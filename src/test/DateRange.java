package test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import ar.com.blec.diary.service.dto.AbsensesDTO;
import ar.com.blec.diary.service.dto.DailyScheduleDTO;
import ar.com.blec.diary.service.dto.DayAtentionDTO;

public class DateRange {

	private final LocalDate startDate;
	private final LocalDate endDate;
	private final List<AbsensesDTO> lstAbsenses;
	private final List<DayAtentionDTO> lstAtentionDay;

	public DateRange(LocalDate startDate, LocalDate endDate, List<AbsensesDTO> lstAbsenses,
			List<DayAtentionDTO> lstAtentionDay) {
		// check that range is valid (null, start < end)
		this.startDate = startDate;
		this.endDate = endDate;
		this.lstAbsenses = lstAbsenses;
		this.lstAtentionDay = lstAtentionDay;
	}

	public List<DiaryDateDTO> getDiaryDateDTOList() {
		List<DiaryDateDTO> resultList = getRawDiaryDateDTOList();

		List<DayOfWeek> atentionDays = getListAtentionDay();

		atentionDays.forEach(x -> {
			LocalDate date = this.startDate;
			while (!date.isAfter(this.endDate)) {
				// verifico si date es un dia de atencion.
				if (x == date.getDayOfWeek()) {
					DiaryDateDTO d = new DiaryDateDTO(date);
					d.getSchedules().addAll(generateSchedules(x,date));
					resultList.add(d);
				}
				date = date.plusDays(1);
			}
		});
		resultList.removeIf(x -> removeAbsenses(x));
		return resultList;
	}
	
	private boolean removeAbsenses(DiaryDateDTO x){
		boolean remove = false;
		List<LocalDate> absenses = getListAbsensesDay();
		
		
		return remove;
	}
	
	/**
	 * 
	 * @return
	 */
	private List<DiaryDateScheduleDTO> generateSchedules(DayOfWeek dayOfWeek,LocalDate date) {
		List<DiaryDateScheduleDTO> schedules = new ArrayList<>();
		DayAtentionDTO dayAtentionDTO = getAtentionDay(dayOfWeek);
		if (dayAtentionDTO != null) {
			List<DailyScheduleDTO> l = dayAtentionDTO.getDailyScheduleDTOList();
			l.forEach(x -> {
				Integer scheduleIni = x.getScheduleIni();
				int hour = 0; //TODO:
				int minutes = 0; //TODO:
				LocalDateTime schedule = date.atTime(hour,minutes);
				while (scheduleIni < x.getScheduleEnd()) {
					DiaryDateScheduleDTO scheduleDTO = new DiaryDateScheduleDTO(schedule);
					schedules.add(scheduleDTO);
					schedule = schedule.plusMinutes(x.getDurationShift());
					scheduleIni += x.getDurationShift();
				}
			});

		}
		return schedules;
	}
	
	private List<LocalDate> getListAbsensesDay() {
		List<LocalDate> l = new ArrayList<>();
		this.lstAbsenses.forEach(x -> {
			Stream.iterate(x.getRangeIni(), d -> d.plusDays(1)).limit(ChronoUnit.DAYS.between(x.getRangeIni(), x.getRangeEnd()) + 1)
			.collect(Collectors.toList()).forEach(d -> l.add(d));
		});
		return l;
	}
	
	private List<DayOfWeek> getListAtentionDay() {
		List<DayOfWeek> l = new ArrayList<>();
		List<String> dayCodes = this.lstAtentionDay.stream().map(DayAtentionDTO::getDayCode)
				.collect(Collectors.toList());
		dayCodes.forEach(x -> l.add(getDayOfWeek(x)));
		return l;
	}

//	private List<DayOfWeek> getListAbsensesDay() {
//		List<DayOfWeek> l = new ArrayList<>();
//		List<String> dayCodes = this.lstAbsenses.stream().map(AbsensesDTO::getDayCode).collect(Collectors.toList());
//		dayCodes.forEach(x -> l.add(getDayOfWeek(x)));
//		return l;
//	}

	private DayAtentionDTO getAtentionDay(DayOfWeek date) {
		DayAtentionDTO dayAtentionDTO = this.lstAtentionDay.stream().filter(x -> getDayOfWeek(x.getDayCode()) == date)
				.findAny().orElse(null);
		return dayAtentionDTO;
	}

	/**
	 * 
	 * @param dayOfWeek
	 * @return
	 */
	private DayOfWeek getDayOfWeek(String dayOfWeek) {
		DayOfWeek day;
		switch (dayOfWeek) {
		case "1":
			day = DayOfWeek.MONDAY;
			break;
		case "2":
			day = DayOfWeek.TUESDAY;
			break;
		case "3":
			day = DayOfWeek.WEDNESDAY;
			break;
		case "4":
			day = DayOfWeek.THURSDAY;
			break;
		case "5":
			day = DayOfWeek.FRIDAY;
			break;
		case "6":
			day = DayOfWeek.SATURDAY;
			break;
		case "7":
			day = DayOfWeek.SUNDAY;
			break;
		default:
			throw new IllegalArgumentException("Invalid day of the week: " + dayOfWeek);
		}
		return day;
	}

	/**
	 * Metodo para devolver una lista de DiaryDateDTO sin los filtros aplicados
	 * (dias de atencion DayAtentionDTO y ausencias AbsensesDTO). Genera la
	 * lista desde startDate hasta endDate.
	 * 
	 * @return
	 */
	private List<DiaryDateDTO> getRawDiaryDateDTOList() {
		List<DiaryDateDTO> l = new ArrayList<>();
		Stream.iterate(startDate, d -> d.plusDays(1)).limit(ChronoUnit.DAYS.between(startDate, endDate) + 1)
				.collect(Collectors.toList()).forEach(d -> l.add(new DiaryDateDTO(d)));
		return l;
	}
}
