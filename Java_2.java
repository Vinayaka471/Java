import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Java_2{
    public static void main(String[] args){
        System.out.println("Enter the number: ");
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();

    String binary="";

    while(num>0){
        int rem=num%2;
        binary= binary+rem;

        num=rem/2;
    }
        System.out.println(num);
    }
}