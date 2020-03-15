//Через for и while

fun main() {
    var example = "ИЯ-32"
    var rWords = listOf("Д", "О", "В", "И", "Н", "Ф", "К", "Р", "П", "М", "С", "Т", "с", "Я")
    var eWords = listOf("d", "o", "v", "i", "n", "f", "k", "r", "p", "m", "s", "T", "s", "y", "a")
    var finStr = " "

    //Цикл прогоняет всю строку
    for (element in example) {
        var j = 0
        //Проверка нужного символа на совпадения
        while (j < rWords.size) {
            if (rWords[j] == element.toString()) {
                //Для буквы Я
                if (j == 13) {
                    finStr += eWords[j]
                    finStr += eWords[j+1]
                    break
                }
                finStr += eWords[j]
                break
            }
            j++
        }
        if (j > 13) {
            finStr += element
        }
    }

    println("Готовая строка - $finStr")
}