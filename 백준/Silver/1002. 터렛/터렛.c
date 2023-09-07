#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
void turret(int x1, int x2, int y1, int y2, int r1, int r2) {
	double dist = 0, sub = 0;
	int result = 0;
	dist = sqrt((pow((double)x2-x1, 2) + pow((double)y2-y1, 2)));
	sub = r1 > r2 ? r1 - r2 : r2 - r1;

	if (dist == 0 && r1 == r2) {
		result = -1;
	}
	else if (dist < (r1 + r2) && (sub < dist)) {
		result = 2;
	}
	else if (dist == r1 + r2 || dist == sub) {
		result = 1;
	}
	else {
		result = 0;
	}
	printf("%d\n", result);
}
int main() {
	
	int testCase = 0;
	int x1, x2, y1, y2, r1, r2;
	scanf("%d", &testCase);
	for (int i = 0; i < testCase; i++) {
		scanf("%d %d %d %d %d %d", &x1, &y1, &r1, &x2, &y2, &r2);
		turret(x1, x2, y1, y2, r1, r2);
	}
	return 0;
 }