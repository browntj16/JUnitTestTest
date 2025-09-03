import java.util.Arrays;

/**
 * basically, this class will house basic functions (some of which may feature intentional mistakes) for me to perform
 * JUnit tests on.
 */
public class MathFunctions {
    /**
     * function that uses the sieveOfEratosthenes to determine if a number is prime.
     * @param n
     * @return
     */
    public boolean isPrime(int n){
        boolean[] boolArr = sieveOfEratosthenes(n+1);
        if(boolArr[n]){
            return true;
        }
        return false;
    }
    public boolean isEven(double x){
        if(x%2==0){
            return true;
        }
        return false;
    }
    /**
     * stupidly simple function. no intentional bugs in this one, so it should always pass our tests
     * @param x
     * @param y
     * @return
     */
    public int add(int x, int y){
        return x+y;
    }

    /**
     * calculates euclidean distance of a vector from the origin. works in n-dimensions.
     * intentionally, there is a bug in this one. there is an
     * unnecessary subtraction from the upper limit of our for loop, and thus we cut off the final scalar of our vector.
     * @param vector
     * @return the euclidean distance of said vector
     */
    public double euclideanDistance(double[] vector){
        double dist = 0;
        if(vector.length == 1){
            return vector[0];
        }
        for(int i = 0; i < vector.length-1; i++){
            double scalar = vector[i];
            dist = dist + (scalar * scalar); // this is a quick and dirty way of doing this, and it only works because
            // we're measuring distance from the origin. it should actually be (x2 - x1)^2, but since one of the points would
            //be the origin and hence 0, then it can be simplified to (x2)^2
        }
        return Math.sqrt(dist);
    }

    /**
     * computationally slow, but nonetheless cool algorithm to determine all prime numbers up to n. i copied it straight from
     * the pseudocode of the wikipedia page on the sieve with not much thought, so it could
     * be buggy. fortunately, it really doesnt matter if it is or is
     * not buggy since i'm here to test JUnit tests. JUnit tests will actually determine whether it is or is not buggy, so this
     * will make for a good test
     * @param n
     * @return returns boolean array corresponding to prime numbers up to n (for example, if boolArray[i] == true,
     * then i is prime)
     */
    private boolean[] sieveOfEratosthenes(int n){
        boolean[] boolArray = new boolean[n];
        Arrays.fill(boolArray, Boolean.TRUE);

        for(double i = 2; i < Math.sqrt(n); i++){
            if(boolArray[(int)i]==true){
                for(double j = (i * i); j < n; j= j+ i){
                    boolArray[(int)j] = false;
                }
            }
        }
        return boolArray;
    }
}
