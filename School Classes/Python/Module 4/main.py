# Lane Pollock
# 11 Mar 2024
# Lab 1 - Customer Object Lab
# Driver for customer class demo

from customer import Customer

#method adds customer by instantiating a customer and appending to list
def add_customer(customers):
    name = input("Enter name to add: ")
    email = input("Enter email: ")
    balance = float(input("Enter balance $"))

    customer = Customer(name, email, balance)
    customers.append(customer)
    print("Customer Added.")

#method iterates through customers to display info
def display_customers(customers):
    for customer in customers:
        customer.display_details()

#method to update customer details
def update_customer(customers):
    found = False
#prompt for name
    name = input("Enter name of customer: ")
    for customer in customers:
        if name == customer.name:
            found = True
            while True:
                print("1: Deposit\n2: Withdraw\n3: Update Email\n4: Back")
                choice = int(input("Enter choice: "))

                if choice == 1:
                    customer.deposit()
                elif choice == 2:
                    customer.withdrawal()
                elif choice == 3:
                    email = input("Enter new email to update: ")
                    customer.email = email
                    print("Email updated.\n")
                elif choice == 4:
                    break
                else:
                    print("Invalid")
    if not found:
        print("Customer not found\n")

#method to remove customer
def remove_customer(customers):
    found = False
    name = input("Enter name of customer: ")
    for customer in customers:
        if name == customer.name:
            found = True
            customers.remove(customer)
            print(f"{name} removed.")

    if not found:
        print("Customer not found.")

#MAIN
def main():
    customers = []
    while True:
        print("\n1: Add Customer\n2: Show Customers\n3: Update Customer\n4: Remove Customer\n5: Exit")

        choice = input("Enter a choice: ")
        if choice == '1':
            add_customer(customers)
        elif choice == '2':
            display_customers(customers)
        elif choice == '3':
            update_customer(customers)
        elif choice == '4':
            remove_customer(customers)
        elif choice == '5':
            print("Goodbye.")
            break
        else:
            print("Invalid Choice")

if __name__ == "__main__":
    main()
