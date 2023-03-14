package MN.CalculateCoefficient;

import MN.E.summation;
import Variable.x;
import Variable.y;

public class cLinear {
    
    private x xAxis;
    private summation sum;
    private cAngular ca;

    public cLinear(x x, y y){
        this.xAxis = x;
        sum = new summation(x, y);
        ca = new cAngular(x, y);
    }
    
    public double calculateCL(){
        return ((sum.sumAxisY()) / xAxis.getLength()) - ((ca.calculateCA() * sum.sumAxisX()) / xAxis.getLength());
    }

}
