package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void oneSetBalanceBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void emptyStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void stringWithNoBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Hello World"));
    }
    @Test
    public void onlyOneBracketLeftReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void onlyOneBracketRightReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void stringWithBalancedBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("My array [1,2,3] and another array index [3]"));
    }

    @Test
    public void stringWithUnbalancedBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void stringWithNestedBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("An array of arrays [[0,1],[4,5],[10,2],[100,200]]"));
    }

    @Test
    public void lotsOfNestedBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[[[]]]]]]"));
    }

    @Test
    public void wrongOrderBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void wrongOrderBracketsInStringReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void wrongOrderNestedBracketsInStringReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[Launch[]Code][]]]"));
    }

    @Test
    public void correctOrderNestedBracketsInStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch[Code]]"));
    }

    @Test
    public void openFinalBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[]][]]["));
    }

    @Test
    public void wrongLeftBracketWithoutRightBracketStartReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]][["));
    }

}
