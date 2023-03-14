package MN.GaussJacobMethod;

public class gaussJacobi {
    
    private int quantity;
    private double [][] equation;
    private double value;
    

    public gaussJacobi(int  quantity) {
        this.quantity = quantity;
        this.equation = new double[quantity][quantity + 1];
    }

    
}
