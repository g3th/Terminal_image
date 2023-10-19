package termImage

import java.awt.Color
import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

class imageMethods(){

    private val dir = System.getProperty("user.home") + "/Desktop/"
    private var char:String? = null
    var image: BufferedImage

    init {
        println("Enter image name:")
        val name = readln()
        image = ImageIO.read(File("${dir}${name}"))
    }

    fun charImage(chr: String){
        char = chr
        for (h in 0 until image.height){
            for (w in 0 until image.width){
                val col = Color(image.getRGB(w,h))
                printImage(col)
            }
            println()
        }
    }

    fun negativeImage(){
        for (h in 0 until image.height){
            for (w in 0 until image.width){
                val col = Color(image.getRGB(w,h))
                val negative = Color(255 - col.red, 255 - col.green, 255 - col.blue)
                printImage(negative)
            }
            println()
        }
    }

    fun greyScaleImage(){
        for (h in 0 until image.height){
            for (w in 0 until image.width){
                val col = Color(image.getRGB(w,h))
                val average = (col.red + col.green + col.blue) / 3
                val greyscale = Color(average, average, average)
                printImage(greyscale)
            }
            println()
        }
    }

    fun normalImage() {
        for (h in 0 until image.height){
            for (w in 0 until image.width){
                val col = Color(image.getRGB(w, h))
                printImage(col)
            }
            println()
        }
    }

    fun printImage(rgb: Color){
        char ?:"█"
        print("\u001b[38;2;${rgb.red};${rgb.green};${rgb.blue}m${char}")
    }
}