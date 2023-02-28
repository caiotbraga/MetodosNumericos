package MN;

public class cLinear {
    
    private x xAxis;
    private y yAxis;
    private summation sum;
    private cAngular ca;

    public cLinear(x x, y y){
        this.xAxis = x;
        this.yAxis = y;
        sum = new summation(x, y);
        ca = new cAngular(x, y);
    }
    
    public double calculateCL(){
        return ((sum.sumAxisY()) / xAxis.getLength()) - ((ca.calculateCA() * sum.sumAxisX()) / xAxis.getLength());
    }

}
