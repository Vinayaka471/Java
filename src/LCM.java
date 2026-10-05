import java.util.*;
public class LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();

        int lcm;

        if(A>B){
            lcm=A;
        }
        else{
            lcm=B;
        }
        while(true){
            if(lcm%A==0 && lcm%B==0){
                System.out.print(lcm);
                break;
            }
            lcm++;
        }
    }   
}


