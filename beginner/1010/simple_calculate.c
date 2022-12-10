/* ex 1010 - Simple Calculate
* input: two lines of input (p_id, p_value, p_quantity) two integers, and a floating value
* output: the total spent in double.
*/
#include <stdio.h>

struct s_product
{
	int		product_id;
	int		product_quantity;
	double	product_price;
};

int	main(void)
{
	struct s_product	product_1;
	struct s_product	product_2;
	double				total_spent;

	scanf("%d %d %lf", &product_1.product_id, &product_1.product_quantity,\
	   &product_1.product_price);
	scanf("%d %d %lf", &product_2.product_id, &product_2.product_quantity,\
	   &product_2.product_price);
	total_spent = (product_1.product_quantity * product_1.product_price);
	total_spent += (product_2.product_quantity * product_2.product_price);
	printf("VALOR A PAGAR: R$ %.2lf\n", total_spent);
}
