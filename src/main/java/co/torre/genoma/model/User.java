/**
 * 
 */
package co.torre.genoma.model;

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
	
	
	
}
