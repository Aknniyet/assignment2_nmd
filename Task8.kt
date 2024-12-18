package Assignment2
import java.util.Scanner;

fun main(){
    val sc = Scanner(System.`in`);

    println("Enter the first number: ");
    val num1 = sc.nextDouble();

    println("Enter the second number: ");
    val num2 = sc.nextDouble();

    println("Choose an operation (+, =, *, /): ");
    val operation = sc.next();

    when(operation){
        "+" -> println("Result: ${num1 + num2}");
        "-" -> println("Result: ${num1 - num2}");
        "*" -> println("Result: ${num1 * num2}");
        "/" -> {
            if (num2 != 0.0){
                println("Result: ${num1 / num2}");
            } else {
                println("Error: Division by zero is not allowed.")
            }
        }
        else -> println("Invalid operation. Please choose operation.")
    }
}
