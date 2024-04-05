// challenge link - https://judge.beecrowd.com/en/problems/view/1017

#include <stdio.h>

int main(void) {
	int traveltime; // hours
	int avgspeed; // km/h
	scanf("%d %d", &traveltime, &avgspeed);

	int distance = traveltime * avgspeed;
	double fuel_consumption = 12.0; // km/h
	double min_fuel = distance / fuel_consumption;
	printf("%.3lf\n", min_fuel);
}
