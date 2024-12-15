```kotlin
fun main() {
    val map = mutableMapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five")

    // Correct way to remove elements from a MutableMap based on a condition
    val keysToRemove = map.filter { it.key % 2 == 0 }.map { it.key }
    keysToRemove.forEach { map.remove(it) }
    println(map) // Output: {1=one, 3=three, 5=five}
    
    //Alternative using entries.removeIf
    val map2 = mutableMapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five")
    map2.entries.removeIf { it.key % 2 == 0 }
    println(map2) // Output: {1=one, 3=three, 5=five}
}
```