package MN;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op, length;
        x xAxis;
        y yAxis;
        // Double [] xAxis = new Double[contx];
        //Double [] yAxis;
        Double value;
        char ans = 'o';
        x vecx;
        do {
            menu();
            op = in.nextInt();
            while (op != 1 && op != 2 && op != 3 && op != 4 && op != 5) {
                System.out.println("Invalid option! Please insert a valid one:");
                op = in.nextInt();
            }
        switch (op) {
            case 1:
            System.out.println("Insert x axis element´s length: ");
            length = in.nextInt();
            xAxis = new x(length);
            for(int i = 0; i < length; i++){
                System.out.print("Insert the value of x axis on xAxis["+i+"]: ");
                value = in.nextDouble();
                xAxis.addValue(value);
            }
            break;
            case 2:
            System.out.println("Insert y axis element´s length: ");
            length = in.nextInt();
            yAxis = new y(length);
            for(int i = 0; i < length; i++){
                System.out.print("Insert the value of y axis on yAxis["+i+"]: ");
                value = in.nextDouble();
                yAxis.addValue(value);
            }
            break;
            case 3:
                
                break;
            // ...
            default:
                // código a ser executado quando nenhum dos casos anteriores é satisfeito
        }
    }while(op != 3);
        
    }

    public static void menu() {
        System.out.println("Linear regression calculation:");
        System.out.println("1 - Add values to X axis");
        System.out.println("2 - Add values to Y axis");
        System.out.println("3 - Linear regression line value");
        System.out.println("4 - Linear correlation coefficient");
    }
}
