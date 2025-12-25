package mypack;

public class Book {
	private int bid;
	private String bname;
	private int bprice;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getBprice() {
		return bprice;
	}
	public void setBprice(int bprice) {
		this.bprice = bprice;
	}
	public Book(int bid, String bname, int bprice) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bprice = bprice;
	}
	
	public Book() {}
	@Override
	public String toString() {
		return "bid=" + bid + "\t\t" +" bname=" + bname +"\t\t " +" bprice=" + bprice ;
	}
	

}