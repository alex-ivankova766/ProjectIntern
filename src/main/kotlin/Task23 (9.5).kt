//Дан набор phoneBook содержащий пары “имя”-”номер телефона”.
// Оставить только те пары, для которых “номер телефона”
// начинается с заданного кода страны countryCode.

fun main() {
    val phoneBook =
        mapOf("Alex" to "+79000000000", "Ben" to "+99000000000", "Carl" to "+79100000000", "Den" to "+349000000000")
    val countryCode = "+7"
    val filteredPhoneBook = phoneBook.filterValues { countryCode in it }
    println(filteredPhoneBook)
}