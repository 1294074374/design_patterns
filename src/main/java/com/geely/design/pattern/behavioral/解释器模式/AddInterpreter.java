package com.geely.design.pattern.behavioral.解释器模式;



public class AddInterpreter implements Interpreter {
    private Interpreter firstExpression,secondExpression;
    @Override
    public int interpret() {
        return this.firstExpression.interpret()+secondExpression.interpret();
    }

    public AddInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public String toString() {
        return "+";
    }
}
