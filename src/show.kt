fun main() {
    var example = "жопа"
    var rWords = listOf(' ', 'ж', 'о', 'п', 'а')
    var eWords = listOf(' ', 'j', 'o', 'p', 'a')
    var chStr = mutableListOf<String>()
    var i = 0
    println("Дефолтная строка $example")

    while (i < example.length) {
        var j = 0
        while (j < 5) {
            var box = example[i]
            if (rWords[j] == example[i]) {
                box = eWords[j]
                chStr.add(i, box.toString())
                break
            }
            j++
        }
        i++
    }
    println("Измененная строка - $chStr")
}