package MN;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op, cont = 0;
        Double [] xAxis = new Double[cont];
        Double [] yAxis;
        Double value;
        char ans = 'o';
        
        do {
            menu();
            op = in.nextInt();
            while (op != 1 && op != 2 && op != 3 && op != 4 && op != 5) {
                System.out.println("Invalid option! Please insert a valid one:");
                op = in.nextInt();
            }
        switch (op) {
            case 1:
            xAxis = new Double[cont];
            System.out.print("Insert a value: ");
            value = in.nextDouble();
            xAxis[cont] = value;
            while(ans == 'Y'){
                cont++;
                System.out.print("Insert a value: ");
                value = in.nextDouble();
                xAxis[cont] = value;
                System.out.print("Insert more? ");
                ans = in.next().charAt(0);
            }
            break;
            case 2:
            yAxis = new Double[cont];
            System.out.print("Insert a value: ");
            value = in.nextDouble();
            yAxis[cont] = value;
            while(ans == 'Y'){
                cont++;
                System.out.print("Insert a value: ");
                value = in.nextDouble();
                yAxis[cont] = value;
                System.out.print("Insert more? ");
                ans = in.next().charAt(0);
            }
            break;
            case 3:
                x Xaxis = new x(xAxis);
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
        System.out.println("3 - Exit");
    }
}
