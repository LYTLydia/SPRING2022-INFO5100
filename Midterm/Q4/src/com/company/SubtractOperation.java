package com.company;

public class SubtractOperation implements MathOperation{
    @Override
    public int performOperation(int a, int b) {
        return a - b;
    }
}