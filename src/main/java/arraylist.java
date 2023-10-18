import java.sql.SQLOutput;
import java.util.Scanner;

public class arraylist {
   public static int Printaverage(int a,int b,int c){
       int sum=a+b+c;
       int average=sum/2;
       System.out.println(average);
    return average;
    }

    public static void main(String[] args) {
       /* Scanner scan = new Scanner(System.in);
        System.out.println("enter first number");
        int a = scan.nextInt();
        System.out.println("enter second number");
        int b= scan.nextInt();


        System.out.println("enter the operation");
        int n = scan.nextInt();
        switch(n){
            case 1: int sum=a+b;
                System.out.println(sum);
                break;
            case 2: int difference=a-b;
                System.out.println(difference);
                break;
            case 3: int multiply=a*b;
                System.out.println(multiply);
                break;
            case 4: int divide=a/b;
                System.out.println(divide);
                break;
            case 5: int module=a%b;
                System.out.println(module);
                break;


        }*/

       /* int i=0;
        while(i < 20) {
            System.out.println(i);
            i=i+1;
        }*/
       /* Scanner scan = new Scanner(System.in);
        System.out.println("enter value of n :");

        int n = scan.nextInt();
        int sum =0;
        for(int i=1;i<=n;i++){
           // System.out.println(i)
            sum = sum+i;}

        System.out.println(sum);



    }
*/

       /* Scanner scan = new Scanner(System.in);
        System.out.println("enter value of n :");

        int n = scan.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }*/
        /*for(int i=0;i<4;i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
        // jyoti
     /*   int n=5;
        int m=4;
      for(int i=0;i<n;i++) {
            for (int j = 0; j <m; j++){
                if(i==0||1==n-1||j==0||j==m-1){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
}
}*/
    /*int n = 5;
    int m = 4;
       for(int i=0; i<n; i++) {
        for(int j=0; j<m; j++) {
        if(i == 0 || i == n-1 || j == 0 || j == m-1) {
        System.out.print("*");
        } else {
        System.out.print(" ");
        }
        }
        System.out.println();
        }
        }
        }*/
       /* int n=5;
        for(int i=0;i<=n;i++){
          for(int j=1;j<=i;j++){
              System.out.print("*");
          }
            System.out.println();
        }
    }
}*/
       /* int n=5;
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}*//*int k=1;
        int i;
        int n=4;
        for(i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();


        }
    }
}*//*for(int i=0;i<=5;i++){
    for(int j=1;j<=i;j++){
        System.out.print(j+" ");
    }
            System.out.println();
        }

    }
}
*//*for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}*/ /*int number=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+"  ");
                number++;
            }
            System.out.println();
        }

    }
}*/
       /* for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                int sum=i+j;
                if(sum % 2==0){
                    System.out.print( "1");
                }
else{
                    System.out.print("0");
                }

            }
            System.out.println();
        }

    }
}*/
Scanner sc= new Scanner(System.in);
        System.out.println("enter first number");
int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        Printaverage(a,b,c);



    }
}