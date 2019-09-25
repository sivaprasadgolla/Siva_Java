package first;
import java.util.function.*;
public class FunctionsUsage {
/*
	public static int sq(int n)
{
	return n*n;
}
	public static void main(String[] args) {
		System.out.println("sq root is :"+sq(12));

	} */

	
	
	public static void main(String[] args) {
		Predicate<Integer> p=i->i%2==0;
		Function<Integer, Integer> f=i->i*i;
		System.out.println("Even or Not\t"+p.test(12));
		System.out.println("--->Sq\t"+f.apply(11));
	}
}
