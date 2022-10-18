public class Prime {
    

    public static void main(String[] args) {
        printy(generate(20));
    }


    /**
     * 
     * Generate array of numbers from 1 to n
     * 
     * @param n
     * @return
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
        for (int i = 1; i < numbers.length; i++) {
            String content = i + "[" + numbers[i] + "]" + sep;
            System.out.print(content);        
            if(i % 10 == 0){
                System.out.println();
            }
        }
    }

    
}
