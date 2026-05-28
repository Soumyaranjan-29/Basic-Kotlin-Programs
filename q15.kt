//Fibonacci series up to n numbers 
fun main(){
    val n=15
    var a=0
    var b=1
    
    println("Fibonacci series:")
    for(i in 1..n){
        print("$a  ")
        val  next=a+b
        a=b
        b=next
    }
}
