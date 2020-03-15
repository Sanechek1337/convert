fun main() {
    var rWords = Array<Char>(30){i -> 'А' + i}
    var eWords = Array<Char>(30){i -> 'A' + i}

    var j = 0
    for (i in rWords){
        println("rWords №$j = $i")
        j++
    }

    println()

    j = 0
    for (i in eWords){
        println("eWords №$j = $i")
        j++
    }
}