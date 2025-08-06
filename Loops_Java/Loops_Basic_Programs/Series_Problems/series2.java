// package Series_Problems;

public class series2 {
    public static void main(String[] args) {
        //A to Z
        for(char ch='A'; ch<='Z'; ch+=2){
            System.out.print (ch+" ");
        }
        
        System.out.println ();
        int diff=1;
        for(char ch='A'; ch<='Z'; ch+=diff){
            
            System.out.print (ch+" ");
            diff++;
        }
    } 
}
