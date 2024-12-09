package io.github.shisiask;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class primitives {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");

        int a = 2;
        float b = 6.7f;
        short c =10;
        long d = 11545465566464L;
        double e = 12.3;
        boolean f = true;
        char g = 'a';
        byte h = 127;
        //output statements
        System.out.println("Hello "+ f );
        System.out.println("Line 2 "+f );

        //loops
        for(int i = 0; i < 10; i++) {
            System.out.println("Loop "+i);
        }
        int z = 0;
        while (z<10)
        {
            System.out.println("While Loop "+z);
            z++;
        }

        /* Strings */

        String cool = "hello";
        System.out.println(cool);

        /* Array */

        String[] coolArray = {"hello", "world"};
        for (String s : coolArray) System.out.println(s);

    }
}