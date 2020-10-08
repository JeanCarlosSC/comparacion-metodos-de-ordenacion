package vista

import services.graphicService.components.mainBar.MainBar
import services.graphicService.setProperties
import javax.swing.ImageIcon
import javax.swing.JFrame

class vistaPrincipal: JFrame() {

    val screenWidth = 1366
    val screenHeight = 768
    val mainBar = MainBar(screenWidth, this, false)

    init {
        mainBar.setLogo(ImageIcon("resources/logo.png"))
        add(mainBar)

        setProperties(screenWidth, screenHeight)
    }

}