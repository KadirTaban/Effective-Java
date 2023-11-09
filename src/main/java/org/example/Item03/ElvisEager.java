package org.example.Item03;

public class ElvisEager {
    private static final ElvisEager instance = new ElvisEager();

    public ElvisEager() {
    }

    public static ElvisEager getInstance() {
        return instance;
    }
}
