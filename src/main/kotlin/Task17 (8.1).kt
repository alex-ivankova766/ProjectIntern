//Пользователь вводит с клавиатуры два числа, знак операции (+,-,* или /) и выполняет над числами указанную операцию.

fun eval(expression: String): Int {
    return when {
        ("-" in expression) -> expression.split("-").first().toInt() - expression.split("-").last().toInt()
        ("+" in expression) -> expression.split("+").first().toInt().toInt() + expression.split("+").last().toInt()
        ("/" in expression) -> expression.split("/").first().toInt().toInt() / expression.split("/").last().toInt()
        else -> expression.split("*").first().toInt().toInt() * expression.split("*").last().toInt()
    }
}

fun main() {
    var task = readLine()?.replace(" ", "")
    while (task != null && task.replace(Regex("\\d+[+-/*]\\d+"), "") != "") {
        println("Введите число, один из математических символов +-*/ и ещё одно число")
        task = readLine()?.replace(" ", "")
    }

    println(eval(task!!))
}
