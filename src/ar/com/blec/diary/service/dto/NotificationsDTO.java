package ar.com.blec.diary.service.dto;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A DTO for the Notifications entity.
 */
public class NotificationsDTO implements Serializable {

    private Long id;

    private Integer idMaNotifications;

    private String cronSchedule;

    private Integer quantity;

    private Boolean allowNotification;

    private Long configId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIdMaNotifications() {
        return idMaNotifications;
    }

    public void setIdMaNotifications(Integer idMaNotifications) {
        this.idMaNotifications = idMaNotifications;
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

    public Boolean isAllowNotification() {
        return allowNotification;
    }

    public void setAllowNotification(Boolean allowNotification) {
        this.allowNotification = allowNotification;
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

        NotificationsDTO notificationsDTO = (NotificationsDTO) o;
        if(notificationsDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), notificationsDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "NotificationsDTO{" +
            "id=" + getId() +
            ", idMaNotifications=" + getIdMaNotifications() +
            ", cronSchedule='" + getCronSchedule() + "'" +
            ", quantity=" + getQuantity() +
            ", allowNotification='" + isAllowNotification() + "'" +
            "}";
    }
}
