/**
 * 
 */
package co.torre.genoma.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author ccarrillo
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class User {

	@JsonProperty("person")
	private Person person;
	
	@JsonProperty("experiences")
	private List<Experience> experiences;

	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}

	/**
	 * @param person the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}

	/**
	 * @return the experiences
	 */
	public List<Experience> getExperiences() {
		return experiences;
	}

	/**
	 * @param experiences the experiences to set
	 */
	public void setExperiences(List<Experience> experiences) {
		this.experiences = experiences;
	}
	
	
	
}
