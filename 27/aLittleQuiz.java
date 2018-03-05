import java.util.Scanner;
public class aLittleQuiz {
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
   
    System.out.print("Are you ready for a quiz? (input Y or N) ");
    String option;
    option = input.nextLine();
    if (option.equals ("Y")){
        System.out.println("Okay, here it comes!");
        }
    else if (option.equals ("N")){
        System.out.println("Too bad! Here it comes!");
        }
    else {
        System.out.println("Whatever then. Type what you want, but I haven't learned to loop yet so you're stuck answering this quiz.");
        }
        
    System.out.println(" Q1) What is the capital of Alaska?\n 1) Melbourne\n 2) Anchorage\n 3) Juneau");
    String answerOne = input.next();
    int totalCorrect1;
    if (answerOne.equals  ("3")){
        System.out.println("Correct!");
        totalCorrect1 = 1;
        }
    else if (answerOne.equals  ("1") || answerOne.equals ("2")){
        System.out.println("Wrong.");
        totalCorrect1 = 0;
        }
    else { 
        System.out.println("Have it your way then. It's not funny.");
        totalCorrect1 = -3;
        }
        
    System.out.println("Q2) Can you store the value \"cat\" in a variable type int?\n 1) yes\n 2) no");
    String answerTwo = input.next();
    int totalCorrect2;
    if (answerTwo.equals ("2")){
        System.out.println("Correct.");
        totalCorrect2 = 1;
        }
    else if (answerTwo.equals ("1")){
        System.out.println("Sorry, \"cat\" is a string. ints can only store numbers.");
        totalCorrect2 = 0;
        }
    else{
        System.out.println("Really now?");
        totalCorrect2 = -3;
        }
    
    System.out.println("What is the result of 9+6/3?\n1) 5\n2) 11\n3) 15/3");
     String answerThree = input.next();
     int totalCorrect3;
     if (answerThree.equals ("2")) {
     System.out.println("Correct.");
        totalCorrect3 = 1;
        }
     else if (answerThree.equals ("1") || answerThree.equals ("3")){
     System.out.println("Sorry. Check your math.");
        totalCorrect3 = 0;
        }
     else {
     System.out.println("You're seriously not funny.");
        totalCorrect3 = -3;
        }
     int totalCorrect = totalCorrect1 + totalCorrect2 + totalCorrect3;
     if (totalCorrect == 3){
        System.out.println("Good job! You got 3 out of 3 correct!\nThanks for playing!");
        }
     else if (totalCorrect == 2){
        System.out.println("Overall, you got 2 out of 3 correct.\nThanks for playing!");
        }
     else if (totalCorrect == 1){
        System.out.println("You got 1 out 3 correct.\nBetter luck next time.");
        }
    else if (totalCorrect == 0){
        System.out.println("You didn't get any questions right.\nStudy harder next time!");
        }
    else {
        System.out.println("You should be ashamed of yourself.");
        }
    }
}



