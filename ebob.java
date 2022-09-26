package ebob;
import java.util.Scanner;
public class ebob {
	
	public static void main(String[] args)
	{	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Birinci sayıyı giriniz:");
		int n1=scanner.nextInt();
		System.out.println("İkinci sayıyı giriniz:");
		int n2=scanner.nextInt();
		int i=1,ebob=1,k=1,ekok=0;
		
		while(i<=n1) 
		{
			i++;
							if(n1%i==0&&n2%i==0) 
							{
								ebob=i;
							}		
		}
			System.out.println("EBOB = "+ebob);
			
		while(k<=(n1*n2))
		{
			k++;
							if(k%n1==0&&k%n2==0)
							{
								ekok=k;
								
								
							}
			
		}
			System.out.println("EKOK = "+ekok);
			
	}

}
