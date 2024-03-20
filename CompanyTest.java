

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
/**
 * A classe de teste CompanyTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class CompanyTest
{
    User client1;
    User client2;
    User seller1;
    User seller2;
    Property property1;
    Property property2;
    Sell sell1;
    Sell sell2;
    Company company;
    /**
     * Construtor default para a classe de teste CompanyTest
     */
    public CompanyTest()
    {
    }

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
        this.client1 = new User("José Manuel", "911111111", "zemanel@yahoo.com");
        this.client2 = new User("António Francisco", "922222222", "tochico@hotmail.com");
        this.seller1 = new User("Fernando Fernandes", "966777101", "fefe@remax.pt");
        this.seller2 = new User("Rodrigo Rodrigues", "966777152", "roro@remax.pt");
        this.property1 = new Property("Teste", 10000.0);
        this.property2 = new Property("Teste2", 11000.0);
        this.company = new Company();
        this.sell1 = new Sell(this.client1, this.seller1, this.property1);
        this.sell2 = new Sell(this.client2, this.seller2, this.property2);
    }
    
    @Test
    public void testConstructor(){
        assertNotNull(this.company.getClients());
        assertNotNull(this.company.getSellers());
        assertNotNull(this.company.getProperties());
        assertNotNull(this.company.getSells());
    }
    
    @Test
    public void testRegisterClient(){
        assertTrue(this.company.registerClient(client1));
    }
    
    @Test
    public void testRegisterClients(){
        assertTrue(this.company.registerClient(client1));
        assertTrue(this.company.registerClient(client2));
    }
    
    @Test
    public void testRegisterClientDuplicate(){
        assertNotSame(this.company.registerClient(client1),this.company.registerClient(client1));
    }
    
    @Test
    public void testRegisterClientNull(){
        assertFalse(this.company.registerClient(null));
    }
    
    //Sellers
    @Test
    public void testRegisterSeller(){
        assertTrue(this.company.registerSeller(seller1));
    }
    
    @Test
    public void testRegisterSellers(){
        assertTrue(this.company.registerSeller(seller1));
        assertTrue(this.company.registerSeller(seller2));
    }
    
    @Test
    public void testRegisterSellerDuplicate(){
        assertNotSame(this.company.registerSeller(seller1),this.company.registerSeller(seller1));
    }
    
    @Test
    public void testRegisterSellerNull(){
        assertFalse(this.company.registerSeller(null));
    }
    
    //Property
    @Test
    public void testRegisterProperty(){
        assertTrue(this.company.registerProperty(property1));
    }
    
    @Test
    public void testRegisterProperties(){
        assertTrue(this.company.registerProperty(property1));
        assertTrue(this.company.registerProperty(property2));
    }
    
    @Test
    public void testRegisterPropertyDuplicate(){
        assertNotSame(this.company.registerProperty(property1),this.company.registerProperty(property1));
    }
    
    @Test
    public void testRegisterPropertyNull(){
        assertFalse(this.company.registerProperty(null));
    }
    
    //SELL
    @Test
    public void testCreateSell(){
        assertTrue(this.company.createSell(client1,seller1,property1));
    }
    
    @Test
    public void testCalculateSellsOfTheYear(){
        assertEquals(2,this.company.calculateSellsOfTheYear(2024));
    }

    /**
     * Desfaz a 'fixture' do teste.
     *
     * Chamado após cada método de teste de caso.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
