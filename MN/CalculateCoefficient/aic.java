package MN.CalculateCoefficient;

public class aic {
    private sqr sqr;
    private Variable.x x;

    public aic(MN.CalculateCoefficient.sqr sqr, Variable.x x) {
        this.sqr = sqr;
        this.x = x;
    }

    public double  calculateAIC(){
        return x.getLength() * Math.log(sqr.calculateSQR() / x.getLength());
    }
    
}
