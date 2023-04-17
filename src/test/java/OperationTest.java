

import io.qase.api.annotation.QaseTitle;
import org.example.Operations;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

class OperationTest {
    Random random = new Random();

   int tempValue1;
    int tempValue2;
    int tempResult;

    Operations operations;

    @BeforeEach
    public void setUp(){
        operations = new Operations();
    }




    @Test
    @QaseTitle("add")
    public void add() {

        assertEquals(4, operations.add(2, 2));
        for (int i = 1; i < 5; i++) {
            tempValue1 = random.nextInt(10);
            tempValue2 = random.nextInt(10);
            tempResult = tempValue1 + tempValue2;
            assertEquals(tempResult, operations.add(tempValue1, tempValue2));
        }




    }

    @Test
    @QaseTitle("sub_witValue")
    public void sub() {
        assertEquals(4, operations.sub(8, 4));

    }

    @Test
    @QaseTitle("multi")
    public void multi() {
        assertEquals(4, operations.multi(2, 2));
    }

    @Test
    @QaseTitle("divide")
    public void divide() {
        assertEquals(5, operations.divide(10, 2));
    }
    @Test
    @QaseTitle("divide_by_zero")
    public void Divide_by_zero(){
        int x =10;
        int y =0;
      //  int result = Operations.divide(x,y);

      //  assertEquals("you can't dibid with zero",ArithmeticException.class);
        assertThrows(ArithmeticException.class, ()-> operations.divide(x,y) );

    }
        //when


    }


