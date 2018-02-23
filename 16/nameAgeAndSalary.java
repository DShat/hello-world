import java.util.Scanner;

public class nameAgeAndSalary{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Hello. What is your name?");
        String name = input.next();
        System.out.println(name);
        System.out.print("Hi, " + name + "! How old are you?");
        int age = input.nextInt();
        System.out.println(age);
        System.out.println("So you're " + age + ", eh? That's pretty old.");
        System.out.print("How much do you make, " + name + "?");
        double salary = input.nextDouble();
        System.out.println(salary);
        System.out.print(salary + "! I hope that's per year and not per hour! LOL!");
    }
}
