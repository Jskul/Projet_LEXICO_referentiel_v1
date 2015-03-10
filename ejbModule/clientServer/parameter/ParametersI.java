package clientServer.parameter;

/**
 * Holds shared parameters.
 * 
 * @author ludovic
 */
public interface ParametersI {

	public static final String PROJECT_ENCODING = "UTF-8";
	
	public static final String SERVICE_EJB = "ejb:/Projet_LEXICO_referentiel_v1/ServiceFacadeBean!clientServer.service.ServiceI";
	
	/* Debugging flags */
	
	public static final boolean DEBUG_ALL = true;
	
	public static final boolean DEBUG_FRONT_CONTROLLER = true;
	public static final boolean DEBUG_DB_INITIALIZATION_CONTROLLER = true;
	public static final boolean DEBUG_DB_INTERROGATION_CONTROLLER = true;
	
	public static final boolean DEBUG_SERVICE_FACADE_BEAN = true;
	public static final boolean DEBUG_DB_INITIALIZATION = true;
	
	public static final boolean DEBUG_DAO_FACADE = true;
	public static final boolean DEBUG_DB_INITIALIZATION_DAO = true;
	public static final boolean DEBUG_DB_INTERROGATION_DAO = true;
	
	

	
}
