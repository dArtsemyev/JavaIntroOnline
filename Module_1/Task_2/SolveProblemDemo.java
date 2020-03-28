package by.module1.task2;

public class SolveProblemDemo {
	public static void main(String[] args) {
		SolveProblem solve = new SolveProblem();
		solve.setA(2);
		solve.setB(2);
		solve.setC(2);
		solve.solveProblemFunction();
	}
}
class SolveProblem {
	private double a, b, c, z;
	
	public SolveProblem() {
		
	}
	public void setA(double a) {
		this.a = a;
	}
	public void setB(double b) {
		this.b = b;
	}
	public void setC(double c) {
		this.c = c;
	}
	public void solveProblemFunction() {
		z = ((b + Math.sqrt(Math.pow(b, 2) + 4*a*c)) / (2*a)) - (Math.pow(a, 3) * c) + Math.pow(b, -2);
		System.out.printf("Solve problem is: %.2f", z);
	}
	
}