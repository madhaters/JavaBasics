import java.util.Scanner;
public class calculatorNew {

    public static void main(String []args){
        float a,b,result;
        System.out.println("enter two numbers:");
            Scanner scan=new Scanner(System.in);
            a=scan.nextFloat();
            b=scan.nextFloat();
            System.out.println("1.ADDITION:\n2.subtraction:\n3.multiplication:\n4.division:\n5.exit\nenter choice:");
            int choice=0;
            if(choice<=5){
            choice=scan.nextInt();}
            else {
                System.out.print( "you entered wrong number");}
            switch(choice){
                case 1:{
                    result=add(a,b);
                    System.out.println("addition is:"+result);
                    break;}
                case 2:{
                    result=sub(a,b);
                    System.out.println("subtractio is:"+result);
                    break;}
                case 3:
                {
                    result=multi(a,b);
                    System.out.println("multiplication is:"+result);
                    break;}
                case 4:
                {
                    result=div(a,b);
                    System.out.println("division is:"+result);
                    break;}
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.print("WRONG CHOICE!!!");
                    break;
            }
                System.out.print("\n------------------\n");
            }
        public static float add(float a,float b)
        {
            return a+b;
        }
        public static float sub(float a,float b)
        {
            return a-b;
        }
        public static float multi(float a,float b)
        {
            return a*b;
        }
        public static float div(float a,float b)
        {
            return a/b;
        }
    }

