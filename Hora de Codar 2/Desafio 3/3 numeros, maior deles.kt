fun main() {

    var n1: Double
    var n2: Double
    var n3: Double

    println("Digite o primeiro número: "); n1 = readln().toDouble()
    println("Digite o segundo número: "); n2 = readln().toDouble()
    println("Digite o terceiro número: "); n3 = readln().toDouble()

    if(n1>n2 && n1>n3){
        println("O primeiro número é o maior")
    }
    else if(n2>n1 && n2>n3) {
        println("O segundo número é o maior")
    }
    else{
        println("O terceiro número é o maior")
    }

}