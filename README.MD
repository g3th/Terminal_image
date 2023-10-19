# Terminal Images
## Print an Image into your terminal

Choose one of the image methods included in the program in order to print your chosen image into your terminal.
The program is tested on linux gnome-terminal, although it might be functional on Windows powershell too. 
Escape codes will probably not work on Windows.

It is recommended to use a small image and to make your terminal as small as possible so that the image is displayed properly.
A sample image is included in the ```sample``` directory to give an idea of an appropriately sized image for display.

Compile in terminal:

```kotlinc termImage.kt imageMethods.kt tui.kt -include-runtime -d imMeth.jar```

Run:

```java -jar imMeth.jar```

Kotlin compiler and Java required, as always.