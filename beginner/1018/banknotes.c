// challenge link - https://judge.beecrowd.com/en/problems/view/1018

#include <stdio.h>

int main(void) {
	int value = 0;
	scanf("%d", &value);

	int bank_notes[] = {100, 50, 20, 10, 5, 2, 1};
	int amount_of_notes = 7;
	int used = 0;
	int i = 0;

	printf("%d\n", value);

	while (i < amount_of_notes) {
		if (bank_notes[i] <= value) {
			used++;
			value -= bank_notes[i];
		} else {
			printf("%d notas(s) de R$ %d,00\n", used, bank_notes[i]);
			used = 0;
			i++;
		}
	}
}
