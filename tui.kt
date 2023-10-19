package termImage

import java.awt.Image

class TUI {

    init {
        println("Recommended: Pick an option")
        println("Choose an appropriately sized image for your terminal size")
        println("and make your terminal as small as possible")
        println("so that the image is fully visible.")
    }

    fun options(){
        println("-----------------------------------------------")
        println("Recommended image size: 300 x 300")
        println("1) Normal image")
        println("2) Negative image")
        println("3) Greyscale")
        println("4) Pixels represented by a charcter of your choice")
        val input = readln()
        val methods = imageMethods()
        when (input){
            "1" -> methods.normalImage()
            "2" -> methods.negativeImage()
            "3" -> methods.greyScaleImage()
            "4" -> {
                println("Pick a character:")
                val c = readln()
                methods.charImage(c)
            }
            else -> println("Invalid")
        }
    }

}