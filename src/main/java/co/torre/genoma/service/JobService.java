/**
 * 
 */
package co.torre.genoma.service;

import co.torre.genoma.model.Job;

/**
 * @author ccarrillo
 *
 */
public interface JobService {
	
	/**
	 * Get job information from API
	 * @param id
	 * @return Job object
	 */
	Job getJobInfo(String id);

}
