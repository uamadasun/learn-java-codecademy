// Import statement:
import java.util.ArrayList;

class PrimeDirective {
  
  // Add your methods here:
  public boolean isPrime(int number) {
    if (number == 0) {
      return false;
    }
    for (int i = 2; i < number/2; i++) {
      if (number>2 && number%i ==0) {
        return false;
      }
    }
    return true;
  }

  public ArrayList<Integer> onlyPrimes(int[] numbers) {
    ArrayList<Integer> primes = new ArrayList<Integer>();
    for (int number:numbers) {
      if (isPrime(number)) {
        primes.add(number);
      }
    }
    return primes;
      }

  
  
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
    boolean prime = pd.isPrime(7);
    System.out.println(prime);
    ArrayList<Integer> tester = pd.onlyPrimes(numbers);
    System.out.println(tester);
  }  

}