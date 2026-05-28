//Factorial of a number
fun main(){
    val num=6
    var fact=1
    
     for(i in 1..num){
         fact=fact*i
     }
     println("factorial=$fact")
}
