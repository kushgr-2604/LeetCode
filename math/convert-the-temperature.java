class Solution {
    public double[] convertTemperature(double celsius) {
       double kelvin = celsius +273.15;
        double Fahrenheit = celsius * 1.80 +32.00;
        double[] value = new double[2];
        value[0] = kelvin;
        value[1] = Fahrenheit;
        return value;
    }
}