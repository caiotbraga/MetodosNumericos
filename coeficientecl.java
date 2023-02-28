package MN;

public class coeficientecl {
    
    private x xAxis;
    private y yAxis;
    private summation sum;

    public coeficientecl(x x, y y){
        this.xAxis = x;
        this.yAxis = y;
        sum = new summation(x, y);
    }

    public Double calculateCCL(){
        return ((xAxis.getLength() * sum.sumMultiply()) - (sum.sumAxisX() * sum.sumAxisY())) / 
        Math.sqrt(((xAxis.getLength() * sum.sumSquareX()) - Math.pow(sum.sumAxisX(), 2)) 
        * (xAxis.getLength() * sum.sumSquareY())- (Math.pow(sum.sumAxisY(), 2)));
    }
}
