package cascading.legstar.cobolcopybook.beans.bean16.bind;

import cascading.legstar.cobolcopybook.beans.bean16.Kcp18V05AccLongName;
import cascading.legstar.cobolcopybook.beans.bean16.Kcp18V05LongNameData;
import cascading.legstar.cobolcopybook.beans.bean16.ObjectFactory;
import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.common.CComplexBinding;
import com.legstar.coxb.host.HostException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * LegStar Binding for Complex element :
 * Kcp18V05AccLongName.
 * <p/>
 * This class was generated by LegStar Binding generator.
 */
public class Kcp18V05AccLongNameBinding
  extends CComplexBinding
  {

  /** Maximum host bytes size for this complex object. */
  private static final int BYTE_LENGTH = 1782;
  /** Static reference to Value object factory to be used as default. */
  private static final ObjectFactory JF = new ObjectFactory();
  /**
   * Current Value object factory (Defaults to the static one but can be
   * changed).
   */
  private ObjectFactory mValueObjectFactory = JF;
  /** Logger. */
  private final Log _log = LogFactory.getLog( getClass() );
  /** Child bound to value object property Kcp18V05LongNameData(Kcp18V05LongNameData). */
  public ICobolComplexBinding _kcp18V05LongNameData;
  /** Value object to which this cobol complex element is bound. */
  private Kcp18V05AccLongName mValueObject;
  /**
   * Indicates that the associated Value object just came from the constructor
   * and doesn't need to be recreated.
   */
  private boolean mUnusedValueObject = false;

  /**
   * Constructor for a root Complex element without a bound Value object.
   */
  public Kcp18V05AccLongNameBinding()
    {
    this( null );
    }

  /**
   * Constructor for a root Complex element with a bound Value object.
   *
   * @param valueObject the concrete Value object instance bound to this
   *                    complex element
   */
  public Kcp18V05AccLongNameBinding(
    final Kcp18V05AccLongName valueObject )
    {
    this( "", "", null, valueObject );
    }

  /**
   * Constructor for a Complex element as a child of another element and
   * an associated Value object.
   *
   * @param bindingName   the identifier for this binding
   * @param fieldName     field name in parent Value object
   * @param valueObject   the concrete Value object instance bound to this
   *                      complex element
   * @param parentBinding a reference to the parent binding
   */
  public Kcp18V05AccLongNameBinding(
    final String bindingName,
    final String fieldName,
    final ICobolComplexBinding parentBinding,
    final Kcp18V05AccLongName valueObject )
    {

    super( bindingName, fieldName, Kcp18V05AccLongName.class, null, parentBinding );
    mValueObject = valueObject;
    if( mValueObject != null )
      {
      mUnusedValueObject = true;
      }
    initChildren();
    setByteLength( BYTE_LENGTH );
    }

  /** Creates a binding property for each child. */
  private void initChildren()
    {
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Initializing started" );
      }
        /* Create binding children instances */

    _kcp18V05LongNameData = new Kcp18V05LongNameDataBinding( "Kcp18V05LongNameData",
      "Kcp18V05LongNameData", this, null );
    _kcp18V05LongNameData.setCobolName( "KCP18V05-LONG-NAME-DATA" );
    _kcp18V05LongNameData.setByteLength( 1782 );

        /* Add children to children list */
    getChildrenList().add( _kcp18V05LongNameData );

    if( _log.isDebugEnabled() )
      {
      _log.debug( "Initializing successful" );
      }
    }

  /** {@inheritDoc} */
  public void createValueObject() throws HostException
    {
        /* Since this complex binding has a constructor that takes a
         * Value object, we might already have a Value object that
         * was not used yet. */
    if( mUnusedValueObject && mValueObject != null )
      {
      mUnusedValueObject = false;
      return;
      }
    mValueObject = mValueObjectFactory.createKcp18V05AccLongName();
    }

  /** {@inheritDoc} */
  public void setChildrenValues() throws HostException
    {

         /* Make sure there is an associated Value object*/
    if( mValueObject == null )
      {
      createValueObject();
      }
        /* Get Value object property _kcp18V05LongNameData */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property "
        + "_kcp18V05LongNameData"
        + " value=" + mValueObject.getKcp18V05LongNameData() );
      }
    _kcp18V05LongNameData.setObjectValue( mValueObject.getKcp18V05LongNameData() );
    }

  /** {@inheritDoc} */
  public void setPropertyValue( final int index ) throws HostException
    {

    ICobolBinding child = getChildrenList().get( index );

       /* Children that are not bound to a value object are ignored.
        * This includes Choices and dynamically generated counters
        * for instance.  */
    if( !child.isBound() )
      {
      return;
      }

        /* Set the Value object property value from binding object */
    Object bindingValue = null;
    switch( index )
      {
      case 0:
        bindingValue = child.getObjectValue( Kcp18V05LongNameData.class );
        mValueObject.setKcp18V05LongNameData( (Kcp18V05LongNameData) bindingValue );
        break;
      default:
        break;
      }
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Setting value of Value object property "
        + child.getJaxbName()
        + " value=" + bindingValue );
      }
    }

  /** {@inheritDoc} */
  public Object getObjectValue(
    final Class<?> type ) throws HostException
    {
    if( type.equals( Kcp18V05AccLongName.class ) )
      {
      return mValueObject;
      }
    else
      {
      throw new HostException( "Attempt to get binding " + getBindingName()
        + " as an incompatible type " + type );
      }
    }

  /** {@inheritDoc} */
  public void setObjectValue(
    final Object bindingValue ) throws HostException
    {
    if( bindingValue == null )
      {
      mValueObject = null;
      return;
      }
    if( bindingValue.getClass().equals( Kcp18V05AccLongName.class ) )
      {
      mValueObject = (Kcp18V05AccLongName) bindingValue;
      }
    else
      {
      throw new HostException( "Attempt to set binding " + getBindingName()
        + " from an incompatible value " + bindingValue );
      }
    }

  /**
   * @return the java object factory for objects creation
   */
  public ObjectFactory getObjectFactory()
    {
    return mValueObjectFactory;
    }

  /**
   * @param valueObjectFactory the java object factory for objects creation
   */
  public void setObjectFactory( final Object valueObjectFactory )
    {
    mValueObjectFactory = (ObjectFactory) valueObjectFactory;
    }

  /** {@inheritDoc} */
  public boolean isSet()
    {
    return ( mValueObject != null );
    }

  /**
   * @return the bound Value object
   */
  public Kcp18V05AccLongName getKcp18V05AccLongName()
    {
    return mValueObject;
    }

  /**
   * The COBOL complex element maximum length in bytes.
   *
   * @return COBOL complex element maximum length in bytes
   */
  public int getByteLength()
    {
    return BYTE_LENGTH;
    }
  }
