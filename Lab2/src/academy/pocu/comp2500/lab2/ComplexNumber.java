package academy.pocu.comp2500.lab2;

public class ComplexNumber {
    public double real;
    public double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public ComplexNumber(double real) {
        this(real, 0.0);
    }
    public ComplexNumber() {
        this(0.0, 0.0);
    }

    public boolean isReal() {
        return (imaginary == 0.0);
    }
    public boolean isImaginary() {
        return (real == 0.0);
    }
    public ComplexNumber getConjugate() {
        return new ComplexNumber(real, -1 * imaginary);
    }
    public ComplexNumber add(ComplexNumber num) {
        return new ComplexNumber(this.real + num.real, this.imaginary + num.imaginary);
    }
    public ComplexNumber subtract(ComplexNumber num) {
        return new ComplexNumber(this.real - num.real, this.imaginary - num.imaginary);
    }
    public ComplexNumber multiply(ComplexNumber num) {
        ComplexNumber productNumber = new ComplexNumber();
        productNumber.real = this.real * num.real - this.imaginary * num.imaginary;
        productNumber.imaginary = this.real * num.imaginary + this.imaginary * num.real;
        return productNumber;
    }
    public ComplexNumber divide(ComplexNumber num) {
        ComplexNumber quotientNumber = new ComplexNumber();
        ComplexNumber numConjugate = num.getConjugate();
        double dividingValue = Math.pow(num.real, 2) + Math.pow(num.imaginary, 2);
        quotientNumber.real = (this.real * numConjugate.real - this.imaginary * numConjugate.imaginary) / (dividingValue);
        quotientNumber.imaginary = (this.real * numConjugate.imaginary + this.imaginary * numConjugate.real) / (dividingValue);
        return quotientNumber;
    }
}
