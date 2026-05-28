//count the number of digits
fun main(){
    var num=647938569
    var count=0
    
    while(num!=0){
       num=num/10
       count++
    }
    println("Number of digits=$count")
}
