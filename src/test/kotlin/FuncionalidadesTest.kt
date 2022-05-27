import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class FuncionalidadesTest {

    @Test
    fun qntddParteCima() {
        assertEquals(1.5, Funcionalidades.qntddParteCima(1))
    }

    @Test
    fun qntddParteBaixo() {
        assertEquals(0, Funcionalidades.qntddParteBaixo(1))
    }

    @Test
    fun qntddRoupasInt() {
        assertEquals(1.5, Funcionalidades.qntddRoupasInt(1))
    }
}