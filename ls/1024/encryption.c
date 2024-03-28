#include <stdio.h> // printf, fgets
#include <ctype.h> // isalpha
#include <stdlib.h> // atoi

int main() {
	char 	msg[1001];
	int 	test_qtty;

	fgets(msg, 1001, stdin);
	test_qtty = atoi(msg);

	while (test_qtty--) {
		fgets(msg, 1001, stdin);
		int len = 0;

		while (msg[len] != '\0' && msg[len] != '\n') {

			if (isalpha(msg[len])) {
				msg[len] = msg[len] + 3;
			}

			len++;	
		}

		msg[len] = '\0';
		int i = 0;

		while (i < len) {

			if (i < (len / 2)) {
				char c = msg[i];
				msg[i] = msg[len - i - 1];
				msg[len - i - 1] = c;
			} else { 
				msg[i] = msg[i] - 1;
			}

			i++;
		}

		printf("%s\n", msg);
	}
}
