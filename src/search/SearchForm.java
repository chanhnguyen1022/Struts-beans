package search;

import org.apache.struts.action.ActionForm;

@SuppressWarnings("serial")
public class SearchForm extends ActionForm {
	private String customerName;
	private String sex;
	private String birthDayStart;
	private String birthDayEnd;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthDayStart() {
		return birthDayStart;
	}

	public void setBirthDayStart(String birthDayStart) {
		this.birthDayStart = birthDayStart;
	}

	public String getBirthDayEnd() {
		return birthDayEnd;
	}

	public void setBirthDayEnd(String birthDayEnd) {
		this.birthDayEnd = birthDayEnd;
	}

	@Override
	public String toString() {
		return "SearchForm [customerName=" + customerName + ", sex=" + sex + ", birthDayStart=" + birthDayStart
				+ ", birthDayEnd=" + birthDayEnd + "]";
	}

}
