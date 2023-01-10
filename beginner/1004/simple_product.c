// challenge 1004
// objective: read two integers and print the product
// input: two integers
// output: PROD = <result>

#include <stdio.h>

int	main(void)
{
	int	num_a;
	int	num_b;
	int	product;

	scanf("%d %d", &num_a, &num_b);
	product = num_a * num_b;
	printf("PROD = %d\n", product);
	return (0);
}
