
package number_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for powerOfTwoRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="powerOfTwoRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="low" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="high" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "powerOfTwoRange", propOrder = {
    "low",
    "high"
})
public class PowerOfTwoRange {

    protected int low;
    protected int high;

    /**
     * Gets the value of the low property.
     * 
     */
    public int getLow() {
        return low;
    }

    /**
     * Sets the value of the low property.
     * 
     */
    public void setLow(int value) {
        this.low = value;
    }

    /**
     * Gets the value of the high property.
     * 
     */
    public int getHigh() {
        return high;
    }

    /**
     * Sets the value of the high property.
     * 
     */
    public void setHigh(int value) {
        this.high = value;
    }

}
