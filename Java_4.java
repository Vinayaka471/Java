import java.util.Scanner;
public class Java_4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int num;

        do{
            num=sc.nextInt();
            sum=sum+num;
        }
        while (num>=0);
            System.out.println("Sum :"+sum);

    }
}

//Given a stream of number, read the numbers till you read a -ve integer & print their sum of numbers read so for
//ip: 5 3 2 -4 2 0 9 op: 6