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

	List<T> consumeApiRest(String endPoint);
	@SuppressWarnings("hiding")
	<T> T consumeApiRest(String endPoint, Class<T> type);
}
