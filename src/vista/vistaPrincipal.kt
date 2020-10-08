package vista

import MainBar
import libraries.`JeanRAD-library`.*
import javax.swing.*

class vistaPrincipal: JFrame() {

    private val screenWidth = 1300
    private val screenHeight = 700
    private val mainBar = MainBar(screenWidth, this)
    private val btCalcular = JButton()

    init {
        mainBar.setLogo(ImageIcon("resources/logo.png"))
        mainBar.setTitle("Comparación métodos de ordenación")
        add(mainBar)

        //aside
        val aside = JPanel()
        aside.setProperties(-2, 27, 300, 461, semiDarkGrayBlue, semiDarkGray2Border)
        add(aside)

        btCalcular.setProperties(70, 360, 170, 32, "Calcular")
        aside.add(btCalcular)

        val label1 = JLabel()
        label1.setProperties(70, 64, 300, 32, "Desde n = ", darkWhite, fontText)
        aside.add(label1)

        val label2 = JLabel()
        label2.setProperties(70, 128, 300, 32, "Hasta n = ", darkWhite, fontText)
        aside.add(label2)

        //footer
        val footer = JPanel()
        footer.setProperties(-2, 486, screenWidth + 2, 224, semiDarkGrayBlue, semiDarkGray2Border)
        add(footer)

        //body
        val body = JPanel()
        body.setProperties(330, 53,  940, 400, semiDarkGrayBlue, semiDarkGray2Border)
        add(body)

        setProperties(screenWidth, screenHeight, darkGray)
    }

}