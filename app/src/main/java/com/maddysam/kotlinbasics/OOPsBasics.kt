package com.maddysam.kotlinbasics

/*  The 5 basic concepts

    --> variables and types

    --> control flows

    --> functions

    --> collections

    --> classes and object (including inheritance)

 */

/***** classes and object (including inheritance) *******
 *
 */

var b =10

fun main() {

    // Creating instances of classes

    //Person("Sandy","San")

    var sandy = Person("Sandy","San")

    //var sandy:Person = Person("Sandy","San") --> Return Person Object type

    var sam = Person()

    var ss = Person(lastName = "Test")

    b = 6

    myFunc(7)


}

// a is a parameter here

fun myFunc(a:Int) {

    // a is a variable here

    var a = a

    println("a is $a")

     b = a

    println("b is $b")
}

class Person(firstName: String ="Sandy", lastName: String = "San"){

    // Initializer Block

    init {

        println("Initialized a new Person object with " +

                "firstName = $firstName and lastName = $lastName ")
    }


}