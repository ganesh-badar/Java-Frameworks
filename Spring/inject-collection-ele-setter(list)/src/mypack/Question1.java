package mypack;

import java.util.List;

public  class Question1 {
        private int qid;
        private String qname;
      
		public void setQid(int qid) {
			this.qid = qid;
		}
		
		private List<String>answer;
	
		public void setQname(String qname) {
			this.qname = qname;
		}
	
		public void setAnswer(List<String> answer) {
			this.answer = answer;
		}
		@Override
		public String toString() {
			return ( qid + " " + qname + " " + answer );
		}
		
	

}
