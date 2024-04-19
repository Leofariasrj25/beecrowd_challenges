// challenge link - https://judge.beecrowd.com/en/problems/view/1019

#include <stdio.h>

int main(void) {
	int total_seconds = 0;
	scanf("%d", &total_seconds);

	int units[] = {3600, 60}; // hours, minutes
	int num_of_units = 2;
	int unit = 0;
	int i = 0;
	
	while (i < num_of_units) {
		unit = total_seconds / units[i];
		total_seconds = total_seconds % units[i];
		printf("%d:", unit);
		i++;
	}

	printf("%d\n", total_seconds);
	return (0);
}
