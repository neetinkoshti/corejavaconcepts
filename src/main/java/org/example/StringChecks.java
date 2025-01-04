package org.example;

public class StringChecks {

    public static void main(String[] args) {
        checkStringEquality();
    }

    private static void checkStringEquality() {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");

        System.out.println(str1==str2); // true
        System.out.println(str1==str3); // false
        System.out.println(str1==str3.intern()); // true
    }

}
