fun main(){

    val numeros = DoubleArray(4) { 0.0 } //declaracao array
    var i = 0

    while(i<=3){
        println("Insira o ${i+1}° número: "); numeros[i] = readln().toDouble()
        i++
    }

    i = 0

    val primeiroNumero = numeros[0]
    val ultimoNumero = numeros[3]
    val maiorNumero = numeros.maxOrNull()

    println("\nO primeiro número digitado: $primeiroNumero")
    println("O ultimo número digitado: $ultimoNumero")
    println("O maior número digitado: $maiorNumero")



}