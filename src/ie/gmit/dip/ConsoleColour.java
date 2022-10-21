package ie.gmit.dip;

/**
 * Enumerates colour styles for use in console output.
 * 
 * @author derek
 *
 */
public enum ConsoleColour { //ANSI escape codes. These make the UI look a little more presentable.
	
	/**
	 * Resets console colour.
	 */
	//Reset
    RESET("\033[0m"),  							//Text Reset

    //Regular Colors
	/**
	 * Regular colours.
	 */
    BLACK("\033[0;30m"),   						//BLACK
    /**
	 * Regular colours.
	 */
    RED("\033[0;31m"),     						//RED
    /**
	 * Regular colours.
	 */
    GREEN("\033[0;32m"),   						//GREEN
    /**
	 * Regular colours.
	 */
    YELLOW("\033[0;33m"),  						//YELLOW
    /**
	 * Regular colours.
	 */
    BLUE("\033[0;34m"),    						//BLUE
    /**
	 * Regular colours.
	 */
    PURPLE("\033[0;35m"),  						//PURPLE
    /**
	 * Regular colours.
	 */
    CYAN("\033[0;36m"),    						//CYAN
    /**
	 * Regular colours.
	 */
    WHITE("\033[0;37m"),   						//WHITE

    //Bold
    /**
	 * Bold colours.
	 */
    BLACK_BOLD("\033[1;30m"),  					//BLACK
    /**
	 * Regular colours.
	 */
    RED_BOLD("\033[1;31m"),    					//RED
    /**
	 * Regular colours.
	 */
    GREEN_BOLD("\033[1;32m"),  					//GREEN
    /**
	 * Regular colours.
	 */
    YELLOW_BOLD("\033[1;33m"), 					//YELLOW
    /**
	 * Regular colours.
	 */
    BLUE_BOLD("\033[1;34m"),   					//BLUE
    /**
	 * Regular colours.
	 */
    PURPLE_BOLD("\033[1;35m"), 					//PURPLE
    /**
	 * Regular colours.
	 */
    CYAN_BOLD("\033[1;36m"),   					//CYAN
    /**
	 * Regular colours.
	 */
    WHITE_BOLD("\033[1;37m"),  					//WHITE

    //Underline
    /**
	 * Underlined colours.
	 */
    BLACK_UNDERLINED("\033[4;30m"), 			//BLACK
    /**
	 * Underlined colours.
	 */
    RED_UNDERLINED("\033[4;31m"),    			//RED
    /**
	 * Underlined colours.
	 */
    GREEN_UNDERLINED("\033[4;32m"),  			//GREEN
    /**
	 * Underlined colours.
	 */
    YELLOW_UNDERLINED("\033[4;33m"), 			//YELLOW
    /**
	 * Underlined colours.
	 */
    BLUE_UNDERLINED("\033[4;34m"),   			//BLUE
    /**
	 * Underlined colours.
	 */
    PURPLE_UNDERLINED("\033[4;35m"), 			//PURPLE
    /**
	 * Underlined colours.
	 */
    CYAN_UNDERLINED("\033[4;36m"),   			//CYAN
    /**
	 * Underlined colours.
	 */
    WHITE_UNDERLINED("\033[4;37m"),  			//WHITE

    //Background
    /**
	 * Background colours.
	 */
    BLACK_BACKGROUND("\033[40m"),  				//BLACK
    /**
	 * Background colours.
	 */
    RED_BACKGROUND("\033[41m"),    				//RED
    /**
	 * Background colours.
	 */
    GREEN_BACKGROUND("\033[42m"),  				//GREEN
    /**
	 * Background colours.
	 */
    YELLOW_BACKGROUND("\033[43m"), 				//YELLOW
    /**
	 * Background colours.
	 */
    BLUE_BACKGROUND("\033[44m"),   				//BLUE
    /**
	 * Background colours.
	 */
    PURPLE_BACKGROUND("\033[45m"), 				//PURPLE
    /**
	 * Background colours.
	 */
    CYAN_BACKGROUND("\033[46m"),   				//CYAN
    /**
	 * Background colours.
	 */
    WHITE_BACKGROUND("\033[47m"),  				//WHITE

    //High intensity
    /**
	 * High intensity colours.
	 */
    BLACK_BRIGHT("\033[0;90m"),  				//BLACK
    /**
	 * High intensity colours.
	 */
    RED_BRIGHT("\033[0;91m"),    				//RED
    /**
	 * High intensity colours.
	 */
    GREEN_BRIGHT("\033[0;92m"),  				//GREEN
    /**
	 * High intensity colours.
	 */
    YELLOW_BRIGHT("\033[0;93m"), 				//YELLOW
    /**
	 * High intensity colours.
	 */
    BLUE_BRIGHT("\033[0;94m"),   				//BLUE
    /**
	 * High intensity colours.
	 */
    PURPLE_BRIGHT("\033[0;95m"), 				//PURPLE
    /**
	 * High intensity colours.
	 */
    CYAN_BRIGHT("\033[0;96m"),   				//CYAN
    /**
	 * High intensity colours.
	 */
    WHITE_BRIGHT("\033[0;97m"),  				//WHITE

    //Bold high intensity
    /**
	 * Bold High intensity colours.
	 */
    BLACK_BOLD_BRIGHT("\033[1;90m"), 			//BLACK
    /**
	 * Bold High intensity colours.
	 */
    RED_BOLD_BRIGHT("\033[1;91m"),   			//RED
    /**
	 * Bold High intensity colours.
	 */
    GREEN_BOLD_BRIGHT("\033[1;92m"), 			//GREEN
    /**
	 * Bold High intensity colours.
	 */
    YELLOW_BOLD_BRIGHT("\033[1;93m"),			//YELLOW
    /**
	 * Bold High intensity colours.
	 */
    BLUE_BOLD_BRIGHT("\033[1;94m"),  			//BLUE
    /**
	 * Bold High intensity colours.
	 */
    PURPLE_BOLD_BRIGHT("\033[1;95m"),			//PURPLE
    /**
	 * Bold High intensity colours.
	 */
    CYAN_BOLD_BRIGHT("\033[1;96m"),  			//CYAN
    /**
	 * Bold High intensity colours.
	 */
    WHITE_BOLD_BRIGHT("\033[1;97m"), 			//WHITE

    //HighiIntensity backgrounds
    /**
	 * High intensity background colours.
	 */
    BLACK_BACKGROUND_BRIGHT("\033[0;100m"),		//BLACK
    /**
	 * High intensity background colours.
	 */
    RED_BACKGROUND_BRIGHT("\033[0;101m"),		//RED
    /**
	 * High intensity background colours.
	 */
    GREEN_BACKGROUND_BRIGHT("\033[0;102m"),		//GREEN
    /**
	 * High intensity background colours.
	 */
    YELLOW_BACKGROUND_BRIGHT("\033[0;103m"),	//YELLOW
    /**
	 * High intensity background colours.
	 */
    BLUE_BACKGROUND_BRIGHT("\033[0;104m"),		//BLUE
    /**
	 * High intensity background colours.
	 */
    PURPLE_BACKGROUND_BRIGHT("\033[0;105m"), 	//PURPLE
    /**
	 * High intensity background colours.
	 */
    CYAN_BACKGROUND_BRIGHT("\033[0;106m"),  	//CYAN
    /**
	 * High intensity background colours.
	 */
    WHITE_BACKGROUND_BRIGHT("\033[0;107m");   	//WHITE
	
	private final String colour;
	
	ConsoleColour(String colour) {
		this.colour = colour;
	}
	
	/**
	 * String provided for chosen colour.
	 * 
	 * @return The selected colour.
	 */
	public String colour() { 
		return this.colour; 
	}
	
	/**
	 * Overridden method toString provided for chosen colour.
	 * 
	 * @return The selected colour.
	 */
	@Override
    public String toString() {
        return colour;
    }
}
