fun main() {
 formaDePagamento()

}

fun taxaDeNatalidadeEMortalidade(): Unit{
    println("Informe o número de habitantes: ")
    val habitantes = readLine()!!.toDouble()

    println("Qual dado você deseja saber: \n" +
            "1- Taxa de natalidade\n" +
            "2- Taxa de mortalidade")

    when(val opcao = readLine()!!.toInt()){
        1 -> if (opcao == 1){
            println("Informe o número de nascimentos: ")
            val nascimentos = readLine()!!.toDouble()
            println("A taxa de natalidade é de: ${(nascimentos * 1000) / habitantes}")
        }
        2 -> if(opcao == 2){
            println("Informe o número de mortes: ")
            val mortes = readLine()!!.toDouble()
            println("A taxa de mortalidade é de: ${(mortes * 1000) / habitantes}")
        }
        else -> println("Opção invalida!")
    }
}

fun formaDePagamento(){
    println("Informe o total da compra:")
    var total = readLine()!!.toDouble()

    println("Qual o modo de pagamento: \n" +
            "1- À vista\n" +
            "2- À prazo (30 dias)\n" +
            "3- À prazo parcelado ")

    when(val formaDePagamento = readLine()!!.toInt()) {
        1 -> println("Total a pagar é de R$${total - total * 0.1}")
        2 -> println("Total a pagar é de R$${total + total * 0.03}")
        3 -> if (formaDePagamento == 3){
            println("Em quantos meses pretende parcelar: ")
            val meses = readLine()!!.toInt()
            //Parcelado em 2 meses
            var totalDoisMeses = total + total * 0.015
            //Parcelado em 3 meses
            var totalTresMeses = totalDoisMeses + totalDoisMeses * 0.015
            //Parcelado em 4 meses
            var totalQuatroMeses = totalTresMeses + totalTresMeses * 0.015
            //Parcelado em 5 meses
            var totalCincoMeses = totalQuatroMeses + totalQuatroMeses * 0.015
            //Parcelado em 6 meses
            var totalSeisMeses = totalCincoMeses + totalCincoMeses * 0.015

            if (meses == 1){
                println("Total a pagar é de R$$total")
            }else if(meses == 2){
                println("Total a pagar é de R$${totalDoisMeses}")
            }else if(meses == 3){
                println("Total a pagar é de R$${totalTresMeses}")
            }else if(meses == 4){
                println("Total a pagar é de R$${totalQuatroMeses}")
            }else if(meses == 5){
                println("Total a pagar é de R$${totalCincoMeses}")
            }else if(meses == 6){
                println("Total a pagar é de R$${totalSeisMeses}")
            }
            else{
                println("Número de parcelas invalida!")
            }
        }
        else -> println("Opção invalida!")
    }
}