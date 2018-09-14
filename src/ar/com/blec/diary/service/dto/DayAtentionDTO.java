package ar.com.blec.diary.service.dto;


import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * A DTO for the DayAtention entity.
 */
public class DayAtentionDTO implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6784449135722700795L;

	private Long id;

    private Integer idMaDays;

    private Boolean enabled;

    private Long configId;
    
    private List<DailyScheduleDTO> dailyScheduleDTOList;
    
    public String getDayCode(){
		return null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIdMaDays() {
        return idMaDays;
    }

    public void setIdMaDays(Integer idMaDays) {
        this.idMaDays = idMaDays;
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
    
    
    /**
	 * @return the dailyScheduleDTOList
	 */
	public List<DailyScheduleDTO> getDailyScheduleDTOList() {
		return dailyScheduleDTOList;
	}

	/**
	 * @param dailyScheduleDTOList the dailyScheduleDTOList to set
	 */
	public void setDailyScheduleDTOList(List<DailyScheduleDTO> dailyScheduleDTOList) {
		this.dailyScheduleDTOList = dailyScheduleDTOList;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DayAtentionDTO dayAtentionDTO = (DayAtentionDTO) o;
        if(dayAtentionDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), dayAtentionDTO.getId());
    }
    
    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "DayAtentionDTO{" +
            "id=" + getId() +
            ", idMaDays=" + getIdMaDays() +
            ", enabled='" + isEnabled() + "'" +
            "}";
    }
}
