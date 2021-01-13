package academy.pocu.comp2500.lab2;

//복소수 클래스
public class ComplexNumber {
//    실수와 허수
    public double real;
    public double imaginary;
//    생성자: 실수와 허수 초기화
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
//    복소수가 순실수이면 true 리턴
    public boolean isReal() {
        return (imaginary == 0.0);
    }
//    복소수가 순허수이면 true 리턴
    public boolean isImaginary() {
        return (real == 0.0);
    }
//    복소수의 켤레 복소수를 리턴
    public ComplexNumber getConjugate() {
        return new ComplexNumber(real, -1 * imaginary);
    }
//    두 개의 복소수를 add 한 복소수를 리턴
    public ComplexNumber add(ComplexNumber num) {
        return new ComplexNumber(this.real + num.real, this.imaginary + num.imaginary);
    }
//    두 개의 복소수를 subtract 한 복소수를 리턴
    public ComplexNumber subtract(ComplexNumber num) {
        return new ComplexNumber(this.real - num.real, this.imaginary - num.imaginary);
    }
//    두 개의 복소수를 multiply 한 복소수를 리턴
    public ComplexNumber multiply(ComplexNumber num) {
        ComplexNumber productNumber = new ComplexNumber();
        productNumber.real = this.real * num.real - this.imaginary * num.imaginary;
        productNumber.imaginary = this.real * num.imaginary + this.imaginary * num.real;
        return productNumber;
    }
//    두 개의 복소수를 divide 한 복소수를 리턴
    public ComplexNumber divide(ComplexNumber num) {
        ComplexNumber quotientNumber = new ComplexNumber();
        ComplexNumber numConjugate = num.getConjugate();
        double dividingValue = Math.pow(num.real, 2) + Math.pow(num.imaginary, 2);
        quotientNumber.real = (this.real * numConjugate.real - this.imaginary * numConjugate.imaginary) / (dividingValue);
        quotientNumber.imaginary = (this.real * numConjugate.imaginary + this.imaginary * numConjugate.real) / (dividingValue);
        return quotientNumber;
    }
}
