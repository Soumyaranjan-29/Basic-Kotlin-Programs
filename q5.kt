//whether a number is palindrome or not
fun main(){
    var num=242
    val original=num
    var reverse=0
    while(num!=0){
      val digit=num%10
        reverse=reverse*10+digit
        num=num/10
    }
    if(original==reverse)
    println("$original is palindrome")
    else
    println("$original is not plaindrome")
}
