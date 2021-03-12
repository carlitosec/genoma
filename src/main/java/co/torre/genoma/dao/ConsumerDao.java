/**
 * 
 */
package co.torre.genoma.dao;

import java.util.List;

/**
 * @author ccarrillo
 *
 */
public interface ConsumerDao<T> {

	/**
	 * Generic method to consume an API
	 * @param endPoint
	 * @return list of objects
	 */
	List<T> consumeApiRest(String endPoint);
	
	@SuppressWarnings("hiding")
	/**
	 * Generic method to consume an API
	 * @param endPoint
	 * @param type
	 * @return generic object
	 */
	<T> T consumeApiRest(String endPoint, Class<T> type);
}
