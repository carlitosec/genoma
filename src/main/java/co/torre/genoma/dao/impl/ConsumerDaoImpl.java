/**
 * 
 */
package co.torre.genoma.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import co.torre.genoma.dao.ConsumerDao;

/**
 * @author ccarrillo
 *
 */
@Stateless
public class ConsumerDaoImpl<T> implements ConsumerDao<T>{

	/* (non-Javadoc)
	 * @see co.torre.genoma.dao.ConsumerDao#consumeApiRest(java.lang.String)
	 */
	public List<T> consumeApiRest(String endPoint) {
		Client client = ClientBuilder.newClient();
		Response response = client.target(endPoint).request(MediaType.APPLICATION_JSON).get();
		List<T> genericList = response.readEntity(new GenericType<List<T>>() {});
		response.close();
		client.close();
		return genericList;
	}

	/* (non-Javadoc)
	 * @see co.torre.genoma.dao.ConsumerDao#consumeApiRest(java.lang.String, java.lang.Class)
	 */
	@SuppressWarnings({ "hiding", "unchecked", "rawtypes" })
	public <T> T consumeApiRest(String endPoint, Class<T> type) {
		Client client = ClientBuilder.newClient();
		Response response = client.target(endPoint).request().get();
		return (T) response.readEntity(new GenericType(type) {});
	}
	
	

}
