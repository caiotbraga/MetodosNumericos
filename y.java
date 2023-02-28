package MN;

public class y {

    private Double [] yAxis;
    private int conty = 0;

    public y(int index){
        yAxis = new Double[index];
    }

    public void addValue(Double value){
        conty++;
        yAxis[conty] = value;
    }
}
