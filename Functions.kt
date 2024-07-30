fun main(){
    println(fullname("Bala", "Murugan"))
    ifullname("Bala", "Murugan")
    println(age(18))
}

fun fullname(fristname : String , lastname : String) : /*return type*/ String {
    return "Name : $fristname $lastname"
}
fun ifullname(fristname : String , lastname : String) : /*return void type*/ Unit {
    println("Name : $fristname $lastname")
}
fun age(age : Int) : String = if(age>17) "adult" else "kid"
