package MN;

public class aic {
    private sqr sqr;
    private x x;

    public aic(MN.sqr sqr, MN.x x) {
        this.sqr = sqr;
        this.x = x;
    }

    public double  calculateAIC(){
        return x.getLength() * Math.log(sqr.calculateSQR() / x.getLength());
    }
    
}
