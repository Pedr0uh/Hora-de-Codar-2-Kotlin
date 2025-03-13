fun main() {

    var n1: Double
    var n2: Double
    var n3: Double
    var primeiroMaior: Double
    var segundoMaior: Double
    var soma: Double

    println("Digite o primeiro número: "); n1 = readln().toDouble()
    println("Digite o segundo número: "); n2 = readln().toDouble()
    println("Digite o terceiro número: "); n3 = readln().toDouble()

    if (n1 > n2 && n1 > n3) {
        primeiroMaior = n1

        if (n2 > n3) {
            segundoMaior = n2
        }
       else{
           segundoMaior = n3
        }
    }
    else if (n2 > n1 && n2 > n3){
        primeiroMaior = n2
        if(n1 > n3){
            segundoMaior = n1
        }
        else{
            segundoMaior = n3
        }
    }
    else{
        primeiroMaior = n3
        if(n1 > n2){
            segundoMaior = n1
        }
        else{
            segundoMaior = n2
        }
    }

    soma = primeiroMaior + segundoMaior

    println("Primeiro maior $primeiroMaior")
    println("Segundo maior $segundoMaior")
    println("A soma dos 2 maiores é: $soma")

}