package vista;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;

public class Grafica {

    private JFreeChart graficador;
    private XYSeriesCollection datos;
    private String titulo,labelX,labelY;

    public Grafica(String titulo,String labelX,String labelY){
        this.titulo = titulo;
        this.labelX = labelX;
        this.labelY = labelY;
        this.datos = new XYSeriesCollection();
        this.graficador = ChartFactory.createXYLineChart(titulo,labelX,labelY,datos,PlotOrientation.VERTICAL,true,false,false);

    }

    public void agregarGrafica(String id,double[] x, double[] y){
        XYSeries a = new XYSeries(id);
        for(int i = 0; i < x.length; i++){
            a.add(x[i],y[i]);
        }
        this.datos.addSeries(a);
    }

    public void crearGrafica(String id,double[] x, double[] y){
        datos.removeAllSeries();
        agregarGrafica(id,x,y);
    }

    public JPanel getGrafica(){
        return new ChartPanel(this.graficador);
    }

}
