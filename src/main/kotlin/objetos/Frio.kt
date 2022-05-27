package objetos

class Frio () : Essenciais(){
    private var itensFrio = listOf("Casacos", "Toucas", "Luvas",
            "Segunda Pele", "Bota", "Cachecol")
    override fun listItensFrio() {
        super.listItensFrio()
        for (i in itensFrio.indices) println("${i+1}- ${itensFrio[i]}")
    }
}