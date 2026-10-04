package javaCore2;

import java.util.Objects;

public class ComplexNumber {
    private double re;
    private double im;

    public ComplexNumber() {
    }

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if(o == null || getClass() != o.getClass()) return false;
//        ComplexNumber complexNumber = (ComplexNumber) o;
//        return Double.compare(complexNumber.im, im) == 0 && Double.compare(complexNumber.re, re) == 0;
//    }
//
//    @Override
//    public int hashCode() {
//        int result;
//        long temp;
//        temp = Double.doubleToLongBits(re);
//        result = (int) (temp ^ (temp >>> 32));
//        temp = Double.doubleToLongBits(im);
//        result = 31 * result + (int) (temp ^ (temp >>> 32));
//        return result;
//    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return Double.compare(re, that.re) == 0 && Double.compare(im, that.im) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }
}
