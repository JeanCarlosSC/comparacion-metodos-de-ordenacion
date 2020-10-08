package vista

import MainBar
import libraries.`JeanRAD-library`.semiDarkGray
import libraries.`JeanRAD-library`.setProperties
import javax.swing.ImageIcon
import javax.swing.JFrame
import javax.swing.JPanel

class vistaPrincipal: JFrame() {

    private val screenWidth = 1366
    private val screenHeight = 768
    private val mainBar = MainBar(screenWidth, this, false)

    init {
        mainBar.setLogo(ImageIcon("resources/logo.png"))
        mainBar.setTitle("Comparación métodos de ordenación")
        add(mainBar)

        val aside = JPanel()
        aside.setProperties(0, 28, 330, 512, semiDarkGray)
        add(aside)

        setProperties(screenWidth, screenHeight)
        extendedState = MAXIMIZED_BOTH;
    }

}