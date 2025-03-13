var n1: Double = 0.0
var n2: Double = 0.0
var op: String = ""

fun main() {

    println("\n--- Bem-Vindo(a) a Micro Calculadora ---\n")

    option()

}

fun option(){

    println("Insira o primeiro valor: "); n1 = readln().toDouble()
    println("Insira o segundo valor: "); n2 = readln().toDouble()

    println("Qual operação que deseja realizar? " +
            "\n1) Adição" +
            "\n2) Subtração" +
            "\n3) Divisão" +
            "\n4) Multiplicação" +
            "\n5) Sair"); val opcao = readln().toInt()

    when(opcao){

        1 -> {
            adi()
        }
        2 -> {
            sub()
        }
        3 -> {
            div()
        }
        4 -> {
            mult()
        }
        5 -> {
            sair()
        }
        else -> {
            print("\nNúmero Invalido, tente novamente\n")
            option()
        }
    }

}

fun adi() {
    val soma = n1 + n2
    println("\nA soma dos números é: $soma")

    println("Deseja realizar uma nova operação? (s/n)")
    op = readln()

    when(op){
        "s" -> {
            option()
        }
        "n" -> {
           sair()
        }
    }

}

fun sub(){
    val subtracao = n1 - n2
    println("\nA subtração dos números é: $subtracao")

    println("Deseja realizar uma nova operação? (s/n)")
    op = readln()

    when(op){
        "s" -> {
            option()
        }
        "n" -> {
            sair()
        }
    }
}

fun div(){
    val divisao = n1 / n2
    println("\nA divisão dos números é: $divisao")

    println("Deseja realizar uma nova operação? (s/n)")
    op = readln()

    when(op){
        "s" -> {
            option()
        }
        "n" -> {
            sair()
        }
    }
}

fun mult(){
    val multiplicao = n1 * n2
    println("\nA multiplicação dos números é: $multiplicao")

    println("Deseja realizar uma nova operação? (s/n)")
    op = readln()

    when(op){
        "s" -> {
            option()
        }
        "n" -> {
            sair()
        }
    }
}

fun sair(){
    println("\nPrograma Encerrado, obrigado!\n")

}