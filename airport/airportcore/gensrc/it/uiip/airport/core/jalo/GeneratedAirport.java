/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 25-nov-2019 22.59.15                        ---
 * ----------------------------------------------------------------
 */
package it.uiip.airport.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
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
	/** Qualifier of the <code>Airport.nRunways</code> attribute **/
	public static final String NRUNWAYS = "nRunways";
	/** Qualifier of the <code>Airport.codeDepartureAirports</code> attribute **/
	public static final String CODEDEPARTUREAIRPORTS = "codeDepartureAirports";
	/** Qualifier of the <code>Airport.codeAirportArrivals</code> attribute **/
	public static final String CODEAIRPORTARRIVALS = "codeAirportArrivals";
	/**
	* {@link OneToManyHandler} for handling 1:n CODEDEPARTUREAIRPORTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Flight> CODEDEPARTUREAIRPORTSHANDLER = new OneToManyHandler<Flight>(
	AirportCoreConstants.TC.FLIGHT,
	false,
	"code",
	"codePOS",
	true,
	true,
	CollectionType.LIST
	);
	/**
	* {@link OneToManyHandler} for handling 1:n CODEAIRPORTARRIVALS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Flight> CODEAIRPORTARRIVALSHANDLER = new OneToManyHandler<Flight>(
	AirportCoreConstants.TC.FLIGHT,
	false,
	"code",
	"codePOS",
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
		tmp.put(NRUNWAYS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Airport.city</code> attribute.
	 * @return the city - the city where the airport is located
	 */
	public String getCity(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Airport.city</code> attribute.
	 * @return the city - the city where the airport is located
	 */
	public String getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Airport.city</code> attribute. 
	 * @param value the city - the city where the airport is located
	 */
	public void setCity(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Airport.city</code> attribute. 
	 * @param value the city - the city where the airport is located
	 */
	public void setCity(final String value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Airport.code</code> attribute.
	 * @return the code - id airport primary key
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Airport.code</code> attribute.
	 * @return the code - id airport primary key
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Airport.codeAirportArrivals</code> attribute.
	 * @return the codeAirportArrivals
	 */
	public List<Flight> getCodeAirportArrivals(final SessionContext ctx)
	{
		return (List<Flight>)CODEAIRPORTARRIVALSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Airport.codeAirportArrivals</code> attribute.
	 * @return the codeAirportArrivals
	 */
	public List<Flight> getCodeAirportArrivals()
	{
		return getCodeAirportArrivals( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Airport.codeAirportArrivals</code> attribute. 
	 * @param value the codeAirportArrivals
	 */
	public void setCodeAirportArrivals(final SessionContext ctx, final List<Flight> value)
	{
		CODEAIRPORTARRIVALSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Airport.codeAirportArrivals</code> attribute. 
	 * @param value the codeAirportArrivals
	 */
	public void setCodeAirportArrivals(final List<Flight> value)
	{
		setCodeAirportArrivals( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to codeAirportArrivals. 
	 * @param value the item to add to codeAirportArrivals
	 */
	public void addToCodeAirportArrivals(final SessionContext ctx, final Flight value)
	{
		CODEAIRPORTARRIVALSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to codeAirportArrivals. 
	 * @param value the item to add to codeAirportArrivals
	 */
	public void addToCodeAirportArrivals(final Flight value)
	{
		addToCodeAirportArrivals( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from codeAirportArrivals. 
	 * @param value the item to remove from codeAirportArrivals
	 */
	public void removeFromCodeAirportArrivals(final SessionContext ctx, final Flight value)
	{
		CODEAIRPORTARRIVALSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from codeAirportArrivals. 
	 * @param value the item to remove from codeAirportArrivals
	 */
	public void removeFromCodeAirportArrivals(final Flight value)
	{
		removeFromCodeAirportArrivals( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Airport.codeDepartureAirports</code> attribute.
	 * @return the codeDepartureAirports
	 */
	public List<Flight> getCodeDepartureAirports(final SessionContext ctx)
	{
		return (List<Flight>)CODEDEPARTUREAIRPORTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Airport.codeDepartureAirports</code> attribute.
	 * @return the codeDepartureAirports
	 */
	public List<Flight> getCodeDepartureAirports()
	{
		return getCodeDepartureAirports( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Airport.codeDepartureAirports</code> attribute. 
	 * @param value the codeDepartureAirports
	 */
	public void setCodeDepartureAirports(final SessionContext ctx, final List<Flight> value)
	{
		CODEDEPARTUREAIRPORTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Airport.codeDepartureAirports</code> attribute. 
	 * @param value the codeDepartureAirports
	 */
	public void setCodeDepartureAirports(final List<Flight> value)
	{
		setCodeDepartureAirports( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to codeDepartureAirports. 
	 * @param value the item to add to codeDepartureAirports
	 */
	public void addToCodeDepartureAirports(final SessionContext ctx, final Flight value)
	{
		CODEDEPARTUREAIRPORTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to codeDepartureAirports. 
	 * @param value the item to add to codeDepartureAirports
	 */
	public void addToCodeDepartureAirports(final Flight value)
	{
		addToCodeDepartureAirports( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from codeDepartureAirports. 
	 * @param value the item to remove from codeDepartureAirports
	 */
	public void removeFromCodeDepartureAirports(final SessionContext ctx, final Flight value)
	{
		CODEDEPARTUREAIRPORTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from codeDepartureAirports. 
	 * @param value the item to remove from codeDepartureAirports
	 */
	public void removeFromCodeDepartureAirports(final Flight value)
	{
		removeFromCodeDepartureAirports( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Airport.country</code> attribute.
	 * @return the country - the country where the airport is located
	 */
	public String getCountry(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Airport.country</code> attribute.
	 * @return the country - the country where the airport is located
	 */
	public String getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Airport.country</code> attribute. 
	 * @param value the country - the country where the airport is located
	 */
	public void setCountry(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Airport.country</code> attribute. 
	 * @param value the country - the country where the airport is located
	 */
	public void setCountry(final String value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Airport.nRunways</code> attribute.
	 * @return the nRunways - the number of airport run-ways
	 */
	public Integer getNRunways(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NRUNWAYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Airport.nRunways</code> attribute.
	 * @return the nRunways - the number of airport run-ways
	 */
	public Integer getNRunways()
	{
		return getNRunways( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Airport.nRunways</code> attribute. 
	 * @return the nRunways - the number of airport run-ways
	 */
	public int getNRunwaysAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNRunways( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Airport.nRunways</code> attribute. 
	 * @return the nRunways - the number of airport run-ways
	 */
	public int getNRunwaysAsPrimitive()
	{
		return getNRunwaysAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Airport.nRunways</code> attribute. 
	 * @param value the nRunways - the number of airport run-ways
	 */
	public void setNRunways(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NRUNWAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Airport.nRunways</code> attribute. 
	 * @param value the nRunways - the number of airport run-ways
	 */
	public void setNRunways(final Integer value)
	{
		setNRunways( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Airport.nRunways</code> attribute. 
	 * @param value the nRunways - the number of airport run-ways
	 */
	public void setNRunways(final SessionContext ctx, final int value)
	{
		setNRunways( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Airport.nRunways</code> attribute. 
	 * @param value the nRunways - the number of airport run-ways
	 */
	public void setNRunways(final int value)
	{
		setNRunways( getSession().getSessionContext(), value );
	}
	
}
