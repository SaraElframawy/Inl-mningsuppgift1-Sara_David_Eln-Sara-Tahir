

import io.qase.api.annotation.QaseTitle;
import io.qase.api.annotation.Step;
import org.example.Main;
import org.example.Operations;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Random;
import java.util.Scanner;

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
    @Step("add random number")
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
    @QaseTitle("add big value as integer {x} and {y}")
    public void addBig(int x,int y){
        x = 222222222;
        y = 23;
        assertEquals(222222245,operations.add(x,y));
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
        assertThrows(ArithmeticException.class, ()-> operations.divide(x,y) );

    }

    @Test
    @QaseTitle("to have a letter instead of operation")
    public void Letter_instead_operation(){
        String input = "+-*/";
        Scanner scanner = new Scanner(input);

        char result = Main.getOperation(scanner,input.charAt(2));

        assertEquals('/', result);
    }



    }


