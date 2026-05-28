//Find sum of digits of a number
fun main(){
    var num=46796
    var sum=0
      while(num!=0){
          sum=sum+num%10
          num=num/10
      }
    println("Sum of digits=$sum")
}
