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
 class Collection{
 public static void main(String args[]){

  LinkedList<User> al=new LinkedList<User>();
  User u1= new User("uday","raj","IT");
  User u2 = new User("kapil","singh","CE");
  //al.add("Ravi");
  //al.add("Ajay");
   al.add(u1);
   al.add(u2);
  Iterator<User> itr=al.iterator();
  while(itr.hasNext()){
   System.out.println(itr.next());
 }
 for(User b:al){
  System.out.println(b.last_name+" "+b.first_name+" "+b.branch);  
  }
 }
}
