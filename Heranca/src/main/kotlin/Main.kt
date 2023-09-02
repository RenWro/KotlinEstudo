fun main(args: Array<String>) {
    var cor: String = ""
    var modelo: String = ""
    var ano: Int = 0


    var fusca = carro("preto", 1985, "fusca")


    println("Digite a cor do Carro")
    fusca.cor = readLine()!!.toString()
    println("Digite o modelo do Carro")
    fusca.modelo = readLine()!!.toString()
    println("Digite o ano do Carro")
    fusca.ano = readLine()!!.toInt()


}