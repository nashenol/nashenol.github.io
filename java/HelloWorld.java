public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!!");
		int a = 273;
		int b = 891;
		GCDCalculator calc = new GCDCalculator(a, b);
		System.out.println("The Greatest Common Divisor between " + a + " and " + b + " is " + calc.getDivisor());
	}
}