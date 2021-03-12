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
public class Experience {
	private String name;
	private String fromMonth;
	private String fromYear;
	private String toMonth;
	private String toYear;
	private String category;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the fromMonth
	 */
	public String getFromMonth() {
		return fromMonth;
	}
	/**
	 * @param fromMonth the fromMonth to set
	 */
	public void setFromMonth(String fromMonth) {
		this.fromMonth = fromMonth;
	}
	/**
	 * @return the fromYear
	 */
	public String getFromYear() {
		return fromYear;
	}
	/**
	 * @param fromYear the fromYear to set
	 */
	public void setFromYear(String fromYear) {
		this.fromYear = fromYear;
	}
	/**
	 * @return the toMonth
	 */
	public String getToMonth() {
		return toMonth;
	}
	/**
	 * @param toMonth the toMonth to set
	 */
	public void setToMonth(String toMonth) {
		this.toMonth = toMonth;
	}
	/**
	 * @return the toYear
	 */
	public String getToYear() {
		return toYear;
	}
	/**
	 * @param toYear the toYear to set
	 */
	public void setToYear(String toYear) {
		this.toYear = toYear;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	
	

}
