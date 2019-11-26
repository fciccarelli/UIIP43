/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 26-nov-2019 22.42.05                        ---
 * ----------------------------------------------------------------
 */
package it.uiip.airport.core.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import it.uiip.airport.core.constants.AirportCoreConstants;
import it.uiip.airport.core.jalo.Flight;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link it.uiip.airport.core.jalo.Passenger Passenger}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPassenger extends User
{
	/** Qualifier of the <code>Passenger.surname</code> attribute **/
	public static final String SURNAME = "surname";
	/** Qualifier of the <code>Passenger.passport</code> attribute **/
	public static final String PASSPORT = "passport";
	/** Qualifier of the <code>Passenger.flight</code> attribute **/
	public static final String FLIGHT = "flight";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n FLIGHT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPassenger> FLIGHTHANDLER = new BidirectionalOneToManyHandler<GeneratedPassenger>(
	AirportCoreConstants.TC.PASSENGER,
	false,
	"flight",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(User.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SURNAME, AttributeMode.INITIAL);
		tmp.put(PASSPORT, AttributeMode.INITIAL);
		tmp.put(FLIGHT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		FLIGHTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.flight</code> attribute.
	 * @return the flight
	 */
	public Flight getFlight(final SessionContext ctx)
	{
		return (Flight)getProperty( ctx, FLIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.flight</code> attribute.
	 * @return the flight
	 */
	public Flight getFlight()
	{
		return getFlight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.flight</code> attribute. 
	 * @param value the flight
	 */
	public void setFlight(final SessionContext ctx, final Flight value)
	{
		FLIGHTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.flight</code> attribute. 
	 * @param value the flight
	 */
	public void setFlight(final Flight value)
	{
		setFlight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.passport</code> attribute.
	 * @return the passport - The passport of the passenger
	 */
	public String getPassport(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PASSPORT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.passport</code> attribute.
	 * @return the passport - The passport of the passenger
	 */
	public String getPassport()
	{
		return getPassport( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.passport</code> attribute. 
	 * @param value the passport - The passport of the passenger
	 */
	public void setPassport(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PASSPORT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.passport</code> attribute. 
	 * @param value the passport - The passport of the passenger
	 */
	public void setPassport(final String value)
	{
		setPassport( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.surname</code> attribute.
	 * @return the surname - The surname of the passenger
	 */
	public String getSurname(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SURNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.surname</code> attribute.
	 * @return the surname - The surname of the passenger
	 */
	public String getSurname()
	{
		return getSurname( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.surname</code> attribute. 
	 * @param value the surname - The surname of the passenger
	 */
	public void setSurname(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SURNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.surname</code> attribute. 
	 * @param value the surname - The surname of the passenger
	 */
	public void setSurname(final String value)
	{
		setSurname( getSession().getSessionContext(), value );
	}
	
}
