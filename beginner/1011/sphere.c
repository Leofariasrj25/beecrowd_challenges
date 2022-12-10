/* ex 1011 - sphere
* input: receive the radius of a circle (double)
* compute: the volume of a sphere
* output: VOLUME = xxxx.yy
*/
#include <stdio.h>

double	ft_pow(double base, int expoent)
{
	double	result;

	result = 1;
	if (expoent == 0)
		return (1);
	if (base == 0)
		return (0);
	while (expoent)
	{
		result = result * base;	
		expoent--;
	}
	return (result);
}

int	main(void)
{
	double			radius;
	const double	pi = 3.14159;
	double			sphere_volume;

	scanf("%lf", &radius);
	sphere_volume = (4 / 3.0) * pi * ft_pow(radius, 3);
	printf("VOLUME = %.3lf\n", sphere_volume);
}
