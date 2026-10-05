public class Java8 {
    public static void main(String[] args){
        for(int i=1;i<=20;i++){
                if(i%3==0 && i%5==0){
                    System.out.println("FizzBuzz");
                }
                else if(i%3==0){
                    System.out.println("Fizz");
                }
                else if(i%5==0){
                    System.out.println("Buzz");
                }
            else{
                System.out.println(i);
                }
        }
    }
}

//Pring numbers from 1 to 20 if the number has 3 then pring "Fizz" if the number has 5 then "Buzz" if it has multiple of 3 and 5 then "FizzBuzz"