package es.usj.crypto;

import java.util.*;
import java.math.*;
import org.apache.commons.math3.primes.Primes;

/*

  This method is based in Miller-Rabin primality test.

  Probability (certainty) is adjusted automatically according to the input length.

  Maximum number allowed is 2147483647 (since it relays in Integer numbers, 
  while the previous one was using BigInteger).

  In Java this limit is named as Integer.MAX_VALUE

  https://docs.oracle.com/javase/6/docs/api/java/lang/Integer.html#MAX_VALUE

*/

public class PrimalityTest {

   public static void main(String[] args) {

      // Read command line input to read number to be tested in "n" variable
      System.out.println("Type your number to be analyzed:");
      Scanner in = new Scanner(System.in);
      BigInteger n = in.nextBigInteger(); // read next input line as BigInteger
      in.close();

      // Returns "prime" with auto-adjusted probability
      // What returns "n.intValue()" when n is bigger than Integer.MAX_VALUE
      System.out.println(Primes.isPrime(n.intValue()) ? "prime" : "not prime");
   }
   
}
