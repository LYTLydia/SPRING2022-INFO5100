package com.company;

public class AddOperation implements MathOperation{
    @Override
    public int performOperation(int a, int b) {
        return a + b;
    }
}