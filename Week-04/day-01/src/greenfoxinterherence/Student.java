package greenfoxinterherence;

public class Student extends Person {

  String previousOrganization;
  int skippedDays;
//  int numberOfDays;

  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  public void introduce() {
    System.out.println(
        "Hi I am" + name + ", a " + age + "year old" + gender + "from" + previousOrganization
            + "who skipped " + skippedDays +
            "days from the course already.");
  }

  public int skipDays(int numberOfDays) {
  skippedDays=skippedDays+numberOfDays;
  return skippedDays;
}

public Student(){
    super();
    this.previousOrganization="The School of Life";
    skippedDays=0;
}



  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
  }









}

