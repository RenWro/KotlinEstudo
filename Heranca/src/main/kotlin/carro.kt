class carro (override var cor: String, override var ano: Int, override var modelo: String): veiculo(cor, ano, modelo){


    //polimorfismo acontece com open e override
    init {
        println("Eu sou um carro");
    }
    override fun velocidade(){
        println("Eu sou rápido")
    }
}