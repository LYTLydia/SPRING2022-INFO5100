package com.company;

public class MultiplyOperation implements MathOperation{
    @Override
    public int performOperation(int a, int b) {
        return a * b;
    }
}