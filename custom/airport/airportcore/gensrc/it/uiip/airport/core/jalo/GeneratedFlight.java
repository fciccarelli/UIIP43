/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 26-nov-2019 23.04.48                        ---
 * ----------------------------------------------------------------
 */
package it.uiip.airport.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import it.uiip.airport.core.constants.AirportCoreConstants;
import it.uiip.airport.core.jalo.Airplane;
import it.uiip.airport.core.jalo.Airport;
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
	/** Qualifier of the <code>Flight.codeAirplane</code> attribute **/
	public static final String CODEAIRPLANE = "codeAirplane";
	/** Qualifier of the <code>Flight.departureTime</code> attribute **/
	public static final String DEPARTURETIME = "departureTime";
	/** Qualifier of the <code>Flight.timeArrival</code> attribute **/
	public static final String TIMEARRIVAL = "timeArrival";
	/** Qualifier of the <code>Flight.plane</code> attribute **/
	public static final String PLANE = "plane";
	/** Qualifier of the <code>Flight.departureAirport</code> attribute **/
	public static final String DEPARTUREAIRPORT = "departureAirport";
	/** Qualifier of the <code>Flight.airportArrival</code> attribute **/
	public static final String AIRPORTARRIVAL = "airportArrival";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PLANE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedFlight> PLANEHANDLER = new BidirectionalOneToManyHandler<GeneratedFlight>(
	AirportCoreConstants.TC.FLIGHT,
	false,
	"plane",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n DEPARTUREAIRPORT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedFlight> DEPARTUREAIRPORTHANDLER = new BidirectionalOneToManyHandler<GeneratedFlight>(
	AirportCoreConstants.TC.FLIGHT,
	false,
	"departureAirport",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n AIRPORTARRIVAL's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedFlight> AIRPORTARRIVALHANDLER = new BidirectionalOneToManyHandler<GeneratedFlight>(
	AirportCoreConstants.TC.FLIGHT,
	false,
	"airportArrival",
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
		tmp.put(CODEAIRPLANE, AttributeMode.INITIAL);
		tmp.put(DEPARTURETIME, AttributeMode.INITIAL);
		tmp.put(TIMEARRIVAL, AttributeMode.INITIAL);
		tmp.put(PLANE, AttributeMode.INITIAL);
		tmp.put(DEPARTUREAIRPORT, AttributeMode.INITIAL);
		tmp.put(AIRPORTARRIVAL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.airportArrival</code> attribute.
	 * @return the airportArrival
	 */
	public Airport getAirportArrival(final SessionContext ctx)
	{
		return (Airport)getProperty( ctx, AIRPORTARRIVAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.airportArrival</code> attribute.
	 * @return the airportArrival
	 */
	public Airport getAirportArrival()
	{
		return getAirportArrival( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.airportArrival</code> attribute. 
	 * @param value the airportArrival
	 */
	public void setAirportArrival(final SessionContext ctx, final Airport value)
	{
		AIRPORTARRIVALHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.airportArrival</code> attribute. 
	 * @param value the airportArrival
	 */
	public void setAirportArrival(final Airport value)
	{
		setAirportArrival( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.code</code> attribute.
	 * @return the code - Primary key of table Flight
	 */
	public Integer getCode(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.code</code> attribute.
	 * @return the code - Primary key of table Flight
	 */
	public Integer getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.code</code> attribute. 
	 * @return the code - Primary key of table Flight
	 */
	public int getCodeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getCode( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.code</code> attribute. 
	 * @return the code - Primary key of table Flight
	 */
	public int getCodeAsPrimitive()
	{
		return getCodeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.code</code> attribute. 
	 * @param value the code - Primary key of table Flight
	 */
	public void setCode(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.code</code> attribute. 
	 * @param value the code - Primary key of table Flight
	 */
	public void setCode(final Integer value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.code</code> attribute. 
	 * @param value the code - Primary key of table Flight
	 */
	public void setCode(final SessionContext ctx, final int value)
	{
		setCode( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.code</code> attribute. 
	 * @param value the code - Primary key of table Flight
	 */
	public void setCode(final int value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.codeAirplane</code> attribute.
	 * @return the codeAirplane - Attribute type of plane
	 */
	public String getCodeAirplane(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODEAIRPLANE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.codeAirplane</code> attribute.
	 * @return the codeAirplane - Attribute type of plane
	 */
	public String getCodeAirplane()
	{
		return getCodeAirplane( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.codeAirplane</code> attribute. 
	 * @param value the codeAirplane - Attribute type of plane
	 */
	public void setCodeAirplane(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODEAIRPLANE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.codeAirplane</code> attribute. 
	 * @param value the codeAirplane - Attribute type of plane
	 */
	public void setCodeAirplane(final String value)
	{
		setCodeAirplane( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.codeAirportArrival</code> attribute.
	 * @return the codeAirportArrival - Attribute Airport of arrival
	 */
	public String getCodeAirportArrival(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODEAIRPORTARRIVAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.codeAirportArrival</code> attribute.
	 * @return the codeAirportArrival - Attribute Airport of arrival
	 */
	public String getCodeAirportArrival()
	{
		return getCodeAirportArrival( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.codeAirportArrival</code> attribute. 
	 * @param value the codeAirportArrival - Attribute Airport of arrival
	 */
	public void setCodeAirportArrival(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODEAIRPORTARRIVAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.codeAirportArrival</code> attribute. 
	 * @param value the codeAirportArrival - Attribute Airport of arrival
	 */
	public void setCodeAirportArrival(final String value)
	{
		setCodeAirportArrival( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.codeDepartureAirport</code> attribute.
	 * @return the codeDepartureAirport - Attribute Airport of departure
	 */
	public String getCodeDepartureAirport(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODEDEPARTUREAIRPORT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.codeDepartureAirport</code> attribute.
	 * @return the codeDepartureAirport - Attribute Airport of departure
	 */
	public String getCodeDepartureAirport()
	{
		return getCodeDepartureAirport( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.codeDepartureAirport</code> attribute. 
	 * @param value the codeDepartureAirport - Attribute Airport of departure
	 */
	public void setCodeDepartureAirport(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODEDEPARTUREAIRPORT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.codeDepartureAirport</code> attribute. 
	 * @param value the codeDepartureAirport - Attribute Airport of departure
	 */
	public void setCodeDepartureAirport(final String value)
	{
		setCodeDepartureAirport( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		PLANEHANDLER.newInstance(ctx, allAttributes);
		DEPARTUREAIRPORTHANDLER.newInstance(ctx, allAttributes);
		AIRPORTARRIVALHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.dayWeek</code> attribute.
	 * @return the dayWeek - Attribute day of the week
	 */
	public String getDayWeek(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedFlight.getDayWeek requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DAYWEEK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.dayWeek</code> attribute.
	 * @return the dayWeek - Attribute day of the week
	 */
	public String getDayWeek()
	{
		return getDayWeek( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.dayWeek</code> attribute. 
	 * @return the localized dayWeek - Attribute day of the week
	 */
	public Map<Language,String> getAllDayWeek(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DAYWEEK,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.dayWeek</code> attribute. 
	 * @return the localized dayWeek - Attribute day of the week
	 */
	public Map<Language,String> getAllDayWeek()
	{
		return getAllDayWeek( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.dayWeek</code> attribute. 
	 * @param value the dayWeek - Attribute day of the week
	 */
	public void setDayWeek(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedFlight.setDayWeek requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DAYWEEK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.dayWeek</code> attribute. 
	 * @param value the dayWeek - Attribute day of the week
	 */
	public void setDayWeek(final String value)
	{
		setDayWeek( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.dayWeek</code> attribute. 
	 * @param value the dayWeek - Attribute day of the week
	 */
	public void setAllDayWeek(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DAYWEEK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.dayWeek</code> attribute. 
	 * @param value the dayWeek - Attribute day of the week
	 */
	public void setAllDayWeek(final Map<Language,String> value)
	{
		setAllDayWeek( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.departureAirport</code> attribute.
	 * @return the departureAirport
	 */
	public Airport getDepartureAirport(final SessionContext ctx)
	{
		return (Airport)getProperty( ctx, DEPARTUREAIRPORT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.departureAirport</code> attribute.
	 * @return the departureAirport
	 */
	public Airport getDepartureAirport()
	{
		return getDepartureAirport( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.departureAirport</code> attribute. 
	 * @param value the departureAirport
	 */
	public void setDepartureAirport(final SessionContext ctx, final Airport value)
	{
		DEPARTUREAIRPORTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.departureAirport</code> attribute. 
	 * @param value the departureAirport
	 */
	public void setDepartureAirport(final Airport value)
	{
		setDepartureAirport( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.departureTime</code> attribute.
	 * @return the departureTime - Attribute of departure time
	 */
	public String getDepartureTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DEPARTURETIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.departureTime</code> attribute.
	 * @return the departureTime - Attribute of departure time
	 */
	public String getDepartureTime()
	{
		return getDepartureTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.departureTime</code> attribute. 
	 * @param value the departureTime - Attribute of departure time
	 */
	public void setDepartureTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DEPARTURETIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.departureTime</code> attribute. 
	 * @param value the departureTime - Attribute of departure time
	 */
	public void setDepartureTime(final String value)
	{
		setDepartureTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.plane</code> attribute.
	 * @return the plane
	 */
	public Airplane getPlane(final SessionContext ctx)
	{
		return (Airplane)getProperty( ctx, PLANE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.plane</code> attribute.
	 * @return the plane
	 */
	public Airplane getPlane()
	{
		return getPlane( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.plane</code> attribute. 
	 * @param value the plane
	 */
	public void setPlane(final SessionContext ctx, final Airplane value)
	{
		PLANEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.plane</code> attribute. 
	 * @param value the plane
	 */
	public void setPlane(final Airplane value)
	{
		setPlane( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.timeArrival</code> attribute.
	 * @return the timeArrival - Attribute of time arrival
	 */
	public String getTimeArrival(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TIMEARRIVAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.timeArrival</code> attribute.
	 * @return the timeArrival - Attribute of time arrival
	 */
	public String getTimeArrival()
	{
		return getTimeArrival( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.timeArrival</code> attribute. 
	 * @param value the timeArrival - Attribute of time arrival
	 */
	public void setTimeArrival(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TIMEARRIVAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.timeArrival</code> attribute. 
	 * @param value the timeArrival - Attribute of time arrival
	 */
	public void setTimeArrival(final String value)
	{
		setTimeArrival( getSession().getSessionContext(), value );
	}
	
}
