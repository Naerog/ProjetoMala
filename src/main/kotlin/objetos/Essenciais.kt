package objetos

open class Essenciais {
    private var essencial = listOf(
        "Documentos Pessoais", "Celular", "Passagem", "Cartão de Vacina",
        "Doc. de Reservas", "Dinheiro", "Lista de Endereços", "Carregador")
    private var essencialRoupas = listOf( "Roupa íntima", "Meias", "Camisetas ou outra partes de cima",
            "Calça ou outra parte de baixo", "Chinelo", "Calçado", "Bolsa ou mochila")

    open fun listEssencial() {
        println("\n--- ESSENCIAL ---")
        for (i in essencial.indices) println("${i+1}- ${essencial[i]}")
        println("\n--- ROUPAS ESSENCIAIS ---")
        for (i in essencialRoupas.indices) println("${i+1}- ${essencialRoupas[i]}")

    }
    open fun listItensCalor() {
        println("\n--- ITENS DE CALOR ---")
        println("\nNão esqueça de adicionar esses itens:")
    }

    open fun listItensFrio() {
        println("\n--- ITENS DE FRIO ---")
        println("\nNão esqueça de adicionar esses itens:")
    }
    open fun listItensBugigangas() {
        println("\nNão esqueça de adicionar esses itens:")
    }
}

