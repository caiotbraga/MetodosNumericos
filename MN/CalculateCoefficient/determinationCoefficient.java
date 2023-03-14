package MN.CalculateCoefficient;

public class determinationCoefficient {
    
    private coeficientecl cl;
    
    public determinationCoefficient(coeficientecl cl){
        this.cl = cl;
    }

    public double calculater2(){
        return Math.pow((cl.calculateCCL() / 100), 2);
    }

}
