package day47_Abstraction;

// abstract super class A
abstract class A{
    // 2 methods in super class: 1 abstract and 1 instance
    public abstract void method1();     // super class abstract method : MUST be overridden in regular sub class, MAY be overridden in abstract sub class
    public void method2(){ }            // super class non-abstract instance method: DOES NOT HAVE TO BE OVERRIDDEN in sub classes
}

// non-abstract sub class c07_Abstract_VS_NonAbstract_2
// in regular sub class : it is MANDATORY TO OVERRIDE abstract method
public class c07_Abstract_VS_NonAbstract_2 extends A {
    // 2 methods are inherited here from super class A
    // 1 method is overridden method1()
    public void method1(){ }
}

// abstract sub class B
// in abstract sub class : it is OPTIONAL TO OVERRIDE abstract method
abstract class B extends A{
    // 2 methods are inherited here from super class A: 1 abstract, 1 instance
}

// non-abstract class extending an abstract class
class C extends B{  // must override the abstract method inherited from super class B
    public void method1(){ }

}

