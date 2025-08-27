# Lane Pollock
# 28 Apr 2025
# lab 7.2 - unit test lab
# arithmetic file with add, subtract, multiply, and divide functions

def add(x, y):
    return x + y 

def subtract(x, y):
    return x - y

def multiply(x, y):
    return x * y

def divide(x, y):
    if y == 0:
        raise ValueError("Cannot divide by zero")
    return x/y

    