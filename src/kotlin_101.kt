// kotlin main function
fun main(args: Array<String>){
    println("Hello! from this Kotlin side")

    // from a kotlin class
    var delink = First()
    delink.name = "Delink"
    println("The name for this Alien is: ${delink.name}")

    // from a java class
    var mwas = Allien()
    mwas.name = "Mwangi"
    println("The second name for this Alien is: ${mwas.name}")

    // summing numbers
    var num1: Int = 5
    var num2: Int = 57

    var ans = num1 + num2
    println("$num1 + $num2 = $ans")

    // if condition
    //   find the largest number between two numbers
    var result: Int
    result = if(num1 < num2)
       num2
    else
        num1

    println("The largest number is: $result")

    // string comparison
    var string1: String = "Delink_"
    var string2: String = "Delink"

    if(string1 == string2)
        println("These strings are same")
    else
        println("This strings are not same")

    // null handling
    // in kotlin you are not allowed to assign null values to an abject
    // to assign a null we use a question mark like below
    var stringx: String? = null
    println(stringx)

    // switch in kotlin
    // check to find the day of the week from the input num
    var num: Int = 5

    when(num) {
        1 -> println("Today is Monday")
        2 -> println("Today is Tuesday")
        3 -> println("Today is Wednesday")
        4 -> println("Today is Thursday")
        5 -> println("Today is Friday")
        6 -> println("Today is Saturday")
        7 -> println("Today is Sunday")
        else -> println("It's not a day of the week")
    }

    // loops - while loop, do while loop, for loop
    // for loop 1
    var numbers = 3 .. 33

    for (n in numbers)
        println("Number: $n")

    // for loop 2
    // making use of step to skip numbers
    var numbers2 = 3 .. 33

    for (n in numbers2.reversed() step 3)
        println("Number: $n")

    println("The count is : ${numbers2.count()}")
}