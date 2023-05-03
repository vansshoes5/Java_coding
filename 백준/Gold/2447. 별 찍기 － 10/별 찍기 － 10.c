#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
void makeStar(int i, int j, int n);

int main() {
	int input = 0;
	scanf("%d", &input);
	if (input % 3 != 0) {
		return 0;
	}
	for (int i = 0; i < input; i++) {
		for (int j = 0; j < input; j++) {
			makeStar(i, j, input);
		}
		printf("\n");
	}
	return 0;
 }

void makeStar(int i, int j, int n) {
	if ((i/n) % 3 == 1 && (j/n) % 3 == 1) {
		printf(" ");
	}
	else {
		if (n / 3 == 0) {
			printf("*");
		}
		else {
			makeStar(i, j, n / 3);
		}
	}
}