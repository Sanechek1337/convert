//Через while

fun main() {
    var example = "Д-4 сс"
    var rWords = listOf(' ', '-', '(', ')', '1', '2', '3', '4', 'Д', 'О', 'В', 'И', 'Н', 'Ф', 'К', 'Р', 'П', 'М', 'С', 'Т', 'с', 'Я')
    var eWords = listOf(' ', '-', '(', ')', '1', '2', '3', '4', 'd', 'o', 'v', 'i', 'n', 'f', 'k', 'r', 'p', 'm', 's', 'T', 's', 'y', 'a')
    var chStr = mutableListOf<Char>()
    var finStr = " "
    var i = 0

   //Цикл прогоняет всю строку
   while (i < example.length) {
       var j = 0
       //Проверка нужного символа на совпадения
       while (j < rWords.size) {
           var box = example[i]
           if (rWords[j] == example[i]) {
               if (j == 21) {
                   box = eWords[j]
                   chStr.add(box)
                   box = eWords[j+1]
                   chStr.add(box)
                   break
               }
               box = eWords[j]
               chStr.add(box)
               break
           }
           j++
       }
       i++
    }

    for (i in chStr) {
        finStr += i
    }

    println("Измененная строка - $chStr")
    println("Готовая строка - $finStr")
}