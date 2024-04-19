// challenge link - https://judge.beecrowd.com/en/problems/view/1021 

#include <stdio.h>
#include <math.h>

int calculate_change(double value, int *units, char *unit_type, int unit_scale) {
	int i = 0;

	while (units[i] != -1) {
		int unit = 0.0;

		if (units[i] <= value) {
			unit = value / units[i];
			value = fmod(value, units[i]);
		}
		
		printf("%d %s(s) de R$ %.2lf\n", unit, unit_type, (units[i] * 1.0) / unit_scale);
		i++;
	}

	return value;
}

int main(void)
{
	int 	notes_units[] = { 100, 50, 20, 10, 5, 2, -1};
	int 	coins_units[] = { 100, 50, 25, 10, 5, 1, -1};
	int 	notes = 0;
	int 	coins = 0;
	double	value = 0;
	int 	total_cents = 0;

	scanf("%lf", &value);
	
	total_cents = (int)(value * 100);
	notes = total_cents / 100;
	coins = total_cents % 100;

	printf("NOTAS:\n");
	coins += calculate_change(notes, notes_units, "nota", 1) * 100;
	
	printf("MOEDAS:\n");
	calculate_change(coins, coins_units, "moeda", 100);

	return (0);
}
