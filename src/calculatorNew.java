import java.util.Scanner;
public class calculatorNew {
    public static void main(String []args){
        float a,b,result;
        calculatorNew calc=new calculatorNew();

        System.out.println("enter two numbers:");
            Scanner scan=new Scanner(System.in);
            a=scan.nextFloat();
            b=scan.nextFloat();
            System.out.println("1.ADDITION:\n2.subtraction:\n3.multiplication:\n4.division:\n5.modulus\n6.exit\nenter choice:");
            int choice=0;
            if(choice<=6){
            choice=scan.nextInt();}
            else {
                System.out.print( "you entered wrong number");}
            switch(choice) {
                case 1:
                    result = calc.add(a, b);
                    System.out.println("addition is:" + result);
                    break;
                case 2:
                    result = calc.sub(a, b);
                    System.out.println("subtraction is:" + result);
                    break;
                case 3:
                    result = calc.multi(a, b);
                    System.out.println("multiplication is:" + result);
                    break;
                case 4:
                    result = calc.div(a, b);
                    System.out.println("division is:" + result);
                    break;
                case 5:
                    result = calc.mod(a, b);
                    System.out.println("modulus is:" + result);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.print("WRONG CHOICE!!!");
                    break;
            }
                System.out.print("\n------------------\n");
            }

        public  float add(float a,float b) {
            return a + b;
        }
        public  float sub(float a,float b)
        {
            return a-b;
        }
        public  float multi(float a,float b)
        {

            return a*b;
        }
        public  float div(float a,float b)
        {
            return a/b;
        }
          public float mod(float a,float b)
        {
            return a%b;
        }
    }

