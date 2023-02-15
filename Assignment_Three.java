package ou_CS3203;
import java.util.*;

public class Assignment_Three {

    public static void main(String[] args) throws Exception{
        int[] array = new int[5];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < array.length; i++){
            int number;
            System.out.println("Enter number: ");
            number = scan.nextInt();
            array[i] = number;
        }
        
        int sum = Sum(array);
        int product = Product(array);

        System.out.println("The sum of the array is: " + sum);
        System.out.println("The product of the array is: " + product);
    }
    
    public static int Sum(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++){
            result += array[i];
        }
        return result;
    }

    public static int Product(int[] array) {
        int result = 1;
        for (int i = 0; i < array.length; i++){
            result = result * array[i];
        }
        return result;
    }



}
