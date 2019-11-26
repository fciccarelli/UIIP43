/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 26-nov-2019 22.27.54                        ---
 * ----------------------------------------------------------------
 */
package it.uiip.airport.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import it.uiip.airport.core.constants.AirportCoreConstants;
import it.uiip.airport.core.jalo.Flight;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link it.uiip.airport.core.jalo.Airport Airport}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAirport extends GenericItem
{
	/** Qualifier of the <code>Airport.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Airport.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>Airport.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>Airport.nRunWay</code> attribute **/
	public static final String NRUNWAY = "nRunWay";
	/** Qualifier of the <code>Airport.departureAirports</code> attribute **/
	public static final String DEPARTUREAIRPORTS = "departureAirports";
	/** Qualifier of the <code>Airport.airportArrivals</code> attribute **/
	public static final String AIRPORTARRIVALS = "airportArrivals";
	/**
	* {@link OneToManyHandler} for handling 1:n DEPARTUREAIRPORTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Flight> DEPARTUREAIRPORTSHANDLER = new OneToManyHandler<Flight>(
	AirportCoreConstants.TC.FLIGHT,
	false,
	"airport",
	"airportPOS",
	true,
	true,
	CollectionType.LIST
	);
	/**
	* {@link OneToManyHandler} for handling 1:n AIRPORTARRIVALS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Flight> AIRPORTARRIVALSHANDLER = new OneToManyHandler<Flight>(
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
		tmp.put(CITY, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(NRUNWAY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Airport.airportArrivals</code> attribute.
	 * @return the airportArrivals
	 */
	public List<Flight> getAirportArrivals(final SessionContext ctx)
	{
		return (List<Flight>)AIRPORTARRIVALSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Airport.airportArrivals</code> attribute.
	 * @return the airportArrivals
	 */
	public List<Flight> getAirportArrivals()
	{
		return getAirportArrivals( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Airport.airportArrivals</code> attribute. 
	 * @param value the airportArrivals
	 */
	public void setAirportArrivals(final SessionContext ctx, final List<Flight> value)
	{
		AIRPORTARRIVALSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Airport.airportArrivals</code> attribute. 
	 * @param value the airportArrivals
	 */
	public void setAirportArrivals(final List<Flight> value)
	{
		setAirportArrivals( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to airportArrivals. 
	 * @param value the item to add to airportArrivals
	 */
	public void addToAirportArrivals(final SessionContext ctx, final Flight value)
	{
		AIRPORTARRIVALSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to airportArrivals. 
	 * @param value the item to add to airportArrivals
	 */
	public void addToAirportArrivals(final Flight value)
	{
		addToAirportArrivals( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from airportArrivals. 
	 * @param value the item to remove from airportArrivals
	 */
	public void removeFromAirportArrivals(final SessionContext ctx, final Flight value)
	{
		AIRPORTARRIVALSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from airportArrivals. 
	 * @param value the item to remove from airportArrivals
	 */
	public void removeFromAirportArrivals(final Flight value)
	{
		removeFromAirportArrivals( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Airport.city</code> attribute.
	 * @return the city - Attribute city airport
	 */
	public String getCity(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAirport.getCity requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Airport.city</code> attribute.
	 * @return the city - Attribute city airport
	 */
	public String getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Airport.city</code> attribute. 
	 * @return the localized city - Attribute city airport
	 */
	public Map<Language,String> getAllCity(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,CITY,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Airport.city</code> attribute. 
	 * @return the localized city - Attribute city airport
	 */
	public Map<Language,String> getAllCity()
	{
		return getAllCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Airport.city</code> attribute. 
	 * @param value the city - Attribute city airport
	 */
	public void setCity(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAirport.setCity requires a session language", 0 );
		}
		setLocalizedProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Airport.city</code> attribute. 
	 * @param value the city - Attribute city airport
	 */
	public void setCity(final String value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Airport.city</code> attribute. 
	 * @param value the city - Attribute city airport
	 */
	public void setAllCity(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Airport.city</code> attribute. 
	 * @param value the city - Attribute city airport
	 */
	public void setAllCity(final Map<Language,String> value)
	{
		setAllCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Airport.code</code> attribute.
	 * @return the code - id airport Primary key
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Airport.code</code> attribute.
	 * @return the code - id airport Primary key
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Airport.code</code> attribute. 
	 * @param value the code - id airport Primary key
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Airport.code</code> attribute. 
	 * @param value the code - id airport Primary key
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Airport.country</code> attribute.
	 * @return the country - Attribute nation airport
	 */
	public String getCountry(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAirport.getCountry requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Airport.country</code> attribute.
	 * @return the country - Attribute nation airport
	 */
	public String getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Airport.country</code> attribute. 
	 * @return the localized country - Attribute nation airport
	 */
	public Map<Language,String> getAllCountry(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,COUNTRY,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Airport.country</code> attribute. 
	 * @return the localized country - Attribute nation airport
	 */
	public Map<Language,String> getAllCountry()
	{
		return getAllCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Airport.country</code> attribute. 
	 * @param value the country - Attribute nation airport
	 */
	public void setCountry(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAirport.setCountry requires a session language", 0 );
		}
		setLocalizedProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Airport.country</code> attribute. 
	 * @param value the country - Attribute nation airport
	 */
	public void setCountry(final String value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Airport.country</code> attribute. 
	 * @param value the country - Attribute nation airport
	 */
	public void setAllCountry(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Airport.country</code> attribute. 
	 * @param value the country - Attribute nation airport
	 */
	public void setAllCountry(final Map<Language,String> value)
	{
		setAllCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Airport.departureAirports</code> attribute.
	 * @return the departureAirports
	 */
	public List<Flight> getDepartureAirports(final SessionContext ctx)
	{
		return (List<Flight>)DEPARTUREAIRPORTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Airport.departureAirports</code> attribute.
	 * @return the departureAirports
	 */
	public List<Flight> getDepartureAirports()
	{
		return getDepartureAirports( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Airport.departureAirports</code> attribute. 
	 * @param value the departureAirports
	 */
	public void setDepartureAirports(final SessionContext ctx, final List<Flight> value)
	{
		DEPARTUREAIRPORTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Airport.departureAirports</code> attribute. 
	 * @param value the departureAirports
	 */
	public void setDepartureAirports(final List<Flight> value)
	{
		setDepartureAirports( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to departureAirports. 
	 * @param value the item to add to departureAirports
	 */
	public void addToDepartureAirports(final SessionContext ctx, final Flight value)
	{
		DEPARTUREAIRPORTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to departureAirports. 
	 * @param value the item to add to departureAirports
	 */
	public void addToDepartureAirports(final Flight value)
	{
		addToDepartureAirports( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from departureAirports. 
	 * @param value the item to remove from departureAirports
	 */
	public void removeFromDepartureAirports(final SessionContext ctx, final Flight value)
	{
		DEPARTUREAIRPORTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from departureAirports. 
	 * @param value the item to remove from departureAirports
	 */
	public void removeFromDepartureAirports(final Flight value)
	{
		removeFromDepartureAirports( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Airport.nRunWay</code> attribute.
	 * @return the nRunWay - Attribute number of tracks airport
	 */
	public String getNRunWay(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAirport.getNRunWay requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NRUNWAY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Airport.nRunWay</code> attribute.
	 * @return the nRunWay - Attribute number of tracks airport
	 */
	public String getNRunWay()
	{
		return getNRunWay( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Airport.nRunWay</code> attribute. 
	 * @return the localized nRunWay - Attribute number of tracks airport
	 */
	public Map<Language,String> getAllNRunWay(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NRUNWAY,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Airport.nRunWay</code> attribute. 
	 * @return the localized nRunWay - Attribute number of tracks airport
	 */
	public Map<Language,String> getAllNRunWay()
	{
		return getAllNRunWay( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Airport.nRunWay</code> attribute. 
	 * @param value the nRunWay - Attribute number of tracks airport
	 */
	public void setNRunWay(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAirport.setNRunWay requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NRUNWAY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Airport.nRunWay</code> attribute. 
	 * @param value the nRunWay - Attribute number of tracks airport
	 */
	public void setNRunWay(final String value)
	{
		setNRunWay( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Airport.nRunWay</code> attribute. 
	 * @param value the nRunWay - Attribute number of tracks airport
	 */
	public void setAllNRunWay(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NRUNWAY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Airport.nRunWay</code> attribute. 
	 * @param value the nRunWay - Attribute number of tracks airport
	 */
	public void setAllNRunWay(final Map<Language,String> value)
	{
		setAllNRunWay( getSession().getSessionContext(), value );
	}
	
}
