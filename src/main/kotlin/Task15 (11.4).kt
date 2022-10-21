//За пределами main() описать функцию
// messageParse(message:String, eventX:( ) -> Unit, eventY:( ) -> Unit, eventZ:( ) -> Unit)
// который принимает в качестве параметра строку.
// Функция должна перебирать строку посимвольно и если символ равен ‘x’,’y’ или ‘z’,
// то соответственно должны вызываться eventX(),eventY() или eventZ(). Регистр не учитывать.
//В main() вызвать нашу функцию messageParse() передать строку “abxbbznmfkYyyxX”
// а в лямбдах событий сделать обработку, выводить на экран сообщение “обнаружен символ x”, “y”, ”z” соответственно.

fun messageParse(message:String, eventX:() -> Unit, eventY:() -> Unit, eventZ:() -> Unit) {
    for (char in message.lowercase()) {
        if (char == 'x') {
            eventX()
        }
        if (char == 'y') {
            eventY()
        }
        if (char == 'z') {
            eventZ()
        }
    }
}
fun main() {
    messageParse("abxbbznmfkYyyxX", {println("Обнаружен символ x")}, {println("Обнаружен символ y")}, {println("Обнаружен символ z")})
}