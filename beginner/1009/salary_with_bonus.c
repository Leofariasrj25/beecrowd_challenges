/* challenge 1009 - Salary with bonus
* input: read a string (seller's name), the workers fixed salary(double) and how much he sold (double)
* ouput: calculate how much is his final salary considering he receives 15% of the total he sold
* */

#include <stdio.h>

int	main(void)
{
	char	seller_name[256];
	double	seller_fixed_salary;
	double	seller_total_sales;
	double	seller_salary_bonus;

	scanf("%s", seller_name);
	scanf("%lf", &seller_fixed_salary);
	scanf("%lf", &seller_total_sales);
	seller_salary_bonus = ((double) 15 / 100) * seller_total_sales;
	seller_salary_bonus += seller_fixed_salary;
	printf("TOTAL = R$ %.2lf\n", seller_salary_bonus);
}
