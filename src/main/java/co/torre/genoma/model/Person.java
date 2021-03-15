/**
 * 
 */
package co.torre.genoma.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * @author ccarrillo
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Person {
	
	private String professionalHeadline;
	private Double completion;
	private String created;
	private Boolean showPhone;
	private Boolean verified;
	private Integer weigth;
	private String name;
	private String picture;
	
	@JsonProperty("location")
	private Location location;
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
	 * @return the showPhone
	 */
	public Boolean getShowPhone() {
		return showPhone;
	}
	/**
	 * @param showPhone the showPhone to set
	 */
	public void setShowPhone(Boolean showPhone) {
		this.showPhone = showPhone;
	}
	/**
	 * @return the verified
	 */
	public Boolean getVerified() {
		return verified;
	}
	/**
	 * @param verified the verified to set
	 */
	public void setVerified(Boolean verified) {
		this.verified = verified;
	}
	/**
	 * @return the weigth
	 */
	public Integer getWeigth() {
		return weigth;
	}
	/**
	 * @param weigth the weigth to set
	 */
	public void setWeigth(Integer weigth) {
		this.weigth = weigth;
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
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(Location location) {
		this.location = location;
	}
	/**
	 * @return the completion
	 */
	public Double getCompletion() {
		return completion;
	}
	/**
	 * @param completion the completion to set
	 */
	public void setCompletion(Double completion) {
		this.completion = completion;
	}
	/**
	 * @return the created
	 */
	public String getCreated() {
		return created;
	}
	/**
	 * @param created the created to set
	 */
	public void setCreated(String created) {
		this.created = created;
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
	};
	
	
}
