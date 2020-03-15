fun main() {
    var example = "ИЯ-32"
    var rWords = listOf(' ', '-', '(', ')', '1', '2', '3', '4', 'Д', 'О', 'В', 'И', 'Н', 'Ф', 'К', 'Р', 'П', 'М', 'С', 'Т', 'Я')
    var eWords = listOf(' ', '-', '(', ')', '1', '2', '3', '4', 'd', 'o', 'v', 'i', 'n', 'f', 'k', 'r', 'p', 'm', 's', 'T', 'y', 'a')
    var chStr = mutableListOf<String>()
    var i = 0

   //Цикл прогоняет всю строку
   while (i < example.length) {
       var j = 0
       println(">>> i = $i")
       //Проверка нужного символа на совпадения
       while (j < rWords.size) {
           println(">>> j = $j")
           var box = example[i]
           println("box = $box")
           if (rWords[j] == example[i]) {
               if (j == 20) {
                   box = eWords[j]
                   chStr.add(i, box.toString())
                   box = eWords[j+1]
                   chStr.add(i+1, box.toString())
                   //i++
                   break
               }
               box = eWords[j]
               chStr.add(i, box.toString())
               break
           }
           println("массив = $chStr")
           j++
           println("<<< j = $j")
       }
       i++
       println("<<< i = $i")
    }
    println("Измененная строка - $chStr")
}