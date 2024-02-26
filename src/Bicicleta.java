public class Bicicleta implements IComun{
    public Bicicleta() {
    }
    @Override
    public Float costeTotal(Integer cp) {
        Float coste=1f;
        return coste;
    }
    @Override
    public Integer tipoEmbalaje(Float x, Float y, Float z, Float peso) {
        Integer embalaje;
        if(peso >= 0 && peso <= 10){
            embalaje = IComun.ENVOLTORIO_CARTON;
        } else{
            return null;
        }
        return embalaje;
    }
}