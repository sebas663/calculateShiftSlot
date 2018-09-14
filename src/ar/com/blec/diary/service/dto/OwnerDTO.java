package ar.com.blec.diary.service.dto;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A DTO for the Owner entity.
 */
public class OwnerDTO implements Serializable {

    private Long id;

    private String externalIdentifier;

    private String endpoint;

    private Boolean enabled;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExternalIdentifier() {
        return externalIdentifier;
    }

    public void setExternalIdentifier(String externalIdentifier) {
        this.externalIdentifier = externalIdentifier;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public Boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OwnerDTO ownerDTO = (OwnerDTO) o;
        if(ownerDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), ownerDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "OwnerDTO{" +
            "id=" + getId() +
            ", externalIdentifier='" + getExternalIdentifier() + "'" +
            ", endpoint='" + getEndpoint() + "'" +
            ", enabled='" + isEnabled() + "'" +
            "}";
    }
}
