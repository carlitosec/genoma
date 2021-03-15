/**
 * 
 */
package co.torre.genoma.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author ccarrillo
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class MemberPerson {
	private String username;
	private String name;
	private String professionalHeadline;
	private String picture;
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the professionalHeadline
	 */
	public String getProfessionalHeadline() {
		return professionalHeadline;
	}
	/**
	 * @param professionalHeadline the professionalHeadline to set
	 */
	public void setProfessionalHeadline(String professionalHeadline) {
		this.professionalHeadline = professionalHeadline;
	}
	/**
	 * @return the picture
	 */
	public String getPicture() {
		return picture;
	}
	/**
	 * @param picture the picture to set
	 */
	public void setPicture(String picture) {
		this.picture = picture;
	}
}
