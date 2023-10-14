fun main(args: Array<String>) {
    println("Digite um valor: ")
    var valor = readln().toDouble()
    println("Digite uma porcentagem: ")
    var porcentagem = readln().toDouble()

    var cal = (valor*porcentagem)/100
    println("A $porcentagem de $valor é igual a $cal")
}