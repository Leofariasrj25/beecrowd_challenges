#include <stdio.h>

double	get_circle_area(double c)
{
	const double		pi =  3.14159;

	return (c * c * pi);
}

double	get_triangle_rectangle(double a, double c)
{
	return ((a * c) / 2);
}

double	get_rectangle_area(double a, double b)
{
	return(a * b);
}

double	get_trapezium_area(double a, double b, double c)
{
	return (((a + b) * c) / 2);
}

double	get_square_area(double b)
{
	return (b * b);
}

int	main(void)
{
	double	a;
	double	b;
	double	c;

	scanf("%lf %lf %lf", &a, &b, &c);
	printf("TRIANGULO: %.3lf\n", get_triangle_rectangle(a, c));
	printf("CIRCULO: %.3lf\n", get_circle_area(c));
	printf("TRAPEZIO: %.3lf\n", get_trapezium_area(a, b, c));
	printf("QUADRADO: %.3lf\n", get_square_area(b));
	printf("RETANGULO: %.3lf\n", get_rectangle_area(a, b));
}
