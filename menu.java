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
        summation sum;
        coeficientecl ccl;
        try {
            System.out.println("Insert x and y axis element's length: ");
            length = in.nextInt();
            xAxis = new x(length);
            yAxis = new y(length);
            for (int i = 0; i < length; i++) {
                System.out.print("Insert the value of x axis on xAxis[" + (i + 1) + "]: ");
                value = in.nextDouble();
                xAxis.addValue(value);
                System.out.print("Insert the value of y axis on yAxis[" + (i + 1) + "]: ");
                value = in.nextDouble();
                yAxis.addValue(value);
            }
            ca = new cAngular(xAxis, yAxis);
            cl = new cLinear(xAxis, yAxis);
            sum = new summation(xAxis, yAxis);
            System.out.println("-------------------------------------------");
            for (int j = 0; j < length; j++) {
                System.out.printf("X[" + j + "] : %.2f | Y[" + j + "] : %.2f | X.Y : %.2f | X^2 : %.2f | Y^2 : %.2f \n"
                ,xAxis.getValue(j), yAxis.getValue(j), sum.multiply(j),  Math.pow(xAxis.getValue(j), 2), Math.pow(yAxis.getValue(j), 2));
            }
            System.out.println("-------------------------------------------");
            System.out.println("SUMMATION: ");
            System.out.printf("X : %.2f | Y : %.2f | X.Y : %.2f | X^2 : %.2f | Y^2 : %.2f \n"
             , sum.sumAxisX(),  sum.sumAxisY(), sum.sumMultiply(), sum.sumSquareX(), sum.sumSquareY());
            System.out.printf("Regression Linear value : Y = %.2f x X + %.2f \n", ca.calculateCA(), cl.calculateCL());
            ccl = new coeficientecl(xAxis, yAxis);
            System.out.printf("Linear regression  coefficient: %.2f%%", ccl.calculateCCL());

        } catch (Exception e) {
            System.out.println("ERROR");
            System.out.println(e.getMessage());
        }
    }
}
