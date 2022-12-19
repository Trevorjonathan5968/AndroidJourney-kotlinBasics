import java.lang.Exception
//every exception is a child of the superclass Extension

fun main()
{
    //exceptions are errors. Can be predefined in the language or custom-made
    val age= try{ //what you want to achieve
        readLine()?.toInt()
    } catch(e1: NumberFormatException) {0}// what to do in a NumberFormatException(can also  be defined as Exception to handle all exceptions)
    finally {// Always execute
        println("Input complete")
    }
    println("Your age is: $age")

    //Catching the division exception
    println("Please enter sides: ")
    val a= readLine()?.toDouble()
    val b= readLine()?.toDouble()
    var ans: Any
    if(a != null && b != null) {
        try {
             ans= division(a, b)
        } catch (e2: DivisionByZeroException){
             ans= "Infinity"

        }finally {
            println("Division Complete")
        }
        println("$a divided by $b is $ans ")
    }

}

//throwing an exception
class DivisionByZeroException: Exception("A number cannot Be divided by zero")//Inherits from class Exception with string error message

fun division(a: Double, b: Double): Double {
    if (b==0.0) throw DivisionByZeroException()
    return a/b
}