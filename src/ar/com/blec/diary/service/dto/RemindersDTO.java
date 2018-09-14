package ar.com.blec.diary.service.dto;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A DTO for the Reminders entity.
 */
public class RemindersDTO implements Serializable {

    private Long id;

    private Integer idMaReminders;

    private String cronSchedule;

    private Integer quantity;

    private Boolean allowReminder;

    private Long configId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIdMaReminders() {
        return idMaReminders;
    }

    public void setIdMaReminders(Integer idMaReminders) {
        this.idMaReminders = idMaReminders;
    }

    public String getCronSchedule() {
        return cronSchedule;
    }

    public void setCronSchedule(String cronSchedule) {
        this.cronSchedule = cronSchedule;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Boolean isAllowReminder() {
        return allowReminder;
    }

    public void setAllowReminder(Boolean allowReminder) {
        this.allowReminder = allowReminder;
    }

    public Long getConfigId() {
        return configId;
    }

    public void setConfigId(Long configId) {
        this.configId = configId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        RemindersDTO remindersDTO = (RemindersDTO) o;
        if(remindersDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), remindersDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "RemindersDTO{" +
            "id=" + getId() +
            ", idMaReminders=" + getIdMaReminders() +
            ", cronSchedule='" + getCronSchedule() + "'" +
            ", quantity=" + getQuantity() +
            ", allowReminder='" + isAllowReminder() + "'" +
            "}";
    }
}
