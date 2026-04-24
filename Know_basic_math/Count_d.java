//count_d

import java.util.Scanner;
public class Count_d{
	public static void main(String a[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the num :");
	int n = sc.nextInt();	
	int count=0;
	//case when n is  0;
	if(n==0){
	count =1;
	}else{
	while(n!=0){
	n/=10;
	count++;
	}
	}
	System.out.print(count);
}
	}
	
	