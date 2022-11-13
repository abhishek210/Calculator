import java.util.Scanner;

public class Calculator {
    int a , b;
    Scanner sc = new Scanner(System.in);
    int addition(){
        System.out.println("Enter 2 number for addition ");
        a = sc.nextInt();
        b = sc.nextInt();
        return (a+b);

    }
    int subtraction(){
        System.out.println("Enter 2 number for subtraction ");
        a = sc.nextInt();
        b = sc.nextInt();
        return (a-b);

    }
    int multiplication(){
        System.out.println("Enter 2 number for multiplication ");
        a = sc.nextInt();
        b = sc.nextInt();
        return (a*b);

    }
    int division(){
        System.out.println("Enter 2 number for division ");
        a = sc.nextInt();
        b = sc.nextInt();
        return (a/b);

    }
    void normal(){
        System.out.println("1 : addition ");
        System.out.println("2 : subtraction ");
        System.out.println("3 : multiplication ");
        System.out.println("4 : division ");
        System.out.println("enter the number : ");
        int choice = sc.nextInt();
        int ans = 0;
        switch (choice)
        {
            case 1 :
                 ans = addition();
                 break;
            case 2 :
                 ans = subtraction();
                 break;
            case 3 :
                 ans = multiplication();
                 break;
            case 4 :
                 ans = division();
                 break;
            default : 
            System.out.println("wrong selection");
        }
        System.out.println("Answer = "+ans);
    }
    void scientific(){
        System.out.println("1 : power ");
        System.out.println("2 : square root ");
        System.out.println("3 : minimum ");
        System.out.println("4 : maximum ");
        System.out.println("enter the choice : ");
        int choice = sc.nextInt();
        int ans = 0;
        switch (choice)
        {
            case 1 :
                 ans = power();
                 break;
                 
            case 2 :
                 ans = squareRoot();
                 break;
            case 3 :
                 ans = maximum();
                 break;
            case 4 :
                 ans = minimum();
                 break;
            default : 
            System.out.println("wrong selection");
        }
        System.out.println("Answer = "+ans);
    }
    int power(){
        System.out.println("Enter 2 number for power ");
        a = sc.nextInt();
        b = sc.nextInt();
        return ((int)Math.pow(a, b));

    }
    int squareRoot(){
        System.out.println("Enter the number for squareRoot ");
        a = sc.nextInt();
        
        return ((int)Math.sqrt(a));

    }
    int maximum(){
        System.out.println("Enter 2 number for maximum ");
        a = sc.nextInt();
        b = sc.nextInt();
        return ((int)Math.max(a, b));

    }
    int minimum(){
        System.out.println("Enter 2 number for minimum ");
        a = sc.nextInt();
        b = sc.nextInt();
        return ((int)Math.min(a, b));

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator obj = new Calculator();
        System.out.println("1 : Normal calculator ");
        System.out.println("2 : Scientific calculator ");
        System.out.println("Enter the choice :");
        int choice = sc.nextInt();
        switch (choice){
            case 1 :
                  obj.normal();
                  break;
            case 2 :
                  obj.scientific();
                  break; 
            default :
            System.out.println("wrong input");     
        }

    }

}