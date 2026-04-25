package day9_apr25.student;

public class Runner {

 public static void main(String[] args) {

  Student newStudent=new Student("Alan",123);

  Student oldStudent=new Student("Bob",765,87.6);

  oldStudent.displayOldStudent();
  System.out.println("-------------------------");
  newStudent.displayNewStudent();



 }







}
