#include <stdio.h> // printf, fgets
#include <string.h> // strlen
#include <stdlib.h> //atoi

void str_trim(char *str);

int main(void) {
	char s[51];

	while (42) {
		fgets(s, 51, stdin);
		int n = atoi(s);

		if (n == 0) {
			return (0);
		}

		
		char lines[n][51];
		int line_size[n];
		int longest_line = -1;

		for (int i = 0; i < n; i++) {
			fgets(lines[i], 51, stdin);
			str_trim(lines[i]);
			line_size[i] = strlen(lines[i]);
			
			if (line_size[i] > longest_line) {
				longest_line = line_size[i];
			}
		}

		for (int j = 0; j < n; j++) {
			for (int x = 0; x < (longest_line - line_size[j]); x++) {
				printf(" ");
			}

			printf("%s", lines[j]); 
		}

		printf("\n");
	}
}

void str_trim(char *str) {
	int index = 0;
	int i = 0;
	int whitespace = 0;

	while (str[i] == ' ' && str[i] != '\0') {
		i++;
	}

	while (str[i] != '\0') {

		if (str[i] != ' ') {
			if (str[i] != '\n' && whitespace == 1) {
				str[index++] = ' ';
				whitespace = 0;
			}

			str[index++] = str[i];
		} else if (str[i] == ' ' && (str[index - 1] != ' ')) {
			whitespace = 1;
		}

		i++;
	}

	str[index] = '\0';
}
