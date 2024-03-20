

/**
 * A property to sell.
 *
 * @author POO
 * @version 03/2024
 */
public class Property {

    private static int numberOfProperties = 0;
    private final String id;
    private String description;
    private double price;

    /**
     * Constructor of class Property
     *
     * @param description The property description.
     * @param price The property price.
     */
    public Property(String description, double price) {
        this.id = Integer.toString(++numberOfProperties); 
        this.description = description;
        this.price = price;
    }

    /**
     * Id selector.
     */
    public String getId() {
        return "";
    }

    /**
     * Description selector.
     */
    public String getDescription() {
        return "";
    }

    /**
     * Description modifier.
     * 
     * @param description The new description. Must not be null.
     */
    public void setDescription(String description) {
    
    }

    /**
     * Price selector.
     */
    public double getPrice() {
        return -1.0;    
    }
    
    /**
     * Price modifier.
     * 
     * @param price The new price. Must not be negative.
     */
    public void setPrice(double price) {

    }

    @Override
    public String toString() {
    return "Descricao   :" + this.description + "\n" + "Preco   :" + this.price + " Euros";
    }
}
