/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 27-nov-2019 22.05.04                        ---
 * ----------------------------------------------------------------
 */
package it.uiip.airport.core.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.util.Utilities;
import it.uiip.airport.core.constants.AirportCoreConstants;
import it.uiip.airport.core.jalo.Flight;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link it.uiip.airport.core.jalo.Passenger Passenger}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPassenger extends User
{
	/** Qualifier of the <code>Passenger.passport</code> attribute **/
	public static final String PASSPORT = "passport";
	/** Qualifier of the <code>Passenger.surname</code> attribute **/
	public static final String SURNAME = "surname";
	/** Qualifier of the <code>Passenger.flights</code> attribute **/
	public static final String FLIGHTS = "flights";
	/** Relation ordering override parameter constants for Flight2PassengerRelation from ((airportcore))*/
	protected static String FLIGHT2PASSENGERRELATION_SRC_ORDERED = "relation.Flight2PassengerRelation.source.ordered";
	protected static String FLIGHT2PASSENGERRELATION_TGT_ORDERED = "relation.Flight2PassengerRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for Flight2PassengerRelation from ((airportcore))*/
	protected static String FLIGHT2PASSENGERRELATION_MARKMODIFIED = "relation.Flight2PassengerRelation.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(User.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PASSPORT, AttributeMode.INITIAL);
		tmp.put(SURNAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.flights</code> attribute.
	 * @return the flights
	 */
	public Collection<Flight> getFlights(final SessionContext ctx)
	{
		final List<Flight> items = getLinkedItems( 
			ctx,
			false,
			AirportCoreConstants.Relations.FLIGHT2PASSENGERRELATION,
			"Flight",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.flights</code> attribute.
	 * @return the flights
	 */
	public Collection<Flight> getFlights()
	{
		return getFlights( getSession().getSessionContext() );
	}
	
	public long getFlightsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			AirportCoreConstants.Relations.FLIGHT2PASSENGERRELATION,
			"Flight",
			null
		);
	}
	
	public long getFlightsCount()
	{
		return getFlightsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.flights</code> attribute. 
	 * @param value the flights
	 */
	public void setFlights(final SessionContext ctx, final Collection<Flight> value)
	{
		setLinkedItems( 
			ctx,
			false,
			AirportCoreConstants.Relations.FLIGHT2PASSENGERRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(FLIGHT2PASSENGERRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.flights</code> attribute. 
	 * @param value the flights
	 */
	public void setFlights(final Collection<Flight> value)
	{
		setFlights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to flights. 
	 * @param value the item to add to flights
	 */
	public void addToFlights(final SessionContext ctx, final Flight value)
	{
		addLinkedItems( 
			ctx,
			false,
			AirportCoreConstants.Relations.FLIGHT2PASSENGERRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(FLIGHT2PASSENGERRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to flights. 
	 * @param value the item to add to flights
	 */
	public void addToFlights(final Flight value)
	{
		addToFlights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from flights. 
	 * @param value the item to remove from flights
	 */
	public void removeFromFlights(final SessionContext ctx, final Flight value)
	{
		removeLinkedItems( 
			ctx,
			false,
			AirportCoreConstants.Relations.FLIGHT2PASSENGERRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(FLIGHT2PASSENGERRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from flights. 
	 * @param value the item to remove from flights
	 */
	public void removeFromFlights(final Flight value)
	{
		removeFromFlights( getSession().getSessionContext(), value );
	}
	
	@Override
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Flight");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(FLIGHT2PASSENGERRELATION_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.passport</code> attribute.
	 * @return the passport - AlphaNumbercode of passport
	 */
	public String getPassport(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PASSPORT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.passport</code> attribute.
	 * @return the passport - AlphaNumbercode of passport
	 */
	public String getPassport()
	{
		return getPassport( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.passport</code> attribute. 
	 * @param value the passport - AlphaNumbercode of passport
	 */
	public void setPassport(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PASSPORT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.passport</code> attribute. 
	 * @param value the passport - AlphaNumbercode of passport
	 */
	public void setPassport(final String value)
	{
		setPassport( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.surname</code> attribute.
	 * @return the surname - surname of the passenger
	 */
	public String getSurname(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SURNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.surname</code> attribute.
	 * @return the surname - surname of the passenger
	 */
	public String getSurname()
	{
		return getSurname( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.surname</code> attribute. 
	 * @param value the surname - surname of the passenger
	 */
	public void setSurname(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SURNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.surname</code> attribute. 
	 * @param value the surname - surname of the passenger
	 */
	public void setSurname(final String value)
	{
		setSurname( getSession().getSessionContext(), value );
	}
	
}
