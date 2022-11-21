#include <stdio.h>

int	main(void)
{
	int	a;
	int	b;
	int	c;
	int	d;
	int	result;

	scanf("%d %d %d %d", &a, &b, &c, &d);
	result = (a * b) - (c * d);
	printf("DIFERENCA = %d\n", result);
}
