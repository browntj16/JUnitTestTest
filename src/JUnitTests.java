import org.junit.Assert;
import org.junit.Test;
public class JUnitTests {
    @Test
    public void testIsPrime(){
        int testCase = 8; // case we are testing
        boolean expectedResult = false; // the expected result is that, yes, 7 is a prime number
        MathFunctions mf = new MathFunctions(); // create our mathfunction class
        boolean result = mf.isPrime(testCase); // run the function
        Assert.assertEquals(result, expectedResult); // compare to see if result matches our expected result
        System.out.println("testIsPrime completed successfully.");
    }
    @Test
    public void testIsEven(){
        int testCase = 111;
        boolean expectedResult = false;
        MathFunctions mf = new MathFunctions();
        boolean result = mf.isEven(testCase);
        Assert.assertEquals(result, expectedResult);
        System.out.println("testIsEven completed successfully.");
    }
    @Test
    public void testAddition(){
        int testCase1 = 11;
        int testCase2 = 3;
        int expectedResult = 14;
        MathFunctions mf = new MathFunctions();
        int result = mf.add(11, 3);
        Assert.assertEquals(result, expectedResult);
        System.out.println("testAddition completed successfully.");
    }
    @Test
    public void testEuclideanDist(){
        double[] vector = {1, 2, 6};
        double expectedResult = Math.sqrt(41);
        MathFunctions mf = new MathFunctions();
        double result = mf.euclideanDistance(vector);
        Assert.assertEquals(result, expectedResult, 1);
        System.out.println("testEuclideanDist completed successfully.");
    }
}
