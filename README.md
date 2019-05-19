# Kotlin-Bootcamp-for-Programmers-Udacity
## Documentation
* [Kotlin Language Documentation](https://kotlinlang.org/docs/reference/)
* [Exclamation Mark in Computing](https://en.wikipedia.org/wiki/Exclamation_mark#Computers)
* [Kotlin Bootcamp Quick Reference Sheet](https://s3.amazonaws.com/video.udacity-data.com/topher/2018/April/5ade60d4_kotlin-quick-reference-sheet/kotlin-quick-reference-sheet.pdf)
## Software
* JAVA JDK 12.0.1
* IntelliJ IDEA Ultimate
## Course Outline
* Lesson 1: Introduction => Set up Software
   - Kotlin REPL < Ctrl + Enter > to execute
      ```kotlin
      fun printHello () {
         println ("Hello World")
      }

      printHello() // Hello World
      ```
* Lesson 2: Kotlin Basics => [Kotlin Koans](https://try.kotlinlang.org/#/Examples/Hello,%20world!/Simplest%20version/Simplest%20version.kt) (REPL) => Operators /  
   - Operators
      ```kotlin
      // res case: kotlin.Type = ?

      1+1 // 2

      53-3 // 50

      50/10 // 5

      1/2 // 0

      1.0/2.0 // 0.5

      6*50 // 300

      val fish = 2
      fish.times(6) // 12
      fish.div(10) // 0
      fish.plus(3) // 5
      fish.minus(3) // -1

      // use primitive 'int' as an object
      1.toLong() // 1

      val boxed: Number = 1
      boxed.toLong() // 1

      // aquarium
      val aquarium = 1
      aquarium // 1

      aquarium = 2 // error: val cannot be reassigned => aquarium = 2
      
      var fish = 2
      fish // 2

      fish = 50
      fish // 50

      fish = "Bubbles" // error: type mismatch: inferred type is String but Int was expected => fish = "Bubbles"

      val plants = 5
      val fish = 2
      fish + plants // 7

      val b: Byte = 1
      val i: Int = b // error: type mismatch: inferred type is Byte but Int was expected => val i: Int = b

      val i: Int = b.toInt()

      val oneMillion = 1_000_000
      val socialSecurityNumber = 999_99_9999L
      val hexBytes = 0xFF_EC_DE_5E
      val bytes = 0b11010010_01101001_10010100_10010010

      var rock : Int = null // error: null can not be a value of a non-null type Int => var rock : Int = null

      var marbles : Int? = null
      var lostOfFish: List<String?> = listOf(null, null)
      var everMoreFish : List<String>? = null
      var definitelyFish : List<String?>? = null
      definitelyFish = listOf(null, null)

      // Error
      goldfish!!.eat()
      goldfish = null
      goldfish!!.eat() 

      var fishFoodTreats = 5
      return fishFoodTreats?.dec() ?: 0
      ```
   - Strings
      ```kotlin
      "Hello Fish" // Hello Fish

      "hello" + " fish" // hello fish

      val numberOfFish = 5
      val numberOfPlants = 12

      "I have $numberOfFish fish and $numberOfPlants plants" // I have 5 fish and 12 plants

      "I have ${numberOfFish + $numberOfPlants} fish and plants" // I have 17 fish and plants

      var fish = "fish"
      var plant = "plant"
      fish == plant // false
      fish == fish // true
      fish != plant // true

      val numberOfFish = 50
      val numberOfPlants = 23
      if (numberOfFish > numberOfPlants) println("Good ratio!")
      else println("unhealthy ratio")
      // Good ratio!

      val fish = 50
      if (fish in 1..100) println(fish) // 50

      when (numberOfFish) {
         0 -> println("Empty tank")
         50 -> println("Full tank")
         else -> println("Perfect!")
      }
      // Full tank
      ```
   - Arrays and Loops
      ```kotlin
      val myList = mutableListOf("tuna","salmon",shark)
      myList = mutableListOf("Koi", "goldfish") // error

      val myList = mutableListOf("tuna","salmon",shark)
      myList.remove("shark") // true

      var fish = 12
      var plants = 5
      val swarm  = listOf(fish, plants)
      swarm // kotlin.collections.List<kotlin.Int> = [12, 5]

      val school = arrayOf("tuna","salmon","shark")
      val numbers = intArrayOf(1,2,3)

      import java.util.*
      println(Arrays.toString(intArrayOf(2, "foo"))) // error: type mismatch: inferred type is String but Int was expected

      val mix = arrayOf("fish", 2)
      println(Arrays.toString(mix)) // [fish, 2]
    
      val bigSwarm  = arrayOf(swarm, arrayOf("dolphin","whale","orka"))
      println(Arrays.toString(bigSwarm)) // [[12, 5], [Ljava.lang.String;@43e7ca6f]

      val array = Array(5) { it * 2 }
      println(array.asList()) // [0, 2, 4, 6, 8]
    
      for (element in swarm) println(element) // 125

      for ((index, element) in swarm.withIndex()) {
         println("Fish at $index is $element")
      } // Fish at 0 is 12Fish at 1 is 5
      ```