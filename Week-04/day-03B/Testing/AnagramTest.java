import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramTest {

  @Test
public void anagram() {

  Anagram wordPlay = new Anagram();

  String first = "papa";
  String second = "paap";

  boolean result=  wordPlay.anagram(first,second);

  assertEquals(true, result);
}

  @Test
  public void anagram_IfDifferent() {

    Anagram wordPlay = new Anagram();

    String first = "papa";
    String second = "mama";

    boolean result=  wordPlay.anagram(first,second);

    assertEquals(false, result);
  }

  @Test
  public void anagram_MissType() {

    Anagram wordPlay = new Anagram();

    String first = "papa";
    String second= "papaa";

    boolean result=  wordPlay.anagram(first,second);

    assertEquals(false, result);
  }
}