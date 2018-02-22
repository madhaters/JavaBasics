import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
        String[] arr={"Hello","Next","Work"};
        //write a foreach loop to iterate over the given collection
        for(String i: arr ){
            System.out.print( "\n"+i);
        }
        //do the same in fori loop

        for(int i=0;i<arr.length;i++)


        {
            System.out.print("\n"+arr[i]);

        }
        //do same with while loop
        //Hint use *arr.length* to get the number of elements in array
        int i=0;
        while(i<arr.length){
            System.out.print("\n"+arr[i]);
            i=i+1;
        }

        //FINAL PRINT stars triangle using any of the loop structures
        int s,j,k;
        for(s=0; s<=5; s++)
        {
            for(j=6; j<=s; j++)
            {
                System.out.print(" ");
            }
            for(k=1; k<=(2*s-1); k++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        //Bonus Print stars line equal to number given in the input from console.
            //eg if i input 3 it should print
                // ***
                // ***
                // ***
            // or if i input 5 it should print
                // *****
                // *****
                // *****
                // *****
                // *****
        int t,u,n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no. of stars you want to print:");
        n=scanner.nextInt();
        for(t=1; t<=n; t++)
        {

            for(u=1; u<=n; u++)
            {
                System.out.print("*");
            }
            {System.out.print("\n");
        }

    }


    }
}
