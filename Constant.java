package hero;

import java.util.Scanner;

public class Constant {
    public Constant() {
    }

    public static void main(String[] args) {
        String a = "elf power";
        String d = "elf charizma";
        String c = "elf magic";
        System.out.println(a);
        System.out.println(d);
        System.out.println(c);

        String str1 = new String();
        str1 = "I study Basic Java!";
        String t1 = str1;

        t1 = t1.replace('a','o');
        System.out.println(t1);

        System.out.println(str1);
        System.out.println(str1.charAt(18));
        System.out.println(str1.contains("Java"));
        String str1Upper = str1.toUpperCase();
        System.out.println(str1Upper);
        System.out.println(str1.toLowerCase());
        System.out.println(str1.substring(7));

    }



    }



