package ou_CS3203;
import java.util.*;

public class Assignment_Three {
    
    public int Sum(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++){
            result += array[i];
        }
        return result;
    }

    public int Product(int[] array) {
        int result = 1;
        for (int i = 0; i < array.length; i++){
            result = result * array[i];
        }
        return result;
    }

}
