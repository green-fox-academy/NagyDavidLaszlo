package fleet;


public class Thing {
  private String name;
  private boolean completed;      // "completed" eldönti hogy kész van-e

  public Thing(String name) {
    this.name = name;
  }

  public void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;        // ha "completed" true [x], ha false [] + name
  }
}