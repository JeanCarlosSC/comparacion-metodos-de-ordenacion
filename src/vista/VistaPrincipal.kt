package vista

import MainBar
import libraries.`JeanRAD-library`.*
import javax.swing.*

class VistaPrincipal: JFrame() {

    private val screenWidth = 1300
    private val screenHeight = 700
    private val mainBar = MainBar(screenWidth, this)

    //aside
    private val btCalcular = JButton()
    private val nBoxMin = JTextArea()
    private val nBoxMax = JTextArea()

    init {
        mainBar.setLogo(ImageIcon("resources/logo.png"))
        mainBar.setTitle("Comparación métodos de ordenación")
        add(mainBar)

        crearAside()

        //footer
        val footer = Footer(screenWidth)
        add(footer)

        //body
        val body = JPanel()
        body.setProperties(330, 53,  940, 400, semiDarkGrayBlue, semiDarkGray2Border)
        add(body)

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

}