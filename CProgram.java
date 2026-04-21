//6. Collect the code from internet for any 5 programs of c language.(Factorial, Armstrong, Palindrome, Fibonacci, Pattern)

//Factorial of a no.
#include <stdio.h>

int main() {
    int n, i;
    long long fact = 1;

    printf("Enter a number: ");
    scanf("%d", &n);

    for(i = 1; i <= n; i++) {
        fact = fact * i;
    }

    printf("Factorial = %lld", fact);

    return 0;
}

//Armstrong number
#include <stdio.h>

int main() {
    int n, temp, rem, sum = 0;

    printf("Enter a number: ");
    scanf("%d", &n);

    temp = n;

    while(temp != 0) {
        rem = temp % 10;
        sum = sum + (rem * rem * rem);
        temp = temp / 10;
    }

    if(sum == n)
        printf("Armstrong number");
    else
        printf("Not an Armstrong number");

    return 0;
}

//Palindrome no.
#include <stdio.h>

int main() {
    int n, rev = 0, rem, temp;

    printf("Enter a number: ");
    scanf("%d", &n);

    temp = n;

    while(n != 0) {
        rem = n % 10;
        rev = rev * 10 + rem;
        n = n / 10;
    }

    if(temp == rev)
        printf("Palindrome number");
    else
        printf("Not a palindrome");

    return 0;
}

//Fibonacci series
#include <stdio.h>

int main() {
    int n, i;
    int a = 0, b = 1, c;

    printf("Enter number of terms: ");
    scanf("%d", &n);

    printf("Fibonacci series:\n");

    for(i = 1; i <= n; i++) {
        printf("%d ", a);
        c = a + b;
        a = b;
        b = c;
    }

    return 0;
}

//Pattern(Triangle)
#include <stdio.h>

int main() {
    int i, j, n;

    printf("Enter number of rows: ");
    scanf("%d", &n);

    for(i = 1; i <= n; i++) {
        for(j = 1; j <= i; j++) {
            printf("* ");
        }
        printf("\n");
    }

    return 0;
}