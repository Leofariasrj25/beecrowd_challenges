#include <stdio.h>

int	main(void)
{
	double	grade_1;
	double	grade_2;
	double	w1;
	double	w2;
	double	result;

	w1 = 3.5;
	w2 = 7.5;
	scanf("%lf %lf", &grade_1, &grade_2);
	result = ((grade_1 * w1) + (grade_2 * w2)) / (double)(w1 + w2);
	printf("MEDIA = %.5lf\n", result);
}
