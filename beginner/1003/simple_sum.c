// challenge: 1003
// objective: read two integers and outputt the sum of these values.
// input: two integers
// output: SOMA = <result>

#include <stdio.h>

int	main(void)
{
	int	num_a;
	int	num_b;
	int	sum;

	scanf("%d %d", &num_a, &num_b);
	sum = num_a + num_b;
	printf("SOMA = %d\n", sum);
	return (0);
}
