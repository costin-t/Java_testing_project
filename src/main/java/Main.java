public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.add(1, 5);
        System.out.println(sum);


    }
}

// Calculator for testing with Junit
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
}

class Login {
    public String age(int age) {
        if (age >= 18 && age <=120) {
            return "You are logged in.";
        }   else if (age> 120) {
            return "the value is not correct";
        }
        else {
            return "Sorry, you must be 18 or older to log in.";
        }
    }
}


class BubbleSort {
    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}




//Coverage // testing the bigger number.
class bignumber {
    public String bignumber_method(int nr1, int nr2, int nr3 ){
        if(nr1 >= nr2  && nr1 >= nr3) {
            return "Number 1 is the biggest";
        } else if ( nr2 >= nr3 && nr2 >= nr1) {
            return "Number 2 is the biggest";
        } else {
            return "Number 3 is the biggest";
        }
    }
}


//Acesta functie calculeaza suma totala care trebuie sa ii vina la final de luna unui angajat.
class salary_for_month {
    //baza reprezentant salariul de baza
    //dayworked reprezinta zilele lucrate de catre angajat
    //bonus se refera la diferitele bonusuri salariale
    public int salary(int baza, int daywork, int year_exp, int hours) {
        
        boolean partime = false;
        int bonus = 0;
        int salary = 0;

        if (hours < 8) {
            partime = true;
        }
        
        if (partime== true && daywork > 15) {
            bonus = bonus + 100;
        }
        if (partime == true && daywork > 30 && year_exp >= 1 ){
            bonus = bonus + 150;
        }
        
        if (partime == false) {
            for (int i = 0; i <year_exp; i++){
                bonus = bonus + 200;
            }
        }
        if (partime == false){
            if (daywork >= 15 && daywork <= 19){
                bonus = bonus + 500;
            }
            else if(daywork >= 20 && daywork < 25) {
                bonus = bonus + 600;
            } 
            else if(daywork >= 25){
                bonus = bonus + 900;
            }
        }
        salary = baza + bonus;
        return salary;
    }

}



class salary_for_month_mutant {
    //baza reprezentant salariul de baza
    //dayworked reprezinta zilele lucrate de catre angajat
    //bonus se refera la diferitele bonusuri salariale
    public int salary_mutant(int baza, int daywork, int year_exp, int hours) {

        boolean partime = false;
        int bonus = 0;
        int salary = 0;

        if (hours < 8) {
            partime = true;
        }

        if (partime== true && daywork > 15) {
            // from > to < | salary_mutant;
            bonus = bonus + 100;
        }
        if (partime == true && daywork >= 30 && year_exp >= 1 ){
            // from >= to > | salary_mutant2
            // from year_exp >= to == 1 | salary_mutant_live2();
            bonus = bonus + 150;
        }

        if (partime == false) {
            for (int i = 0; i <year_exp; i++){
                bonus = bonus + 200;
            }
        }
        if (partime == false){
            if (daywork >= 15 && daywork <= 19){
                // from >= to == | salary_mutant_live();
                bonus = bonus + 500;
            }
            else if(daywork >= 20 && daywork < 25) {
                bonus = bonus + 600;
            }
            else if(daywork >= 25){
                bonus = bonus + 900;
            }
        }
        salary = baza + bonus;
        return salary;
    }

}