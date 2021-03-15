/**
 * 
 */
package co.torre.genoma.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import co.torre.genoma.model.Experience;
import co.torre.genoma.model.User;
import co.torre.genoma.service.UserService;

/**
 * @author ccarrillo
 *
 */
@RequestScoped
@ManagedBean
public class UserController {

	@Inject
	private UserService userService;

	private String userName;
	private User user;

	/**
	 * find a people by username
	 * 
	 * @return String object to redirect to another page
	 */
	public String findUserInfo() {
		try {
			user = userService.getUserInfo(getUserName());
			
			if(user.getPerson() == null) {
				FacesContext.getCurrentInstance().addMessage(null,
						new FacesMessage(FacesMessage.SEVERITY_INFO, "No record found!!.", null));
				return null;
			}
			
			return "userInfo";
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "No record found!!." + e.getLocalizedMessage() + " " 
							+ e.getMessage(), null));
			return null;
		}
	}

	/**
	 * Get experiences from person
	 * 
	 * @return list of experiences
	 */
	public List<Experience> getExperiences() {
		return user.getExperiences().stream().filter(e -> e.getCategory().equals("jobs")).collect(Collectors.toList());
	}

	/**
	 * Get studies from person
	 * 
	 * @return list of studies
	 */
	public List<Experience> getStudies() {
		return user.getExperiences().stream().filter(e -> e.getCategory().equals("education"))
				.collect(Collectors.toList());
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

}
