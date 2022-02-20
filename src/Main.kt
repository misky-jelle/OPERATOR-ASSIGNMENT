fun main(){
    printName("Misky")
    var result= getRemainder(5,2)
    println(result)
    var sum= Sum(3,5,1,7)
    println(sum)
    printInterestingfunFact("basketball")

}














fun printName(name: String){
    println("Hello" + " " + name)
}
fun getRemainder(num1:Int,num2:Int):Int{
    var modulus =num1 % num2
    return modulus
}
fun Sum(a:Int,b:Int,c:Int,d:Int):Int{
    var sum =a+b+c+d
    return sum
}
fun printInterestingfunFact(fact:String){
    println("I love" + " " + fact)
}