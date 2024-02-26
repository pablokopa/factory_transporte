public class Camion implements IComun{
    public Camion() {
    }
    @Override
    public Float costeTotal(Integer cp) {
        Float coste=1f;
        return coste;
    }
    @Override
    public Integer tipoEmbalaje(Float x, Float y, Float z, Float peso) {
        Integer embalaje;
        if (peso > 50){
            embalaje = IComun.PALET;
        } else if (peso <= 50 && peso >= 15){
            embalaje = IComun.CAJA_MADERA;
        } else {
            embalaje = IComun.ENVOLTORIO_CARTON;
        }
        return embalaje;
    }
}
