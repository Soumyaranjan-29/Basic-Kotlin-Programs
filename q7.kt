//Find the largest among three numbers
fun findlargest(a:Int,b:Int,c:Int):Int{
 if(a>=b&&a>=c){
     return a
    }
    else if(b>=a&&b>=c){
    return b
    }
    else{
    return c
    }
}
fun main(){
    val num1=20
    val num2=7
    val num3=25
    val largest=findlargest(num1,num2,num3)
    println("Largest number=$largest")
}
