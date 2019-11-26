/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 26-nov-2019 23.04.48                        ---
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
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link it.uiip.airport.core.jalo.Airplane Plane}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAirplane extends GenericItem
{
	/** Qualifier of the <code>Plane.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Plane.nPassengers</code> attribute **/
	public static final String NPASSENGERS = "nPassengers";
	/** Qualifier of the <code>Plane.nGoods</code> attribute **/
	public static final String NGOODS = "nGoods";
	/** Qualifier of the <code>Plane.planes</code> attribute **/
	public static final String PLANES = "planes";
	/**
	* {@link OneToManyHandler} for handling 1:n PLANES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Flight> PLANESHANDLER = new OneToManyHandler<Flight>(
	AirportCoreConstants.TC.FLIGHT,
	false,
	"plane",
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
		tmp.put(NPASSENGERS, AttributeMode.INITIAL);
		tmp.put(NGOODS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Plane.code</code> attribute.
	 * @return the code - primary key of table plane
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Plane.code</code> attribute.
	 * @return the code - primary key of table plane
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Plane.code</code> attribute. 
	 * @param value the code - primary key of table plane
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Plane.code</code> attribute. 
	 * @param value the code - primary key of table plane
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Plane.nGoods</code> attribute.
	 * @return the nGoods - Attribute number of goods
	 */
	public Integer getNGoods(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NGOODS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Plane.nGoods</code> attribute.
	 * @return the nGoods - Attribute number of goods
	 */
	public Integer getNGoods()
	{
		return getNGoods( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Plane.nGoods</code> attribute. 
	 * @return the nGoods - Attribute number of goods
	 */
	public int getNGoodsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNGoods( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Plane.nGoods</code> attribute. 
	 * @return the nGoods - Attribute number of goods
	 */
	public int getNGoodsAsPrimitive()
	{
		return getNGoodsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Plane.nGoods</code> attribute. 
	 * @param value the nGoods - Attribute number of goods
	 */
	public void setNGoods(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NGOODS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Plane.nGoods</code> attribute. 
	 * @param value the nGoods - Attribute number of goods
	 */
	public void setNGoods(final Integer value)
	{
		setNGoods( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Plane.nGoods</code> attribute. 
	 * @param value the nGoods - Attribute number of goods
	 */
	public void setNGoods(final SessionContext ctx, final int value)
	{
		setNGoods( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Plane.nGoods</code> attribute. 
	 * @param value the nGoods - Attribute number of goods
	 */
	public void setNGoods(final int value)
	{
		setNGoods( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Plane.nPassengers</code> attribute.
	 * @return the nPassengers - Attribute number of passengers
	 */
	public Integer getNPassengers(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NPASSENGERS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Plane.nPassengers</code> attribute.
	 * @return the nPassengers - Attribute number of passengers
	 */
	public Integer getNPassengers()
	{
		return getNPassengers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Plane.nPassengers</code> attribute. 
	 * @return the nPassengers - Attribute number of passengers
	 */
	public int getNPassengersAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNPassengers( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Plane.nPassengers</code> attribute. 
	 * @return the nPassengers - Attribute number of passengers
	 */
	public int getNPassengersAsPrimitive()
	{
		return getNPassengersAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Plane.nPassengers</code> attribute. 
	 * @param value the nPassengers - Attribute number of passengers
	 */
	public void setNPassengers(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NPASSENGERS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Plane.nPassengers</code> attribute. 
	 * @param value the nPassengers - Attribute number of passengers
	 */
	public void setNPassengers(final Integer value)
	{
		setNPassengers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Plane.nPassengers</code> attribute. 
	 * @param value the nPassengers - Attribute number of passengers
	 */
	public void setNPassengers(final SessionContext ctx, final int value)
	{
		setNPassengers( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Plane.nPassengers</code> attribute. 
	 * @param value the nPassengers - Attribute number of passengers
	 */
	public void setNPassengers(final int value)
	{
		setNPassengers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Plane.planes</code> attribute.
	 * @return the planes
	 */
	public Collection<Flight> getPlanes(final SessionContext ctx)
	{
		return PLANESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Plane.planes</code> attribute.
	 * @return the planes
	 */
	public Collection<Flight> getPlanes()
	{
		return getPlanes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Plane.planes</code> attribute. 
	 * @param value the planes
	 */
	public void setPlanes(final SessionContext ctx, final Collection<Flight> value)
	{
		PLANESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Plane.planes</code> attribute. 
	 * @param value the planes
	 */
	public void setPlanes(final Collection<Flight> value)
	{
		setPlanes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to planes. 
	 * @param value the item to add to planes
	 */
	public void addToPlanes(final SessionContext ctx, final Flight value)
	{
		PLANESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to planes. 
	 * @param value the item to add to planes
	 */
	public void addToPlanes(final Flight value)
	{
		addToPlanes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from planes. 
	 * @param value the item to remove from planes
	 */
	public void removeFromPlanes(final SessionContext ctx, final Flight value)
	{
		PLANESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from planes. 
	 * @param value the item to remove from planes
	 */
	public void removeFromPlanes(final Flight value)
	{
		removeFromPlanes( getSession().getSessionContext(), value );
	}
	
}
