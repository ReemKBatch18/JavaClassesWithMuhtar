package day54_Maps;
/*
Syntax to declare a variable:
    DataType  VariableName = data;

in this variable declaration, data type decides how many data can be assigned to the variable

ENUM : IS A CUSTOM DATA TYPE
    whatever is stored in enum will be taken as constant
    only used for containing a fixed set of constants
    you can specify how many kinds of data values are available
    we only need it if we need a variable to be chosen from a small set of values
    ex:
        Color r;

We can use this in Selenium for the fixed number of Browsers we have: Chrome, Safari, Firefox, Edge, IE.
 */


enum Color{
    Red, Green, Blue
}

enum c09_Browsers {

    Chrome, Firefox, Edge
}
