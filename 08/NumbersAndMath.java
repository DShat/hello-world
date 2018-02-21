public class NumbersAndMath {
    public static void main(String[] args) {
    // Prints out "I will now count my chickens:"
        System.out.println("I will now count my chickens:");
       
        //Counts the number of "hens" and "roosters"  
        System.out.println("Hens " + (25f + 30 / 6));
        System.out.println("Roosters " + (100f - 25 * 3 % 4));
        
        //Prints "Now I will count the eggs:"
        System.out.println("Now I will count the eggs:");
        
        //Determines the amount of eggs
        System.out.println(3f + 2 + 1 - 5 + 4 % 2 - 1 / 4 + 6);
       
        //Prints "Is it true that 3 + 2 < 5-7?"
        System.out.println("Is it true that 3 + 2 < 5 - 7?");
        
        //Determines if 3 + 2 < 5 - 7 is true
        System.out.println(3f + 2 < 5 - 7);
        
        //Finds the value of 3 + 2 and 5 - 7, respectively
        System.out.println("What is 3 + 2? " + (3f + 2));
        System.out.println("What is 5 - 7? " + (5f - 7));
        
        //Prints "Oh, that's why it's false."
        System.out.println("Oh, that's why it's false.");
        
        //Prints "How about some more."
        System.out.println("How about some more.");
        
        //Determines whether 5 is greater, greater or equal, or less or equal than -2 
        System.out.println("Is it greater? " + (5f > -2));
        System.out.println("Is it greater or equal? " + (5f >= -2));
        System.out.println("Is it less or equal? " + (5f <= -2));
    }
}
