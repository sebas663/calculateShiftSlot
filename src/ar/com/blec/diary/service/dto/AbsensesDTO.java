package ar.com.blec.diary.service.dto;


import java.time.LocalDate;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A DTO for the Absenses entity.
 */
public class AbsensesDTO implements Serializable {

    private Long id;

    private String reason;

    private LocalDate rangeIni;

    private LocalDate rangeEnd;

    private Boolean allDaily;

    private Integer idMaAbsenses;

    private Boolean enabled;

    private Long configId;

    public String getDayCode(){
		return null;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public LocalDate getRangeIni() {
        return rangeIni;
    }

    public void setRangeIni(LocalDate rangeIni) {
        this.rangeIni = rangeIni;
    }

    public LocalDate getRangeEnd() {
        return rangeEnd;
    }

    public void setRangeEnd(LocalDate rangeEnd) {
        this.rangeEnd = rangeEnd;
    }

    public Boolean isAllDaily() {
        return allDaily;
    }

    public void setAllDaily(Boolean allDaily) {
        this.allDaily = allDaily;
    }

    public Integer getIdMaAbsenses() {
        return idMaAbsenses;
    }

    public void setIdMaAbsenses(Integer idMaAbsenses) {
        this.idMaAbsenses = idMaAbsenses;
    }

    public Boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
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

        AbsensesDTO absensesDTO = (AbsensesDTO) o;
        if(absensesDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), absensesDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "AbsensesDTO{" +
            "id=" + getId() +
            ", reason='" + getReason() + "'" +
            ", rangeIni='" + getRangeIni() + "'" +
            ", rangeEnd='" + getRangeEnd() + "'" +
            ", allDaily='" + isAllDaily() + "'" +
            ", idMaAbsenses=" + getIdMaAbsenses() +
            ", enabled='" + isEnabled() + "'" +
            "}";
    }
}
