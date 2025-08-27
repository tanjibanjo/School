# Lane Pollock
# 11 Feb 2025
# Lab 2.2 -BMI Calculator

#get data from user
weight = float(input("Enter your weight in kg: "))
height = float(input("Enter your height in meters: "))

#calculate bmi
bmi = weight / (height **2)

#output
print(f"Your BMI is: {bmi:.2f}\n")