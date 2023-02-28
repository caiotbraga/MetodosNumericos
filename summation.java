package MN;

public class summation {
    
    private x xAxis;
    private y yAxis;
    Double result = 0.0;
    
    public summation(x x, y y){
        this.xAxis = x;
        this.yAxis = y;
    }

    public Double sum2Axis(){
            for(int i = 0; i < this.xAxis.length; i++){
                result = (this.xAxis[i] * valuesT[i]) + result;
            }
            return result;
    }

    public Double sumSquare(){
        for(int i = 0; i < valuesO.length; i++){
            result = (valuesO[i] * valuesO[i]) + result;
        }
        return result;
    }

    public Double sumAxis(){
        for(int i = 0; i < valuesO.length; i++){
            result = valuesO[i] + result;
        }
        return result;
    }
}
