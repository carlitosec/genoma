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
public class JobMember {
	@JsonProperty("person")
	private MemberPerson person;
	
	private Boolean member;

	/**
	 * @return the person
	 */
	public MemberPerson getPerson() {
		return person;
	}

	/**
	 * @param person the person to set
	 */
	public void setPerson(MemberPerson person) {
		this.person = person;
	}

	/**
	 * @return the member
	 */
	public Boolean getMember() {
		return member;
	}

	/**
	 * @param member the member to set
	 */
	public void setMember(Boolean member) {
		this.member = member;
	}
	
	
}
