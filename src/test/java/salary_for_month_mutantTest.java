import org.junit.Test;

import static org.junit.Assert.*;

public class salary_for_month_mutantTest {

    @Test
    public void salary_mutant() {

        salary_for_month_mutant s = new salary_for_month_mutant();
        int result = s.salary_mutant(2000, 31, 1, 7);
        assertEquals(2000, result);

        //  2100  ---- mutant  >=  2250
        // Mutant have been killed by the test
    }

    @Test
    public void salary_mutant2(){
        salary_for_month_mutant s = new salary_for_month_mutant();
        int result = s.salary_mutant(2000, 30, 1, 7);
        assertEquals(2250, result);
        // 2250 -- mutant actual 2100
        //Mutant have been kileld by the test
    }

    @Test
    public void salary_mutant_live(){
        salary_for_month_mutant s = new salary_for_month_mutant();
        int result = s.salary_mutant(2000, 15, 0, 9);
        assertEquals(2500, result);
        // 2500
        //Mutant survive
    }

    @Test
    public void salary_mutant_live2(){
        salary_for_month_mutant s = new salary_for_month_mutant();
        int result = s.salary_mutant(2000, 30, 1, 9);
        assertEquals(3100, result);
        // 2500
        //Mutant survive
    }
}