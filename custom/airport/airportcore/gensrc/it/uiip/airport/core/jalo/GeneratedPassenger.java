/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 27-nov-2019 22.53.52                        ---
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
	/** Qualifier of the <code>Passenger.passid</code> attribute **/
	public static final String PASSID = "passid";
	/** Qualifier of the <code>Passenger.nome</code> attribute **/
	public static final String NOME = "nome";
	/** Qualifier of the <code>Passenger.cognome</code> attribute **/
	public static final String COGNOME = "cognome";
	/** Qualifier of the <code>Passenger.passaporto</code> attribute **/
	public static final String PASSAPORTO = "passaporto";
	/** Qualifier of the <code>Passenger.flight</code> attribute **/
	public static final String FLIGHT = "flight";
	/** Qualifier of the <code>Passenger.flights</code> attribute **/
	public static final String FLIGHTS = "flights";
	/** Relation ordering override parameter constants for PassengerFlightRelation from ((airportcore))*/
	protected static String PASSENGERFLIGHTRELATION_SRC_ORDERED = "relation.PassengerFlightRelation.source.ordered";
	protected static String PASSENGERFLIGHTRELATION_TGT_ORDERED = "relation.PassengerFlightRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for PassengerFlightRelation from ((airportcore))*/
	protected static String PASSENGERFLIGHTRELATION_MARKMODIFIED = "relation.PassengerFlightRelation.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(User.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PASSID, AttributeMode.INITIAL);
		tmp.put(NOME, AttributeMode.INITIAL);
		tmp.put(COGNOME, AttributeMode.INITIAL);
		tmp.put(PASSAPORTO, AttributeMode.INITIAL);
		tmp.put(FLIGHT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.cognome</code> attribute.
	 * @return the cognome - Attribute of the surname of the passenger
	 */
	public String getCognome(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COGNOME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.cognome</code> attribute.
	 * @return the cognome - Attribute of the surname of the passenger
	 */
	public String getCognome()
	{
		return getCognome( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.cognome</code> attribute. 
	 * @param value the cognome - Attribute of the surname of the passenger
	 */
	public void setCognome(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COGNOME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.cognome</code> attribute. 
	 * @param value the cognome - Attribute of the surname of the passenger
	 */
	public void setCognome(final String value)
	{
		setCognome( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.flight</code> attribute.
	 * @return the flight - Primary key of table Flight
	 */
	public Integer getFlight(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, FLIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.flight</code> attribute.
	 * @return the flight - Primary key of table Flight
	 */
	public Integer getFlight()
	{
		return getFlight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.flight</code> attribute. 
	 * @return the flight - Primary key of table Flight
	 */
	public int getFlightAsPrimitive(final SessionContext ctx)
	{
		Integer value = getFlight( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.flight</code> attribute. 
	 * @return the flight - Primary key of table Flight
	 */
	public int getFlightAsPrimitive()
	{
		return getFlightAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.flight</code> attribute. 
	 * @param value the flight - Primary key of table Flight
	 */
	public void setFlight(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, FLIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.flight</code> attribute. 
	 * @param value the flight - Primary key of table Flight
	 */
	public void setFlight(final Integer value)
	{
		setFlight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.flight</code> attribute. 
	 * @param value the flight - Primary key of table Flight
	 */
	public void setFlight(final SessionContext ctx, final int value)
	{
		setFlight( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.flight</code> attribute. 
	 * @param value the flight - Primary key of table Flight
	 */
	public void setFlight(final int value)
	{
		setFlight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.flights</code> attribute.
	 * @return the flights
	 */
	public List<Flight> getFlights(final SessionContext ctx)
	{
		final List<Flight> items = getLinkedItems( 
			ctx,
			true,
			AirportCoreConstants.Relations.PASSENGERFLIGHTRELATION,
			"Flight",
			null,
			Utilities.getRelationOrderingOverride(PASSENGERFLIGHTRELATION_SRC_ORDERED, true),
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.flights</code> attribute.
	 * @return the flights
	 */
	public List<Flight> getFlights()
	{
		return getFlights( getSession().getSessionContext() );
	}
	
	public long getFlightsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			AirportCoreConstants.Relations.PASSENGERFLIGHTRELATION,
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
	public void setFlights(final SessionContext ctx, final List<Flight> value)
	{
		setLinkedItems( 
			ctx,
			true,
			AirportCoreConstants.Relations.PASSENGERFLIGHTRELATION,
			null,
			value,
			Utilities.getRelationOrderingOverride(PASSENGERFLIGHTRELATION_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(PASSENGERFLIGHTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.flights</code> attribute. 
	 * @param value the flights
	 */
	public void setFlights(final List<Flight> value)
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
			true,
			AirportCoreConstants.Relations.PASSENGERFLIGHTRELATION,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(PASSENGERFLIGHTRELATION_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(PASSENGERFLIGHTRELATION_MARKMODIFIED)
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
			true,
			AirportCoreConstants.Relations.PASSENGERFLIGHTRELATION,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(PASSENGERFLIGHTRELATION_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(PASSENGERFLIGHTRELATION_MARKMODIFIED)
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
			return Utilities.getMarkModifiedOverride(PASSENGERFLIGHTRELATION_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.nome</code> attribute.
	 * @return the nome - Attribute of the name of the passenger
	 */
	public String getNome(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NOME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.nome</code> attribute.
	 * @return the nome - Attribute of the name of the passenger
	 */
	public String getNome()
	{
		return getNome( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.nome</code> attribute. 
	 * @param value the nome - Attribute of the name of the passenger
	 */
	public void setNome(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NOME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.nome</code> attribute. 
	 * @param value the nome - Attribute of the name of the passenger
	 */
	public void setNome(final String value)
	{
		setNome( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.passaporto</code> attribute.
	 * @return the passaporto - Attribute of the alphanumeric code of the passport
	 */
	public String getPassaporto(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PASSAPORTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.passaporto</code> attribute.
	 * @return the passaporto - Attribute of the alphanumeric code of the passport
	 */
	public String getPassaporto()
	{
		return getPassaporto( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.passaporto</code> attribute. 
	 * @param value the passaporto - Attribute of the alphanumeric code of the passport
	 */
	public void setPassaporto(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PASSAPORTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.passaporto</code> attribute. 
	 * @param value the passaporto - Attribute of the alphanumeric code of the passport
	 */
	public void setPassaporto(final String value)
	{
		setPassaporto( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.passid</code> attribute.
	 * @return the passid - Attribute id
	 */
	public Integer getPassid(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, PASSID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.passid</code> attribute.
	 * @return the passid - Attribute id
	 */
	public Integer getPassid()
	{
		return getPassid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.passid</code> attribute. 
	 * @return the passid - Attribute id
	 */
	public int getPassidAsPrimitive(final SessionContext ctx)
	{
		Integer value = getPassid( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Passenger.passid</code> attribute. 
	 * @return the passid - Attribute id
	 */
	public int getPassidAsPrimitive()
	{
		return getPassidAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.passid</code> attribute. 
	 * @param value the passid - Attribute id
	 */
	public void setPassid(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, PASSID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.passid</code> attribute. 
	 * @param value the passid - Attribute id
	 */
	public void setPassid(final Integer value)
	{
		setPassid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.passid</code> attribute. 
	 * @param value the passid - Attribute id
	 */
	public void setPassid(final SessionContext ctx, final int value)
	{
		setPassid( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Passenger.passid</code> attribute. 
	 * @param value the passid - Attribute id
	 */
	public void setPassid(final int value)
	{
		setPassid( getSession().getSessionContext(), value );
	}
	
}
