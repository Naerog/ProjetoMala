object Funcionalidades {
// meow
    fun qntddParteCima(dias: Int): Double {
        val n = 1
        println("A quantidade de peças da parte de cima que você deve levar é: ${dias * (n+0.5)}") //UNIT
        return dias*(n+0.5)
    }
    fun qntddParteBaixo(dias: Int): Int {
        val n = 2
        println("A quantidade de peças da parte de baixo que você deve levar é: ${dias / n}")
        return dias/n
    }
    fun qntddRoupasInt(dias: Int): Double {
        val n = 2
        println("A quantidade de peças íntimas que você deve levar é: ${dias * (n-0.5)}")
        return dias*(n-0.5)
    }
}
// meow
// meow
// meow