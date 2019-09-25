package animal;

public class animals {
  int hunger= 50;
  int thirst= 50;

  public animals() {
  }

  public void eat (){
    hunger = hunger -1; }

  public void drink (){
    thirst = thirst -1; }

  public void play (){
    thirst = thirst +1;
    hunger = hunger +1;
  }
}