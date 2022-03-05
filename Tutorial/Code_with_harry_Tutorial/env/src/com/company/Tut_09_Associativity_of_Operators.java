package com.company;

/*
*Java Operator Precedence and Associativity
        Operators	                                            Precedence                                  Associativity
        postfix increment and decrement	                        ++ --                                       left to right
        prefix increment and decrement, and unary	            ++ -- + - ~ !                               right to left
        multiplicative	                                        * / %                                       left to right
        additive	                                            + -                                         left to right
        shift	                                                << >> >>>                                   left to right
        relational	                                            < > <= >= instanceof                        left to right
        equality	                                            == !=                                       left to right
        bitwise AND	                                            &                                           left to right
        bitwise exclusive OR	                                ^                                           left to right
        bitwise inclusive OR	                                |                                           left to right
        logical AND	                                            &&                                          left to right
        logical OR	                                            ||                                          left to right
        ternary	                                                ? :                                         right to left
        assignment	                                            = += -= *= /= %= &= ^= |= <<= >>= >>>=      right to left
*/
public class Tut_09_Associativity_of_Operators {
    public static void main(String[] args) {
        int i=6*5-34/2;
        /*
        -> highest precedence goes to * and /. they are then evaluated on the basis of left to right associativity
            =30-34/2
            =30-17
            =13
         */
        int j=60/5-34*2;
        /*
            =12-34*2
            =12-68
            =-56
         */
        System.out.println(i);
        System.out.println(j);

        int x=5;
        int y=1;
        int k=(x-y)/2;
        System.out.println(k);

        int a=5;
        int b=1;
        int c=4;
        int z=b*b- (4*a*c)/(2*a);
        System.out.println(z);
    }
}
