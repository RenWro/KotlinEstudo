open class veiculo  (open var cor: String, open var ano: Int, open var modelo: String){

    //polimorfismo acontece com open e override
    init {
        println("Eu sou um veículo");
    }
    open fun velocidade(){
        println("Eu sou rápido")
    }
}
