package greenfoxinterherence;

public class Sponsor extends Person{

String company= "BMW";
int  hiredStudents=7;

/*
introduce(): "Hi, I'm name, a age year old gender who represents company and hired hiredStudents students so far."
hire(): increase hiredStudents by 1
getGoal(): prints out "Hire brilliant junior software developers."
 */

public void introduce(){
  System.out.println("Hi, i am "+ name + ", a" + age + "years old " + gender +
      "who represents" + company + "and hired" + hiredStudents + "students so fare.");
}

public void hire(){
  this.hiredStudents++;
}

public void getGoal(){
  System.out.println("Hire brilliant junior software developers.");
}
public Sponsor(){}

  Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company=company;
  }
}
