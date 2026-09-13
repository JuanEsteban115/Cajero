package logic;

import exceptions.IdNoEncontrado;
import exceptions.RetiroMayorAlSaldo;
import exceptions.RetiroNegativo;
import exceptions.ValorNegativoParaRecargar;
import model.Cajero;

public class OperadorCajero {

    Cajero c1 = new Cajero(1234, 500000, 0, 0);

    public Cajero buscarId(int id) throws IdNoEncontrado {
        if (c1.getId() != id) {
            throw new IdNoEncontrado("");
        } else {
            return c1;
        }
    }

    public String retirarDinero(int id, double retiro) throws RetiroMayorAlSaldo, RetiroNegativo, IdNoEncontrado {
        Cajero c1 = buscarId(id);
        if (retiro < 0) {
            throw new RetiroNegativo("");
        } else if (retiro > c1.getSaldo()) {
            throw new RetiroMayorAlSaldo("");
        } else {
            c1.setSaldo(c1.getSaldo() - retiro);
        }
        return "Retiro exitoso!, nuevo saldo " + c1.getSaldo();

    }

    public String recargarDinero(int id, double consignar) throws ValorNegativoParaRecargar, IdNoEncontrado {
        Cajero c1 = buscarId(id);
        if (consignar < 0) {
            throw new ValorNegativoParaRecargar("");
        } else {
            c1.setSaldo(c1.getSaldo() + consignar);
        }
        return "Recarga exitosa!, nuevo saldo: " + c1.getSaldo();

    }
    public String mostrarSaldo(int id) throws IdNoEncontrado {
        Cajero c1 = buscarId(id);
        if(c1 != null){
            return c1.toString();
        }else{
            return "Cuenta no encontrada";
        }
    }


}



