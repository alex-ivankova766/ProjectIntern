//Создать класс Car с двумя полями:name и speed  и дата класс Vehicle с двумя полями:name и speed .
//создать объекты car1 = Car(“Lada”,100) и car2 = Car(“Lada”,100)
//вывести на экран сравнение двух объектов car1 и car2 с помощью операторов “==” и “===”,
//вывести на экран hashCode этих объектов.
//создать объект car3 = car1,
//вывести на экран сравнение двух объектов car1 и car3 с помощью операторов “==” и “===”,
//вывести на экран hashCode этих объектов,
//в объекте car3 изменить свойство name = “Belaz”,
//вывести на экран свойства name объектов car1 и car3,
//Проанализировать поведение.
//создать объекты vehicle1 = Vehicle(“Ural”,100) и vehicle2 =Vehicle(“Ural”,100)
//провести все операции описанные выше, над объектами vehicle1 и  vehicle2
//создать объекты vehicle3=vehicle1.copy(“ZIL”) и
//vehicle4=vehicle1.copy()
//провести все операции сравнения между объектами vehicle3 и vehicle1, vehicle4 и vehicle1.
// Проанализировать полученные результаты.
abstract class Transport() {
    abstract fun getName(): String
    abstract fun getSpeedValue(): Int
}

class Car(private var name: String, val speed: Int) : Transport() {
    fun setName(newName: String) {
        name = newName
    }

    override fun getName() = name
    override fun getSpeedValue() = speed
}

data class Vehicle(private var name: String, val speed: Int) : Transport() {
    override fun getName() = name
    override fun getSpeedValue() = speed
}

fun compare(transport1: Transport, transport2: Transport) {
    println("(${transport1.getName()}, ${transport1.getSpeedValue()}) == (${transport2.getName()}, ${transport1.getSpeedValue()}) is ${transport1 == transport2}")
    println("(${transport1.getName()}, ${transport1.getSpeedValue()})  === (${transport2.getName()}, ${transport2.getSpeedValue()}) is ${transport1 === transport2}")
    println("(${transport1.getName()}, ${transport1.getSpeedValue()}) hashCode is ${transport1.hashCode()}")
    println("(${transport2.getName()}, ${transport1.getSpeedValue()}) hashCode is ${transport2.hashCode()}")
}

fun main() {
    val car1 = Car("Lada", 100)
    val car2: Car = Car("Lada", 100)
    println("car1(Lada, 100) and car2(Lada, 100) созданы.")
    compare(car1, car2)
    println("Объекты похожи, как две капли воды, но являются разными.")
    val car3 = car1
    println("car3 = car1 создан. По сути переменной car3 класса Car присвоен объект car1")
    compare(car1, car3)
    println("Переменные ссылаются на один и тот же объект, поэтому они абсолютно равны.")
    car3.setName("Belaz")
    println("Имя car3 изменено на Belaz")
    println("car1.name = ${car1.getName()}")
    println("car3.name = ${car3.getName()}")
    println("Имя car1 также поменялось, тк переменные по-прежнему ссылаются на один и тот же объект.")
    val vehicle1 = Vehicle("Ural", 100)
    val vehicle2 = Vehicle("Ural", 100)
    println("vehicle1(Ural, 100) и vehicle2(Ural, 100) дата класса Vehicle созданы.")
    compare(vehicle1, vehicle2)
    println("vehicle1(Ural, 100) и vehicle2(Ural, 100) равны по значению, но не являются одним и тем же объектом, несмотря на то, что их хешкоды (переопределённые в дата классе) совпадают.")
    val vehicle3 = vehicle1.copy("ZIL")
    val vehicle4 = vehicle1.copy()
    println("vehicle3(ZIL, 100) и vehicle4(Ural, 100) скопированы из vehicle1")
    compare(vehicle1, vehicle3)
    println("vehicle1(Ural, 100) и vehicle3(Ural, 100) отличаются по значению, и не являются одним и тем же объектом, поэтому не равны ни в том, ни в другом случае.")
    compare(vehicle1, vehicle4)
    println("vehicle1(Ural, 100) и vehicle4(Ural, 100) равны по значению, их хешкоды равны, но они являются разными объектами тк vehicle4(Ural, 100) был скопирован из vehicle1(Ural, 100)")
}
