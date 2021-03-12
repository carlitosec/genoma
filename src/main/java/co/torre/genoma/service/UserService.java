/**
 * 
 */
package co.torre.genoma.service;

import co.torre.genoma.model.User;

/**
 * @author ccarrillo
 *
 */
public interface UserService {
	/**
	 * Get user information from API
	 * @param userName
	 * @return User object
	 */
	User getUserInfo(String userName);

}
