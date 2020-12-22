import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Cookie extends ItemSobremesa {
    private int numero;
    private int precoPorDuzia;
    private int custoTotal;

    public Cookie() {

    }

    public Cookie (int numero, int precoPorDuzia, int custoTotal) {
       this.numero = numero;
       this.precoPorDuzia = precoPorDuzia;
       this.custoTotal = custoTotal;
    }

    public Cookie(String cookies_com_passas_e_aveia, int precoPorDuzia, int custoTotal) {
    }

    public int getCusto(){
        return custoTotal;
    }

    public int getNumero(){
        return numero;
    }

    public int getPrecoPorDuzia(){
        return precoPorDuzia;
    }


    @Override
    public String toString() {
        return String.format("%d @ %s /dz\n%-25s %6s", getNumero(),
                Sorveteria.centavos2ReaisECentavos(getPrecoPorDuzia()), getNome(), Sorveteria.centavos2ReaisECentavos(getCusto()));
    }



}

