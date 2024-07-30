// hashmap is the variable with keyWord and Value
// it is looks like "var/val VariableName = KeyWord<key + Value"
fun main(args : Array<String>){

    var Mapvalue = HashMap<Double, String>()

    Mapvalue.put(1.0, "Robo")
    Mapvalue.put(2.0, "2.o")
    Mapvalue.put(3.0, "Venom")

    println("Second Part of Robo is " + Mapvalue[2.0])

    Mapvalue.put(3.0, "Captain")

    println("Second Part of Robo is " + Mapvalue[3.0])

    println("By keys")

    for(i in Mapvalue.keys){
        println("Movies are ${Mapvalue[i]}")
    }

    println("By values")

    for(i in Mapvalue.values){
        println("Movies are $i")
    }
}