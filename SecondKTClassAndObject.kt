import otherdts.*

fun main(){
    SubClass()

    var dts = ClassAndObject()

    var ds = other()

    ds.dob("21-10-2004")

    dts.personaldetails()

    var rec = rect()

    println("the length of rect is ${rec.len*rec.brt}")
}
fun SubClass(){
    println("Welcome to Class and Object tutorial")
}

class rect{
    var len = 6
    var brt = 9
}