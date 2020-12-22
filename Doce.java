import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Doce extends ItemSobremesa {
    private int precoPorQuilo;
    private double peso;
    private int custoTotal;
    private String name;

    public Doce() {

    }

    public Doce(int precoPorQuilo, double peso, int custoTotal, String name) {
        this.precoPorQuilo = precoPorQuilo;
        this.peso = peso;
        this.custoTotal = custoTotal;
        this.name = name;

    }

    public Doce(String caramelo_de_manteiga_de_amendoim, double peso, int custoTotal) {
    }

    public int getCusto(){
        return custoTotal;
    }

    public double getPeso(){
        return peso;
    }

    @Override
    public String toString() {
        return String.format("%.2f g @ %s /kg\n%-25s %6s", getPeso(),
                Sorveteria.centavos2ReaisECentavos(precoPorQuilo), getNome(), Sorveteria.centavos2ReaisECentavos(getCusto()));
    }

}
