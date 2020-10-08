package vista

import javax.swing.JFrame
import

class vistaPrincipal: JFrame() {

    val screenWidth = 1366
    val screenHeight = 768

    init {
        setProperties(screenWidth, screenHeight)
    }

}