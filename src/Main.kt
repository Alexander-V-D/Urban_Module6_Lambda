fun main() {

    //Задача 1
    val print = { str: String -> print(str) }
    print("Пример выполнения решения задачи 1: ")
    repeatPrint(1, "1", print = print)
    println()

    //Задача 2
    val getArithmeticMean = { array: Array<Int> ->
        var sum = 0.0
        array.forEach { sum += it }
        sum / array.size
    }
    println(
        "Пример выполнения решения задачи 2: " +
                "${getArithmeticMean(arrayOf(1, 2, 3, 4, 5))}"
    )

    //Задача 3
    val filterPositiveNumbersFromArray = { array: Array<Int> ->
        var filteredArray = arrayOf<Int>()
        array.forEach { if (it >= 0) filteredArray += it }
        filteredArray
    }
    println(
        "Пример выполнения решения задачи 3: " +
                filterPositiveNumbersFromArray(arrayOf(-2, -1, 0, 1, 2)).contentToString()
    )

    //Задача 4
    val transformArray = { array: Array<Int> ->
        array.forEachIndexed { index, i ->
            if (i % 2 == 0) array[index] /= 2 else array[index] *= 3
        }
    }
    val array = arrayOf(2, 5, 6, 9, 1)
    transformArray(array)
    println("Пример выполнения решения задачи 4: " + array.contentToString())
}

//Функция для задачи 1
fun repeatPrint(count: Int, message: String, print: (String) -> Unit) {
    repeat(count) {
        print(message)
    }
}