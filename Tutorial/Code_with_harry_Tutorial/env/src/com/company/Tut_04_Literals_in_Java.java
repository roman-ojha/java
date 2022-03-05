package com.company;

/*
Literals:
    -> A constant value which can be assigned to the variable is called as a literal
 */

public class Tut_04_Literals_in_Java {
    public static void main(String[] args) {
        byte age = 43;
            // in this case here 43 number is a integer literal
        int age2 = 43;
        long age3 = 54322345543L;
            // we have to use 'L' or 'l' at the end of the number in the long datatype
        char ch = 'A';
            // in this case we are assigning 'A' using single quotes in character which is character literal
        float f1 = 5.6f;
            // here we have to put 'f' after floating value to say that this number is floating point literal
        double d1 = 43.43;
            // by default we don't have to use 'd' after double but if you want to use it then you can use it
        double d2 = 43.5D;
        double d3 = 43.4d;
        boolean a = true;
        String str="Roman";
            // here, "Roman" is a string literal
    }
}

/*
Java Language Keywords
    ->  Here is a list of keywords in the Java programming language.
        You cannot use any of the following as identifiers in your programs.
        The keywords const and goto are reserved, even though they are not currently used.
        true, false, and null might seem like keywords, but they are actually literals;
        you cannot use them as identifiers in your programs.

            abstract	continue	for	        new	        switch
            assert***	default	    goto*	    package	    synchronized
            boolean	    do	        if	        private	    this
            break	    double	    implements	protected	throw
            byte	    else	    import	    public	    throws
            case	    enum****	instanceof	return	    transient
            catch	    extends	    int	        short	    try
            char	    final	    interface	static	    void
            class	    finally	    long	    strictfp**	volatile
            const*	    float	    native	    super	    while
 */