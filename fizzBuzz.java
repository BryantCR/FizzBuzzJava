


public class FizzBuzz {
    public String fizzBuzz(int number) {
        //for(int i=1; i<=100; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                console.log("FizzBuzz");
            } 
            else{
            if(i % 3 == 0) {
                console.log("Fizz");
                }
                else{
                    if(i % 5 == 0) {
                    console.log("Buzz");
                    }
                    else {
                        Integer.toString(number);
                    }
                } 
            }
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
}