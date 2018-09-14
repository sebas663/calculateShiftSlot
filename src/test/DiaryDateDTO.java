package test;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DiaryDateDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4427827353827613474L;
	/**
	 * 
	 */
	private LocalDate date;
	/**
	 * 
	 */
	private DayOfWeek dayOfWeek;
	
	/**
	 * 
	 */
	private List<DiaryDateScheduleDTO> schedules;
	
	/**
	 * 
	 * @param date
	 */
	public DiaryDateDTO(LocalDate date) {
		super();
		this.date = date;
		this.schedules = new ArrayList<>();
		this.dayOfWeek = date.getDayOfWeek();
	}

	/**
	 * @param schedules the schedules to set
	 */
	public void addSchedule(DiaryDateScheduleDTO schedule) {
		this.schedules.add(schedule);
	}

	/**
	 * @param schedules the schedules to set
	 */
	public void removeSchedule(DiaryDateScheduleDTO schedule) {
		this.schedules.remove(schedule);
	}
	
	/**
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * @return the schedules
	 */
	public List<DiaryDateScheduleDTO> getSchedules() {
		return schedules;
	}
	
}
