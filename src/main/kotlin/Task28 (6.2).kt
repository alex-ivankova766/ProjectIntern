//Реализовать предыдущее задание с фигурами через interface.
//Создать абстрактный класс Figure, в нем описать два абстрактных метода для вычисления площади и периметра.
//Создать не менее трех классов различных геометрических фигур (например: квадрат, окружность, треугольник),
//которые будут наследоваться от абстрактного класса Figure,  переопределить и реализовать методы.
//создать объекты классов и вывести на экран результаты выполнения методов
import kotlin.math.sqrt as sqrt

private const val PI = 3.1415926535897932384626433832795

interface Figure {
    fun square(): Double
    fun perimeter(): Double
}

class Square(private val side: Double) : Figure {
    override fun square(): Double {
        return side * side
    }

    override fun perimeter(): Double {
        return side * 4
    }
}

class Circle(private val radius: Double) : Figure {
    override fun square(): Double {
        return PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * PI * radius
    }
}

class Triangle(private var sideA: Double, private var sideB: Double, private var sideC: Double) : Figure {
    init {
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            println("Треугольник со сторонами $sideA, $sideB, $sideC не может существовать!")
            sideA = 0.0
            sideB = 0.0
            sideC = 0.0
        }
    }

    private val perimeter = sideA + sideB + sideC
    override fun perimeter(): Double {
        return perimeter
    }

    private val halfPerimeter
        get() = perimeter / 2

    override fun square(): Double {
        return sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC))
    }
}

fun main() {
    val mySquare = Square(5.0)
    val myCircle = Circle(3.0)
    val myTriangle = Triangle(2.0, 3.0, 4.0)
    val badTriangle = Triangle(2.0, 3.0, 6.0)
    println("Площадь квадрата = ${mySquare.square()}, периметр квадрата = ${mySquare.perimeter()}\n" +
            "Площадь круга = ${myCircle.square()}, длина окружности = ${myCircle.perimeter()}\n" +
            "Площадь треугольника = ${myTriangle.square()}, периметр треугольника = ${myTriangle.perimeter()}")
}
