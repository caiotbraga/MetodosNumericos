package MN.CalculateCoefficient;

import MN.E.summation;
import MN.Variable.x;
import MN.Variable.y;

public class cAngular {
    
    private x xAxis;
    private summation sum;

    public cAngular(x x, y y){
        this.xAxis = x;
        sum = new summation(x, y);
    }

    public double calculateCA(){
        return ((xAxis.getLength() * sum.sumMultiply()) - (sum.sumAxisX() * sum.sumAxisY())) / 
        ((xAxis.getLength() * sum.sumSquareX()) - (Math.pow(sum.sumAxisX(), 2)));
    }
}
