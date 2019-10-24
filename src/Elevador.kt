class Elevador (var estado: Int){
    override fun toString(): String {

        if (estado == 0) {
            return "Elevador DETENIDO "
        } else if (estado == 1){
            return "Elevador SUBIENDO "
        }else{
            return "Elevador BAJANDO "
        }

    }
}

