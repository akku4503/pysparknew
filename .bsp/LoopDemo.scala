object LoopDemo {
  def main(args: Array[String]): Unit = {
    println("Demo: While Loop")
    var i = 1
    while (i <= 5) {
      println(s"While Loop iteration: $i")
      i += 1
    }

    println("\nDemo: Do-While Loop")
    var j = 1
    do {
      println(s"Do-While Loop iteration: $j")
      j += 1
    } while (j <= 5)

    println("\nDemo: For Loop with Range")
    for (k <- 1 to 5) {
      println(s"For Loop iteration: $k")
    }

    println("\nDemo: For Loop with Guards (only even numbers)")
    for (k <- 1 to 10 if k % 2 == 0) {
      println(s"Even number: $k")
    }

    println("\nDemo: For Loop with yield (creates a collection)")
    val squares = for (k <- 1 to 5) yield k * k
    println(s"Squares from 1 to 5: ${squares.mkString(",")}")
  }
}