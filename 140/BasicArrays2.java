import java.util.Random;
public class BasicArrays2{
        public static void main(String[] args){
        Random r = new Random();
        int[] randomNumbers = new int[10];
        for (int i = 0; i<randomNumbers.length; i++){
        randomNumbers[i] = r.nextInt(100);
        }
        
        for (int x = 0; x<randomNumbers.length; x++){
        System.out.println("Slot " + x +" contains a " + randomNumbers[x]);
        }
    }
}
    
