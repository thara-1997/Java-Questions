import java.util.Scanner;

public class PrintTriangles {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter row/columns you want");
//        int numLines = sc.nextInt();
//
//        int row,column = 0;

        //01)Right Triangle
//        for(row=0; row<numLines; row++){
//            for(column=0; column<=row; column++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //02)Inverted triangle
//        for(row=numLines; row>=0; row--){
//            for(column=0; column<=row; column++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter row/columns you want");
        int limit = sc1.nextInt();
        int starting_num= 10;

        int row1,column1;

        for (row1=0; row1<limit; row1++){
            for (column1=0; column1<=row1; column1++){
                System.out.print(starting_num);
                starting_num++;
            }
            System.out.println();
        }


    }
}
