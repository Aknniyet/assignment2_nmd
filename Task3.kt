package Assignment2

fun main(){
    var age: Int = 19;

    when{
        age in 0..5 -> println("You are a toddler.");
        age in 6..12 -> println("You are a child.");
        age in 13..17 -> println("You are a teenager.");
        age in 18..64 -> println("You are an adult.");
        age >= 65 -> println("You are a senior.");
        else -> println("Inalid age.")
    }
}
