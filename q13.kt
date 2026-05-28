//Calculate simple interest
fun calculatesimpleinterest(p:Double,r:Double,t:Double):Double{
    return(p*t*r)/100
}
fun main(){
    val principal=1500.00
    val rate=7.00
    val time=2.00
    val si = calculatesimpleinterest(principal,rate,time)
    println("Simple interest=$si")
}
