import math

def is_prime(n):
    if n <= 1:
        return False
    if n == 2:
        return True
    if n % 2 == 0:
        return False

    max_divisor = math.isqrt(n)   
    for divisor in range(3, max_divisor + 1, 2):
        if n % divisor == 0:
            return False

    return True
