package com.geely.design.pattern.structural.适配器模式;

/**
 * @author laijunlin
 */
public class PowerAdapter implements DC5{
    private AC220 ac220 = new AC220();

    @Override
    public int outputDC5V() {
        int adapterInput = ac220.outputAC220V();

        System.out.println("使用PowerAdapter输入AC:"+adapterInput+"V");
        // 变压器(适配逻辑)
        System.out.println("适配变电压");
        int adapterOutput = adapterInput/44;
        System.out.println("使用PowerAdapter输出DC:"+adapterOutput+"V");

        return adapterOutput;
    }
}
