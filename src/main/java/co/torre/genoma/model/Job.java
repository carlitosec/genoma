/**
 * 
 */
package co.torre.genoma.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author ccarrillo
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Job {
	
	private String objective;
	
	@JsonProperty("compensation")
	private Compensation compensation;
	
	@JsonProperty("members")
	private List<JobMember> members;
	
	@JsonProperty("details")
	private List<JobDetail> details;
	/**
	 * @return the objective
	 */
	public String getObjective() {
		return objective;
	}
	/**
	 * @param objective the objective to set
	 */
	public void setObjective(String objective) {
		this.objective = objective;
	}
	/**
	 * @return the members
	 */
	public List<JobMember> getMembers() {
		return members;
	}
	/**
	 * @param members the members to set
	 */
	public void setMembers(List<JobMember> members) {
		this.members = members;
	}
	/**
	 * @return the details
	 */
	public List<JobDetail> getDetails() {
		return details;
	}
	/**
	 * @param details the details to set
	 */
	public void setDetails(List<JobDetail> details) {
		this.details = details;
	}
	/**
	 * @return the compensation
	 */
	public Compensation getCompensation() {
		return compensation;
	}
	/**
	 * @param compensation the compensation to set
	 */
	public void setCompensation(Compensation compensation) {
		this.compensation = compensation;
	}

	
}
