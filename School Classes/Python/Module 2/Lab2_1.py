# Lane Pollock
# 11 Feb 2025
# Lab 2.1 - Simple interest calculator

#prompt for initial amount
balance = float(input("Enter in your principal amount: $"))

#get interest rate
rate = float(input("Enter your interest rate: "))

#get time in years
time = int(input("Enter in the number of years: "))

#simple interest
interest = (balance * rate * time) / 100

#output
print(f"Your simple interest is: {interest:.2f}")