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
}