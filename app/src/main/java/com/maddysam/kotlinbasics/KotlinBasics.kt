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
    var agee : Byte = 25
    var year : Short = 2020
    var phoneNumber: Long = 18881234567
    var isGood : Boolean = true
    var firstCharacter : Char = 'a'

    // String Interpolation

    val Str = "Hello World"
    var firChar = Str[0]
    var lastChar = Str[Str.length - 1]

    //print("firChar  $firChar and length is ${Str.length} ") //$ is called as String Template Expression or String Interpolation
    //Note ${} is u
    //Arithmetic operators (+, -, *, /, %)
    var result = 5+3
    result = result / 2
    // alternatively
    // result /= 2
    result = result * 5
    result = result - 1
    var moduloResult = 5%2

 /*

    var a =5.0
    var b =3

    result = a/b Type mismatch. Required: Int Found:Double

    result = (a / b).toInt() => result 1

    val resDoub:Double = (a/b) => result 1.666666666667*/

  //  println( moduloResult)

    //Comparison operators (==, !=, <, >, <=, >=)
    val isEqual = 5==3
    // Concatenation - adding of "Strings"
    //println("isEqual is " + isEqual)
    val isNotEqual = 5!=5
    // Kotlin has a feature called String Interpolation.
    // This feature allows you to directly insert a template expression inside a String.
    // Template expressions are tiny pieces of code that are evaluated and
    // their results are concatenated with the original String.
    // A template expression is prefixed with $ symbol.
    // Following are examples of String interpolation
    /*println("isNotEqual is $isNotEqual")

    println("is5Greater3 ${5 > 3}")
    println("is5LowerEqual3 ${5 >= 3}")
    println("is5LowerEqual5 ${5 >= 5}")
*/
    //Assignment operators (+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 3
  //  println("myNum is $myNum")
    myNum *= 4
  //  println("myNum is $myNum")


    //Increment & Decrement operators (++, --)

    myNum++

  //  println("myNum is $myNum")

    /*What is post increment and pre increment in Java?

     Pre-increment means that the variable is incremented BEFORE it's evaluated in the expression

     Post-increment means that the variable is incremented AFTER it has been evaluated for use in the expression

     */

    /*
    // increments after use
    println("myNum is ${myNum++}")  //33  why?? bcuz the ${myNum++} will be executed once
    // increments before use
   the value of myNum is 34 here --> println("myNum is ${++myNum}") //  35
    println("myNum is ${--myNum}")
*/
    //create a variable for testing all condition
    val age = 16
    //create a variable for drinkingAge
    val drinkingAge = 21
    //create a variable for votingAge
    val votingAge = 18
    //create a variable for drivingAge
    val drivingAge = 16

    //Assign the if statement to a variable
    val currentAge =  if (age >=drinkingAge){
        println("Now you may drink in the US")
        //return the value for this block
        drinkingAge
    }else if(age >=votingAge){
        println("You may vote now")
        //return the value for this block
        votingAge
    }else if (age>=drivingAge){
        println("You may drive now")
        //return the value for this block
        drivingAge
    }else{
        println("You are too young")
        //return the value for this block
        age
    }
    //print the age for the passing condition
    print("current age is $currentAge")

    // Control Flows
    // If Statements
    // top to bottom approach

    var ageee = 17
    if(ageee >= 21){
        print("now you may drink in the US")
    }
    // Else If Statement - only executed if the if statement is not true
    else if(ageee >= 18){
        print("now you may vote")
    }
    // Else If Statement - only executed if the foregoing else if statement is not true
    else if (ageee >= 16){
        print("you now may drive")
    }
    // else is only executed if all of the foregoing statements weren't true
    else{
        print("you're too young")
    }

    // Kotlin’s "when" expression is the replacement of the switch statement
    // top to bottom approach
    // from other languages like C, C++, and Java.
    // It is compact and more powerful than switch statements.
    var season = 3
    when(season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> println("Fall")
        4 -> println("Winter")
        else -> println("Invalid Season")
    }
    var month = 3
    when(month) {
        1,2,3 -> println("Spring")
        in 4..6 -> println("Summer")
        in 7..9 -> println("Fall")
        in 10..12 -> println("Winter")
        else -> println("Invalid Season")
    }

    // challenge - translate the if statement with the age to a when expression
    when(age){
        // with the !in it's the same as saying not in ...
        !in 0..20  -> print("now you may drink in the US")
        in 18..20  -> print("now you may vote")
        16,17 -> print("you now may drive")
        else -> print("you're too young")
    }

    var x : Any = 13.37
    when(x) {
        is Int -> println("$x is an Int")
        !is Double -> println("$x is not Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }

    /**
    var x : Any = 13.37
    when(x) {
    is Int -> println("$x is an Int")
    !is Double -> println("$x is not Double")
    is String -> println("$x is a String")
    else -> println("$x is none of the above")
    }
     **/

    //assign when to a variable
    val result1 =  when(x) {
        //let condition for each block be only a string
        is Int -> "is an Int"
        !is Double -> "is not Double"
        is String -> "is a String"
        else -> "is none of the above"
    }
    //then print x with the result
    println("$x $result1")

    // Loops
    // While Loop
    // While loop executes a block of code repeatedly as long as a given condition is true

//    while(condition) {
//        // code to be executed
//    }

    var y = 100
    while(y >= 0) {
        print("$y ")
        y--
    }

//    var y = 100
//    while(y <= 0) {
//        print("$y ")
//        y--
//    }
    print("\n")

    var z = 100
    while(z >= 0) {
        print("$z ")
        z-=2
    }

    // Do while loop
    // The do-while loop is similar to while loop except that it
    // tests the condition at the end of the loop.
    // This means that it will at least execute the body once
    var c = 1
    do {
        print("$c ")
        c++
    } while(c <= 10)

    print("\n")

    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold"){
        roomTemp++
        if(roomTemp == 20){
            feltTemp = "comfy"
            println("it's comfy now")
        }
    }


    // For Loop
    // A for-loop is used to iterate through ranges, arrays, collections, or anything
    // that provides an iterator (You’ll learn about iterator, arrays, ranges and collections in a future lectur    e).
    for(num in 1..10) {
        print("$num ")
    }
    print("\n")

    // infix notation
    for(i in 1 until 10) { // Same as - for(i in 1.until(10))
        print("$i ")
    }
    print("\n")

    for(i in 10 downTo 1) {     // Same as - for(i in 10.downTo(1))
        print("$i ")
    }
    print("\n")

    for(i in 1 until 10 step 2) { // Same as - for(i in 1.until(10).step(2))
        print("$i ")
    }
    print("\n")

    /*Write a for loop that runs from 0 to 10000 once it's at 9001 it should write "IT'S OVER 9000!!!" */

    for(i in 1.until(10000)){

        if(i == 9901){
            print("IT'S OVER 9000!!!")
        }
    }


    /*  Write a while loop that checks the humidity (not the humidityLevel). The variable humidityLevel starts at 80.
     The variable humidity is initialized with "humid". If it is "humid" then it should reduce the "humidityLevel" by 5
     and print "humidity decreased" Once the humidityLevel is below 60 it should print "it's comfy now" and set the humidity
     to "comfy" */

    var humidity = "humid"
    var humidityLevel = 80
    while (humidity == "humid"){
       humidityLevel-=5;
        println("humidity decreased")
       if(humidityLevel < 60){
           humidity = "comfy"
           println("it's comfy now")
       }
    }

    /* break and continue */

    for(i in 0..20){

        if(i / 2 == 5){

            break
        }

        print("$i ")
    }

    println()

    for(j in 1 until 20){

        if(j/2==5){

            continue
        }

        print("$j ") //1 2 3 4 5 6 7 8 9 12 13 14 15 16 17 18 19
                     // -- > // 11 won't come since 11/2=5.5 & it considered as 5 due to int data type
    }


    /*********** Functions *******/

    myFunction()
    println(addUp(5,3))
    println(avg(3.2,5.3))

    /*********** NULLABLES/OPTIONALS in Kotlin *******/

    // NULLABLES/OPTIONALS in Kotlin
    // Kotlin supports nullability as part of its type System.
    // That means You have the ability to declare whether
    // a variable can hold a null value or not.
    // By supporting nullability in the type system,
    // the compiler can detect
    // possible NullPointerException errors at compile time
    // and reduce the possibility of having them thrown at runtime.
        var name: String = "Denis"
    // name = null // Compilation Error

        var nullableName: String? = "Denis"
        nullableName = null // Works

    // Here name cannot/must not be null
        val len = name.length
        val upper = name.toLowerCase()

    // but the same methods won't work on nullable types
       /* val len2 = nullableName.length // Compilation Error
        val upper2 = nullableName.toLowerCase()  // Compilation Error */

    // So how can we solve this? We could do a null check before hand

        val nullableName2: String? = "Denis"

        if(nullableName2 != null) {
            println("Hello, ${nullableName2.toLowerCase()}.")
            println("Your name is ${nullableName2.length} characters long.")
        } else {
            println("Hello, Guest")
        }

    // This works but seems to be quite some work...
    // So how about we shorten the syntax...
    // Kotlin provides a Safe call operator, ?.
    // It allows you to combine a null-check and
    // a method call in a single expression.

        nullableName2?.toLowerCase()

    // This is the same as:
        if(nullableName2 != null)
            nullableName2.toLowerCase()
        else
            null

    // You can use methods on a nullable variable like this
        val nullableName3: String? = null

        println(nullableName3?.toLowerCase()) // prints null
        println(nullableName3?.length) // prints null

    // You can perform a chain safe calls:
        //val wifesAge: String? = user?.wife?.age


    // Let'S say we don’t want to print anything if
    // the variable is null?

    // In order to perform an operation only if the
    // variable is not null, we can use the safe call
    // operator with let -

        val nullableName4: String? = null

        nullableName4?.let { println(it.toLowerCase()) }
        nullableName4?.let { println(it.length) }
    // Prints nothing because there nullableName is null
    // and we used let to prevent anything from being performed


    // What if we would like to enter a default value?
    // Then we can use the elvis operator ?:
        val name2 = nullableName4 ?: "Guest"

        //val wifesAge2: String? = user?.wife?.age ?: 0


    // Not null assertion : !! Operator
    // The !! operator converts a nullable type to a
    // non-null type, and throws a NullPointerException
    // if the nullable type holds a null value.
    // This is risky, and you should only use it if
    // you are 100% certain, that there will be a value in
    // the variable.
        val nullableName5: String? = null
        nullableName5!!.toLowerCase() // Results in NullPointerException
}


    // The syntax of a function - fun stands for function
    fun myFunction(){
        // The body of a function
        println("myFunction was called")
    }

    // This function has two parameters and returns a value of type Int
    fun addUp(a: Int, b: Int): Int{
        // the return keyword indicates that this function will return the following value
        // once this function is called and executed
        return (a+b)
    }
    // Article on Kotlin words https://blog.kotlin-academy.com/kotlin-programmer-dictionary-function-vs-method-vs-procedure-c0216642ee87
    // CHALLENGE: create a function that calculates the average and call it
    fun avg(a: Double, b: Double): Double {
        return  (a + b)/2
    }