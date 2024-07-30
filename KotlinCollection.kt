fun main(args : Array<String>){

//    var readonlympof = mapOf<Int, String>()
    var readonlympof = mapOf(1 to "Frist", 2 to "Second", 3 to "Third")
    println(readonlympof)

    var writeablemap = hashMapOf(1 to "Frist", 2 to "Second")
    writeablemap.put(3, "3rd")

    println(writeablemap)

    //Listof
    var readlist = listOf("1" ,"2" ,"3")
    println(readlist.get(2))

    var writelist = mutableListOf("1" ,"2" ,"3", "4")
    writelist.add(4,"5")

    for (i in writelist){
        println(i)
    }

    var readset = setOf(1, 2, 3, 4, 5, 5, 4, 6, 7, 8, 9)
    println(readset)

    var writeset = mutableSetOf(1, 2, 3, 4, 5, 5, 4, 6, 7, 8, 9)
    writeset.add(1)
    println(writeset)
}