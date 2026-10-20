import java.util.Scanner;
public class Largest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
int num1=sc.nextInt();

System.out.println("Enter the second number: ");
int num2=sc.nextInt();

System.out.println("Enter the third number: ");
int num3=sc.nextInt();

if(num1>=num2 && num1>=3){
System.out.println("Largest number is: "+num1);
}
if(num2>=num1 && num2>=3){
System.out.println("Largest number is: "+num2);
}
if(num3>=num1 && num3>=2){
System.out.println("Largest number is: "+num3);
}
}
}