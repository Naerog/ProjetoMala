import objetos.Essenciais
import objetos.Bugigangas
import objetos.Frio
import objetos.Quente

fun main() {
    val essencial = Essenciais()
    val quente = Quente()
    val frio = Frio()
    val bugigangas = Bugigangas()
    var loop = true
    try {
        while (loop) {
            println("\n--- ORGANIZAÇÃO DE MALAS ---\n")
            print("Digite seu nome: ")
            val nome = readln()
            print("Digite quantos dias de viagem, Sr/a.$nome: ")
            val dias = readln().toInt()
            print("Digite o clima, Sr/a.$nome: (Quente/Frio) ")
            val clima = readln()
            essencial.listEssencial()

            when (clima) {
                "Quente" -> {
                    println("Adicione estes itens, Sr/a.$nome: ")
                    quente.listItensCalor()
                }
                "Frio" -> {
                    println("Adicione estes itens, Sr/a.$nome: ")
                    frio.listItensFrio()
                }
                else -> println("CLIMA INVÁLIDO >:(")
            }

            println("\nQuer adicionar bugigangas, Sr/a. $nome? (S/N)")
            val bugi = readln()

            if (bugi == "S") {
                println("\n\nEntão adicione estes itens, Sr/a. $nome.")
                bugigangas.listItensBugigangas()

            } else if (bugi == "N")
                println("\nEntão são só esses itens mesmo. Boa viagem, Sr/a.$nome.")
            println("\nEsta é a lista dos itens escolhidos essenciais para sua viagem, Sr/a.$nome. ")

            if (clima == "Quente" && bugi == "S") {
                essencial.listEssencial()
                quente.listItensCalor()
                bugigangas.listItensBugigangas()
                break

            } else if (clima == "Frio" && bugi == "S") {
                essencial.listEssencial()
                frio.listItensFrio()
                bugigangas.listItensBugigangas()


            } else if (clima == "Quente" && bugi == "N") {
                essencial.listEssencial()


            } else if (clima == "Frio" && bugi == "N") {
                essencial.listEssencial()
                frio.listItensFrio()

            }

            Funcionalidades.run {
                qntddParteCima(dias)
                qntddParteBaixo(dias)
                qntddRoupasInt(dias)
            }
            println("\nQuer fazer outra consulta? Enter ou N para sair")
            val opc = readln()
            if (opc == "N") {
                loop = false
            }
        }
    } catch (e:Exception){
        println("\nERROR 666: Insira valores válidos.")
    }
}






