package day39_AccessModifiers;
/*
There are 4 access modifiers in Java:
1. public: visible everywhere by everyone. Open to the world.
2. protected:
3. default: Only visible/accessible within same package only, given by default (whenever you don't provide it)
            when we don't provide public, private, or protected keyword, then ==> default
4. private: Only visible/accessible with same class only.

public (most accessible) ==> default (less accessible) ==> private (least accessible)
 */
public class c03_AccessModifiers {

    // if I have a number:
    int defaultAccess = 1000; // this variable has a default access modifier = only accessible within same package
    // when we try to call in Resources package ==> compiler error

    // if I want a variable to be accessible everywhere I can add public like this:
    public int publicAccess = 2000; // Accessible everywhere
    // when we try to call it in the Resources package ==> it works

    // Social Security number must be a private data ==> we can assign it as private variable:
    private long SSN = 123456789;
    // even if we try to call it outside this class and inside the same package ==> compiler error


}

/*
• we can call public variables and methods any where in any class in one whole project.
• we call call protected variables and methods in any class in one package.
• Also we can call protected variables and methods in any sub class in one whole project.
• we can call default variables and methods in any class in one package ONLY.
 */
