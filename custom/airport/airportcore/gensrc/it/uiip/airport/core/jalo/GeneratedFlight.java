/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 25-nov-2019 23.11.52                        ---
 * ----------------------------------------------------------------
 */
package it.uiip.airport.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import it.uiip.airport.core.constants.AirportCoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link it.uiip.airport.core.jalo.Flight Flight}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedFlight extends GenericItem
{
	/** Qualifier of the <code>Flight.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Flight.dayWeek</code> attribute **/
	public static final String DAYWEEK = "dayWeek";
	/** Qualifier of the <code>Flight.codeDepartureAirport</code> attribute **/
	public static final String CODEDEPARTUREAIRPORT = "codeDepartureAirport";
	/** Qualifier of the <code>Flight.codeAirportArrival</code> attribute **/
	public static final String CODEAIRPORTARRIVAL = "codeAirportArrival";
	/** Qualifier of the <code>Flight.codePlane</code> attribute **/
	public static final String CODEPLANE = "codePlane";
	/** Qualifier of the <code>Flight.departureTime</code> attribute **/
	public static final String DEPARTURETIME = "departureTime";
	/** Qualifier of the <code>Flight.arrivalTime</code> attribute **/
	public static final String ARRIVALTIME = "arrivalTime";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CODE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedFlight> CODEHANDLER = new BidirectionalOneToManyHandler<GeneratedFlight>(
	AirportCoreConstants.TC.FLIGHT,
	false,
	"code",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(DAYWEEK, AttributeMode.INITIAL);
		tmp.put(CODEDEPARTUREAIRPORT, AttributeMode.INITIAL);
		tmp.put(CODEAIRPORTARRIVAL, AttributeMode.INITIAL);
		tmp.put(CODEPLANE, AttributeMode.INITIAL);
		tmp.put(DEPARTURETIME, AttributeMode.INITIAL);
		tmp.put(ARRIVALTIME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.arrivalTime</code> attribute.
	 * @return the arrivalTime - Arrival time of the flight
	 */
	public String getArrivalTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ARRIVALTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.arrivalTime</code> attribute.
	 * @return the arrivalTime - Arrival time of the flight
	 */
	public String getArrivalTime()
	{
		return getArrivalTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.arrivalTime</code> attribute. 
	 * @param value the arrivalTime - Arrival time of the flight
	 */
	public void setArrivalTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ARRIVALTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.arrivalTime</code> attribute. 
	 * @param value the arrivalTime - Arrival time of the flight
	 */
	public void setArrivalTime(final String value)
	{
		setArrivalTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.code</code> attribute.
	 * @return the code - Id of the flight, PK
	 */
	public Integer getCode(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.code</code> attribute.
	 * @return the code - Id of the flight, PK
	 */
	public Integer getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.code</code> attribute. 
	 * @return the code - Id of the flight, PK
	 */
	public int getCodeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getCode( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.code</code> attribute. 
	 * @return the code - Id of the flight, PK
	 */
	public int getCodeAsPrimitive()
	{
		return getCodeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.codeAirportArrival</code> attribute.
	 * @return the codeAirportArrival - Arrival airport of the flight
	 */
	public String getCodeAirportArrival(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODEAIRPORTARRIVAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.codeAirportArrival</code> attribute.
	 * @return the codeAirportArrival - Arrival airport of the flight
	 */
	public String getCodeAirportArrival()
	{
		return getCodeAirportArrival( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.codeAirportArrival</code> attribute. 
	 * @param value the codeAirportArrival - Arrival airport of the flight
	 */
	public void setCodeAirportArrival(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODEAIRPORTARRIVAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.codeAirportArrival</code> attribute. 
	 * @param value the codeAirportArrival - Arrival airport of the flight
	 */
	public void setCodeAirportArrival(final String value)
	{
		setCodeAirportArrival( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.codeDepartureAirport</code> attribute.
	 * @return the codeDepartureAirport - Departure airport of the flight
	 */
	public String getCodeDepartureAirport(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODEDEPARTUREAIRPORT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.codeDepartureAirport</code> attribute.
	 * @return the codeDepartureAirport - Departure airport of the flight
	 */
	public String getCodeDepartureAirport()
	{
		return getCodeDepartureAirport( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.codeDepartureAirport</code> attribute. 
	 * @param value the codeDepartureAirport - Departure airport of the flight
	 */
	public void setCodeDepartureAirport(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODEDEPARTUREAIRPORT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.codeDepartureAirport</code> attribute. 
	 * @param value the codeDepartureAirport - Departure airport of the flight
	 */
	public void setCodeDepartureAirport(final String value)
	{
		setCodeDepartureAirport( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.codePlane</code> attribute.
	 * @return the codePlane - Departure airport of the flight
	 */
	public String getCodePlane(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODEPLANE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.codePlane</code> attribute.
	 * @return the codePlane - Departure airport of the flight
	 */
	public String getCodePlane()
	{
		return getCodePlane( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.codePlane</code> attribute. 
	 * @param value the codePlane - Departure airport of the flight
	 */
	public void setCodePlane(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODEPLANE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.codePlane</code> attribute. 
	 * @param value the codePlane - Departure airport of the flight
	 */
	public void setCodePlane(final String value)
	{
		setCodePlane( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CODEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.dayWeek</code> attribute.
	 * @return the dayWeek - Day of the week on which the flight is defined
	 */
	public String getDayWeek(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DAYWEEK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.dayWeek</code> attribute.
	 * @return the dayWeek - Day of the week on which the flight is defined
	 */
	public String getDayWeek()
	{
		return getDayWeek( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.dayWeek</code> attribute. 
	 * @param value the dayWeek - Day of the week on which the flight is defined
	 */
	public void setDayWeek(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DAYWEEK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.dayWeek</code> attribute. 
	 * @param value the dayWeek - Day of the week on which the flight is defined
	 */
	public void setDayWeek(final String value)
	{
		setDayWeek( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.departureTime</code> attribute.
	 * @return the departureTime - Departure time of the flight
	 */
	public String getDepartureTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DEPARTURETIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.departureTime</code> attribute.
	 * @return the departureTime - Departure time of the flight
	 */
	public String getDepartureTime()
	{
		return getDepartureTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.departureTime</code> attribute. 
	 * @param value the departureTime - Departure time of the flight
	 */
	public void setDepartureTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DEPARTURETIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.departureTime</code> attribute. 
	 * @param value the departureTime - Departure time of the flight
	 */
	public void setDepartureTime(final String value)
	{
		setDepartureTime( getSession().getSessionContext(), value );
	}
	
}
