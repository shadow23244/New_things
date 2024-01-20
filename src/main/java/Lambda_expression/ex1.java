package Lambda_expression;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ex1 
{
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(10);
		a.forEach((n)->{System.out.println(n);}); //here (n) is the parameter and after -> is the expression or value
	}
	
	public static void lambdaExpressionUsingConsumerInterface() {
		/*
		 Lambda expressions can be stored in variables if the variable's type is an interface which has only one method. 
		 The lambda expression should have the same number of parameters and the same return type as that method. 
		 Java has many of these kinds of interfaces built in, such as the Consumer interface (found in the java.util package) used by lists.
		 */
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(10);
		Consumer<Integer> method = (n) ->{System.out.println(n);};
		a.forEach(method);
	}

}
