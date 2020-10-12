package vista

import abstraction.Metodo
import libraries.`JeanRAD-library`.*
import logic.BubbleSort
import logic.InsertionSort
import logic.SelectionSort
import javax.swing.JLabel
import javax.swing.JPanel

class Footer(screenWidth: Int) : JPanel() {

    private val metodos = mutableListOf<Metodo>()
    private val pilaDeLabels = mutableListOf<JLabel>()

    init {
        crearEtiquetas()
        crearPila()
        actualizarPila()

        setProperties(7, 486, screenWidth - 22, 200, semiDarkGrayBlue, semiDarkGray2Border)
    }

    private fun crearEtiquetas() {
        val lDetalles = JLabel()
        lDetalles.setProperties(27, 30, 200, 32, "Detalles:", darkWhite, fontTextBold)
        add(lDetalles)

        //primera columna
        val lOEMax = JLabel()
        lOEMax.setProperties(332, 5, 120, 28, "OE en n máximo", darkWhite, fontTextBold)
        add(lOEMax)

        val lFormula = JLabel()
        lFormula.setProperties(282, 35, 100, 28, "por fórmula", blueGray, fontText)
        add(lFormula)

        val lContador = JLabel()
        lContador.setProperties(408, 35, 100, 28, "por contador", blueGray, fontText)
        add(lContador)

        //segunda columna
        val lOEMin = JLabel()
        lOEMin.setProperties(576, 5, 120, 28, "OE en n mínimo", darkWhite, fontTextBold)
        add(lOEMin)

        val lFormula1 = JLabel()
        lFormula1.setProperties(534, 35, 100, 28, "por fórmula", blueGray, fontText)
        add(lFormula1)

        val lContador1 = JLabel()
        lContador1.setProperties(660, 35, 100, 28, "por contador", blueGray, fontText)
        add(lContador1)

        //tercera columna
        val lOEN = JLabel()
        lOEN.setProperties(820, 5, 100, 28, "OE en n =", darkWhite, fontTextBold)
        add(lOEN)

        val lFormula2 = JLabel()
        lFormula2.setProperties(786, 35, 100, 28, "por fórmula", blueGray, fontText)
        add(lFormula2)

        val lContador2 = JLabel()
        lContador2.setProperties(912, 35, 100, 28, "por contador", blueGray, fontText)
        add(lContador2)

        //últimas columnas
        val lFormula3 = JLabel()
        lFormula3.setProperties(1038, 35, 100, 28, "Fórmula", blueGray, fontText)
        add(lFormula3)

        val lComplejidad = JLabel()
        lComplejidad.setProperties(1164, 35, 100, 28, "Complejidad", blueGray, fontText)
        add(lComplejidad)
    }

    private fun crearPila() {
        metodos.add(BubbleSort.getInstance())
        metodos.add(InsertionSort.getInstance())
        metodos.add(SelectionSort.getInstance())

        //Falta añadir los metodos al arreglo
        for(i in 0..2){//metodos.indices) {
            val lNombre = JLabel()
            lNombre.setProperties(110, 60+i*28, 130, 32, "Nombre del método", greenGray, fontText)
            add(lNombre)

            val lFormulaMetodo1 = JLabel()
            lFormulaMetodo1.setProperties(282, 60+i*28, 100, 32,"-text-", darkWhite, fontText)
            pilaDeLabels.add(lFormulaMetodo1)
            add(lFormulaMetodo1)

            val lContadorMetodo1 = JLabel()
            lContadorMetodo1.setProperties(408, 60+i*28, 100, 32,"-text-", darkWhite, fontText)
            pilaDeLabels.add(lContadorMetodo1)
            add(lContadorMetodo1)

            val lFormulaMetodo2 = JLabel()
            lFormulaMetodo2.setProperties(534, 60+i*28, 100, 32,"-text-", darkWhite, fontText)
            pilaDeLabels.add(lFormulaMetodo2)
            add(lFormulaMetodo2)

            val lContadorMetodo2 = JLabel()
            lContadorMetodo2.setProperties(660, 60+i*28, 100, 32,"-text-", darkWhite, fontText)
            pilaDeLabels.add(lContadorMetodo2)
            add(lContadorMetodo2)

            val lFormulaMetodo3 = JLabel()
            lFormulaMetodo3.setProperties(786, 60+i*28, 100, 32,"-text-", darkWhite, fontText)
            pilaDeLabels.add(lFormulaMetodo3)
            add(lFormulaMetodo3)

            val lContadorMetodo3 = JLabel()
            lContadorMetodo3.setProperties(912, 60+i*28, 100, 32,"-text-", darkWhite, fontText)
            pilaDeLabels.add(lContadorMetodo3)
            add(lContadorMetodo3)

            val lFormulaMetodo = JLabel()
            lFormulaMetodo.setProperties(1038, 60+i*28, 130, 32,"${metodos[i].formula}", darkWhite, fontText)
            add(lFormulaMetodo)

            val lComplejidadMetodo = JLabel()
            lComplejidadMetodo.setProperties(1196, 60+i*28, 130, 32,"${metodos[i].complejidad}", darkWhite, fontText)
            add(lComplejidadMetodo)
        }

    }

    fun actualizarPila() {
        for(i in 0..2) {
            pilaDeLabels[i*6 + 0].text = "         -" //lFormulaMetodo1
            pilaDeLabels[i*6 + 1].text = "         -" //lContadorMetodo1
            pilaDeLabels[i*6 + 2].text = "         -" //lFormulaMetodo2
            pilaDeLabels[i*6 + 3].text = "         -" //lContadorMetodo2
            pilaDeLabels[i*6 + 4].text = "         -" //lFormulaMetodo3
            pilaDeLabels[i*6 + 5].text = "         -" //lContadorMetodo3
        }
    }
}