package siva.lambda.expression;

@FunctionalInterface
interface Arthemetic
{
	public void sum(int a,int b);
	//public void Sub(int a,int b);
}
public class WithArgWithFI {
public static void main(String[] args) {
	Arthemetic A=(a,b) -> System.out.println("Sum\t:"+ (a+b) );
	A.sum(100, 200);
}
}
