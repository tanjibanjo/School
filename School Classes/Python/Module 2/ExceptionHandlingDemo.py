# Lane Pollock
# 6 Feb 2024
# Basic Exception Handling Demo

try:
    numerator = int(input("Enter the numerator: "))
    denominator = int(input("Enter the denominator: "))

    #attempt division
    result = numerator / denominator
    print(f"The result is {result}")

except ValueError:
    print("Error. Please enter only integers.")
except ZeroDivisionError:
    print("Error: Division by zero is not allowed.")

#trying to convert a potentially complex string to an int
try:
    raw_data = input("Enter a number to convert to integer: ")
    number = int(raw_data)
    print(f"The converted number is {number}.")
except ValueError:
    print("Error. Invalid inupt. Enter an integer.")
finally:
    print("Data conversion attempt completed.")