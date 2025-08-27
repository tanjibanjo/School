# Author: Lane Pollock
# Date: 23 Jan 2024
# Assignment: Lab 1.3 - Age Calculator
# Description: Create a python script that calculates how old the user
#  will be in a given number of years

#prompt for current age
age = int(input("Enter your current age: "))
years = int(input("Enter the number of years to calculate: "))

#print future age
print(f"In {years} years, you will be {age + years} years old.")