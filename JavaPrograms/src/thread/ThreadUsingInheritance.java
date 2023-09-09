package thread;

class ThreadOne extends Thread{
	public void run() {
		System.out.println("Factorial Program");
		int i,n=5;
		int fact=1;
		for(i=1;i<=n;i++) {
			fact*=i;
			System.out.println(fact);
		}
	}
}

public class ThreadUsingInheritance {

	public static void main(String[] args) {
		ThreadOne t = new ThreadOne();
		t.run();
	}

}
