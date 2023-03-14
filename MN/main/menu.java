package MN.main;

import java.util.Scanner;

import MN.predict;
import MN.CalculateCoefficient.cAngular;
import MN.CalculateCoefficient.cLinear;
import MN.CalculateCoefficient.coeficientecl;
import MN.CalculateCoefficient.determinationCoefficient;
import MN.CalculateCoefficient.sqr;
import MN.E.summation;
import Variable.x;
import Variable.y;

public class menu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op, length;
        x xAxis;
        y yAxis;
        Double value, x;
        cAngular ca;
        cLinear cl;
        summation sum;
        coeficientecl ccl;
        determinationCoefficient r2;
        predict y;
        sqr sqr;
        System.out.println("Insert x and y axis element's length: ");
        length = in.nextInt();
        xAxis = new x(length);
        yAxis = new y(length);
        ccl = new coeficientecl(xAxis, yAxis);
        ca = new cAngular(xAxis, yAxis);
        cl = new cLinear(xAxis, yAxis);
        y = new predict(ca, cl);
        r2 = new determinationCoefficient(ccl);
        sum = new summation(xAxis, yAxis);
        sqr = new sqr(r2, yAxis, sum);
        try {
            do {
                menu();
                op = in.nextInt();
                switch (op) {
                    case 1:
                        for (int i = 0; i < length; i++) {
                            System.out.print("Insert the value of x axis on xAxis[" + (i + 1) + "]: ");
                            value = in.nextDouble();
                            xAxis.addValue(value);
                            System.out.print("Insert the value of y axis on yAxis[" + (i + 1) + "]: ");
                            value = in.nextDouble();
                            yAxis.addValue(value);
                        }
                       
                        System.out.println("-------------------------------------------");
                        for (int j = 0; j < length; j++) {
                            System.out.printf(
                                    "X[" + j + "] : %.2f | Y[" + j
                                            + "] : %.2f | X.Y : %.2f | X^2 : %.2f | Y^2 : %.2f \n",
                                    xAxis.getValue(j), yAxis.getValue(j), sum.multiply(j),
                                    Math.pow(xAxis.getValue(j), 2), Math.pow(yAxis.getValue(j), 2));
                        }
                        System.out.println("-------------------------------------------");
                        System.out.println("SUMMATION: ");
                        System.out.printf("X : %.2f | Y : %.2f | X.Y : %.2f | X^2 : %.2f | Y^2 : %.2f \n",
                                sum.sumAxisX(), sum.sumAxisY(), sum.sumMultiply(), sum.sumSquareX(), sum.sumSquareY());
                        System.out.printf("Regression Linear value : Y = %.2f x X + %.2f \n", ca.calculateCA(),
                                cl.calculateCL());
                       
                        System.out.printf("Linear regression  coefficient: %.2f%%\n", ccl.calculateCCL());
                        break;
                    case 2:
                        System.out.printf("R^2 value: %.2f\n", r2.calculater2());
                        break;
                    case 3:
                        System.out.print("Insert x value to predict: ");
                        x = in.nextDouble();
                        System.out.printf("Y = %.2f\n", y.calculateValue(x));
                        break;
                    case 4: 
                        System.out.printf("SQR : %.2f \n" , sqr.calculateSQR());
                    default:
                        // código a ser executado se expressao não for igual a nenhum dos valores
                        // especificados
                        break;
                }
            } while (op != 5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void menu() {
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("1 - Calculate regression linear line and regression coefficient");
        System.out.println("2 - Calculate r2");
        System.out.println("3 - Predict value");
        System.out.println("4 - Calculate SQR");
        System.out.println("5 - Exit");
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}