//Создать переменную concat и присвоить ей лямбда-выражение,
// которое в качестве параметра принимает несколько переменных (не менее трех) типа String,
// а тело преобразовывает их в одну строку, в порядке возрастания(по количеству символов в слове) и выводит на экран.
fun main() {
    val concat: (String, String, String) -> Unit =
        { str1, str2, str3 -> println(listOf(str1, str2, str3).sortedWith(compareBy { it.length }).joinToString()) }
    concat("books", "crocodile", "dino")
}