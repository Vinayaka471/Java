import java.util.*;
public class ItoB {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        String rem="";
        while(num>0){
            rem= rem +(num%2);
            num=num/2;

        }
        System.out.print("The binary number is: "+rem);
    }
}
