package ar.com.blec.diary.service.dto;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A DTO for the Rules entity.
 */
public class RulesDTO implements Serializable {

    private Long id;

    private Boolean allowRule;

    private String cronSchedule;

    private Integer quantity;

    private Boolean enabled;

    private Integer idMaRules;

    private Long configId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean isAllowRule() {
        return allowRule;
    }

    public void setAllowRule(Boolean allowRule) {
        this.allowRule = allowRule;
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

    public Boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getIdMaRules() {
        return idMaRules;
    }

    public void setIdMaRules(Integer idMaRules) {
        this.idMaRules = idMaRules;
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

        RulesDTO rulesDTO = (RulesDTO) o;
        if(rulesDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), rulesDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "RulesDTO{" +
            "id=" + getId() +
            ", allowRule='" + isAllowRule() + "'" +
            ", cronSchedule='" + getCronSchedule() + "'" +
            ", quantity=" + getQuantity() +
            ", enabled='" + isEnabled() + "'" +
            ", idMaRules=" + getIdMaRules() +
            "}";
    }
}
