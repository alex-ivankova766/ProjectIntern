//Дан список words содержащий null и элементы типа String.
//Вывести на экран построчно каждый каждый элемент, преобразовав в верхний регистр и предварительно проверив на null:
//- используя оператор if
//- используя оператор безопасного вызова ?
//- используя функцию let
//- используя Элвис-оператор ?: задать значение по умолчанию для null объектов = ”empty”

fun main() {
    val words: List<String?> = listOf("dog", null, "CAT", null, "Crocodile")

    println("if with forEach")
    words.forEach { word ->
        println(if (word != null) word.uppercase() else "empty") }

    println("\nif with for")
    for (word in words) {
        if (word != null) {
            println(word.uppercase())
        }
    }

    println("\n?")
    words.forEach { word ->
        println(word?.uppercase()) }

    println("\nlet")
    words.forEach { word ->
        word?.let { println(it.uppercase()) } }

    println("\n?:")
    words.forEach { word ->
        println(word?.uppercase() ?: "empty") }
}