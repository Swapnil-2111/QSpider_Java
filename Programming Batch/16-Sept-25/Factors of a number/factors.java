// Factors of a number

// public class factors {
//     public static void main(String[] args) {
//         int den=1;
//         int num=100;
//         while (den<=num) {
//             if (num%den==0) {
//                 System.out.println(den);
//             }
//             den++;
//         }
        
//     }
// }


// Second Approach to solve the above problem

public class factors{
    public static void main(String[] args) {
        int den=1;
        int num=100;
        while (den<=num/2) {
            if (num%den==0) {
                System.out.println(den);
            }
            den++;
        }
        System.out.println(num);
    }
}
