package siva.lambda.expression;
interface Samples
{
	public void say();
}
public class WithFI {
public static void main(String[] args) {
	Samples samples=() -> System.out.println("Lambda Expression");
	samples.say();
}
}
