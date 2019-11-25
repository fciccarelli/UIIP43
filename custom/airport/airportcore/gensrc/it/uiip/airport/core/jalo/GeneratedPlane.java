/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 25-nov-2019 23.11.52                        ---
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
 * Generated class for type {@link it.uiip.airport.core.jalo.Plane Plane}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPlane extends GenericItem
{
	/** Qualifier of the <code>Plane.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Plane.nPassengers</code> attribute **/
	public static final String NPASSENGERS = "nPassengers";
	/** Qualifier of the <code>Plane.nGoods</code> attribute **/
	public static final String NGOODS = "nGoods";
	/** Qualifier of the <code>Plane.codePlanes</code> attribute **/
	public static final String CODEPLANES = "codePlanes";
	/**
	* {@link OneToManyHandler} for handling 1:n CODEPLANES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Flight> CODEPLANESHANDLER = new OneToManyHandler<Flight>(
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
	 * @return the code - Type of the plane, PK
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Plane.code</code> attribute.
	 * @return the code - Type of the plane, PK
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Plane.codePlanes</code> attribute.
	 * @return the codePlanes
	 */
	public Collection<Flight> getCodePlanes(final SessionContext ctx)
	{
		return CODEPLANESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Plane.codePlanes</code> attribute.
	 * @return the codePlanes
	 */
	public Collection<Flight> getCodePlanes()
	{
		return getCodePlanes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Plane.codePlanes</code> attribute. 
	 * @param value the codePlanes
	 */
	public void setCodePlanes(final SessionContext ctx, final Collection<Flight> value)
	{
		CODEPLANESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Plane.codePlanes</code> attribute. 
	 * @param value the codePlanes
	 */
	public void setCodePlanes(final Collection<Flight> value)
	{
		setCodePlanes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to codePlanes. 
	 * @param value the item to add to codePlanes
	 */
	public void addToCodePlanes(final SessionContext ctx, final Flight value)
	{
		CODEPLANESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to codePlanes. 
	 * @param value the item to add to codePlanes
	 */
	public void addToCodePlanes(final Flight value)
	{
		addToCodePlanes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from codePlanes. 
	 * @param value the item to remove from codePlanes
	 */
	public void removeFromCodePlanes(final SessionContext ctx, final Flight value)
	{
		CODEPLANESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from codePlanes. 
	 * @param value the item to remove from codePlanes
	 */
	public void removeFromCodePlanes(final Flight value)
	{
		removeFromCodePlanes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Plane.nGoods</code> attribute.
	 * @return the nGoods - Goods capacity of the plane
	 */
	public Integer getNGoods(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NGOODS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Plane.nGoods</code> attribute.
	 * @return the nGoods - Goods capacity of the plane
	 */
	public Integer getNGoods()
	{
		return getNGoods( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Plane.nGoods</code> attribute. 
	 * @return the nGoods - Goods capacity of the plane
	 */
	public int getNGoodsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNGoods( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Plane.nGoods</code> attribute. 
	 * @return the nGoods - Goods capacity of the plane
	 */
	public int getNGoodsAsPrimitive()
	{
		return getNGoodsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Plane.nGoods</code> attribute. 
	 * @param value the nGoods - Goods capacity of the plane
	 */
	public void setNGoods(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NGOODS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Plane.nGoods</code> attribute. 
	 * @param value the nGoods - Goods capacity of the plane
	 */
	public void setNGoods(final Integer value)
	{
		setNGoods( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Plane.nGoods</code> attribute. 
	 * @param value the nGoods - Goods capacity of the plane
	 */
	public void setNGoods(final SessionContext ctx, final int value)
	{
		setNGoods( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Plane.nGoods</code> attribute. 
	 * @param value the nGoods - Goods capacity of the plane
	 */
	public void setNGoods(final int value)
	{
		setNGoods( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Plane.nPassengers</code> attribute.
	 * @return the nPassengers - Passengers capacity of the plane
	 */
	public Integer getNPassengers(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NPASSENGERS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Plane.nPassengers</code> attribute.
	 * @return the nPassengers - Passengers capacity of the plane
	 */
	public Integer getNPassengers()
	{
		return getNPassengers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Plane.nPassengers</code> attribute. 
	 * @return the nPassengers - Passengers capacity of the plane
	 */
	public int getNPassengersAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNPassengers( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Plane.nPassengers</code> attribute. 
	 * @return the nPassengers - Passengers capacity of the plane
	 */
	public int getNPassengersAsPrimitive()
	{
		return getNPassengersAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Plane.nPassengers</code> attribute. 
	 * @param value the nPassengers - Passengers capacity of the plane
	 */
	public void setNPassengers(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NPASSENGERS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Plane.nPassengers</code> attribute. 
	 * @param value the nPassengers - Passengers capacity of the plane
	 */
	public void setNPassengers(final Integer value)
	{
		setNPassengers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Plane.nPassengers</code> attribute. 
	 * @param value the nPassengers - Passengers capacity of the plane
	 */
	public void setNPassengers(final SessionContext ctx, final int value)
	{
		setNPassengers( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Plane.nPassengers</code> attribute. 
	 * @param value the nPassengers - Passengers capacity of the plane
	 */
	public void setNPassengers(final int value)
	{
		setNPassengers( getSession().getSessionContext(), value );
	}
	
}
