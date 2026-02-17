package PlataformaStreaming;

import java.util.ArrayList;

public class PlataformaStreaming{
    static void main() {
        ArrayList<Suscripcion> listaSuscripciones = new ArrayList<>();

        PlanGratis planGratis = new PlanGratis("Gratis", 0.00);
        PlanBasico planBasico = new PlanBasico("Básico", 9.99);
        PlanPremium planPremium = new PlanPremium("Premium", 14.99);
        PlanFamiliar planFamiliar = new PlanFamiliar("Familiar", 19.99);

        listaSuscripciones.add(planGratis);
        listaSuscripciones.add(planBasico);
        listaSuscripciones.add(planPremium);
        listaSuscripciones.add(planFamiliar);

        for(Suscripcion suscripcion : listaSuscripciones){
            suscripcion.mostrarInfo(suscripcion.getNombrePlan(), suscripcion.getPrecio());
            suscripcion.obtenerBeneficios();
            suscripcion.obtenerPeriodoPrueba();
        }
    }
}
