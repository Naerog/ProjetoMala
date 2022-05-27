package objetos

class Quente () : Essenciais() {
    private var itensCalor = listOf("Shorts", "Regatas", "Roupas de Banho",
            "Saída de Praia", "Boné ou Chapéu")
    override fun listItensCalor() {
        super.listItensCalor()
        for (i in itensCalor.indices) println("${i+1}- ${itensCalor[i]}")
    }
}