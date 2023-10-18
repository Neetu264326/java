import java.util.Scanner;

public class Reverserray {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("reverse array");
        int a[]=new int [2];

        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter array");
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();

        }
        System.out.println("Array");
        for (int i =0;i<a.length;i++){
            System.out.println(a[i] +"");

        }
        System.out.println("reverse array");
        for (int i=a.length-1;i>=0;i--){
            System.out.println(a[i] +"");

        }

    }

}
