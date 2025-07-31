object CollectionDemo {
  def main(args: Array[String]): Unit = {
    // List Example
    val fruits = List("apple", "banana", "orange")
    println("List Example:")
    fruits.foreach(fruit => println(s"Fruit: $fruit"))

    // Set Example
    val numbers = Set(1, 2, 2, 3, 4)
    println("\nSet Example (duplicates removed):")
    numbers.foreach(num => println(s"Number: $num"))

    // Map Example
    val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo", "India" -> "New Delhi")
    println("\nMap Example:")
    capitals.foreach { case (country, capital) =>
      println(s"Capital of $country is $capital")
    }

    // List - filtering and mapping
    val squared = fruits.indices.map(i => i * i).toList
    println(s"\nSquares of indices: ${squared.mkString(", ")}")

    // Set - check existence
    println(s"\nSet contains 3? ${numbers.contains(3)}")
    println(s"Set contains 10? ${numbers.contains(10)}")

    // Map - get value by key
    println(s"\nCapital of France: ${capitals.getOrElse("France", "Unknown")}")
  }
}
