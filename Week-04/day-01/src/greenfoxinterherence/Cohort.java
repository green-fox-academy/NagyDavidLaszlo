package greenfoxinterherence;


import java.util.ArrayList;

public class Cohort {

  String name;

  ArrayList<Student> students = new ArrayList<>();
  ArrayList<Mentor> mentors = new ArrayList<>();

  public void addStudent(Student student) {
    student = new Student();
    students.add(student);
  }

  public void addMentor(Mentor mentor) {
    mentor = new Mentor();
    mentors.add(mentor);
  }
public void Cohort(){

}
  // info(): prints out "The name cohort has students.size() students and mentors.size() mentors."

  public void info() {
    System.out.println(
        "The" + name + "cohort has " + students.size() + "students " + mentors.size() + "mentors.");
  }
  public void Cohort(String name) {


   students.clear();
   mentors.clear();
  }
}