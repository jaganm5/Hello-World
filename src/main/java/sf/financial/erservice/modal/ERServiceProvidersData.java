package sf.financial.erservice.modal;

public class ERServiceProvidersData {
	private String name;
	private String taxNumber;
	private String stateCode;
	private String age;
	private String multiRecordInd;
	public ERServiceProvidersData() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTaxNumber() {
		return taxNumber;
	}
	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getMultiRecordInd() {
		return multiRecordInd;
	}
	public void setMultiRecordInd(String multiRecordInd) {
		this.multiRecordInd = multiRecordInd;
	}
	@Override
	public String toString() {
		return "ERServiceProvider [name=" + name + ", taxNumber=" + taxNumber + ", stateCode=" + stateCode
				+ ", age=" + age + ", multiRecordInd=" + multiRecordInd + "]";
	}
	
}
