/**
 * 
 */
package co.torre.genoma.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

import co.torre.genoma.model.Job;
import co.torre.genoma.model.JobMember;
import co.torre.genoma.service.JobService;

/**
 * @author ccarrillo
 *
 */
@RequestScoped
@ManagedBean
public class JobController {

	@Inject
	private JobService jobService;
	
	private String jobId;
	private Job job;
	
	/**
	 * Find a job by job id
	 * @return String object to redirect to another page
	 */
	public String findJobInfo() {
		job = jobService.getJobInfo(getJobId());
		return "jobInfo";
	}
	
	/**
	 * Get members of the job posted
	 * @return list a job members
	 */
	public List<JobMember> getMembers() {
		return job.getMembers().stream().filter(m -> m.getMember()).collect(Collectors.toList());
	}
	
	/**
	 * Get Benefits from Job posted
	 * @return String object with benefit
	 */
	public String getBenefits() {
		return job.getDetails().stream().filter(b -> b.getCode().equals("benefits")).findAny().get().getContent();
	}
	
	/**
	 * Get a detail dynamically from Job posted
	 * @param detail
	 * @return String object with detail obtained
	 */
	public String findDetail(String detail) {
		return job.getDetails().stream().filter(b -> b.getCode().equals(detail)).findAny().get().getContent();
	}
	
	
	/**
	 * @return the jobId
	 */
	public String getJobId() {
		return jobId;
	}
	/**
	 * @param jobId the jobId to set
	 */
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	/**
	 * @return the job
	 */
	public Job getJob() {
		return job;
	}
	/**
	 * @param job the job to set
	 */
	public void setJob(Job job) {
		this.job = job;
	}
	
	
	
	
	
}
