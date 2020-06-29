package day53_Iterator_Maps;
/*
Iterable (I):
    . is the ROOT interface
    . iterable has IS A relation with all classes
    . we need it to iterate the objects contained in classes
    . the classes that implement Iterable: gain the ability to ITERATE the objects
    . purpose : to apply ITERATOR interface to the classes that are implementing Iterable (I)
    . Iterator (I) is the actual interface that iterates the objects
    . Iterable(I) internally uses Iterator(I)

Reasons why we need Iterator:
    . it allows us to get access to each object of the collection type (collection means multiple obects)
    . it allows us to remove the objects (not the values, but the objects themselves) from the collection


Methods:
    . Iterator() method: iterates any given collection, then returns Iterator(I)
                            returns interface Iterator(I)
    . hasNext() method: checks if there are engough elements that can be iterated.
                            returns boolean
    . next() method:    checks if hasNext() is true ==> next() gets access to the object to retrieve it
                            then you can decide if you want to remove it or do anything else
    . remove() method:  removes the current element of the iteration

 */
public class c02_Iterable_intro {
}
