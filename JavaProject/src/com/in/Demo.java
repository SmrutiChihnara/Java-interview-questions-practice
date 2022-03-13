package com.in;

public class Demo
{
	public static void main(String[] args) {
		int c=1;
		int sum=0;
		for(;c<=6;c++)
		{sum+=c;
		if(sum==10)
		{
			continue;
		}
		if(sum>c*2)
		{
			break;
		}
			
		}
		do
		{
			sum-=c;
			
		}
		while(sum>c);
		System.out.println(sum);
	}
}