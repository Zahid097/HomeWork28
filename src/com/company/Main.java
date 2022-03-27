package com.company;

import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {

        System.out.println(sqrt.apply(813487.23));

    }

    public static UnaryOperator<Double> sqrt = Math::sqrt;
}
