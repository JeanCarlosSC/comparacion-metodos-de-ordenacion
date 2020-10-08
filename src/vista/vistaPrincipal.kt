package vista

import MainBar
import libraries.`JeanRAD-library`.*
import javax.swing.*

class vistaPrincipal: JFrame() {

    private val screenWidth = 1366
    private val screenHeight = 768
    private val mainBar = MainBar(screenWidth, this, false)
    private val btCalcular = JButton()

    init {
        mainBar.setLogo(ImageIcon("resources/logo.png"))
        mainBar.setTitle("Comparación métodos de ordenación")
        add(mainBar)

        //aside
        val aside = JPanel()
        aside.setProperties(0, 28, 330, 512, semiDarkGrayBlue, semiDarkGray2Border)
        add(aside)

        btCalcular.setProperties(70, 400, 170, 32, "Calcular")
        aside.add(btCalcular)

        val label1 = JLabel()
        label1.setProperties(70, 64, 300, 32, "Desde n = ", darkWhite, fontText)
        aside.add(label1)

        val label2 = JLabel()
        label2.setProperties(70, 128, 300, 32, "Hasta n = ", darkWhite, fontText)
        aside.add(label2)

        //footer
        val footer = JPanel()
        footer.setProperties(0, 539, screenWidth - 4, 224, semiDarkGrayBlue, semiDarkGray2Border)
        add(footer)

        //body
        val body = JPanel()
        body.setProperties(350, 48,  990, 470, semiDarkGrayBlue, semiDarkGray2Border)
        add(body)

        setProperties(screenWidth, screenHeight, darkGray)
        extendedState = MAXIMIZED_BOTH;
    }

}