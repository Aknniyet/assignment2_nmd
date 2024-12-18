package Assignment2

fun main(){
    var age: Int = 19;

    if (age < 18){
        println("You are minor.");
    } else if (age > 18 && age < 65){
        println("You are an adult.")
    } else{
        println("You are a sinior.")
    }
}
