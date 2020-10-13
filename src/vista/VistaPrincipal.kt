package vista

import MainBar
import libraries.`JeanRAD-library`.*
import org.jfree.chart.ChartFactory
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.*

class VistaPrincipal: JFrame() {

    private val screenWidth = 1300
    private val screenHeight = 700
    private val mainBar = MainBar(screenWidth, this)
    private val footer = Footer(screenWidth)
    private var grafica = Grafica("Comparación Métodos de Ordenamiento","N","OE(N)")
    private var body = JPanel()

    //aside
    private val btCalcular = JButton()
    private val nBoxMin = JTextArea()
    private val nBoxMax = JTextArea()

    init {
        mainBar.setLogo(ImageIcon("resources/logo.png"))
        mainBar.setTitle("Comparación métodos de ordenación")
        add(mainBar)

        crearAside()
        add(footer)
        createBody();

        setProperties(screenWidth, screenHeight, megaDarkGray)
    }

    private fun crearAside() {
        val aside = JPanel()
        aside.setProperties(30, 47, 270, 421, semiDarkGrayBlue, semiDarkGray2Border)
        add(aside)

        //primera linea
        val label1 = JLabel()
        label1.setProperties(50, 64, 300, 32, "Desde n = ", darkWhite, fontText)
        aside.add(label1)

        nBoxMin.setProperties(135, 66, 100, 28, true, false, "0")
        aside.add(nBoxMin)

        //segunda linea
        val label2 = JLabel()
        label2.setProperties(50, 128, 300, 32, "Hasta  n = ", darkWhite, fontText)
        aside.add(label2)

        nBoxMax.setProperties(135, 130, 100, 28, true, false, "100")
        aside.add(nBoxMax)

        //boton calcular
        btCalcular.setProperties(50, 350, 170, 32, "Calcular")
        btCalcular.addActionListener(object : ActionListener {
            override fun actionPerformed(e: ActionEvent?) {
                footer.calcular(nBoxMin.text.toInt(), nBoxMax.text.toInt())
                createBody()
            }

        })
        aside.add(btCalcular)

    }

    private fun createBody(){
        remove(body)
        grafica = Grafica("Comparación Métodos de Ordenamiento","N","OE(N)")
        body = grafica.grafica
        body.setProperties(330, 53,  940, 400, darkWhite, semiDarkGray2Border)
        for (metodo in footer.getMetodos()){
            val x = ArrayList<Double>()
            val y = ArrayList<Double>()

            for(i in nBoxMin.text.toInt()..nBoxMax.text.toInt()){
                x.add(i.toDouble())
                y.add(metodo.calcularOEFormula(i).toDouble())
            }

            grafica.agregarGrafica(metodo.methodName,x,y)
        }

        body.add(grafica.grafica)
        add(body)
        body.validate()
        repaint()
    }

}