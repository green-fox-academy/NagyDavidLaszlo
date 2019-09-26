package gyakorlas;

public class practiceMain {

  public static void main(String[] args) {

    practice person = new practice();

    person.writeAge();

    person.writeName();             // ezzel kiírhatom az egyébként private nevet (Jimmy),
    // mert nem közvetlen nyúlok hozzá

 //   System.out.println(person.name);  //ezzel nem írhatom ki mert közvetlen teszem

    person.getName();


  }

}


