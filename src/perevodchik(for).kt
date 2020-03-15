//Через for

fun main() {
    var example = "Д-4 сс"
    var rWords = listOf(" ", "-", "(", ")", "1", "2", "3", "4", "Д", "О", "В", "И", "Н", "Ф", "К", "Р", "П", "М", "С", "Т", "с", "Я")
    var eWords = listOf(" ", "-", "(", ")", "1", "2", "3", "4", "d", "o", "v", "i", "n", "f", "k", "r", "p", "m", "s", "T", "s", "y", "a")
    var finStr = " "

    //Цикл прогоняет всю строку
    for (element in example) {
        //Проверка нужного символа на совпадения
        for(j in rWords.indices) {
            if (rWords[j] == element.toString()) {
                if (j == 21) {
                    finStr += eWords[j]
                    finStr += eWords[j+1]
                    break
                }
                finStr += eWords[j]
                break
            }
        }
    }

    println("Готовая строка - $finStr")
}