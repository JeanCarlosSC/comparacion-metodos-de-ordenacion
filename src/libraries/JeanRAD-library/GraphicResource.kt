package services.graphicService

import java.awt.Color
import java.awt.Cursor
import java.awt.Font
import javax.swing.BorderFactory
import javax.swing.border.Border

//----------------------------------------COLOUR PALETTES---------------------------------------------------------------
//basic
val black = Color(0, 0, 0)
val red = Color(255, 0, 0)
val white = Color(255, 255, 255)

//dark theme based on intellij idea
val semiDarkGrayBlue = Color(60, 63, 65) //main background
val darkGray = Color(49, 51, 53) //second background
val megaDarkGray = Color(43, 43, 43) //console background
val semiDarkGray2 = Color(85, 85, 85)//console border
val darkWhite = Color(187,187,187) //main color font
val semiDarkGray = Color(114, 115, 122) //var names without use font
val gray = Color(124, 123, 119) //comment font
val grayPurple = Color(152, 118, 168) //var names in use font
val lightGrayGreen = Color(106, 135, 89) //string font
val greenGray = Color(98,148, 82) //javadoc font
val orangeGray = Color(199,118,50) //reserve word font
val lightBlueGray = Color(104,150,186) //numbers font
val semiDarkGray3 = Color(81, 81, 81) //mainToolbar bottom border

//light theme based on intellij idea


//green complementary cake
val lightGreen = Color(193, 255, 171)
val green = Color(122, 179, 102)
val greenCake = Color(212, 255, 196)
val purple = Color(179, 84, 167)
val lightPurple = Color(255, 171, 245)

//special palette
val cyan = Color(72, 206, 247)
val darkCyan = Color(70, 147, 171)
val darkOcher = Color(169, 105, 0)
val mustard = Color(255, 225, 0)
val darkBlueGray = Color(58, 117, 181)
val blueGray = Color(82, 125, 181)

//others and specials
val blackTransparent = Color(0F, 0F, 0F, 0.8F)
val transparent = Color(0F, 0F, 0F, 0F)
val superLightGray = Color(120, 120, 120)
val megaDarkWhite = Color(180, 180, 180)
val semiDarkWhite = Color(210, 210, 210)

//-----------------------------------------FONTS------------------------------------------------------------------------
//standard
val fontTitle = Font("Gill Sans MT Condensed", Font.PLAIN, 64)
val fontTitle2 = Font("Arial", Font.BOLD, 24)
val fontButton = Font("Arial", Font.PLAIN, 18)
val fontSubtitle = Font("Gill Sans MT Condensed", Font.PLAIN, 32)
val fontTitleGame = Font("Imprint MT Shadow", Font.PLAIN, 72)
val fontVersion = Font("Arial", Font.PLAIN, 14)
val fontText = Font("Arial Narrow", Font.PLAIN, 18)
val fontEcuation = Font("Arial Narrow", Font.ITALIC, 20)
val fontTextMini = Font("Arial Narrow", Font.PLAIN, 14)

//----------------------------------------CURSORS-----------------------------------------------------------------------
//standard
val defaultCursor = Cursor(0)
val crosshairCursor = Cursor(1)
val textCursor = Cursor(2)
val waitCursor = Cursor(3)
val nResizeCursor = Cursor(8)
val eResizeCursor = Cursor(11)
val handCursor = Cursor(12)
val moveCursor = Cursor(13)

//----------------------------------------BORDERS-----------------------------------------------------------------------
//standard
val blackBorder: Border = BorderFactory.createLineBorder(black, 2, false)
val blackBorderTransparent: Border = BorderFactory.createLineBorder(blackTransparent, 2, false)
val grayBorder: Border = BorderFactory.createLineBorder(gray, 2, false)
val semiDarkGray2Border: Border = BorderFactory.createLineBorder(semiDarkGray2, 2, false)
val darkGrayBorder: Border = BorderFactory.createLineBorder(darkGray, 2, false)
