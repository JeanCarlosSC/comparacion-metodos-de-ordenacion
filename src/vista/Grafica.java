package vista;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import java.awt.*;
import java.util.ArrayList;
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
        this.graficador.setBackgroundPaint(new Color(31, 31, 31));
        
        this.graficador.getLegend().setBackgroundPaint(new Color(60, 63, 65));
        this.graficador.getPlot().setBackgroundPaint(new Color(101, 101, 104));

        this.graficador.getTitle().setPaint(new Color(187,187,187));
        this.graficador.getLegend().setItemPaint(new Color(187,187,187));

        this.graficador.getXYPlot().setRangeGridlinePaint(new Color(0, 0, 0));

    }

    public void agregarGrafica(String id,ArrayList<Double> x, ArrayList<Double> y){
        XYSeries a = new XYSeries(id);
        for(int i = 0; i < x.size(); i++){
            a.add(x.get(i),y.get(i));
        }
        this.datos.addSeries(a);
    }

    public void crearGrafica(String id,ArrayList<Double> x, ArrayList<Double> y){
        datos.removeAllSeries();
        agregarGrafica(id,x,y);
    }

    public JPanel getGrafica(){
        return new ChartPanel(this.graficador);
    }

}
