// kotlin main function
fun main(args: Array<String>){
    println("Hello from his side")

    // from a kotlin class
    var delink = First()
    delink.name = "Delink"
    println("The name for this Alien is: ${delink.name}")

    // from a java class
    var mwas = Allien()
    mwas.name = "Mwangi"
    println("The second name for this Alien is: ${mwas.name}")

    // suming numbers
    var num1: Int = 5
    var num2: Int = 57

    var ans = num1 + num2
    println("$num1 + $num2 = $ans")

    // if condition
    //   find the largerst number between two numbers
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
}