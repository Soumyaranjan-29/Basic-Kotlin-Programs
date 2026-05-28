//print all prime numbers from 1 to n
fun main(){
    val n=25
    for(num in 2..n){
       var isprime=true
       for(i in 2 until num){
           if(num%i==0){
               isprime=false
               break
           }
       }
       if(isprime){
    println(num)
       }
    }
}
