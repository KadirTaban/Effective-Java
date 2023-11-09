package org.example.Item03;

public class Main {
    public static void main(String[] args) {

        //Singleton with public final field
        Elvis elvis = Elvis.INSTANCE;

        //Singleton with static factory also but eager
        ElvisEager elvisEager = ElvisEager.getInstance();

        //Singleton with static factory also but lazy
        ElvisLazy elvisLazy = ElvisLazy.getInstance();

        //Singleton with enum
        ElvisEnum elvisEnum = ElvisEnum.INSTANCE;
    }
}
