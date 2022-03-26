package com.company;

public class Context {

    MathOperation operation;
    public Context(MathOperation operation) {
        this.operation = operation;
    }
    public int execute(int a, int b) {
        return operation.performOperation(a, b);
    }
}
