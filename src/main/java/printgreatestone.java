import java.util.Scanner;

public class printgreatestone {
    public static void printgreater(int a, int b) {
        // int a;
        // int b;

        if (a < b) {
            System.out.println("greater number is:" + b);
        }
        if (a > b) {
            System.out.println("greater number is:" + a);
        }
        return  ;
    }


    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("enter first number");
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        printgreater(a,b);

    }


}
