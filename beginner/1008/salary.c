#include <stdio.h>

int	main(void)
{
	int		worker_id;
	int		worker_hours;
	double	worker_hour_rate;
	double	worker_salary;

	scanf("%d %d %lf", &worker_id, &worker_hours, &worker_hour_rate);
	worker_salary = worker_hours * worker_hour_rate;
	printf("NUMBER = %d\n", worker_id);
	printf("SALARY = U$ %.2lf\n", worker_salary);
}
