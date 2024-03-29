package academy.pocu.comp2500.lab2.app;

import academy.pocu.comp2500.lab2.ComplexNumber;

public class Program {
    private static final double DOUBLE_EPSILON = 0.00001;

    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber();
        ComplexNumber num2 = new ComplexNumber(10.0);
        ComplexNumber num3 = new ComplexNumber(2.5, -5.1);
        ComplexNumber num4 = new ComplexNumber(0.0, 0.0012);


//        assert는 예약어
//        평가되는 표현식 or 값을 받아서 참이면 pass하고 거짓이면 AssertionError 예외 발생

//        num1, num2, num3 에 대한 생성자가 제대로 실행되었는지 값 비교를 통해 확인
        assert num1.real == 0.0;
        assert num1.imaginary == 0.0;

        assert num2.real == 10.0;
        assert num2.imaginary == 0.0;

        assert num3.real == 2.5;
        assert num3.imaginary == -5.1;

//        순실수(isReal) 함수가 제대로 동작하는지 확인
        assert num2.isReal();
        assert !num3.isReal();

//        순허수(isImaginary) 함수가 제대로 동작하는지 확인
        assert num4.isImaginary();
        assert !num3.isImaginary();

//        getConjugate 함수가 제대로 동작하는지 확인
        ComplexNumber num3Conjugate = num3.getConjugate();

        assert num3Conjugate.real == 2.5;
        assert num3Conjugate.imaginary == 5.1;

//        add 함수가 제대로 동작하는지 확인
        ComplexNumber sum = num2.add(num3);

        assert Math.abs(sum.real - 12.5) < DOUBLE_EPSILON;
        assert Math.abs(sum.imaginary - (-5.1)) < DOUBLE_EPSILON;

//        subtract 함수가 제대로 동작하는지 확인
        ComplexNumber diff = num4.subtract(num3);

        assert Math.abs(diff.real - (-2.5)) < DOUBLE_EPSILON;
        assert Math.abs(diff.imaginary - 5.1012) < DOUBLE_EPSILON;

//        multiply 함수가 제대로 동작하는지 확인
        ComplexNumber product = num3.multiply(num4);

        assert Math.abs(product.real - 0.00612) < DOUBLE_EPSILON;
        assert Math.abs(product.imaginary - 0.003) < DOUBLE_EPSILON;

//        divide 함수가 제대로 동작하는지 확인
        ComplexNumber quotient = num4.divide(num3);

        assert Math.abs(quotient.real - (-1.89709E-4)) < DOUBLE_EPSILON;
        assert Math.abs(quotient.imaginary - 9.29944E-5) < DOUBLE_EPSILON;
    }
}
