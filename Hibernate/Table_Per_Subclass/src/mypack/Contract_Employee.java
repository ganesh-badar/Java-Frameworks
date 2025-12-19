package mypack;

public class Contract_Employee extends Employee
{
	private int contract_duration;
	private int rate_per_hour;
	public int getContract_duration() {
		return contract_duration;
	}
	public void setContract_duration(int contract_duration) {
		this.contract_duration = contract_duration;
	}
	public int getRate_per_hour() {
		return rate_per_hour;
	}
	public void setRate_per_hour(int rate_per_hour) {
		this.rate_per_hour = rate_per_hour;
	}
	
	

}