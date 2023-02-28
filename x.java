package MN;

public class x {
    
    private Double [] xAxis;
    private int contx = 0;

    public x(int index){
        xAxis = new Double[index];
    }

    public void addValue(Double value){
        xAxis[contx] = value;
        contx++;
    }

    public int getLength(){
        return xAxis.length;
    }

    public double getValue(int index){
        return xAxis[index];
    }
}
