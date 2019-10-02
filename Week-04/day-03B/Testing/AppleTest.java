import static org.junit.Assert.*;

public class AppleTest {

  @org.junit.Test
  public void getApple() {

    Apple apple = new Apple();
    String result =apple.getApple();
    assertEquals(result,"apple");
  }
}