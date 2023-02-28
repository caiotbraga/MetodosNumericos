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
            for(int i = 0; i < xAxis.getLength(); i++){
                result = (xAxis.getValue(i) * yAxis.getValue(i)) + result;
            }
            return result;
    }

    public Double sumSquareX(){
        for(int i = 0; i < xAxis.getLength(); i++){
            result = (Math.pow(xAxis.getValue(i), 2)) + result;
        }
        return result;
    }

    public Double sumSquareY(){
        for(int i = 0; i < xAxis.getLength(); i++){
            result = (Math.pow(yAxis.getValue(i), 2)) + result;
        }
        return result;
    }
    

    public Double sumAxisX(){
        for(int i = 0; i < xAxis.getLength(); i++){
            result = xAxis.getValue(i) + result;
        }
        return result;
    }

    public Double sumAxisY(){
        for(int i = 0; i < xAxis.getLength(); i++){
            result = yAxis.getValue(i) + result;
        }
        return result;
    }
}
