fun main(args: Array<String>) {
    println("Hello ${args[0]}!")

    val isUnit = print("The is an expression")
    println(isUnit)

    val temperature = 10
    val isHot = if (temperature > 50) true else false
    println(isHot)

    val message = "You are ${if (temperature > 50) "tried" else "safe" } fish"
    println(message)
}