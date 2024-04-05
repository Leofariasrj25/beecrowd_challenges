#include <stdio.h>

int ft_abs(int num) {
	if (num < 0)
		return num * -1;
	else
		return num;
}

int main(void) {
	int x_speed = 60; // km/h
	int y_speed = 90; // km/h
	int distance_rate = 60 / ft_abs(x_speed - y_speed);

	int distance = 0;
	scanf("%d", &distance);

	int time_required = distance_rate * distance;
	printf("%d minutos\n", time_required);
}
