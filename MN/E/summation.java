package MN.E;

import Variable.y;
import Variable.x;
public class summation {

    private x xAxis;
    private y yAxis;
    Double result = 0.0;

    public summation(x x, y y) {
        this.xAxis = x;
        this.yAxis = y;
    }

    public Double sum2Axis() {
        Double result = 0.0;
        for (int i = 0; i < xAxis.getLength(); i++) {
            result = (xAxis.getValue(i) * yAxis.getValue(i)) + result;
        }
        return result;
    }

    public Double sumSquareX() {
        Double result = 0.0;
        for (int i = 0; i < xAxis.getLength(); i++) {
            result = (Math.pow(xAxis.getValue(i), 2)) + result;
        }
        return result;
    }

    public Double sumSquareY() {
        Double result = 0.0;
        for (int i = 0; i < xAxis.getLength(); i++) {
            result = (Math.pow(yAxis.getValue(i), 2)) + result;
        }
        return result;
    }

    public Double sumAxisX() {
        Double result = 0.0;
        for (int i = 0; i < xAxis.getLength(); i++) {
            result = xAxis.getValue(i) + result;
        }
        return result;
    }

    public Double sumAxisY() {
        Double result = 0.0;
        for (int i = 0; i < yAxis.getLength(); i++) {
            result = yAxis.getValue(i) + result;
        }
        return result;
    }

    public Double multiply(int index) {
        return xAxis.getValue(index) * yAxis.getValue(index);
    }

    public Double sumMultiply() {
        Double result = 0.0;
        for (int i = 0; i < xAxis.getLength(); i++) {
            result = multiply(i) + result;
        }
        return result;
    }
}
