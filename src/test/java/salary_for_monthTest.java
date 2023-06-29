import org.junit.Test;

import static org.junit.Assert.*;

public class salary_for_monthTest {

    @Test
    public void daywork1() {
        salary_for_month s = new salary_for_month();
        int result = s.salary(2000, 1, 0, 8);
        assertEquals(2000, result);
    }
    @Test
    public void daywork14() {
        salary_for_month s = new salary_for_month();
        int result = s.salary(2000, 14, 0, 8);
        assertEquals(2000, result);
    }
    @Test
    public void daywork15() {
        salary_for_month s = new salary_for_month();
        int result = s.salary(2000, 15, 0, 8);
        assertEquals(2500, result);
    }
    @Test
    public void daywork16() {
        salary_for_month s = new salary_for_month();
        int result = s.salary(2000, 16, 0, 8);
        assertEquals(2500, result);
    }
    @Test
    public void daywork19() {
        salary_for_month s = new salary_for_month();
        int result = s.salary(2000, 19, 0, 8);
        assertEquals(2500, result);
    }
    @Test
    public void daywork20() {
        salary_for_month s = new salary_for_month();
        int result = s.salary(2000, 20, 0, 8);
        assertEquals(2600, result);
    }
    @Test
    public void daywork21() {
        salary_for_month s = new salary_for_month();
        int result = s.salary(2000, 21, 0, 8);
        assertEquals(2600, result);
    }
    @Test
    public void daywork29() {
        salary_for_month s = new salary_for_month();
        int result = s.salary(2000, 24, 0, 8);
        assertEquals(2600, result);
    }
    @Test
    public void daywork30() {
        salary_for_month s = new salary_for_month();
        int result = s.salary(2000, 25, 0, 8);
        assertEquals(2900, result);
    }
    @Test
    public void daywork31() {
        salary_for_month s = new salary_for_month();
        int result = s.salary(2000, 26, 0, 8);
        assertEquals(2900, result);
    }

    //Equivalence partitioning
    //In equivalence partitioning, each equivalence class represents a set of valid or invalid inputs that produce similar results.
    //    For the salary function provided, we can apply equivalence partitioning to the input parameters as follows:
    //    Baza: We can partition this input into two equivalence classes: baza >= 0 and baza < 0.
    //    Daywork: We can partition this input into three equivalence classes: daywork < 1, 1 <= daywork <= 30, and daywork > 30.
    //    Year_exp: We can partition this input into two equivalence classes: year_exp >= 0 and year_exp < 0.
    //    Hours: We can partition this input into two equivalence classes: hours < 8 and hours >= 8.

    @Test
    //Baza > 0
    public void bazabig() {
        salary_for_month s = new salary_for_month();
        int result = s.salary(5000, 0, 0, 8);
        assertEquals(5000, result);
    }

    @Test
    //Baza = 0
    public void bazazero() {
        salary_for_month s = new salary_for_month();
        int result = s.salary(0, 0, 0, 8);
        assertEquals(0, result);
    }

    @Test
    //Baza < 0 negative
    public void bazanegative() {
        salary_for_month s = new salary_for_month();
        int result = s.salary(-5, 0, 0, 8);
        assertEquals(-5, result);
    }

    //Daywork
    @Test
    public void daywork0() {
        salary_for_month s = new salary_for_month();
        int result = s.salary(200, -3, 0, 8);
        assertEquals(200, result);
    }
    @Test
    public void daywork30_equivalence() {
        salary_for_month s = new salary_for_month();
        int result = s.salary(200, 30, 0, 8);
        assertEquals(1100, result);
    }
    @Test
    public void daywork31_equivalence() {
        salary_for_month s = new salary_for_month();
        int result = s.salary(200, 40, 0, 8);
        assertEquals(1100, result);
    }
}