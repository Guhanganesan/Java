package DataVariables;

import java.util.Scanner;

public class Calculator {
	
	int a,b;
	
	Calculator(int x,int y)
	{
		this.a=x;
		this.b=y;
		
	}
	
	void add()
	{
		System.out.println(a+b);
	}
    void sub()
    {
    	System.out.println(a-b);
    }
    void mul()
    {
    	System.out.println(a*b);
    }
    void div()
    {
    	System.out.println(a/b);
    }
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int input1 = sc.nextInt();
		System.out.println("Enter st number");
		int input2 = sc.nextInt();
				
		Calculator obj = new Calculator(input1,input1); 
		
		         
		           obj.add();  
		           obj.sub();
		           obj.mul();
		           obj.div();
   }

}
