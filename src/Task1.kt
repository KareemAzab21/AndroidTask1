
import java.util.Scanner

fun main(){
    println("Enter First Number")
    val x:Int =Scanner(System.`in`).nextInt()
    println("Enter Second Number")
    val y:Int=Scanner(System.`in`).nextInt()
    add(x,y)
}

fun add(x:Int,y:Int){
    val sum:Int=x+y
    println("The Sum is $sum")
}