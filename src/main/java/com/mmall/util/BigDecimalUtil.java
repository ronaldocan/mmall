package com.mmall.util;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2017/5/7.
 */
public class BigDecimalUtil {
    private BigDecimalUtil() {

    }

    public static BigDecimal add(Double num1, Double num2) {
        BigDecimal n1 = new BigDecimal(num1.toString());
        BigDecimal n2 = new BigDecimal(num2.toString());
        return  n1.add(n2);
    }
    public static BigDecimal sub(Double num1, Double num2) {
        BigDecimal n1 = new BigDecimal(num1.toString());
        BigDecimal n2 = new BigDecimal(num2.toString());
        return  n1.subtract(n2);
    }
    public static BigDecimal mul(Double num1, Double num2) {
        BigDecimal n1 = new BigDecimal(num1.toString());
        BigDecimal n2 = new BigDecimal(num2.toString());
        return  n1.multiply(n2);
    }
    public static BigDecimal div(Double num1, Double num2) {
        BigDecimal n1 = new BigDecimal(num1.toString());
        BigDecimal n2 = new BigDecimal(num2.toString());
        return n1.divide(n2, 2, BigDecimal.ROUND_HALF_UP);
    }
}
