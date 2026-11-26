import java.util.Scanner;

// public class recursion {
//     public static int printNum(int n,int num){
         
//         if(n>num){
//             return 0;
//         }
       
//         return n+ printNum(n+1,num);
//     }

//     public static void main(String[] args) {
//         Scanner num1 = new Scanner(System.in);
//         int num = num1.nextInt();
        
       
//         int res = printNum(1,num);
//         System.out.println(res); 
//      }
// }


// Print fibbonacii of a number 

public class recursion {
    public static int fibbonacii(int num){
        if(num==0){
            return 0;
        }  if(num==1){
            return 1;
        }


        

        return fibbonacii(num-1) + fibbonacii(num - 2);
    }
    


public static void main(String[] args){
    Scanner n = new Scanner(System.in);
    int num = n.nextInt();

    for (int i = 0;i<num;i++){
        System.out.print(fibbonacii(i)+" ");
    }
}

}