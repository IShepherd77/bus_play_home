import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person1;
    private Person person2;
    private Person person3;


    @Before
    public void before(){
        bus = new Bus("Edinburgh", 3);
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void checkCapacity(){
        assertEquals(3, bus.getCapacity());
    }

    @Test
    public void canAddPerson(){
        bus.addPerson(person1);
        assertEquals(1, bus.passengerCount());
    }

   @Test
    public void canRemovePerson(){
        bus.addPerson(person1);
        bus.addPerson(person2);
        bus.addPerson(person3);
        assertEquals(3, bus.passengerCount());
        bus.removePerson();
        assertEquals(2, bus.passengerCount());
   }

   

}
