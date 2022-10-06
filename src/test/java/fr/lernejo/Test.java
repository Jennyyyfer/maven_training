package fr.lernejo;

import org.assertj.core.api.Assertions;

import static fr.lernejo.Sample.op;

class Test {

    @org.junit.jupiter.api.Test
    void sum_of_10_and_5_equal_15(){
        int u = 10;
        int v = 5;
        int sum = op(Sample.Operation.ADD, u, v);

        Assertions.assertThat(sum).as("10+5").isEqualTo(15);
    }
    @org.junit.jupiter.api.Test
    void sum_of_negative_11_and_12_equals_1(){
        int u = -11;
        int v = 12;

        int sum = Sample.op(Sample.Operation.ADD, u, v);
        Assertions.assertThat(sum).as("sum of  -11+12").isEqualTo(1);
    }
    @org.junit.jupiter.api.Test
    void product_of_10_and_12_equals_120(){
        int u = 10;
        int v = 12;

        int product = Sample.op(Sample.Operation.MULT, u, v);
        Assertions.assertThat(product).as("10*12").isEqualTo(120);
    }
    @org.junit.jupiter.api.Test
    void product_of_4_and_5_equals_20(){
        int u = 4;
        int v = 5;

        int product = Sample.op(Sample.Operation.MULT, u, v);
        Assertions.assertThat(product).as("4*5").isEqualTo(20);
    }
    @org.junit.jupiter.api.Test
    void dividing_10_by_2_should_produce_5() {
        int dividend = 10; // (1)
        int divisor = 2;
        int quotient = Sample.divide(dividend, divisor); // (2)
        Assertions.assertThat(quotient).as("quotient of 10 / 2")
            .isEqualTo(5); // (3)
    }
    @org.junit.jupiter.api.Test
    void dividing_120_by_24_should_produce_5() {
        int dividend = 120; // (1)
        int divisor = 24;
        int quotient = Sample.divide(dividend, divisor); // (2)
        Assertions.assertThat(quotient).as("quotient of 120 / 24")
            .isEqualTo(5); // (3)
    }
    @org.junit.jupiter.api.Test
    void factor_of_5(){
        int n = 5;
        int fact = Sample.fact(n-1);
        Assertions.assertThat(fact).as("fact").isEqualTo(24);
    }
    @org.junit.jupiter.api.Test
    void factor_of_777(){
        int n = 777;
        int fact = Sample.fact(n-1);
        Assertions.assertThat(fact).as("fact").isEqualTo(0);
    }

}



