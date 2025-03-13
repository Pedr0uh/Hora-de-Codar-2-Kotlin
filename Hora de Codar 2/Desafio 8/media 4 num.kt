fun main(){

    val notas = DoubleArray(4) {0.0}
    var i = 0
    var soma = 0.0

    while(i<=3){
        println("Insira o ${i+1}° número:");notas[i] = readln().toDouble()
        i++
    }

    i = 0
    println("Números escolhidos: ${notas.joinToString()}")

    while(i<=3){
        if(notas[i] < 0 && notas[i] > 10){
            println("Use apenas números maiores que 10 e menores que 0!")
            tenteNovamente()
        }
        i++
    }

    i = 0

    while(i<=3){
        soma += notas[i]
        i++
    }

    var media = soma/4

    print("\n--- Sua media foi: $media ---\n")

    if(media > 5){
        println("\nVocê passou teste!")

    }
    else{
        tenteNovamente()
    }



}

fun tenteNovamente(){
    println("\nTente novamente\n")
    main()
}