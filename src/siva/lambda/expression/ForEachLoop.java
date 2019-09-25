package siva.lambda.expression;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {

	public static void main(String[] args) {
List<String> list=new ArrayList<String>();

list.add("vara");
list.add("prasad");
list.add("java");
list.add("SCALA");
list.add("SIP");

list.forEach((n) -> System.out.println(n));

	}

}
