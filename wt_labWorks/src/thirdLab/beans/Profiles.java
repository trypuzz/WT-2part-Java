package thirdLab.beans;

import java.util.List;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name="profiles")
@XmlAccessorType(XmlAccessType.FIELD)
public class Profiles {
	@XmlElements({
		@XmlElement(name="profile",type = ArchiveProfile.class),
		})
	private List<ArchiveProfile> profiles;


	public List<ArchiveProfile> getProfiles() {
		return profiles;
	}
	public void setProfiles(List<ArchiveProfile> profiles) {
		this.profiles = profiles;
	}
}
