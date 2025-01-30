fun main() {

    /*
    Дан список слов в произвольном порядке по алфавиту.
    Необходимо сгруппировать элементы по первому символу.
    */
    val listWords = listOf("Дан", "список", "слов", "произвольном", "порядке", "алфавиту")
    println(listWords)
    println(listWords.groupBy { it.lowercase().first() })
    println()

    /*
    Дан список строк.
    Необходимо сгруппировать его по длине строки.
    */
    val listString = listOf(
        "Дан список телефонов", "по году выпуска ", "Не забывайте",
        "он может выглядеть как map(ключ - значение)", "но на самом деле", "внутри себя будет содержать объект Pair"
    )
    println(listString)
    println(listString.groupBy { it.length })
    println()

    /*
    Дан список телефонов по году выпуска phoneToYear.
    Не забывайте он может выглядеть как map(ключ - значение), но на самом деле внутри себя будет содержать объект Pair.
    Необходимо с группировать объекты по годам выпуска телефонов. Исходный список, например, такой.
    val phoneToYear = listOf(
        "Nexus One" to 2010,
        "Pixel 2" to 2017,
        "Pixel 4a" to 2020,
        "iPhone 4" to 2010,
        "iPhone X" to 2017,
        "Galaxy Note 8" to 2017,
        "Galaxy S11" to 2020
    )
    */
    val phoneToYear = listOf(
        "Nexus One" to 2010, "Pixel 2" to 2017, "Pixel 4a" to 2020,
        "iPhone 4" to 2010, "iPhone X" to 2017, "Galaxy Note 8" to 2017, "Galaxy S11" to 2020
    )
    println(phoneToYear)
    println(phoneToYear.groupBy { (_, int) -> int })
}
