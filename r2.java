package MN;

public class r2 {
    private x xAxis;
    private y yAxis;
    private coeficientecl cl;
    public r2(x x, y y, coeficientecl cl){
        this.xAxis = x;
        this.yAxis = y;
        this.cl = cl;
    }

    public double calculater2(){
        return Math.pow((cl.calculateCCL() / 100), 2);
    }

}
