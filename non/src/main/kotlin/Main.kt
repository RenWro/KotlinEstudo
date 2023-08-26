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
fun main() {
    // Recebendo as três variáveis do usuário
    println("Digite o primeiro número:")
    val num1 = readLine()!!.toInt()

    println("Digite o segundo número:")
    val num2 = readLine()!!.toInt()

    println("Digite o terceiro número:")
    val num3 = readLine()!!.toInt()

    // Encontrando o maior número
    val max = if (num1 >= num2 && num1 >= num3) {
        num1
    } else if (num2 >= num1 && num2 >= num3) {
        num2
    } else {
        num3
    }

    // Encontrando o menor número
    val min = if (num1 <= num2 && num1 <= num3) {
        num1
    } else if (num2 <= num1 && num2 <= num3) {
        num2
    } else {
        num3
    }

    // Calculando o número do meio
    val middle = num1 + num2 + num3 - max - min

    // Imprimindo em ordem decrescente
    println("Números em ordem decrescente: $max, $middle, $min")
}


