fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]

    val list2 = mutableListOf<Int>(1,2,3,4,5)
    val toRemove = mutableListOf<Int>()
    for (item in list2) {
        if (item % 2 == 0) {
            toRemove.add(item)
        }
    }
    list2.removeAll(toRemove) 
    println(list2) //Output: [1,3,5]
    
    //Alternative solution using a descending iterator
    val list3 = mutableListOf<Int>(1,2,3,4,5)
    for (i in list3.size -1 downTo 0) {
        if (list3[i] % 2 == 0) {
            list3.removeAt(i)
        }
    }
    println(list3) //Output: [1,3,5]
} 