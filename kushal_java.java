import java.util.Scanner;
import java.util.*;

class User
{
  String first_name;
  String last_name;
  String branch;
  public User(String first_name, String last_name, String branch)
  {
    this.first_name= first_name;
    this.last_name= last_name;
    this.branch= branch;
  }
}


class B
{
	void ProB()
	{
		Scanner sc = new Scanner(System.in);
		C dummy = new C();
		System.out.println("\n LOG IN:");
					System.out.println("\n First Name:- ");
					dummy.first_name = sc.next();
					System.out.println("\n Last Name:- ");
					dummy.last_name = sc.next();
					System.out.println("\n Branch:- ");
					dummy.branch = sc.next();
		dummy.Pro(dummy);
	}
}
/*
class C extends A
{
	void Pro(C s)
	{
		System.out.println("Student Name:- "+s.first_name+ " "+ s.last_name+"\t Student Branch:- "+s.branch);
		System.out.println(s.first_name.equals("Amit"));
		System.out.println(s.last_name.equals("jain"));
		System.out.println(s.branch.equals("IT"));
		boolean b = Search(s.first_name,s.last_name,s.branch);
		System.out.println("In C :- "+b);
	}
}
*/
class Demo3
{
	public static void main(String args[])
	{
		User a1 = new User("Amit","jain","IT");

		LinkedList<User> list = new LinkedList<User>();
		list.add(a1);
		for(User b:list){
	   	if (b.first_name == "Amit" && b.last_name == "jain" && b.branch == "IT")
			{
				System.out.println("item found");
				System.out.println(b.first_name+b.last_name+b.branch);
			}
	 }
	 /*
		C a2 = new C();
		a2.first_name= "Amit";
		a2.last_name= "jain";
		a2.branch= "IT";

		b = a2.Search(a2.first_name,a2.last_name,a2.branch);

		System.out.println(b);

		B m = new B();
		m.ProB();*/
	}
}
