package mypack;

import java.util.List;

public class Question {

	private int qid;
	private String qname;
	private List<String>ans;
	public Question(int qid, String qname, List<String> ans) {
		super();
		this.qid = qid;
		this.qname = qname;
		this.ans = ans;
	}
	@Override
	public String toString() {
		return (qid + " " + qname + " " + ans );
	}
	
	
	
}
