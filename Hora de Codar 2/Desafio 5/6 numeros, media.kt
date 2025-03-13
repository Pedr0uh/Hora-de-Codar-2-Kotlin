fun main(){

    val array = DoubleArray(6) { 0.0 } // Cria um array de tamanho 5, preenchido com zeros
    var i = 0
    var soma = 0.0

    while(i<=5){
        println("Insira o ${i+1}° número: "); array[i] = readln().toDouble()
        i++
    }

    i = 0

    while(i<=5){
        soma += array[i]
        i++
    }

    val media = soma / 6

    println("\n ${array.joinToString()}")

    println("\n--- A media dos números é: $media ---")
    


}