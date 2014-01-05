package peeves.temperatureConverter

object Converter {
    
    def main(args: Array[String]): Unit = {
		println("TEMPERATURE CONVERTER")
		println("~~~~~~~~~~~~~~~~~~~~~")
		print("Type \'F\'to convert to Fahrenheit, and \'C\' for Celsius: ")
	    val fc = readChar.toString()
	    if(fc.toUpperCase() == "F") {
	        println("You selected to convert to Fahrenheit.")
	        print("Input degrees Celsius: ")
	        var c1 = readInt
	        var f1 = c1 * 9 / 5 + 32
	        println("Degrees Fahrenheit: " + f1)
	    }
	    else if(fc.toUpperCase() == "C") {
	        println("You selected to convert to Celsius.")
	        print("Input degrees Fahrenheit: ")
	        var c2 = readInt
	        var f2 = (c2 - 32) * 5 / 9
	        println("Degrees Celsius: " + f2)
	    }
	    else {
	        println("You did not select a valid choice.")
	    }
	}
    
}
