package org.example.Item03;

public class ElvisLazy {
    private static ElvisLazy instance;

    public ElvisLazy() {
    }

    public static ElvisLazy getInstance(){
        if (instance == null){
            instance = new ElvisLazy();
        }
        return instance;
    }
}