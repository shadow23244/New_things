package Lambda_expression;

public class ex2 {
	
	public static void main(String[] args) {
		method_for_lambda exclaim = (s) -> s +"!";
		method_for_lambda ask =(s) -> s + "?";
		printFormatted("Hello", exclaim);
		printFormatted("HI", ask);
	}

	public static void printFormatted(String str, method_for_lambda function) {
		String result = function.m1(str);
		System.out.println(result);
	}
}
