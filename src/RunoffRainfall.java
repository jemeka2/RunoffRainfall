public class RunoffRainfall {
    /*
    Begin
	    //Variables
	    Get dimensions of roof from user in feet
	    Get amount of rainfall from user in inches

	    //Math
	    Convert the dimensions of the roof to inches (multiply each number by 12)
	    Multiply the converted roof dimensions by the amount of rainfall
	    Finally divide results of the roof dimensions and rainfall by 231

	    //Output
	    Display the final results to the user
    End

     */
    public static void main(String[] args)
    {
        //Variables
        int lengthFt = 20;
        int widthFt = 30;
        int rainInch = 30; //average rainfall in USA is 30.21 inches

        //Converting roof dimensions
        int lengthIn = 20 * 12;
        int widthIn = 30 * 12;

        //Finding cubic inches of water
        int cubicWaterIn = lengthIn * widthIn * rainInch;
        int numOfGal = cubicWaterIn / 231;

        //Output
        System.out.println("Amount of rain runoff: " + numOfGal + " gallons per cubic inch");




    }
}
