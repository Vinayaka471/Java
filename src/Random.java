public class Random {
    public static void main(String[] args){
        System.out.print("Numbers are: ");
    int nums;
    while(true){
         nums=(int) (Math.random()*10+1);  //Math.random => 0.0<= X <1
        if(nums==5)
            break;

        System.out.print(nums+" ");

    }
    }
}

// I need to generate random numbers from 1 to 10 and print the o/p but terminate when i get 5