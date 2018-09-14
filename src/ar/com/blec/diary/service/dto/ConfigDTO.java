package ar.com.blec.diary.service.dto;


import java.time.LocalDate;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A DTO for the Config entity.
 */
public class ConfigDTO implements Serializable {

    private Long id;

    private String code;

    private String description;

    private LocalDate dateIni;

    private LocalDate dateEnd;

    private Boolean enabled;

    private Long ownerId;

    private Long ambitId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateIni() {
        return dateIni;
    }

    public void setDateIni(LocalDate dateIni) {
        this.dateIni = dateIni;
    }

    public LocalDate getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public Long getAmbitId() {
        return ambitId;
    }

    public void setAmbitId(Long ambitId) {
        this.ambitId = ambitId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ConfigDTO configDTO = (ConfigDTO) o;
        if(configDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), configDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "ConfigDTO{" +
            "id=" + getId() +
            ", code='" + getCode() + "'" +
            ", description='" + getDescription() + "'" +
            ", dateIni='" + getDateIni() + "'" +
            ", dateEnd='" + getDateEnd() + "'" +
            ", enabled='" + isEnabled() + "'" +
            "}";
    }
}
