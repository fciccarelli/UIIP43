/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 26-nov-2019 21.11.59                        ---
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
import de.hybris.platform.util.OneToManyHandler;
import it.uiip.airport.core.constants.AirportCoreConstants;
import it.uiip.airport.core.jalo.Airport;
import it.uiip.airport.core.jalo.Passenger;
import it.uiip.airport.core.jalo.Plane;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
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
	/** Qualifier of the <code>Flight.departureTime</code> attribute **/
	public static final String DEPARTURETIME = "departureTime";
	/** Qualifier of the <code>Flight.Timearrival</code> attribute **/
	public static final String TIMEARRIVAL = "Timearrival";
	/** Qualifier of the <code>Flight.passengers</code> attribute **/
	public static final String PASSENGERS = "passengers";
	/** Qualifier of the <code>Flight.plane</code> attribute **/
	public static final String PLANE = "plane";
	/** Qualifier of the <code>Flight.airportPOS</code> attribute **/
	public static final String AIRPORTPOS = "airportPOS";
	/** Qualifier of the <code>Flight.airport</code> attribute **/
	public static final String AIRPORT = "airport";
	/**
	* {@link OneToManyHandler} for handling 1:n PASSENGERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Passenger> PASSENGERSHANDLER = new OneToManyHandler<Passenger>(
	AirportCoreConstants.TC.PASSENGER,
	false,
	"flight",
	null,
	false,
	true,
	CollectionType.LIST
	);
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
	CollectionType.LIST
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n AIRPORT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedFlight> AIRPORTHANDLER = new BidirectionalOneToManyHandler<GeneratedFlight>(
	AirportCoreConstants.TC.FLIGHT,
	false,
	"airport",
	"airportPOS",
	true,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(DAYWEEK, AttributeMode.INITIAL);
		tmp.put(DEPARTURETIME, AttributeMode.INITIAL);
		tmp.put(TIMEARRIVAL, AttributeMode.INITIAL);
		tmp.put(PLANE, AttributeMode.INITIAL);
		tmp.put(AIRPORTPOS, AttributeMode.INITIAL);
		tmp.put(AIRPORT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.airport</code> attribute.
	 * @return the airport
	 */
	public Airport getAirport(final SessionContext ctx)
	{
		return (Airport)getProperty( ctx, AIRPORT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.airport</code> attribute.
	 * @return the airport
	 */
	public Airport getAirport()
	{
		return getAirport( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.airport</code> attribute. 
	 * @param value the airport
	 */
	public void setAirport(final SessionContext ctx, final Airport value)
	{
		AIRPORTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.airport</code> attribute. 
	 * @param value the airport
	 */
	public void setAirport(final Airport value)
	{
		setAirport( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.airportPOS</code> attribute.
	 * @return the airportPOS
	 */
	 Integer getAirportPOS(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, AIRPORTPOS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.airportPOS</code> attribute.
	 * @return the airportPOS
	 */
	 Integer getAirportPOS()
	{
		return getAirportPOS( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.airportPOS</code> attribute. 
	 * @return the airportPOS
	 */
	 int getAirportPOSAsPrimitive(final SessionContext ctx)
	{
		Integer value = getAirportPOS( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.airportPOS</code> attribute. 
	 * @return the airportPOS
	 */
	 int getAirportPOSAsPrimitive()
	{
		return getAirportPOSAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.airportPOS</code> attribute. 
	 * @param value the airportPOS
	 */
	 void setAirportPOS(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, AIRPORTPOS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.airportPOS</code> attribute. 
	 * @param value the airportPOS
	 */
	 void setAirportPOS(final Integer value)
	{
		setAirportPOS( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.airportPOS</code> attribute. 
	 * @param value the airportPOS
	 */
	 void setAirportPOS(final SessionContext ctx, final int value)
	{
		setAirportPOS( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.airportPOS</code> attribute. 
	 * @param value the airportPOS
	 */
	 void setAirportPOS(final int value)
	{
		setAirportPOS( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.code</code> attribute.
	 * @return the code - id plane primary key
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.code</code> attribute.
	 * @return the code - id plane primary key
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.code</code> attribute. 
	 * @param value the code - id plane primary key
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.code</code> attribute. 
	 * @param value the code - id plane primary key
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		PLANEHANDLER.newInstance(ctx, allAttributes);
		AIRPORTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.dayWeek</code> attribute.
	 * @return the dayWeek - day of the week
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
	 * @return the dayWeek - day of the week
	 */
	public String getDayWeek()
	{
		return getDayWeek( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.dayWeek</code> attribute. 
	 * @return the localized dayWeek - day of the week
	 */
	public Map<Language,String> getAllDayWeek(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DAYWEEK,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.dayWeek</code> attribute. 
	 * @return the localized dayWeek - day of the week
	 */
	public Map<Language,String> getAllDayWeek()
	{
		return getAllDayWeek( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.dayWeek</code> attribute. 
	 * @param value the dayWeek - day of the week
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
	 * @param value the dayWeek - day of the week
	 */
	public void setDayWeek(final String value)
	{
		setDayWeek( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.dayWeek</code> attribute. 
	 * @param value the dayWeek - day of the week
	 */
	public void setAllDayWeek(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DAYWEEK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.dayWeek</code> attribute. 
	 * @param value the dayWeek - day of the week
	 */
	public void setAllDayWeek(final Map<Language,String> value)
	{
		setAllDayWeek( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.departureTime</code> attribute.
	 * @return the departureTime - time of departure
	 */
	public String getDepartureTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DEPARTURETIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.departureTime</code> attribute.
	 * @return the departureTime - time of departure
	 */
	public String getDepartureTime()
	{
		return getDepartureTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.departureTime</code> attribute. 
	 * @param value the departureTime - time of departure
	 */
	public void setDepartureTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DEPARTURETIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.departureTime</code> attribute. 
	 * @param value the departureTime - time of departure
	 */
	public void setDepartureTime(final String value)
	{
		setDepartureTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.passengers</code> attribute.
	 * @return the passengers
	 */
	public List<Passenger> getPassengers(final SessionContext ctx)
	{
		return (List<Passenger>)PASSENGERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.passengers</code> attribute.
	 * @return the passengers
	 */
	public List<Passenger> getPassengers()
	{
		return getPassengers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.passengers</code> attribute. 
	 * @param value the passengers
	 */
	public void setPassengers(final SessionContext ctx, final List<Passenger> value)
	{
		PASSENGERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.passengers</code> attribute. 
	 * @param value the passengers
	 */
	public void setPassengers(final List<Passenger> value)
	{
		setPassengers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to passengers. 
	 * @param value the item to add to passengers
	 */
	public void addToPassengers(final SessionContext ctx, final Passenger value)
	{
		PASSENGERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to passengers. 
	 * @param value the item to add to passengers
	 */
	public void addToPassengers(final Passenger value)
	{
		addToPassengers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from passengers. 
	 * @param value the item to remove from passengers
	 */
	public void removeFromPassengers(final SessionContext ctx, final Passenger value)
	{
		PASSENGERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from passengers. 
	 * @param value the item to remove from passengers
	 */
	public void removeFromPassengers(final Passenger value)
	{
		removeFromPassengers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.plane</code> attribute.
	 * @return the plane
	 */
	public Plane getPlane(final SessionContext ctx)
	{
		return (Plane)getProperty( ctx, PLANE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.plane</code> attribute.
	 * @return the plane
	 */
	public Plane getPlane()
	{
		return getPlane( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.plane</code> attribute. 
	 * @param value the plane
	 */
	public void setPlane(final SessionContext ctx, final Plane value)
	{
		PLANEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.plane</code> attribute. 
	 * @param value the plane
	 */
	public void setPlane(final Plane value)
	{
		setPlane( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.Timearrival</code> attribute.
	 * @return the Timearrival - time of arrival
	 */
	public String getTimearrival(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TIMEARRIVAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Flight.Timearrival</code> attribute.
	 * @return the Timearrival - time of arrival
	 */
	public String getTimearrival()
	{
		return getTimearrival( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.Timearrival</code> attribute. 
	 * @param value the Timearrival - time of arrival
	 */
	public void setTimearrival(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TIMEARRIVAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Flight.Timearrival</code> attribute. 
	 * @param value the Timearrival - time of arrival
	 */
	public void setTimearrival(final String value)
	{
		setTimearrival( getSession().getSessionContext(), value );
	}
	
}
