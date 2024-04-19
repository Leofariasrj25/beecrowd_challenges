// challenge link - 

#include <stdio.h>

int main(void) 
{
	int intervals[] = { 0, 25, 50, 75, 100 };
	int intervals_size = 5;
	double value = 0;

	scanf("%lf", &value);
	
	int start = intervals[0];
	int end = intervals[intervals_size -1];

	if (value < start || value > end) {
		printf("Fora de intervalo\n");
		return (0);
	}

	end = intervals[1];

	if (value >= start && value <= end) {
		printf("Interval [%d,%d]\n", start, end);
		return (0);
	}

	for (int i = 1, j = 2; j < intervals_size; i++, j++) {
		start = intervals[i];
		end = intervals[j];

		if (value > start && value <= end) {
			printf("Interval (%d,%d]\n", start, end);
			break;
		}
	}

	return (0);
}
