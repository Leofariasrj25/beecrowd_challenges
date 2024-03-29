#include <stdio.h> // printf, scanf
#include <string.h> // strcmp

int main() {
	
	char value[102];
	char digit[2];

	while (42) {
		scanf("%s %s", digit, value);
		
		if (digit[0] == '0' && strcmp(value, "0") == 0) {
			break;
		}
	
		int i = 0;
		int len = 0;


		while (value[len] != '\0') {
			if (value[len] != digit[0]) {
				value[i] = value[len];
				i++;
			}

			len++;
		}

		value[i] = '\0';

		i = 0;

		while (value[i] == '0') {
			i++;
		}

		if (value[i] == '\0') {
			value[i] = '0';
			value[i + 1] = '\0';
		} 
		
		printf("%s\n", &value[i]);
	}
}
