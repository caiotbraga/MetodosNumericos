package MN;

public class summation {
    
    Double [] valuesO;
    Double [] valuesT;
    Double result = 0.0;
    
    public summation (Double [] vec){
        valuesO = vec;
    }

    public summation (Double [] vec1, Double [] vec2){
        valuesO = vec1;
        valuesT = vec2;
    }

    public Double sum2Axis(){
            for(int i = 0; i < valuesO.length; i++){
                result = (valuesO[i] * valuesT[i]) + result;
            }
            return result;
    }

    public Double sumSquare(){
        for(int i = 0; i < valuesO.length; i++){
            result = (valuesO[i] * valuesO[i]) + result;
        }
        return result;
    }

    public Double sumAxis(){
        for(int i = 0; i < valuesO.length; i++){
            result = valuesO[i] + result;
        }
        return result;
    }
}
