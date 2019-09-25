package siva.lambda.expression;

interface Express
{
	public void says(String message);
}

public class MultibleStatements {

	public static void main(String[] args) {
Express express=(message) -> { System.out.println("hello");
                               System.out.println("wonderfulll");
                                           };
express.says("Hello");
	}

}
