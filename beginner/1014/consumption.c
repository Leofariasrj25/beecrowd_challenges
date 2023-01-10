#include <stdio.h>

int	main(void)
{
	int		kilometers;
	float	total_fuel_spent;
	float	consumption_rate;

	scanf("%d %f", &kilometers, &total_fuel_spent);
	consumption_rate = (float) kilometers / total_fuel_spent;	
	printf("%.3f km/l\n", consumption_rate);
}

