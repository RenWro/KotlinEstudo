//fun main(args: Array<String>) {
//    println("Hello World!")
//
//    var num = 4
//    num = num + 2
//    num += 2
//    num -= 2
//    num ++
//
//
//    println("Meu nome é" + num)

//    var total = 5 !== 6
//
//    println(total)

//    System.out.println(total2)
//
//    var te =false
//    System.out.println(te)
//
//    var numint : Int = 21444
//    System.out.println(numint)

//    var numfloat : Float = 21444.4F
//    System.out.println(numfloat)

//    var numfloat : Float = 21444.4
//    var soma = numfloat + numint
//
//    System.out.println(soma)
// () são funções nativas


//    var numfloat = 21444.4F
//    var soma = numfloat.toInt() + numint
//
//    System.out.println(soma)

//    var f1 = 3.17f
//    var d2 = 3.14
//
//    d2 += f1.toDouble()
//
//    System.out.println(d2)

////    println("Digite a idade: ")
//    var idade = 0
////    idade = readLine()!!.toInt()
////        if (idade < 18) {
////            println("Você não pode dirigir")
////        }
////        else if (idade <21) {
////            println("Você não pode beber, mas pode dirigir")
////        } else if (idade < 25) {
////            System.out.println("Você pode beber e pode dirigir - mas não ao mesmo tempo")
////        } else {
////            System.out.println("Liberado")
////        }
//
//        var final = if( idade >=18 )
//    var valM = 0
//    var valorMenor = 999999999999999
//    var aux =
//    for (x in 1..3) {
//        println("Digite a um valor: ")
////        var idade = readLine()!!.toInt()
//
//        var valor = readLine()!!.toInt()
//        if (valor > valM) {
//            aux = valM
//            valM = valor
//            if( aux < valorMenor){
//                valorMenor = aux
//            }
//        } else if(valor < valorMenor) {
//            valorMenor = aux
//        } else {
//    }
//    var valM = 0
//    var valorMenor = 999999999999999
//    var aux =
//        for (x in 1..3) {
//            println("Digite a um valor: ")
//        }
//
//fun main() {
//    // Recebendo as três variáveis do usuário
//    println("Digite o primeiro número:")
//    val num1 = readLine()!!.toInt()
//
//    println("Digite o segundo número:")
//    val num2 = readLine()!!.toInt()
//
//    println("Digite o terceiro número:")
//    val num3 = readLine()!!.toInt()
//
//    // Encontrando o maior número
//    val max = if (num1 >= num2 && num1 >= num3) {
//        num1
//    } else if (num2 >= num1 && num2 >= num3) {
//        num2
//    } else {
//        num3
//    }
//
//    // Encontrando o menor número
//    val min = if (num1 <= num2 && num1 <= num3) {
//        num1
//    } else if (num2 <= num1 && num2 <= num3) {
//        num2
//    } else {
//        num3
//    }
//
//    // Calculando o número do meio
//    val middle = num1 + num2 + num3 - max - min
//
//    // Imprimindo em ordem decrescente
//    println("Números em ordem decrescente: $max, $middle, $min")
//}


//fun main() {
//    println("Digite um número,1 sendo 1 para Conta Corrente, 2 para Cartão de crédito e 3 para Internet Banking: ")
//    var opcao = readLine()!!.toInt()
//    when ( opcao ){
//        1 -> println("Conta Corrente")
//        2 -> println("Cartão de crédito")
//        3 -> println("Internet Banking")
//        else ->{
//            println("nenhuma opção encontrada")
//            println("Fale com um dos nossos atendentes")
//        }
//    }
//}
//
//fun main(args: Array<String>) {
//    var fusca = Carro()
//
//    println("Digite o ID do Carro:")
//    fusca.id = readLine()!!.toInt()
//    println("Digite a cor do Carro")
//    fusca.cor = readLine()!!.toString()
//    println("Digite o modelo do Carro")
//    fusca.modelo = readLine()!!.toString()
//    println("Digite o ano do Carro")
//    fusca.ano = readLine()!!.toInt()
//
////    val somaResultado = fusca.soma(1, 2)
////    println("A soma é $somaResultado")
//
//    val total = fusca.usoCarro(fusca.ano)
//    println("O carro tem $total anos de uso")
//
//}?

//fun main (args: Array<String>) {
//    //collection list
//    var items = listOf("SP", "BH", "RJ") // lista imutavel
//    var numeros =  mutableListOf(1, 2,43); //totalmente mutavel
//
//    println(items)
//    println(numeros)
//
//
//    var mix= arrayListOf("SP", 1,3) //array mutavel com funcoes
//    println(mix)
//    mix.add("MG")
//    println(mix)
//    println(mix.size)
//    println(mix.isEmpty())
//    println(mix.contains("SP"))
//    mix.remove(1)
//    println(mix)
//    mix.sort()
//    println(mix)
//
//    var nomes = arrayListOf("Jose", "Paulo", "Maira", "Felipe")
//        nomes.sort()
//        println(nomes)
//
//            for (nominal in nomes) {
//            println("Nome: $nominal")
//            }
//        nomes.add("Roger")
//        println(nomes)
//        nomes.add("Joana")
//        println(nomes)
//
//
//    //mais rapido que os outros e mesmas funções que a list
//    var set = hashSetOf(1, 2, 3, 4, 4, 60, 70)
//        println(set)
//        set.add(100)
//        set.remove(3)
//        println(set)
//
//    var map = arrayListOf(
//        hashMapOf("cep" to 12345, "uf" to "ce", "cidade" to "Fortaleza", "bairro" to "São João do Tauape"),
//        hashMapOf("cep" to 12346, "uf" to "SP", "cidade" to "São Paulo", "bairro" to "Jardim Paulista"),
//        hashMapOf("cep" to 12347, "uf" to "MG", "cidade" to "Belo Horizonte", "bairro" to "Savassi"),
//
//        )


//
//}
//
