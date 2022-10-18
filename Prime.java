import java.util.ArrayList;
import java.util.List;

public class Prime {
    
    /**
     *  Main method to run the program 
     * 
     * 
     * @param args  
     */
    public static void main(String[] args) {

        for (int number : primes(100)) {
            System.out.println(number);
        }

        // printy(crible(100));
    }


    /**
     * 
     * Generate array of numbers from 1 to n+1
     * 
     * @param n number of elements
     * @return an array of size n+1 initialised with zeros 
     */
    public static int [] generate(int n){
        int [] numbers = new int[n+1];
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = 0;
        }
        return numbers;
    }

    /**
     *  Pretty print numbers 
     * @param numbers
     */
    public static void printy(int [] numbers){
        String sep = "\t";

        for (int i = 0; i < numbers.length; i++) {
            String content = i + "[" + numbers[i] + "]" + sep;

            System.out.print(content);        
            if(i % 10 == 0){
                System.out.println();
            }
        }
    }

/** 
 * Crible Eratosth. 
 * 
 * @param n
 * @return
 */
public static List<Integer> primes(int n) {
    
    List<Integer> primes = new ArrayList<>();
    int [] res = crible(n);

    for (int i = 2; i < res.length; i++) {
        if(res[i] == 0){
            primes.add(i);
        }
    }

    return primes;
}

/**
 * Crible 
 * 
 * @param n
 * @return
 */
public static int [] crible(int n){

    final int MARKED = -2;
    int [] numbers = generate(n);

    int squareRoot = (int) Math.sqrt(n);
    numbers[0] = 2;
    int currentPrime; 

    do {
        currentPrime = numbers[0];

        //Marquage multiples
        for (int j = currentPrime * currentPrime; j < numbers.length; j++) {
            if(j % currentPrime == 0) { //multiple
                numbers[j] = MARKED;
            }
        }
        int y = currentPrime + 1;  
        while (numbers[y] == MARKED) 
            y++;        
        numbers[0] = y; // next prime number


    } while (currentPrime <= squareRoot);

    
    return numbers;
}

    
}
