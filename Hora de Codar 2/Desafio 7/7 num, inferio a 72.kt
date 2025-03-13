fun main(){

    val numeros = DoubleArray(6) {0.0}
    var i = 0
    var soma = 0.0

    while(i<=5){
        println("insira o ${i+1}° número: ");numeros[i] = readln().toDouble()
        i++
    }

    i = 0
    println("\nNúmeros digitados: ${numeros.joinToString()}")

    while(i<=5){
        if(numeros[i] < 72){
            soma += numeros[i]
        }
        i++
    }

    println("\nSoma dos números inferiores a 72: $soma")


}