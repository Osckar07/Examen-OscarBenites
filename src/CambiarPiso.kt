class CambiarPiso (var cambio: Int,var posicion: Int) {
    open fun otro() = if(cambio> posicion) {
        print(Elevador(2))
        while (cambio != posicion) {
            println(Edificio.Piso(posicion ++))
            println(Elevador(1))
        }

        print( Elevador(0))
    }else if(cambio<posicion) {
        print(Elevador(1))
        while (cambio != posicion) {
            println(Edificio.Piso(posicion ++))
            println(Elevador(1))
        }

        print( Elevador(0))}else {

        print(Elevador(0))

        println("!!")


    }
}
