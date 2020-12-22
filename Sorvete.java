import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Sorvete extends ItemSobremesa {

    private int valor;
    private int custoTotal;

    public Sorvete() {
        valor = 2;
        custoTotal = valor;
    }

    public Sorvete(int valor, int custoTotal) {
        this.valor = valor;
        this.custoTotal = custoTotal;

    }

    public Sorvete(String sorvete_de_baunilha, int custoTotal) {
    }

    public int getCusto(){
        return valor;
    }

    @Override
    public String toString() {
        return String.format("%-25s %6s", getNome(), Sorveteria.centavos2ReaisECentavos(getCusto()));
    }

}
