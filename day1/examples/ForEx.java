package day1.examples;

import Day3.src.Day3.examples.Example2;

public class ForEx extends Example2{

	public static void main(String[] args) {
		int k=0;
		int a=1,b=2;
		
		
		for(int i=0;i<=10;i++)
			{
			System.out.println("i :"+i);
			}
		while(k==1)
		{
			System.out.println("Hii");
		}
		
		if(a==1 && b==2)
		{
			System.out.println("Both are true");
		}
		if(a==1 || b==3)
		{
			System.out.println("Only one of the two are correct");
	
		}
		
		int a1=15,b1=11;
		int c1=a1 & b1;
		System.out.println("C is :"+c1);
		
		}

}
