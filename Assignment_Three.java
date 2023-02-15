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
        int[] reversed = Reverse(array);

        System.out.println("The sum of the array is: " + sum);
        System.out.println("The product of the array is: " + product);
        System.out.println("This is reversed array: ");
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        
        
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
    public static int[] Reverse(int[] array){
        int[] reversed = new int[array.length];

        for (int i = array.length - 1; i >= 0; i++){
            int counter = 0;
            reversed[counter] = array[i];
            counter += 1;
        }
        return reversed;
    }

    
}
