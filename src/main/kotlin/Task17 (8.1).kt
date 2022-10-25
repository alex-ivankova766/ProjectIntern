//Пользователь вводит с клавиатуры два числа, знак операции (+,-,* или /) и выполняет над числами указанную операцию.

fun eval(expression: String) : Int {
    when  {
        ("-" in expression) -> return expression.split("-")[0].toInt() - expression.split("-")[1].toInt()
        ("+" in expression) -> return expression.split("+")[0].toInt() + expression.split("+")[1].toInt()
        ("/" in expression) -> return expression.split("/")[0].toInt() / expression.split("/")[1].toInt()
    }
    return expression.split("*")[0].toInt() * expression.split("*")[1].toInt()
}
fun main() {
    var task = readLine()
    while (task != null && task.replace(" ", "").replace(Regex("""[0-9]{1,}[+-/*][0-9]{1,}"""), "") != "") {
        println("Введите число, один из математических символов +-*/ и ещё одно число")
        task = readLine()
    }
    task = task!!.replace(" ", "")
    println(eval(task!!))
}
