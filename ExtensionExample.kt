fun main(){

    var str1="Hai"
    var str2="thozla"
//without extension
    var fstr = "$str1 $str2"
    println(fstr)
// with extension
    var fistr = str1.addTwoStr(str1 ,str2)
    println(fistr)

    var nu1 = 4
    var nu2 = 3
    println(nu1.Graterthan(nu2))
}

fun String.addTwoStr(strone :String, strtwo :String) : String{
    return "$strone $strtwo"
}
//kotlin.jvm.internal.StringCompanionObject@6e0be858
fun Int.Graterthan(num2 : Int) : Int{
    if(this > num2){
        return this
    }
    else{
        return num2
    }
}
