import java.util.Scanner;
public class FactorsRecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of which you want the factors:");
        int facNum=sc.nextInt();
        int serial=1;
        int count=factor( facNum,serial,0);
        System.out.println("Total number of Factors are:"+count);
    }

    public static int factor(int orgNum,int serial,int tempCount){
        //Base Case
        if (serial>orgNum) {
            return tempCount;
        }
        //Process
        if (orgNum%serial==0) {
            ++tempCount;
        }
        ++serial;
        //Recursive Call
        return factor(orgNum, serial, tempCount);
    }
}
