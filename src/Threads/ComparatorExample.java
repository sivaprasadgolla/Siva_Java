package Threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product
{
	int id;
	String name;
	double price;
	public Product(int id,String name,double price) 
	{
		super();
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class ComparatorExample {

	public static void main(String[] args) {
		List<Product> list=new ArrayList<Product>();
		list.add(new Product(1001,"salt", 10));
		list.add(new Product(1002,"sugar", 50));
		list.add(new Product(1003,"rocksalt", 12));
		list.add(new Product(1004,"rice", 1000));
		Collections.sort(list,(p1,p2)-> { return p1.name.compareTo(p2.name) ;}) ;
		//System.out.println("\\bid\tname\tprice");
		for(Product p:list)
		{
			System.out.println(p.id+"\t"+p.name+"\t"+p.price);
		}
	}

}
