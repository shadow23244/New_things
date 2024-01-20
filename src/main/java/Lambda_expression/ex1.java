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
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(10);
		Consumer<Integer> method = (n) ->{System.out.println(n);};
		a.forEach(method);
	}

}
