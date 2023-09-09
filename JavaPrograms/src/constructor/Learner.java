package constructor;

public class Learner {

	private int lid;
	private String lname;
	private String ldegree;
		
//		public Learner() {
//			lid=1;
//			lname="Vipul";
//			ldegree="BSc";
//			System.out.println(lid+lname+ldegree);
//		}
		public Learner(int lid, String lname, String ldegree) {
			this.lid=lid;
			this.lname=lname;
			this.ldegree=ldegree;
			
		}
		public int getlid() {
			return lid;
		}
		public String lname() {
			return lname;
		}
		public String ldegree() {
			return ldegree;
		}
		
		public static void main(String[] args) {
			Learner l1=new Learner(100, "Vipul", "BSc");
			Learner l2=new Learner(101, "Harsh", "BSc");
			
			System.out.println("Learner 1: ID- "+l1.getlid()+", Name- "+l1.lname()+",Degree- "+l1.ldegree());
			System.out.println("Learner 2: ID- "+l2.getlid()+", Name- "+l2.lname()+",Degree- "+l2.ldegree());
			
		}
	

}
