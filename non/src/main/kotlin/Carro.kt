class Carro {
    var id : Int = 0
    var cor : String = ""
    var modelo : String = ""
    var ano : Int = 0
    var anoAtual :Int = 2023


//nome com parenteses e chaves
    fun mostrar(){
        println("Você criou um carro")
        println("O ID do carro é "+id)
        println("A cor do carro é $cor")

    }
//    fun  soma(num1 : Int, num2: Int) : Int{
//     var total = num1 + num2
//     return total
//    }
    fun usoCarro(ano:Int) : Int{
        var total = this.anoAtual - ano
        return total
    }

}