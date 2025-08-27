# Lane Pollock
# 11 Mar 2024
# Lab 1 - Customer Object Lab
# Customer class to hold name, email, balance

class Customer:
    def __init__(self, name, email, balance):
        self.name = name
        self.email = email
        self.__balance = balance #private

    #getBalance
    @property
    def balance(self):
        return self.__balance
    #setBalance
    @balance.setter
    def balance(self, amount):
        if amount < 0:
            print("Invalid")
        else:
            self.__balance = amount
    
    #method for deposits
    def deposit(self):
        amount = float(input("Enter amount to depost: $"))
        #add to balance
        if amount > 0:
            self.balance += amount
            #success message
            print(f"Success. New balance is ${self.balance}\n")
        else:
            print("Cannot add negative amount.\n")
        

    #method for withdrawals
    def withdrawal(self):
        amount = float(input("Enter amount to withdraw: $"))
        #check for insufficient funds
        if 0 < amount <= self.balance:
            self.balance -= amount
            #print message
            print(f"Success. New balance is ${self.balance}")
        else:
            print("Insufficient funds.\n")
    
    #method to display details
    def display_details(self):
        print(f"--------\n{self.name} - {self.email} \n${self.balance}\n--------")



        



