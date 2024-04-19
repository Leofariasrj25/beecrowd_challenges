// challenge link - https://judge.beecrowd.com/en/problems/view/1020

#include <stdio.h>

int main(void) {
	int	days;
	int 	years;
	int 	months;

	scanf("%d", &days);

	years = days / 365;
	days = days % 365;
	months = days / 30;
	days = days % 30;

	printf("%d ano(s)\n", years);
	printf("%d mes(es)\n", months);
	printf("%d dia(s)\n", days);
	return (0);
}
