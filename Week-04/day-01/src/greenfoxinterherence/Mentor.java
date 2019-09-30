package greenfoxinterherence;

public class Mentor extends Person {

  String level = "intermediate";

  // @Override - Erre mi szükség????
  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }
  Mentor() {
    super();
  }

  Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }
/*
Mentor(name, age, gender, level)
Mentor(): sets name to Jane Doe, age to 30, gender to female, level to intermediate
 */

}
