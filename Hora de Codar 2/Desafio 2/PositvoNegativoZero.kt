fun main(){

    var num1: Double

    println("Insira um número: "); num1 = readln().toDouble()

    if(num1 > 0){
        println("O número é positivo.")
    }
    else if(num1 < 0){
        println("O número é negativo.")
    }
    else{
        println("O número é zero.")
    }

}