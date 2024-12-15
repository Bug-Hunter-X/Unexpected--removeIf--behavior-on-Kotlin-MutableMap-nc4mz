```kotlin
fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    set.removeIf { it % 2 == 0 }
    println(set) // Output: [1, 3, 5]

    // Unexpected behavior starts here
    val map = mutableMapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five")
    map.removeIf { it.key % 2 == 0 }
    println(map) // Output: {1=one, 3=three, 5=five}

    val map2 = mutableMapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five")
    map2.entries.removeIf { it.key % 2 == 0 }
    println(map2) // Output: {1=one, 3=three, 5=five}

    val map3 = mutableMapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five")
    val keysToRemove = map3.filter { it.key % 2 == 0 }.map { it.key }
    keysToRemove.forEach { map3.remove(it) }
    println(map3) // Output: {1=one, 3=three, 5=five}
}
```