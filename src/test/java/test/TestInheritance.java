package test;

/**
 * @author laijunlin
 * @date 2021-03-06 23:31
 */
public class TestInheritance {


    public static void main(String[] args) {
        Son son = new Son();
        Grandpa grandpa = new Son();
        Father father = new Son();
        son.getFather();
    }
}

class Grandpa{
    public void say(){
        System.out.println("I am grandpa");
    }
}

class Father extends Grandpa{
    public int anInt = 0;
    public void say(){
        System.out.println("I am father");
    }
    public Father getFather(){
        return this;
    }
}

class Son extends Father{
    private Son son = null;
    @Override
    public Son getFather(){
        super.anInt = 1;
        System.out.println(super.anInt);
       return son;
    }
}
