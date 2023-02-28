package MN;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op, length;
        x xAxis;
        y yAxis;
        Double value;
        cAngular ca;
        cLinear cl;
        do {
            menu();
            op = in.nextInt();
            while (op != 1 && op != 2 && op != 3) {
                System.out.println("Invalid option! Please insert a valid one:");
                op = in.nextInt();
            }
            switch (op) {
                case 1:
                    System.out.println("Insert x and y axis element´s length: ");
                    length = in.nextInt();
                    xAxis = new x(length);
                    yAxis = new y(length);
                    for (int i = 0; i < length; i++) {
                        System.out.print("Insert the value of x axis on xAxis[" + i + "]: ");
                        value = in.nextDouble();
                        xAxis.addValue(value);
                        System.out.print("Insert the value of y axis on yAxis[" + i + "]: ");
                        value = in.nextDouble();
                        yAxis.addValue(value);
                    }
                    ca = new cAngular(xAxis, yAxis);
                    cl = new cLinear(xAxis, yAxis);
                    for(int j = 0; j < length; j++){
                        System.out.println("X["+j+"] :" +xAxis.getValue(j)+ "Y["+j+"] : " +yAxis.getValue(j));
                    }
                    System.out.printf("Regression Linear value : Y = %a x X + %l", ca.calculateCA(), cl.calculateCL());
                    break;
                case 2:

                   
                    break;
                case 3:

                    break;
                // ...
                default:
                    // código a ser executado quando nenhum dos casos anteriores é satisfeito
            }
        } while (op != 3);

    }

    public static void menu() {
        System.out.println("Linear regression calculation:");
        System.out.println("1 - Add values to X and Y axis to calculate Linear regression line");
        System.out.println("2 - Linear correlation coefficient");
    }
}
