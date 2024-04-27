package kotlinInterview

import jdk.internal.org.objectweb.asm.util.Printer
import jdk.jfr.internal.OldObjectSample.emit
import java.util.concurrent.Flow

class KotlinInterview {
    //Q1. How to declare an array
    var numbers: IntArray = intArrayOf(1, 2, 3, 4)
    var chars: CharArray = charArrayOf('c', 'd')
    var stringArray = arrayOf("shakiba", "nur")


    //Q2. How to create a SingleTone Class?
    object SomeSingleTone
    /*
    * public final class SomeSingleTone{
    * public static final SomeSingleTone INSTANCE;
    * private SomeSingleTone(){
    * INSTANCE=(SomeSingleTone)this;
    * }
    * static{
    * new SomeSingleTone();
    * }
    * }
    * */

    //Q3. What is a data class?
    data class User(val name: String? = null, val age: Int? = null)

    // primary constructor need to have at least one parameter
    // All primary constructor parameters should be defined as var or val
    // data class can not be abstract , open ,sealed or inner

    //Q4.What is the basic difference between fold and reduce in kotlin? When to use which?
    var value = listOf(1, 2, 3).fold(0) { sum, element -> sum + element }
    //fold takes an initial value, and the first invocation of lamda you pass the inital value and pass the first element
    //as the parameter means firstly the sum=0

    var reduceValue = listOf(1, 2, 3).reduce { sum, element -> sum + element }
    //reduce does not take any intial value so the first sum will be sum=1+2

    //Q5. var vs val?
    /*val: is immutable(once initialise can not be change). it is similar to java final int n=20;
    * var: is mutable(can be change). It is similar to java int n=20
    *  */

    //Q6. Where should i use var and where val?
    /*var: Where value is changing frequently. example: var incrementalValue:Int?=null
    * val: Where value will not change some textview or button text : e.g: val buttonText="Button Static text"
    * */

    //Q7. Advantage of when and switch?
    fun test() {

        //Two or more choices:
        var number = 1
        when (number) {
            1 -> println("One")
            2, 3 -> println("Two or Three")
            else -> ("No number")
        }

        //when without argument
        when {
            number < 1 -> println("Number is less than 1")
            number > 1 -> println("NUmber is greater than 1")
        }
        //Any type passed
        var obj: Any = String
        when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a String"
            else -> "Unknown"
        }

        //smart casting
        var x: Any = String
        when (x) {
            is Int -> println("X is an integer")
            is String -> println("X is a string")
        }
        //range
        when (number) {
            in 1..2 -> println("In between 1 to 2")
            else -> println("Not in the range")
        }
    }

    //Q8. Null safety in kotlin
    var a: String = "test"

    //a=null
    val body = MessageBody().apply {
        text = "dsjfvjhds"
    }


    class MessageBody {
        var text: String? = null
    }
    //Q. Lamda Function

    fun s() {
        val sum = { a: Int, b: Int -> a + b }
        val result = sum(3, 4)
        println(result)
    }

    //Higher order function
    fun higherOrderFunction() {
        val result = calculate(3, 4) { a, b -> a + b }
    }

    fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }
    //end of Higher order function
    companion object{
        val s="shakiba"
    }

    fun setOnClickListener(listener:OnClickListener){

    }
    val s=setOnClickListener(object:OnClickListener{
        override fun onClick() {

        }

    })
//    fun fetchData():Flow<Int>{
//        for(i in 1..5){
//
//            emit(i)
//        }
//    }

    val sh:String by lazy { "Shakiba" }// do not initialise untill it has been access for the 1st time
}
//object declaration
interface OnClickListener{
    fun onClick()
}


class test{


    val test=KotlinInterview.s
    fun processResult(result:Result){
        when(result){
            is Result.Success->
                print("succes")
            is Result.Failed->
                print("failed")
            Result.Loading->
                println("loading")

        }
    }
}
//Q. Sealed Class
sealed class Result{
    data class Success(val data:String):Result()
    data class Failed(val data:String):Result()
    object Loading:Result()
}
interface printer{
    fun printMessage(message:String)
}
//class Logger(private val printer: Printer) : Printer by printer {
//    override fun printMessage(message: String) {
//        println("Logging message: $message")
//        printer.printMessage(message)
//    }
//}

