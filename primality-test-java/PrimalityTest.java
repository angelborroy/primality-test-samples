import java.util.*;
import java.math.*;

/*

  This method is based in Miller-Rabin primality test.

  The probability that the BigInteger is prime exceeds (1 - 1/2^certainty)

  - isProbablePrime() with certainty =  1 means 50% accuracy
  - isProbablePrime() with certainty = 10 means 99.9% accuracy

  Documentation available in https://docs.oracle.com/javase/7/docs/api/java/math/BigInteger.html#isProbablePrime(int)

*/

public class PrimalityTest {

   public static void main(String[] args) {

      // Read command line input to read number to be tested in "n" variable
      Scanner in = new Scanner(System.in);
      BigInteger n = in.nextBigInteger();  // read next input line as BigInteger
      in.close();

      // Returns "prime" if the probability that this BigInteger is prime 
      // exceeds 99.9%
      System.out.println(n.isProbablePrime(10) ? "prime" : "not prime");
   }
   
}
