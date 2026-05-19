    //Problem 5
    //
    //Take two numbers from user and print:
    //
    //addition
    //        subtraction
    //multiplication
    //        division
    //remainder

    import java.util.Scanner;

    public class Java6 {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number of carrot: ");
            int carrot=sc.nextInt();
            System.out.println("Enter the number of onion: ");
            int onion=sc.nextInt();
            System.out.println("Total vegetable is :" + (carrot+onion));

        }
    }
