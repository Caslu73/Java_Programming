package day07_ifStatements;

public class NetIncomeCalc {

    public static void main(String[] args) {

        int salary = 100000;
        boolean isMarried = true;
        double taxRate = 0; // Temporary value for tax rate


        if(salary >= 130000){ // if the salary is 130k or more, then the tax rate should be 35%
            taxRate = 0.35;
        }
        if (salary >= 100000 && salary < 130000){ // if the salary is between 100k to 130k(excluded) then the tax rate should be 30%
            taxRate = 0.30;
        }
        if ( salary >= 80000 && salary < 100000){
            taxRate = 0.25;
        }
        if ( salary < 80000){
            taxRate = 0.20;
        }
        if (isMarried){ // if the person is married
            taxRate -= 0.05; // tax is reduced by 5%
        }

        double totalTax = salary * taxRate;
        double netIncome = salary - totalTax;

        //double netIncome = salary * (1-taxRate);

        System.out.println( "salary is = " + salary);
        System.out.println( "netIncome = " + netIncome);
        System.out.println( "Total Tax is = " + totalTax);




    }
}
/*
Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition:
                	if the person is married, he/she will pay 5% less tax

 */
