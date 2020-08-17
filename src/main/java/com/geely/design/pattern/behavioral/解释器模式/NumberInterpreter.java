package com.geely.design.pattern.behavioral.解释器模式;

public class NumberInterpreter implements Interpreter{
    private int number;

    @Override
    public int interpret() {
        return this.number;
    }
    public NumberInterpreter(String number) {
        this.number = Integer.valueOf(number);
    }

    public NumberInterpreter(int number) {
        this.number = number;
    }
}
