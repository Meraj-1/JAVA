// import java.util.*;
// public class Function {
//     public static void  calculate(int a, int b) {               //parameter  wo value jo function ke andar aati hai usse parameter
//         int sum = a + b;       // Compute sum
//         System.out.println("The sum is: " + sum);  // Output result
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter two numbers:");
//         int a = sc.nextInt();  // First number
//         int b = sc.nextInt();  // Second number
//          calculate(a,b);                               //argument  (a,b)        wo argument jo actual fution call karne ke time di jaati hai usse argumrent kehte hau
//     }    

//     }

// import java.util.*;
// public class Function {
//     public static void  Swap(int a, int b) {       
//         int temp = a;
//         a = b;
//         b= temp;
//         System.err.println("a="+a);
//         System.err.println("b="+b);

//     }
//     public static void main(String[] args) {
//     int a= 5;
//     int b =3;
//     Swap(a,b);
//     }    
// }



// import java.util.*;
// public class Function {
//     public static int product(int a, int b) {       
   
//         int product = a * b ;
//         return product;
//     }
//     public static void main(String[] args) {
//         int a = 3;
//         int b = 6;
//       int fin =  product(a,b);
//       System.out.println("The product is: " + fin);
//     }    
// }


import java.util.*;
// public class Function {
//     public static int product(int n) {       
//        int f = 1;
//        for(int i = 1; i <= n; i++) {
//         f = f*i;
//        }
//        return f;
//     }
  
//     public static void main(String[] args) {
  
//      System.out.println(product(4));
//     }    
// }


public class Function {
    public static int product(int n) {       
       int f = 1;
       for(int i = 1; i <= n; i++) {
        f = f*i;
       }
       return f;
    }


    /////// Functions //////// Overloading using parameters
    // public static int sum(int a,int b) {
    //  return a + b;
    // }
    public static int sum(int a, int b, int c){
        return a + b + c;
    }
    // END //////// 


    ////////Functions //////// overloading diffrent types
    public static int sum(int a,int b) {
        return a + b;
    } 
    
    public static float  sum(float a, float b){
        return a + b;
    }
    /// end
   
    public static  boolean isPrime(int n) {
        boolean isprime = true;
      for(int i = 2; i <= n-1 ; i++){
        if(n % i == 0){
          isprime = false;
          break;
        }
      }
      return isprime;

    };
 

    public static void main(String[] args) {
     System.out.println(isPrime(12));
    }    
}