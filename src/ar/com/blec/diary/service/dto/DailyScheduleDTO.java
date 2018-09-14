package ar.com.blec.diary.service.dto;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A DTO for the DailySchedule entity.
 */
public class DailyScheduleDTO implements Serializable {

    private Long id;

    private Integer scheduleIni;

    private Integer scheduleEnd;

    private Integer durationShift;

    private Integer durationUnit;

    private Integer position;

    private Boolean enabled;

    private Long dayAtentionId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getScheduleIni() {
        return scheduleIni;
    }

    public void setScheduleIni(Integer scheduleIni) {
        this.scheduleIni = scheduleIni;
    }

    public Integer getScheduleEnd() {
        return scheduleEnd;
    }

    public void setScheduleEnd(Integer scheduleEnd) {
        this.scheduleEnd = scheduleEnd;
    }

    public Integer getDurationShift() {
        return durationShift;
    }

    public void setDurationShift(Integer durationShift) {
        this.durationShift = durationShift;
    }

    public Integer getDurationUnit() {
        return durationUnit;
    }

    public void setDurationUnit(Integer durationUnit) {
        this.durationUnit = durationUnit;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Long getDayAtentionId() {
        return dayAtentionId;
    }

    public void setDayAtentionId(Long dayAtentionId) {
        this.dayAtentionId = dayAtentionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DailyScheduleDTO dailyScheduleDTO = (DailyScheduleDTO) o;
        if(dailyScheduleDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), dailyScheduleDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "DailyScheduleDTO{" +
            "id=" + getId() +
            ", scheduleIni=" + getScheduleIni() +
            ", scheduleEnd=" + getScheduleEnd() +
            ", durationShift=" + getDurationShift() +
            ", durationUnit=" + getDurationUnit() +
            ", position=" + getPosition() +
            ", enabled='" + isEnabled() + "'" +
            "}";
    }
}
