package com.maddysam.kotlinbasics

fun main(){

    /*********** variables *******/

    /*********** var *******/

    // mutable variable

    // var can be overriden

    var myName = "MaddySam"

    myName = "M S"

    //print("variable var : " + myName)

    /*********** val *******/

    // immutable variable

    val myValName = "MaddySam"

   /* error stmt --> val cant be overriden myValName = "M S" */

    //println("variable val : " + myValName)

    /*********** Datatype *******/

   /* kotlin is a strongly typed language that supports Type Inference.

    The compiler will directly assume the size and type to a variable by that.

    For example, if you assign any whole number to a variable,

    the compiler will directly assume that the variable is of type Int

    */
    var myAge = 31

    var myString = "String"

    // Integer TYPES: Byte (8 bit), Short (16 bit), Int (32 bit), Long (64 bit)
    
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 12_039_812_309_487_120 //used for storing social security number or credit card number

    // Floating Point number Types: Float (32 bit), Double (64 bit)
    val myFloat: Float = 13.37F
    val myDouble: Double = 3.14159265358979323846

    // Booleans the type Boolean is used to represent logical values.
    // It can have two possible values true and false.
    var isSunny: Boolean = true
    // not sunny anymore...
    isSunny = false

    // Characters
    val letterChar = 'A'
    val digitChar = '1'

    // Strings
    val myStr = "Hello World"
    var firCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]

    //Exercise Problems

    var courseName :String = "Android Masterclass"
    val leet : Float = 13.37F
    val pi : Double = 3.14159265358979
    var age : Byte = 25
    var year : Short = 2020
    var phoneNumber: Long = 18881234567
    var isGood : Boolean = true
    var firstCharacter : Char = 'a'

    // String Interpolation

    val Str = "Hello World"
    var firChar = Str[0]
    var lastChar = Str[Str.length - 1]

    //print("firChar  $firChar and length is ${Str.length} ") //$ is called as String Template Expression or String Interpolation

    //Arithmetic operators (+, -, *, /, %)
    var result = 5+3
    result = result / 2
    // alternatively
    // result /= 2
    result = result * 5
    result = result - 1
    var moduloResult = 5%2

    /*Type mismatch. Required: Int
    Found:Double

    var a =5.0
    var b =3
    result = (a / b).toInt() => result 1

    val resDoub:Double = (a/b) => result 1.666666666667*/

    println( moduloResult)


}