package mypack;

public class Answer {

	private String aname;
	private String postedby;

	public void setAname(String aname) {
		this.aname = aname;
	}
	
	
	public void setPostedby(String postedby) {
		this.postedby = postedby;
	}


	@Override
	public String toString() {
		return ( aname + " " + postedby );
	}
	
}
