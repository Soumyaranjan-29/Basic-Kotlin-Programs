//sum of all numbers from 1 to N
fun sumofnumbers(n:Int):Int {
    var sum=0
      for(i in 1..n){
          sum=sum+i
      }
      return sum
}
   fun main(){
       val n=15
      println("sum from 1 to $n =${sumofnumbers(n)}")
}
