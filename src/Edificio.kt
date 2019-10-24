enum class Pisos{
    S1,S2,S3,L,P2,P3,P4,P5,P6,P7,P8,P9,P10,P11,P12
}
//, val type: Pisos
class Edificio  {

    class Piso(var value: Int){
        override fun toString(): String {
            return "Esta en el Piso $value "

        }

    }

}