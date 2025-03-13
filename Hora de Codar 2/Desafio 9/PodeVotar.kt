/*Escreva um programa para ler o ano de nascimento de uma pessoa
 e escrever uma mensagem que diga se ela poderá ou não votar este ano
 (não é necessário considerar o mês em que ela nasceu).*/

fun main(){

    val anoAtual = 2025

    println("Insira o ano do seu nascimento: ")
    val ano: Int = readln().toInt()

    val condicao = anoAtual - ano

    if(condicao >= 16){
        println("Você ja pode votar!")
    }
    else{
        println("Você ainda não pode votar!")
    }

}