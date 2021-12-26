import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int arr[]=new int[T];
				
		for(int i=0;i<T;i++)
		{
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<T;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
			if(min>arr[i])
			{
				min=arr[i];
			}
		}		
		System.out.println(min+" "+max);
	}

}
