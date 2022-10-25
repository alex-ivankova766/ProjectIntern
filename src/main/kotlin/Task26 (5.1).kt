//Создать суперкласс Vehicle, описывающий поведение любого транспортного средства.
//В классе Vehicle создать два свойства (с инициализацией значений по умолчанию)
//для переопределения в классах наследниках: скорость и название.
//В классе Vehicle создать два метода start() и stop() (с действием по умолчанию)
//для переопределения в классах наследниках, которые будут выводить на экран начало движения и остановку.
//Пример: “Автомобиль начал движение со скоростью 50 км/ч”
//Создать три класса наследника  от Vehicle описывающих три типа транспортных средств: лодка, самолет и танк.

open class Vehicle(open val speed: Int = 10, open val name: String = "Vehicle") {
    open fun start() {
        println("Транспортное средство $name начало движение со скоростью $speed км/ч")
    }

    open fun stop() {
        println("Транспортное средство $name остановилось.")
    }
}

class Boat(override val speed: Int = 5, override val name: String = "Boat") : Vehicle() {
    override fun start() {
        println("Лодка $name начала движение со скоростью $speed км/ч")
    }

    override fun stop() {
        println("Лодка $name остановилась.")
    }
}

class Airplane(override val speed: Int = 500, override val name: String = "Airplane") : Vehicle() {
    override fun start() {
        println("Самолёт $name начал движение со скоростью $speed км/ч")
    }

    override fun stop() {
        println("Самолёт $name приземлился и остановился.")
    }
}

class Tank(override val speed: Int = 40, override val name: String = "Tank") : Vehicle() {
    override fun start() {
        println("Танк $name начал движение со скоростью $speed км/ч")
    }

    override fun stop() {
        println("Танк $name остановился.")
    }
}
