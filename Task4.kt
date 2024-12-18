package Assignment2

fun main(){
    var age: Int =19;
    var isStudent: Boolean = true;

    if(age > 18 && isStudent){
        println("You are an adult student.");
    } else if(age < 18 && isStudent) {
        println("You are a student, but not an adult");
    } else if(age > 18 && !isStudent){
        println("You are an adult, but not student.");
    } else if(age < 18 || !isStudent){
        println("You are not an adult and not student.");
    } else {
        println("Invalid data.")
    }
}
