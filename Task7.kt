package Assignment2
import java.util.Scanner;

fun main(){
    val sc = Scanner(System.`in`);
    var count: Int = 0;
    do{
        var num: Int = sc.nextInt();
        println("Number is $num");
        count++;
    } while (num != 0)

    println("Number of attempts: $count");
}
