fun main (args: Array<String>) {

    var ubicacion: Int = 1

    var seleccion: Int? = 0
    while (seleccion != 1) {

        val estadoElevador = Elevador(0)
        print(estadoElevador)
        var valor: Int?
        println("Ingrese el piso que sea ir: ")
        valor = readLine()?.toInt()

/*/
Donde:
-3 = Sótano 3
-2 = Sótano 2
-1 = Sótano 1
1 = Lobby
y los pisos 2 al 12
 */
        when (valor) {
            -3 -> CambiarPiso(valor, ubicacion)
            -2 -> CambiarPiso(valor, ubicacion)
            -1 -> CambiarPiso(valor, ubicacion)
            1 -> CambiarPiso(valor, ubicacion)
            2 -> CambiarPiso(valor, ubicacion)
            3 -> CambiarPiso(valor, ubicacion)
            4 -> CambiarPiso(valor, ubicacion)
            5 -> CambiarPiso(valor, ubicacion)
            6 -> CambiarPiso(valor, ubicacion)
            7 -> CambiarPiso(valor, ubicacion)
            8 -> CambiarPiso(valor, ubicacion)
            9 -> CambiarPiso(valor, ubicacion)
            10 -> CambiarPiso(valor, ubicacion)
            11 -> CambiarPiso(valor, ubicacion)
            12 -> CambiarPiso(valor, ubicacion)



            else -> {
                print("no está en el rango, ")
            }

        }
    }
}

