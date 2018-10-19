#include <stdint.h>
#include <stdio.h>

// base
#define N 8 // número de bits
#define INT uint8_t // int com N bits
typedef struct {
    INT *bits;
    int size;
} var;
int get_bit(var * v, int i) {
    int n = v->size/N - i/N - 1;
    int j = i % N;
    return (v->bits[n] & (1 << j)) > 0;
}
void set_bit(var * v, int i, int bit) {
    int n = v->size/N - i/N - 1;
    int j = i % N;
    if (bit) {
        v->bits[n] = v->bits[n] | (1 << j);
    } else {
        v->bits[n] = v->bits[n] & ~(1 << j);
    }
}

// var a[size];
var declare_var(int size) {
    var v;
    v.size = size;
    return v;
}

// a<l, u> = b
void assign_var(var * a, int l, int u, var * b) {
    int i = 0;
    while (i <= u - l) {
        set_bit(a, l + i, get_bit(b, i));
        i += 1;
    }
}

void print_var(var * v) {
    int i = v->size - 1;
    while (i >= 0) {
        printf("%d", get_bit(v, i));
        i -= 1;
    }
    printf("\n");
}

// not
void not(var * v) {
    int i = 0;
    while (i < v->size/N) {
        v->bits[i] = ~v->bits[i];
        i += 1;
    }
}