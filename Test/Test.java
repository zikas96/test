package Test;

import pattern.singelton.Singleton;

public class Test {


    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        System.out.println(s.incrementValue());
        Singleton ss = Singleton.getInstance();
        System.out.println(ss.incrementValue());


    }
}
