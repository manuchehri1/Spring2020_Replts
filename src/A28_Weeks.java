import java.util.Scanner;

public class A28_Weeks {

    public static void main(String[] args) {

        // DO NOT CHANGE:
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();

        //WRITE YOUR CODE HERE:
        if(day==1){
            System.out.println("It's a Monday");
        }else if(day==2){
            System.out.println("It's a Tuesday");
        }else if(day==3){
            System.out.println("It's a Wednesday");
        }else if(day==4){
            System.out.println("It's a Thursday");
        }else if(day==5){
            System.out.println("It's a Friday");
        }else if(day==6){
            System.out.println("It's a Saturday");
        }else if(day==7){
            System.out.println("It's a Sunday");
        }else{
            System.out.println("There is no such a day!");
        }

    }

}
