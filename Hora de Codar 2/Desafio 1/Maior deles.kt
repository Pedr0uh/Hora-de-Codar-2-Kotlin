fun main(){
    var n1: Double
    var n2: Double

    println("Insira o primeiro número: "); n1 = readln().toDouble()
    println("Insira o segundo número: "); n2 = readln().toDouble()

    if (n1 > n2){
        println("O primeiro número é maior")
    }
    else if(n1 == n2){
        print("Os números são iguais")
    }
    else{
        println("O segundo número é maior")
    }


}