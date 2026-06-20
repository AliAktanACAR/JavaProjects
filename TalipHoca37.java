public class TalipHoca37 {
    public static void main(String[] args) {

        ComplexNumber x1 = new ComplexNumber(3.1, 6.4);
        ComplexNumber y1 = new ComplexNumber(3.1, 6.4);
        ComplexNumber z1 = new ComplexNumber ();

        z1 = z1.add(x1,y1);

        System.out.println(z1);

    }
}
class ComplexNumber{
    private double real;
    private double imaginary;

    public ComplexNumber(){}

    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;

    }
    public Double getReal(){
        return real;
    }

    public Double getImaginary(){
        return imaginary;
    }

    public ComplexNumber add(ComplexNumber x, ComplexNumber y){
        double realSum = x.getReal() + y.getReal();
        double imaginarySum = x.getImaginary() + y.getImaginary();

        ComplexNumber z = new ComplexNumber(realSum, imaginarySum);

        return z;

    }

    @Override
    public String toString() {
        return "ComplexNumber ("
                 + real + " " + "+" + " " +
                 + imaginary + "i" +
                ')';
    }
}
