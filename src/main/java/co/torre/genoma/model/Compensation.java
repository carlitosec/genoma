/**
 * 
 */
package co.torre.genoma.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author ccarrillo
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Compensation {
	private String currency;
	private Integer minAmount;
	private Integer maxAmount;
	private String periodicity;
	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	/**
	 * @return the minAmount
	 */
	public Integer getMinAmount() {
		return minAmount;
	}
	/**
	 * @param minAmount the minAmount to set
	 */
	public void setMinAmount(Integer minAmount) {
		this.minAmount = minAmount;
	}
	/**
	 * @return the maxAmount
	 */
	public Integer getMaxAmount() {
		return maxAmount;
	}
	/**
	 * @param maxAmount the maxAmount to set
	 */
	public void setMaxAmount(Integer maxAmount) {
		this.maxAmount = maxAmount;
	}
	/**
	 * @return the periodicity
	 */
	public String getPeriodicity() {
		return periodicity;
	}
	/**
	 * @param periodicity the periodicity to set
	 */
	public void setPeriodicity(String periodicity) {
		this.periodicity = periodicity;
	}
}
