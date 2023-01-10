#include <stdio.h>

int	abs_(int n)
{
	if (n < 0)
		return (n * -1);
	else
		return (n);
}

int	greatest(int a, int b)
{
	int gt;

	gt = (a + b + abs_(a - b));
	return (gt / 2);
}

int	main(void)
{
	int num_a;
	int	num_b;
	int	num_c;
	int	greater;

	scanf("%d %d %d", &num_a, &num_b, &num_c);
	greater = greatest(num_a, num_b);	
	greater = greatest(greater, num_c);
	printf("%d eh o maior\n", greater);
}
