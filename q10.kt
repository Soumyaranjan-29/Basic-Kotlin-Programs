//Check whether a character is a vowel or consonant
fun checkcharacter(ch:Char):String{
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
       return "vowel"
    }
    else{
      return "consonant"
    }
}
fun main(){
    val ch='i'
    println("$ch is ${checkcharacter(ch)}")
}
