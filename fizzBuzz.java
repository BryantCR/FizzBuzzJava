


public class FizzBuzz {

    public static String fizzBuzz(int number) {
        //for(int i=1; i<=100; i++) {
        if(number % 5 == 0 && number % 3 == 0)
            return "FizzBuzz";
        if(number % 5 == 0)
            return "Fizz";
        if(number % 3 == 0)
            return "Buzz";
        return Integer.toString(number);
        //}
    }
    
    // NINJA BONUS:
    // Create an overloaded method for fizzBuzz
    public String fizzBuzz(
        // Parameters
        int number,  
        String multOf3Word, 
        String multOf5Word,
        String multOf15Word
        ) {
        
        // Implement the same logic, but replace "Fizz", "Buzz" and 
        // "Fizzbuzz" with the given words
    }

    public static void main(String[] args) {
        FizzBuzz tester = new FizzBuzz();
        
        System.out.println(fizzBuzz(9));     // Fizz
        System.out.println(fizzBuzz(10));    // Buzz
        System.out.println(fizzBuzz(15));    // FizzBuzz
        System.out.println(fizzBuzz(16));    // 16
        System.out.println(fizzBuzz(2)); 
        
        // Uncomment the following for a more comprehensive test:
        /*
        for (int i = 1; i <= 50; i++) {
            System.out.println(tester.fizzBuzz(i));
        }
        */
    }
}
