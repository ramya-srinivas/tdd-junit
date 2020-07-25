import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringATest {
    /*TODO list for  my features
      1. only one A in 1st: "ABCD" => "BCD"
      2. only one A in 2nd: "BACD" => "BCD"
      3. two A's : "AACD" => "CD" || "AABAA" => "AABAA"
      4. length 0: "" => ""
      5. no A's in 1st two positions: "BBAA" => "BBAA"
      6. length 1 and A: "A" => ""
      7. length 1 and not A: "B" => "B"
     */
    StringA presentInFirst2;

    @BeforeEach
    public void setup() {
        presentInFirst2 = new StringA();
    }

    @Test
    void onlyOneAin1stPosition() {
        assertEquals("BCD", presentInFirst2.remove_A("ABCD"));
    }

    @Test
    public void onlyOneAin2ndPosition() {
        assertEquals("BCD", presentInFirst2.remove_A("BACD"));
    }

    @Test
    public void twoAs() {
        assertEquals("CD", presentInFirst2.remove_A("AACD"));
        assertEquals("BAA", presentInFirst2.remove_A("AABAA"));
    }

    @Test
    public void emptyString() {
        assertEquals("", presentInFirst2.remove_A(""));
    }

    @Test
    public void noAsInFistTwoPositions() {
        assertEquals("BBAA", presentInFirst2.remove_A("BBAA"));
    }

    @Test
    public void lenght1AndA() {
        assertEquals("", presentInFirst2.remove_A("A"));
    }

    @Test
    public void lenght1AndNotA() {
        assertEquals("B", presentInFirst2.remove_A("B"));
    }

}