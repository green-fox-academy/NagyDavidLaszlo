import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;

public class SumTest {

  @Test
  public void sumNumbers() {

    ArrayList<Integer> numbersAdded = new ArrayList<>(Arrays.asList(2, 4, 7, 8));

    Sum sumTest = new Sum();
    int testresult = sumTest.sumNumbers(numbersAdded);
    assertEquals(testresult, 21);
  }
}