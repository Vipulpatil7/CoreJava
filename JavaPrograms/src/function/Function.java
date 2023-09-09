package function;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Function {

static void great(int a,int b,int c) {
	if(a>b&&a>c) {
		System.out.println(a+" is greater than "+b+"&"+c);
	}
	else if(b>c&&b>a){
		System.out.println(b+" is greater than "+a+"&"+c);
	}
	else if(c>a&&c>b){
		System.out.println(c+" is greater than "+a+"&"+b);
	}
	else{
		System.out.println("Error wrong input provided");
	}
	}
	public static void main(String[] args) throws IOException,NumberFormatException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter A: ");
		int a=Integer.parseInt(br.readLine());
		System.out.print("Enter B: ");
		int b=Integer.parseInt(br.readLine());
		System.out.print("Enter C: ");
		int c=Integer.parseInt(br.readLine());	
		System.out.println("A="+a+" B="+b+" C="+c);
		great(a,b,c);	
	}
}
