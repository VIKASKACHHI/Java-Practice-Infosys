import java.util.*;

public class array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];
        sc.close();
        for(int i = 0; i<size;i++){
            numbers[i] = sc.nextInt();
        }

        for(int i = 0; i<size; i++){
            System.out.println(numbers[i]);
        }


    }
}
