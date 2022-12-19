//KOTLIN BASICS

//Main method
fun main(args: Array<String>)
{
// var- can be changed
// val- cannot be changed

    //var myVariable: Int= 5
    var myVariable2= 6  // camelCase
    println("My lucky number is: $myVariable2")// Use $ to print variables inside quotations

    var isGood= true //Boolean type
    println("God is good: $isGood")


// same arithmetic operation rules as others
    var x = 10
    var y= 20

    println("The result of x+y= ${x+y}")

    x += 10 //same as x = x+10 

    val w= 20F //F for float
    var z= 8.0 //Double
    val r= 7

    println("The Volume of a sphere with  radius 7= ${4F/3F*22F/7F*r*r*r}")//Up caret can't be used for cube

    //same string rules, with addition of methods
    val name= "Trevor"
    println("My name in reverse is: ${name.uppercase().reversed()}")//Strings can have methods


//Comparators, must use same data type.
//<, >, <=, >=, ==, !=
//Logical operators: AND= &&(precedes OR), OR= ||, NOT= !
    val bool= true
    x= 9
    y= 3
    var v= 9
    val hardExp= !(x != v) && bool || v>(x+y) &&(!bool || y<v)

    println(hardExp)


//if...elseif...else
    var m= 3
    var n= if(x>y) 5 else 6 //Single line
    if(m<n || m>= v){       //Multiline
        println("Something is true")
    }else if(m>n)
    {
        println("Something is false")
    }else
    {
        println("Hahaha")
    }

//user input and null
//null occurs when the user input is not obtained. Crashing is mitigated via: 

//Using the ? operator
    /*val userEnter= readLine()
    println("You entered: ${userEnter?.uppercase()}")

    //checking using If
    if(userEnter != null) println("You entered: ${userEnter?.uppercase()}")
*/
//arrays

    val myArray= arrayOf("Hello", "my", "name", "is", "Trevor")//can also store multi variable types
    println(myArray[3])

    //loops
    var i=0
    while(i<myArray.size){
        print("${myArray[i]} ")
        i++
}//printing an array using while loop

for(i in myArray) print("\n${i} ")//using for loop
for(i in 5..10) println(i)// range from 5 to 10
for(i in 10 downTo 0 step 2) println(i)// range from 10 to 5 skipping two numbers (step size is 1 if not specified)
for (i in 'a'..'f') print(i)// prints alphabet a to f

//Lists
    //There are mutable and immutable
    //types are implied but if empty, must be specified
    //Size isn't limited especially for mutable
    val imList= listOf(1,2,4,5)//immutable
    var mList= mutableListOf(1,2,3,4,5)

    //these can only be  done using mutable lists
    println(mList)//Prints whole list
    mList.add(6)
    mList.remove(3)
    mList.removeAt(3)
    println(mList)

//when condition
    //Compares one variable to others of same type and executes a function
    /*var age= readLine()?.toInt()

    when(age) {
        in 0..12 -> println("You are a young kid")
        in 13..17 -> println("You are a teenager")
        18 -> println("You are 18!!")//exactly 18
        19, 20 -> println("You are a young adult")//19 or 21
        in 22..65 -> println("You are an adult")
        else ->{ //bigger function inside the arrow function
            if(age != null){
                if(age>65 && age < 300) println("You are really old")
                else println("You are lying")
            }

        }
    }
    */


    val arr= intArrayOf(34,2334,65,87)//takes in vararg elements
    val max = getMax(45,34,65,7,8,*arr,346,8,89,56,453,78, 9)//can also embed arrays inside
    println("Max= $max")
    val primeChecker = readLine()?.toInt()
    print(" ${primeChecker?.isPrime()}")

    }


//functions
// function with default value for parameters
fun square(number: Int= 1, exponent: Int= 1): Int //function name= square takes in number and exponent each of type int and returns an int
{
    var ans= 1
    for(i in 1..exponent) ans*= number
    return ans

}
//or
fun square2(f: Int, g: Int)= f*g //single line fun but only allows expressions
//can also use lists as parameters. Declared as:
fun listExample(list: List<Int>){}

//VarArg takes an unspecified amount of numbers as an array
fun getMax(vararg nums: Int): Int{
    var max= 0
    for(number in nums) if(number>max) max= number
    return max
}

//function extensions
fun Int.isPrime(): Boolean{
    for(i in 2 until this-1) if(this % i == 0) return false
    return true
}