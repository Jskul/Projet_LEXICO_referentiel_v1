package clientServer.utility;

import clientServer.parameter.ParametersI;

/**
 * A set of shared utilities.
 * 
 * @author ludovic
 */
public class Utilities  {

	/**
	 * Prints console traces according to ParametersI interface debugging constants.
	 * 
	 * @param	which		String	The name of the class for which traces has to be printed.
	 * @param	message		String	A message to be concatenated with the class name.
	 * @param	separator	String	A separator to be inserted between the class name and the message. 
	 */
	@SuppressWarnings("unused")
	public static void trace(String which, String message, String separator) {
		if (which == null) {which = "Unspecified class name";}
		if (message == null) {message = "";}
		if (separator == null) {separator = "";}
		
		String trace = "";
		
		if	(	ParametersI.DEBUG_ALL
			|| 	(which.matches("FrontController") && ParametersI.DEBUG_FRONT_CONTROLLER)
			||	(which.matches("DBInitializationController") && ParametersI.DEBUG_DB_INITIALIZATION_CONTROLLER)
			||	(which.matches("DBInterrogationController") && ParametersI.DEBUG_DB_INTERROGATION_CONTROLLER)
			|| 	(which.matches("ServiceFacadeBean") && ParametersI.DEBUG_SERVICE_FACADE_BEAN)
			||	(which.matches("DBInitialization") && ParametersI.DEBUG_DB_INITIALIZATION)
			||	(which.matches("DAOFacade") && ParametersI.DEBUG_DAO_FACADE)
			||	(which.matches("DBInitializationDAO") && ParametersI.DEBUG_DB_INITIALIZATION_DAO)
			||	(which.matches("DBInterrogationDAO") && ParametersI.DEBUG_DB_INTERROGATION_DAO)
			
			) {
			trace = which + separator + message;
		}
		
		if (trace.length() > 0) {			
			System.out.println(trace);
		}
	}
	
}
