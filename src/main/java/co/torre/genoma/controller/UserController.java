/**
 * 
 */
package co.torre.genoma.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

import co.torre.genoma.model.Experience;
import co.torre.genoma.model.User;
import co.torre.genoma.service.UserService;

/**
 * @author ccarrillo
 *
 */
// @SessionScoped
@RequestScoped
@ManagedBean
public class UserController {

	@Inject
	private UserService userService;

	private String userName;
	private User user;

	public String findUserInfo() {
		user = userService.getUserInfo(getUserName());
		return "userInfo";
	}

	public List<Experience> getExperiences() {
		return user.getExperiences().stream().filter(e -> e.getCategory().equals("jobs")).collect(Collectors.toList());
	}

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
