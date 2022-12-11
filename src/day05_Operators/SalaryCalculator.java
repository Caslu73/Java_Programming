package day05_Operators;

public class SalaryCalculator {

    public static void main(String[] args) {

        // THIS IS THE WAY TO CALCULATE A SALARY. GOD HELP ME HAHAHAHAH

        double hourlyRate = 55,
                weeklyHours = 45;
        double stateTaxRate = 7; // Implicit casting
        double federalTaxRate = 24.5;

        //-----------------------------------------------------------

        double salaryBeforeTax = hourlyRate * weeklyHours  * 52; // TO GET salaryBeforeTax

        double stateTax = salaryBeforeTax * stateTaxRate / 100; // TO GET THE StateTax

        double federalTax = salaryBeforeTax * federalTaxRate / 100; // TO GET FederalTax

        double totalTax = stateTax + federalTax;

        double salaryAfterTax = salaryBeforeTax - totalTax;


        System.out.println("Gross pay is: $" + salaryBeforeTax);
        System.out.println("Federal Tax is: $" + federalTax);
        System.out.println("State Tax is: $" + stateTax);
        System.out.println("Total Tax is: $" + totalTax);
        System.out.println("Net income is: $" + salaryAfterTax);


        System.out.println("----------------------------------------------------------");

        System.out.println("Gross pay is: $" + salaryBeforeTax +
                "\nFederal tax is: $" + federalTax +
                "\nState Tax is: $" + stateTax +
                "\nTotal Tax is $" + totalTax +
                "\nNet income is: $" + salaryAfterTax);





    }
        }
/*
1.1declare the following variables:
					hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

			1.2 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax
				Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52

			1.3 use print statement to print each of the above
					Ex:	   hourlyRate = $55
						   weeklyHours = 45
						   stateTaxRate = 7 (given as percentage, you need to convert to decimal)
						   federalTaxRate = 26 (given as percentage, you need to convert to decimal)

					    output:
					    	Gross pay is: $117000
					    	Federal tax is: $30420
				    		State tax is: $7020
				    		Total tax is: $37440
				    		Net income is: 79560
 */