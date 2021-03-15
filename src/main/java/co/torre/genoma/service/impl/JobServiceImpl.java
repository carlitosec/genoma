/**
 * 
 */
package co.torre.genoma.service.impl;

import javax.ejb.Stateless;
import javax.inject.Inject;

import co.torre.genoma.dao.ConsumerDao;
import co.torre.genoma.model.Job;
import co.torre.genoma.service.JobService;
import co.torre.genoma.util.Constant;

/**
 * @author ccarrillo
 *
 */
@Stateless
public class JobServiceImpl implements JobService {
	
	@Inject
	private ConsumerDao<Job> consumer;

	/* (non-Javadoc)
	 * @see co.torre.genoma.service.JobService#getJobInfo(java.lang.String)
	 */
	@Override
	public Job getJobInfo(String id) {
		String endPoint = Constant.JOB_URL + id;
		Job job = consumer.consumeApiRest(endPoint, Job.class);
		return job;
	}

}
