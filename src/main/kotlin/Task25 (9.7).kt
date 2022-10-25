//Время дано строкой “01:20:12”, содержащей часы, минуты и секунды, разделенные двоеточием.
// Разобрать строку и рассчитать количество секунд прошедших с начала дня.
//Использовать функцию split()

fun main() {
    val time = "01:20:12"
    val timeList = time.split(":").map {it.toInt()}
    val hours = timeList[0]
    val minutes = timeList[1]
    val seconds = timeList[2]
    println("С начала дня прошло ${hours * 3600 + minutes * 60 + seconds} секунд")
}