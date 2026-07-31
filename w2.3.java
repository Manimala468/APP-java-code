public class Student{
  String name;
  int rollno;
  
  void display(){
      System.out.println("name:" + name);
      System.out.println("rollno:" + rollno);
  }

  public static void main(String[] args){
    Student s1 = new Student();
    s1.name="Riya";
    s1.rollno=24;
    s1.display();
  }
}
  
