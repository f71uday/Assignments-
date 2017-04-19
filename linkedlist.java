import java.util.Scanner;
class A
{ boolean flag = false;

  Node start;
  class Node
  {
    String first_name, last_name, branch;
    Node next;
    Node (String first_name, String last_name, String branch)
    {
      first_name.this = first_name;
      last_name.this = last_name;
      branch.this = branch;
      next = null;

    }
  }
  public void add(String first_name, String last_name, String branch)
  {
    Node new_user = new Node(first_name,last_name,branch);
    new_user.next = start;
    start= new_user;

  }
  public boolean Search (String first_name, String last_name, String branch)
  {
    Node last = start;
   while (last.next != null)
       {
         if (last.first_name == first_name && last.last_name == last_name && last.branch == branch)
         {
           flag = true;
           System.out.println(first_name+" "+last_name+" "+branch);
           break;
           return true;
         }
         else return false;
         last = last.next;
        //return;

       }


     }


}


//kushals code begins here


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

class Demo3
{
	public static void main(String args[])
	{
		A a1 = new A();
		a1.add("Amit","jain","IT");
		boolean b;
		b = a1.Search("Amit","jain","IT");
		System.out.println(b);

		C a2 = new C();
		a2.first_name= "Amit";
		a2.last_name= "jain";
		a2.branch= "IT";

		b = a2.Search(a2.first_name,a2.last_name,a2.branch);

		System.out.println(b);

		B m = new B();
		m.ProB();
	}
}
