package test;

import java.io.Serializable;
import java.time.LocalDateTime;

public class DiaryDateScheduleDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8068019088123146494L;
	/**
	 * 
	 */
	private LocalDateTime schedule;

	/**
	 * 
	 * @param schedule
	 */
	public DiaryDateScheduleDTO(LocalDateTime schedule) {
		super();
		this.schedule = schedule;
	}

	/**
	 * @return the schedule
	 */
	public LocalDateTime getSchedule() {
		return schedule;
	}

	/**
	 * @param schedule
	 *            the schedule to set
	 */
	public void setSchedule(LocalDateTime schedule) {
		this.schedule = schedule;
	}

}
