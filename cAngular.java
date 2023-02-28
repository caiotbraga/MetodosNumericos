package MN;

public class cAngular {
    
    private x xAxis;
    private y yAxis;
    private summation sum;

    public cAngular(x x, y y){
        this.xAxis = x;
        this.yAxis = y;
        sum = new summation(x, y);
    }

    public double calculateCA(){
        return ((xAxis.getLength() * sum.sumMultiply()) - (sum.sumAxisX() * sum.sumAxisY())) / 
        ((xAxis.getLength() * sum.sumSquareX()) - (Math.pow(sum.sumAxisX(), 2)));
    }
}
