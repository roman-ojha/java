package com.company;

/*
    String name = "Roman"
                   |||||
                   01234
 */

public class Tut_14_String_Method_in_Java {
    public static void main(String[] args) {
        String name1="Roman";
        String name2=new String(" Ojha");
        String name3="      Roman     ";
        System.out.println(name1+name2);

        int value=name1.length();
        // This will return the length of the String
        System.out.println(value);

        String lower=name1.toLowerCase();
        // This will Returns a new String in lowercase characters
        System.out.println(lower);

        String upper=name1.toUpperCase();
        // This will Return a new String in Upper characters
        System.out.println(upper);

        System.out.println(name3);
        System.out.println(name3.trim());
        // This will excluded the space

        System.out.println(name1.substring(3));
        // This will return a substring from start to the end substring(index)

        System.out.println(name1.substring(2,4));
        // This will return a substring from start index to the end index. Start index is included and end is excluded

        System.out.println(name1.replace('m','o'));
        System.out.println(name1.replace("man","om"));
        // This will replace the character that you want

        System.out.println(name1.startsWith("man"));
        // This will return boolean if String is Start with the given String

        System.out.println(name1.endsWith("man"));
        // This will return boolean if String is ends with the given String

        System.out.println(name1.charAt(3));
        // This will return the character of the given index

        System.out.println(name1.indexOf("an"));
        // this will return the index of the given string,character if it exist if not then it will return -1

        System.out.println(name1.indexOf('o',2));
        // this will return the index of the given string,character if it exist if not then it will return -1
        // and it will start to search from given index

        System.out.println(name1.lastIndexOf('o'));
        // This will return the last index of the given string

        System.out.println(name1.lastIndexOf("n",3));
        // This will return the last index of the given string and start to exclude the given index from the last

        System.out.println(name1.equals("Roman"));
        // This will check whether the string is equal to given string or not
        // if you want to check the string value then always use .equals() rather then '='

        System.out.println(name1.equalsIgnoreCase("roMan"));
        // This will check whether the string is equal to given string or not by ignoring case

        /* Escape Sequence Characters :
                -> Sequence of Character after backslash '\' = Escape Sequence Characters
                    Ex: \n -> newline
                        \b -> backspace
                        \t -> Tab
                        \r -> carriage return
                        \f -> form feed
                        \' -> single quote
                        \" -> double quote
                        \\ -> back slash
         */
        System.out.println("I am escape sequence \" double quote");
        System.out.println("I am escape sequence \\ back slash");
    }
}
