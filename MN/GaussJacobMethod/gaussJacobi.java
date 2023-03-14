package MN.GaussJacobMethod;

public class gaussJacobi {
    
    private int quantity;
    private double [][] equation;
    private double [] equationResult;
    private double value;
    

    public gaussJacobi(int  quantity) {
        this.quantity = quantity;
        this.equation = new double[quantity][quantity];
        this.equationResult = new double [quantity];
    }

    public boolean checkDominant(){
        boolean dominant = false;
        double value = 0.0;
        for(int i = 0; i < equation.length; i++){
            for(int j = 0; j < equation.length; j++){
                value += Math.abs(equation[i][j]);
                if(value == equation[i][i]){
                    value = 0.0;
                }
            }
            if(Math.abs(equation[i][i]) > value){
                dominant = true;
            }else{
                dominant = false;
            }
        }
        return dominant;
    }
}
