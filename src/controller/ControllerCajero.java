package controller;

import exceptions.IdNoEncontrado;
import exceptions.RetiroMayorAlSaldo;
import exceptions.RetiroNegativo;
import exceptions.ValorNegativoParaRecargar;
import logic.OperadorCajero;


public class ControllerCajero {
    private OperadorCajero opCajero;
    public ControllerCajero(){
        opCajero = new OperadorCajero();
    }

    public boolean buscarId(int id) throws IdNoEncontrado {
        return opCajero.buscarId(id) != null;
    }

    public String retirarDinero(int id, double retiro) throws IdNoEncontrado, RetiroMayorAlSaldo, RetiroNegativo {
        return opCajero.retirarDinero(id, retiro);
    }

    public String recargarDinero(int id, double consignar) throws IdNoEncontrado, ValorNegativoParaRecargar {
        return opCajero.recargarDinero(id, consignar);
    }

    public String mostrarSaldo(int id) throws IdNoEncontrado {
        return opCajero.mostrarSaldo(id);
    }

}


