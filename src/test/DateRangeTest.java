package test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import ar.com.blec.diary.service.dto.AbsensesDTO;
import ar.com.blec.diary.service.dto.DayAtentionDTO;

public class DateRangeTest {

	public static void main(String[] args) {
//		esto deberia ser el inicio de la agenda
		LocalDate startDate = LocalDate.now();
//		esto deberia ser el final de la agenda
		LocalDate endDate = startDate.plusMonths(2);
//		estas son las ausencias
		List<AbsensesDTO> lstAbsenses = new ArrayList<>();
//		estas son las dias de atencion con su lista de horarios.
		List<DayAtentionDTO> lstAtentionDay = new ArrayList<>();
		
		
//		DateRange date = new DateRange(startDate, endDate,lstAbsenses, lstAtentionDay);
		
//		cualquiera de estos dos metodos deberia devolver los slosts		
//		List<DiaryDateDTO> lst = date.toList();
//		List<DiaryDateDTO> lst2 = date.streamToList();
//		lst.removeIf(x -> !lstAbsenses.contains(x.getDate()));
		
		
		
//		LocalDateTime starDateTime = LocalDateTime.now();
//		LocalDateTime endDateTime = LocalDateTime.now().plus(Duration.of(20, ChronoUnit.MINUTES));
//
//		System.out.println(starDateTime);
//		System.out.println(endDateTime);
		
		
		
//		LocalDate a = LocalDate.of(2014, 6, 30);
//
//	    System.out.println(a.getDayOfWeek());
		
//		while (!startDate.isAfter(endDate)) {
//		 System.out.println(startDate);
//		 startDate = startDate.plusDays(1);
//		}
//		List<String> l = getList();
//		l.add("x");
//		l.forEach(System.out::println);
		
		String someString = "https://misimagenes.fleni.org.ark&Service1111";
		long count = someString.chars().count();
		System.out.println(count);
	}
	
	
	private static List<String> getList(){
		List<String> l = Arrays.asList("a","ab","abc","abcd");
//		return Collections.unmodifiableList(l);
		return l;
	}

}
