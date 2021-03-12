/**
 * 
 */
package co.torre.genoma.service.impl;

import javax.ejb.Stateless;
import javax.inject.Inject;

import co.torre.genoma.dao.ConsumerDao;
import co.torre.genoma.model.User;
import co.torre.genoma.service.UserService;
import co.torre.genoma.util.Constant;

/**
 * @author ccarrillo
 *
 */
@Stateless
public class UserServiceImpl implements UserService{
	
	@Inject
	private ConsumerDao<User> consumer;

	@Override
	public User getUserInfo(String userName) {
//		ConsumerDao<User> consumer = new ConsumerDaoImpl<>();
		String endPoint = Constant.USER_URL + userName;
		User user = consumer.consumeApiRest(endPoint, User.class);
		return user;
	}

}
