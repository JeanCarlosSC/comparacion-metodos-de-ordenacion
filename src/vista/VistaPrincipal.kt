package vista

import MainBar
import libraries.`JeanRAD-library`.*
import javax.swing.*

class VistaPrincipal: JFrame() {

    private val screenWidth = 1300
    private val screenHeight = 700
    private val mainBar = MainBar(screenWidth, this)
    private val footer = Footer(screenWidth);
    private val grafica = Grafica("Comparacion Metodos Ordenamito","N","OE(N)");

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

        setProperties(screenWidth, screenHeight, darkGray)
    }

    private fun crearAside() {
        val aside = JPanel()
        aside.setProperties(30, 47, 270, 421, semiDarkGrayBlue, semiDarkGray2Border)
        add(aside)

        //primera linea
        val label1 = JLabel()
        label1.setProperties(60, 64, 300, 32, "Desde n = ", darkWhite, fontText)
        aside.add(label1)

        nBoxMin.setProperties(135, 66, 100, 28, true, false)
        aside.add(nBoxMin)

        //segunda linea
        val label2 = JLabel()
        label2.setProperties(60, 128, 300, 32, "Hasta n = ", darkWhite, fontText)
        aside.add(label2)

        nBoxMax.setProperties(135, 130, 100, 28, true, false)
        aside.add(nBoxMax)

        //boton calcular
        btCalcular.setProperties(50, 350, 170, 32, "Calcular")
        aside.add(btCalcular)

    }

    private fun createBody(){
        val body = grafica.grafica
        body.setProperties(330, 53,  940, 400, semiDarkGrayBlue, semiDarkGray2Border)
        for (metodo in footer.getMetodos()){
            val x = ArrayList<Double>()
            val y = ArrayList<Double>()

            for(i in 0..100){
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