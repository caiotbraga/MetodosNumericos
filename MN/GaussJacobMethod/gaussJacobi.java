package MN.GaussJacobMethod;

import java.util.Arrays;

public class gaussJacobi {

    private double [][] equation;
    private int maxInterations = 100;

    public gaussJacobi(double [] [] M) {
        this.equation = M;
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
        if(dominant == true){
            return dominant;
        }else{
            int DOM = 0;
            for(int i = 0; i < equation.length; i++){
                for(int j = 0; j < equation.length; j++){
                    value += Math.abs(equation[i][j]);
                    if(value == equation[i][i]){
                        value = 0.0;
                    }
                }
                if(Math.abs(equation[i][i]) == value){
                    dominant = true;

                }else if(Math.abs(equation[i][i]) > value){
                    DOM++;
                    dominant = true;
                }else{
                    dominant = false;
                }
            }
            if(DOM == 0){
            dominant = false;
            }
        }
        return dominant;
    }

    public void solve()
  {
    int iterations = 0;
    int n = equation.length;
    double epsilon = 1e-15;
    double[] X = new double[n]; // Approximations
    double[] P = new double[n]; // Prev
    Arrays.fill(X, 0);
    Arrays.fill(P, 0);

    while (true) {
      for (int i = 0; i < n; i++) {
        double sum = equation[i][n]; // b_n

        for (int j = 0; j < n; j++)
          if (j != i)
            sum -= equation[i][j] * P[j];
        X[i] = 1/equation[i][i] * sum;
      }

      System.out.print("X-" +(iterations + 1)+ " = {");
      for (int i = 0; i < n; i++)
        System.out.printf("%.2f", X[i]);
      System.out.println("}");

      iterations++;
      if (iterations == 1) continue;

      boolean stop = true;
      for (int i = 0; i < n && stop; i++)
        if (Math.abs(X[i] - P[i]) > epsilon)
          stop = false;

      if (stop || iterations == maxInterations) break;
      P = (double[])X.clone();
    }
  }
}
