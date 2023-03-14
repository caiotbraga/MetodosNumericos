package MN.CalculateCoefficient;

import MN.E.summation;
import Variable.x;
import Variable.y;

public class coeficientecl {
    
    private x xAxis;
    private summation sum;
    

    public coeficientecl(x x, y y){
        this.xAxis = x;
        sum = new summation(x, y);
    }

    public Double calculateCCL(){
       double r = ((xAxis.getLength() * sum.sumMultiply()) - (sum.sumAxisX() * sum.sumAxisY())) * 100;
       double r2 = ((xAxis.getLength() * sum.sumSquareX()) - Math.pow(sum.sumAxisX(), 2)); 
       double r3 = (xAxis.getLength() * sum.sumSquareY()) - (Math.pow(sum.sumAxisY(), 2)); 
       double r4 = r2 * r3;
       
       
       
       
        return   r / Math.sqrt(r4);
    }
}
