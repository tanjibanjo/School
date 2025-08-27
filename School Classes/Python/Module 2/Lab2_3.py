# Lane Pollock
# 11 Feb 2025
# Lab 2.3 - Bank Account Simulator

#global variable
balance = 0

#print initial balance
print(f"Your balance is ${balance:.2f}")

#functions for bank menu
def deposit():
    global balance
    #get deposit amnt
    deposit = float(input("Enter the amount to depost: $"))
    #apply
    balance += deposit
    print(f"Your new balance is ${balance:.2f}")

def withdraw():
    global balance
    #get amnt
    withdrawal = float(input("Enter in amout to withdraw: $"))
    #handle overdraw
    if withdrawal > balance:
        print("Insufficient funds.")
    else:
        balance -= withdrawal
        print(f"Your new balance is ${balance:.2f}")

def printBalance():
    global balance
    #print balance
    print(f"Your balance is ${balance:.2f}")

def menu():
    print("1: Deposit")
    print("2: Withdraw")
    print("3: Check Balance:")
    print("4: Exit\n")

#MAIN LOOP
while True:
    menu()
    try:
        choice = int(input("Enter choice: "))
    
        if choice == 1:
            deposit()
        elif choice == 2:
            withdraw()
        elif choice == 3:
            printBalance()
        elif choice == 4:
            print("Goodbye.\n")
            break
        else:
            print("Error, invalid entry.")

    except:
        print("Something went wrong...enter an integer\n")
    
    
