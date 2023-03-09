package MN;

public class predict {
    private cAngular ca;
    private cLinear cl;

    public predict(cAngular ca, cLinear cl) {
        this.ca = ca;
        this.cl = cl;
    }

    public double calculateValue(Double x){
        return (ca.calculateCA() * x) + cl.calculateCL(); 
    }
}
