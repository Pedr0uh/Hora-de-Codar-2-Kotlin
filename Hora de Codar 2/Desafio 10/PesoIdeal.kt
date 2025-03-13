fun main(){

    println("Escolha seu genero designado a nascer: \n1) Masculino \n" +
            "2) Feminino")
    val escolha: Int = readln().toInt()
    
    when (escolha) {
        1 -> {
            masculino()
        }
        2 -> {
            feminino()
        }
        else -> {
            println("\nPor favor, tente novamente\n")
            main()
        }
    }
}

fun masculino(){
    println("digite sua altura ao nascer: ")
    val h = readln().toInt()

    val conta = (72.7 * h) - 58

    println("Seu peso ideal seria: $conta")
}

fun feminino(){
    println("digite sua altura ao nascer: ")
    val h = readln().toInt()

    val conta = (62.1 * h) - 44.7

    println("Seu peso ideal seria: $conta")
}