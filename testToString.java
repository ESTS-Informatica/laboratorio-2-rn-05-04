

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste testToString.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class testToString
{
    /**
     * Construtor default para a classe de teste testToString
     */
    public testToString()
    {
        
    }
    @Test
    public void testToStringConstructor(){
        Property property1 = new Property ("T3 Monte Belo", 150000.0);
        assertEquals("Descricao   :T3 Monte Belo\n" + "Preco   :150000.0 Euros", property1.toString());
    }

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
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
