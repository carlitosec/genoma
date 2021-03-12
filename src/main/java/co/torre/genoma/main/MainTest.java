/**
 * 
 */
package co.torre.genoma.main;

import co.torre.genoma.model.Person;
import co.torre.genoma.model.User;
import co.torre.genoma.service.UserService;
import co.torre.genoma.service.impl.UserServiceImpl;

/**
 * @author ccarrillo
 *
 */
public class MainTest {

	public static void main(String[] args) {
		UserService service = new UserServiceImpl();
		User user = service.getUserInfo("carlossmonk");
		Person person = user.getPerson();
		System.out.println(person.getProfessionalHeadline());
	}
}
