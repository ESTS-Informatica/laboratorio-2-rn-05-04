
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

/**
 * Manage a company.
 *
 * @author POO
 * @version 03/2024
 */
public class Company {

    // Clients registry
    private ArrayList<User> clients;
    // Sellers registry
    private ArrayList<User> sellers;
    // Properties registry
    private ArrayList<Property> properties;
    // Sells registry
    private ArrayList<Sell> sells;

    /**
     * Constructor of class Company
     */
    public Company() {
        this.clients = new ArrayList<User>();
        this.sellers = new ArrayList<User>();
        this.properties = new ArrayList<Property>();
        this.sells = new ArrayList<Sell>();
    }

    /**
     * Get the list of clients.
     *
     * @return This company clients.
     */
    public List<User> getClients() {
        return this.clients;         // dummy implementation
    }

    /**
     * Get the list of sellers.
     *
     * @return This company sellers.
     */
    public List<User> getSellers() {
        return this.sellers;         // dummy implementation
    }

    /**
     * Get the list of properties.
     *
     * @return This company's properties.
     */
    public List<Property> getProperties() {
        return this.properties;         // dummy implementation
    }

    /**
     * Get the list of sells.
     *
     * @return This company sells.
     */
    public List<Sell> getSells() {
        return this.sells;         // dummy implementation
    }

    /**
     * Register a client.
     *
     * @param client to register. Must not be null. Must not be registered.
     * @return true If the registration succeeds, false otherwise.
     */
    public boolean registerClient(User client) {
        if(!clients.contains(client) && client != null){
            this.clients.add(client);
            return true;
        }
        else
            return false;
    }

    /**
     * Register a seller.
     *
     * @param seller to register. Must not be null. Must not be registered.
     * @return true If the registration succeeds, false otherwise.
     */
    public boolean registerSeller(User seller) {
        if(!sellers.contains(seller) && seller != null){
            this.sellers.add(seller);
            return true;
        }
        else
            return false;
    }

    /**
     * Register a property.
     *
     * @param property to register. Must not be null. Must not be registered.
     * @return true If the registration succeeds, false otherwise.
     */
    public boolean registerProperty(Property property) {
        if(!properties.contains(property) && property != null){
            this.properties.add(property);
            return true;
        }
        else
            return false;
    }

    /**
     * Register a sell.
     *
     * @param sell to register. Must not be null. Must not be registered.
     * @return true If the registration succeeds, false otherwise.
     */
    public boolean registerSell(Sell sell) {
        return true;         // dummy implementation
    }

    /**
     * Generate a new sell and register that sell.
     *
     * @param client Must be already registered.
     * @param seller Must be already registered.
     * @param property Must be already registered.
     * @return true If the request succeeds, false otherwise.
     */
    public boolean createSell(User client, User seller, Property property) {
        if(!sells.contains(new Sell(client, seller, property)) && client != null && seller != null && property != null){
            this.sells.add(new Sell(client,seller,property));
            return true;
        }
        else
            return false;     
    }

    /**
     * Calculates the total number of sells within the provided year.
     *
     * @param year
     * @return The total number of sells in the year.
     */
    public int calculateSellsOfTheYear(int year) {
        
        int contador = 0;
        for (Sell sell : sells){
            if (sell.getDate().getYear() + 1900 == year){
                contador ++;
            }
        }
        return contador;         // dummy implementation
    }

    /**
     * Find the seller with more sells within the provided year.
     *
     * @param year
     * @return The name of the seller of the year.
     */
    public String findSellerOfTheYear(int year) {
        ArrayList<User> sellersWhoSold = new ArrayList<User>();
        for (Sell sell : sells){
            sellersWhoSold.add(sell.getSeller());
        }
        return null;         // dummy implementation
    }

}
