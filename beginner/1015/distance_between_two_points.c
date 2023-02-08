// receive two lines of input
// each line of input will be composed of two doubles representing x and y
// convert each pair to doubles.
// calculate the distance between those two points

#include <stdio.h>
#include <math.h>

int	main(void)
{
	double	x1;
	double	x2;
	double	y1;
	double	y2;
	double	result;

	scanf("%lf %lf", &x1, &y1);
	scanf("%lf %lf", &x2, &y2);
	result = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
	result = sqrt(result);
	printf("%.4lf\n", result);
}
