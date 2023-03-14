package MN.CalculateCoefficient;

public class aic {
    private sqr sqr;
    private MN.Variable.x x;

    public aic(MN.CalculateCoefficient.sqr sqr, MN.Variable.x x) {
        this.sqr = sqr;
        this.x = x;
    }

    public double  calculateAIC(){
        return x.getLength() * Math.log(sqr.calculateSQR() / x.getLength());
    }
    
}
