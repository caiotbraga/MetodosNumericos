package MN.CalculateCoefficient;

import MN.E.summation;
import MN.Variable.y;

public class sqr {
    private determinationCoefficient r2;
    private y y;
    private summation sum;

    public sqr(determinationCoefficient r2,y y, summation sum) {
        this.r2 = r2;
        this.y = y;
        this.sum = sum;
    }
    
    public double calculateSQR(){
        return (r2.calculater2() - 1) * (sum.sumSquareY() -((Math.pow(sum.sumAxisY(), 2)) / y.getLength()));
    }
    
}
