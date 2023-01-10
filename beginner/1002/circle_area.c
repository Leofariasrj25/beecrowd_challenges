// challenge 1002
// objective: calculate the area of a circle
// input: a floating point. R
// output: the area of the circle in float (A=<value>)

#include <stdio.h>

int	main(void)
{
	const double	n = 3.14159;
	double			r;
	double			a;

	scanf("%lf", &r);
	a = n * (r * r);
	printf("A=%.4lf\n", a);
}
