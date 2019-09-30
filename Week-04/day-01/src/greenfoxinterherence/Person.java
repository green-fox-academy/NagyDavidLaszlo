package greenfoxinterherence;

public class Person {

  String name= "Jane Doe";
  int age= 30;
  String gender="female";

  public void introduce() {
    System.out.println("Hi! I am " + name + "a " + age + "year old " + gender + ".");
  }

  public void getGoal() {
    System.out.println("My goal is: Live for the moment.");
  }

  public Person() {
  }


  public Person(String name,int age, String gender){
    this.name=name;
    this.age= age;
    this.gender=gender;


  }

}
