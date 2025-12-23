package mypack;

import java.util.List;

public class Question {

	private int qid;
	private String qname;
	private List<Answer>ans;
	public void setQid(int qid) {
		this.qid = qid;
	}
	
	
	
	


	public void setQname(String qname) {
		this.qname = qname;
	}



	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}

	@Override
	public String toString() {
		return "Question [qid=" + qid + ", qname=" + qname + ", ans=" + ans + "]";
	}

	
}
