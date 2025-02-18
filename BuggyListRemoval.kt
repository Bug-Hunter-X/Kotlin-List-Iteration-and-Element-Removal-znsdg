fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]

    val list2 = mutableListOf<Int>(1,2,3,4,5)
    for (i in list2.size -1 downTo 0) {
        if (list2[i] %2 == 0) {
            list2.removeAt(i)
        }
    }
    println(list2) //Output: [1,3,5]
}