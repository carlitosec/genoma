/**
 * 
 */
package co.torre.genoma.service.impl;

import javax.ejb.Stateless;

import co.torre.genoma.dao.ConsumerDao;
import co.torre.genoma.dao.impl.ConsumerDaoImpl;
import co.torre.genoma.model.User;
import co.torre.genoma.service.UserService;

/**
 * @author ccarrillo
 *
 */
@Stateless
public class UserServiceImpl implements UserService{

	@Override
	public User getUserInfo(String userName) {
		ConsumerDao<User> consumer = new ConsumerDaoImpl<>();
		String endPoint = "https://bio.torre.co/api/bios/" + userName;
		User user = consumer.consumeApiRest(endPoint, User.class);
		return user;
	}

}
