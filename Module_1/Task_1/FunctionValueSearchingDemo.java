package by.module1.task1;

public class FunctionValueSearchingDemo {
	public static void main(String[] args) {
		FunctionValueSearching functionValue = new FunctionValueSearching(6, 3, 9); 
		System.out.printf("Function value is: %.2f", functionValue.returnFunctionValue());		
	}
}
class FunctionValueSearching {
	private double a, b, c, z;
	
	public FunctionValueSearching(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double returnFunctionValue () {
		z = ((a - 3) * b/2) + c;
		return z;
	}	
}