package vista

import abstraction.Metodo
import libraries.`JeanRAD-library`.*
import logic.BubbleSort
import logic.InsertionSort
import logic.RadixSort
import logic.SelectionSort
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.JTextArea

class Footer(screenWidth: Int) : JPanel() {

    private val metodos = mutableListOf<Metodo>()
    private val pilaDeLabels = mutableListOf<JLabel>()
    private val nBox = JTextArea()

    init {
        crearEtiquetas()
        crearPila()
        actualizarPila(0, 100, 200)

        setProperties(7, 486, screenWidth - 22, 200, semiDarkGrayBlue, semiDarkGray2Border)
    }

    private fun crearEtiquetas() {
        val lDetalles = JLabel()
        lDetalles.setProperties(27, 30, 200, 32, "Detalles:", darkWhite, fontTextBold)
        add(lDetalles)

        //primera columna
        val lOEMax = JLabel()
        lOEMax.setProperties(312, 5, 140, 28, "OE en n mínimo", darkWhite, fontTextBold)
        add(lOEMax)

        val lFormula = JLabel()
        lFormula.setProperties(262, 35, 100, 28, "por fórmula", blueGray, fontText)
        add(lFormula)

        val lContador = JLabel()
        lContador.setProperties(388, 35, 100, 28, "por contador", blueGray, fontText)
        add(lContador)

        //segunda columna
        val lOEMin = JLabel()
        lOEMin.setProperties(556, 5, 140, 28, "OE en n máximo", darkWhite, fontTextBold)
        add(lOEMin)

        val lFormula1 = JLabel()
        lFormula1.setProperties(514, 35, 100, 28, "por fórmula", blueGray, fontText)
        add(lFormula1)

        val lContador1 = JLabel()
        lContador1.setProperties(640, 35, 100, 28, "por contador", blueGray, fontText)
        add(lContador1)

        //tercera columna
        val lOEN = JLabel()
        lOEN.setProperties(800, 5, 120, 28, "OE en n =", darkWhite, fontTextBold)
        add(lOEN)

        nBox.setProperties(880, 7, 90, 28, true, false, "200")
        add(nBox)

        val lFormula2 = JLabel()
        lFormula2.setProperties(766, 35, 100, 28, "por fórmula", blueGray, fontText)
        add(lFormula2)

        val lContador2 = JLabel()
        lContador2.setProperties(892, 35, 100, 28, "por contador", blueGray, fontText)
        add(lContador2)

        //últimas columnas
        val lFormula3 = JLabel()
        lFormula3.setProperties(1008, 35, 100, 28, "Fórmula", blueGray, fontText)
        add(lFormula3)

        val lComplejidad = JLabel()
        lComplejidad.setProperties(1164, 35, 100, 28, "Complejidad", blueGray, fontText)
        add(lComplejidad)
    }

    private fun crearPila() {
        metodos.add(BubbleSort.getInstance())
        metodos.add(InsertionSort.getInstance())
        metodos.add(SelectionSort.getInstance())
        metodos.add(RadixSort.getInstance())

        //Falta añadir los metodos al arreglo
        for(i in 0..3){//metodos.indices) {
            val lNombre = JLabel()
            lNombre.setProperties(90, 60+i*28, 130, 32, metodos[i].methodName, greenGray, fontText)
            add(lNombre)

            val lFormulaMetodo1 = JLabel()
            lFormulaMetodo1.setProperties(262, 60+i*28, 100, 32,"", darkWhite, fontText)
            pilaDeLabels.add(lFormulaMetodo1)
            add(lFormulaMetodo1)

            val lContadorMetodo1 = JLabel()
            lContadorMetodo1.setProperties(388, 60+i*28, 100, 32,"", darkWhite, fontText)
            pilaDeLabels.add(lContadorMetodo1)
            add(lContadorMetodo1)

            val lFormulaMetodo2 = JLabel()
            lFormulaMetodo2.setProperties(514, 60+i*28, 100, 32,"-text-", darkWhite, fontText)
            pilaDeLabels.add(lFormulaMetodo2)
            add(lFormulaMetodo2)

            val lContadorMetodo2 = JLabel()
            lContadorMetodo2.setProperties(640, 60+i*28, 100, 32,"-text-", darkWhite, fontText)
            pilaDeLabels.add(lContadorMetodo2)
            add(lContadorMetodo2)

            val lFormulaMetodo3 = JLabel()
            lFormulaMetodo3.setProperties(766, 60+i*28, 100, 32,"-text-", darkWhite, fontText)
            pilaDeLabels.add(lFormulaMetodo3)
            add(lFormulaMetodo3)

            val lContadorMetodo3 = JLabel()
            lContadorMetodo3.setProperties(892, 60+i*28, 100, 32,"-text-", darkWhite, fontText)
            pilaDeLabels.add(lContadorMetodo3)
            add(lContadorMetodo3)

            val lFormulaMetodo = JLabel()
            lFormulaMetodo.setProperties(1008, 60+i*28, 160, 32, metodos[i].formula, darkWhite, fontText)
            add(lFormulaMetodo)

            val lComplejidadMetodo = JLabel()
            lComplejidadMetodo.setProperties(1196, 60+i*28, 130, 32, metodos[i].complejidad, darkWhite, fontText)
            add(lComplejidadMetodo)
        }

    }

    fun actualizarPila(nMin: Int, nMax: Int, n: Int) {
        for(i in 0..3) {
            pilaDeLabels[i*6 + 0].text = metodos[i].calcularOEFormula(nMin).toString() //lFormulaMetodo1
            pilaDeLabels[i*6 + 1].text = metodos[i].calcularOEContador(nMin).toString() //lContadorMetodo1
            pilaDeLabels[i*6 + 2].text = metodos[i].calcularOEFormula(nMax).toString() //lFormulaMetodo2
            pilaDeLabels[i*6 + 3].text = metodos[i].calcularOEContador(nMax).toString() //lContadorMetodo2
            pilaDeLabels[i*6 + 4].text = metodos[i].calcularOEFormula(n).toString() //lFormulaMetodo3
            pilaDeLabels[i*6 + 5].text = metodos[i].calcularOEContador(n).toString() //lContadorMetodo3
        }
    }

    fun getMetodos(): MutableList<Metodo> {
        return metodos
    }

    fun calcular(nMax: Int, nMin: Int) {
        actualizarPila(nMax, nMin, nBox.text.toInt())
    }
}