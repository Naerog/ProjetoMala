package objetos

class Bugigangas : Essenciais() {
     private var itensBugigangasEs = listOf(
          "Câmera Fotográfica", "Prendedor de Cabelo", "Consoles Portáteis",
          "Óculos", "Livros", "Fone de Ouvido", "Cadeados\n")

     override fun listItensBugigangas() {
          println("\n--- BUGIGANGAS ---")
          for (i in itensBugigangasEs.indices) println("${i+1}- ${itensBugigangasEs[i]}")
     }
}