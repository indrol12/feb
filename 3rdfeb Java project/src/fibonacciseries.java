
public class fibonacciseries {
public static void main(String[] args) {
	
	fibonacciseries f=new fibonacciseries();
	f.fs();
	
}
	void fs()
{
	int n1=0;
	int n2=1;
	int n3;
	System.out.println("fibonacci series from 1 to 15 :");
	for(int num=1;num<=15;num++)
	{
		n3=n1+n2;
		System.out.print(n3+" ");
		n1=n2;
		n2=n3;
		
	}
}
}
