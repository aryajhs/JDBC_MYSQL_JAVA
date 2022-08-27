import java.util.*;
class linkedlist
{
	void func()
	{
		LinkedList lst = new LinkedList(); 
		lst.add("Coke");
		lst.add("Dairy Milk");
		lst.add(500);
		lst.add(7.9);
		lst.add("Dairy Milk");
                lst.add("Condom");
                lst.remove("Dairy Milk");
                lst.remove("Condom");
                 
		System.out.println(lst);
		System.out.println("No of item's:"+lst.size());	
	}
	public static void main(String args[])
	{
		linkedlist obj= new linkedlist();
               
		obj.func();
                throw new ArithmeticException("Arithmetic Exception");

	}
}   

