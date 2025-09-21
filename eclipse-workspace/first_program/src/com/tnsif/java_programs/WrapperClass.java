package com.tnsif.java_programs;

public class WrapperClass {
    public static void main(String[] args) {
        
        byte b = 10;
        short s = 20;
        int i = 100;
        long l = 1000L;
        float f = 12.34f;
        double d = 123.456;
        char c = 'A';
        boolean bool = true;

        Byte wb = b;
        Short ws = s;
        Integer wi = i;
        Long wl = l;
        Float wf = f;
        Double wd = d;
        Character wc = c;
        Boolean wbool = bool;

        System.out.println("Wrapper Byte: " + wb);
        System.out.println("Wrapper Short: " + ws);
        System.out.println("Wrapper Integer: " + wi);
        System.out.println("Wrapper Long: " + wl);
        System.out.println("Wrapper Float: " + wf);
        System.out.println("Wrapper Double: " + wd);
        System.out.println("Wrapper Character: " + wc);
        System.out.println("Wrapper Boolean: " + wbool);

        byte pb = wb;
        short ps = ws;
        int pi = wi;
        long pl = wl;
        float pf = wf;
        double pd = wd;
        char pc = wc;
        boolean pbool = wbool;

        System.out.println("\nUnboxed byte: " + pb);
        System.out.println("Unboxed short: " + ps);
        System.out.println("Unboxed int: " + pi);
        System.out.println("Unboxed long: " + pl);
        System.out.println("Unboxed float: " + pf);
        System.out.println("Unboxed double: " + pd);
        System.out.println("Unboxed char: " + pc);
        System.out.println("Unboxed boolean: " + pbool);
    }
}

