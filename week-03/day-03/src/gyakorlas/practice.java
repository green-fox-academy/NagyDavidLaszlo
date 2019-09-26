package gyakorlas;

public class practice {

 private String name= "Jimmy";
  String eyecolor;
  int hightincm;
  int age=38;

  public void writeAge(){
    age=21;           //miért ezt írja ki, ha alatta a this. szerintem a class age-ra vonatkozik ami 38??
    System.out.println(this.age);
  }


  public void writeName(){
    System.out.println(name);
  }

  public String getName() {
    return this.name;
  }

}
