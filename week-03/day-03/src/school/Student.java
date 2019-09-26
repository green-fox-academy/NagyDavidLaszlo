package school;

public class Student {

/*
Create Student and Teacher classes
Student
learn() -> prints the student is learning something new
question(teacher) -> calls the teachers answer method
Teacher
teach(student) -> calls the students learn method
answer() -> prints the teacher is answering a question
Instantiate a Student and Teacher object
Call the student's question() method and the teacher's teach() method


 */
  public void learn() {
    System.out.println("Student is learning something new.");
  }

  public void question(Teacher teacher) {
    teacher.answer();

  }


}
