package com.geely.design.pattern.structural.适配器模式;

/**
 * 被适配者
 * 220V交流电
 */
public class AC220 {
    public int outputAC220V() {
        int output = 220;
        System.out.println("AC220输出交流的" + output + "V");
        return output;
    }
}
