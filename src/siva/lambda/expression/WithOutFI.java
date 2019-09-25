package siva.lambda.expression;

interface sample
{
	void say();
}

 class ImplClass implements sample
{
	public void say()
	{
		System.out.println("Good Morning!!");
	}
}
public class WithOutFI {

	public static void main(String[] args) {
		
		ImplClass ic=new ImplClass();
		ic.say();
		sample s=new ImplClass();
		s.say();
	}

}
