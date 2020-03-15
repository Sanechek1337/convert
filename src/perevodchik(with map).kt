//Map вместо list

fun main() {
    var example = "ИЯ-32"
    val words = mapOf<Char, String> (
        'В' to "v", 'Д' to "d", 'И' to "i", 'К' to "k", 'М' to "m",
        'Н' to "n", 'О' to "o", 'П' to "p", 'Р' to "r", 'С' to "s",
        'с' to "s", 'Т' to "t", 'Ф' to "f", 'Я' to "ya", ' ' to " ",
        '-' to "-", '(' to "(", ')' to ")", '1' to "1", '2' to "2",
        '3' to "3", '4' to "4")
    var finStr = " "

    //Цикл прогоняет всю строку
    for (element in example) {
        //Проверка нужного символа на совпадения
        for(j in words) {
            if (j.key == element) {
                finStr += j.value
                break
            }
        }
    }

    println("Готовая строка - $finStr")
}