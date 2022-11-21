#include <stdio.h>

int	main(void)
{
	double	weights[3];
	double	grades[3];
	double	grades_w;
	double	weight_sum;
	double	result;

	weights[0] = 2;
	weights[1] = 3;
	weights[2] = 5;
	scanf("%lf %lf %lf", &grades[0], &grades[1], &grades[2]);
	grades_w = grades[0] * weights[0] \
		+ grades[1] * weights[1] + grades[2] * weights[2];
	weight_sum = weights[0] + weights[1] + weights[2];
	result = grades_w / (double)weight_sum;
	printf("MEDIA = %.1lf\n", result);
	return (0);
}
