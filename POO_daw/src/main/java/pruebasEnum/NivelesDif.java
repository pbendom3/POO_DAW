package pruebasEnum;

public enum NivelesDif {
    FACIL(2), MEDIO(4), DIFICIL(8), EXPERTO(10);

    public final int multiplicador;

    NivelesDif(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    public int getMultiplicador() {
        return multiplicador;
    }


}
