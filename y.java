package MN;

public class y {

    private Double [] yAxis;
    private int conty = 0;

    public y(int index){
        yAxis = new Double[index];
    }

    public void addValue(Double value){
        yAxis[conty] = value;
        conty++;
    }

    public int getLength(){
        return yAxis.length;
    }

    public double getValue(int index){
        return yAxis[index];
    }
}
