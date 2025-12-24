package mypack;

import java.util.List;

public class Question {
  private int qid;
  private String qname;
  private List<String> ans;
  public int getQid() {
	return qid;
  }
  public Question(int qid, String qname, List<String> ans) {
	super();
	this.qid = qid;
	this.qname = qname;
	this.ans = ans;
  }
  
}
