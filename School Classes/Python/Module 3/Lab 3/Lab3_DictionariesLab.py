# Lane Pollock
# 25 Feb 2025
# Lab 3 - Dictionaries Lab
# Make a contact management system using dictionaries, allowing to add, update, delete, or search

#define function that prints the options of the program
def menu():
    print("1: Add Contact")
    print("2: Search Contacts")
    print("3: Update Contact")
    print("4: Delete Conact")
    print("5: Show All Contacts")
    print("6: Exit")

#define function that adds a contact to the dictionary
def add_contact(contacts):
    name = input("Enter the contact's name: ")
    phone = input("Enter the contact's phone number: ")
    email = input("Enter the contact's email address: ")

    contacts[name] = {'phone' : phone, 'email' : email}

    print("Contact added!\n")

#define function that searches contacts and displays details if found
def search_contacts(contacts):
    name = input("Enter the name of the contact you wish to search for: ")

    if name in contacts:
        print(f"{name} found:\n\tPhone Number: " + contacts[name].get('phone'))
        print("\tEmail Address: " + contacts[name].get('email'))
    
    else:
        print("Contact not found.\n")

#define function to update contacts
def update_contact(contacts):
    name = input("Enter the name of the contact you wish to update: ")

    if name in contacts:
        new_phone = input("Enter the new phone number: ")
        new_email = input("Enter the new email: ")

        contacts[name]['phone'] = new_phone
        contacts[name]['email'] = new_email
        print("Contact Updated!")

    else:
        print("Contact not found.\n")

#define function to remove contact
def delete_contact(contacts):
    name = input("Enter the name of the contact you wish to delete: ")

    if name in contacts:
        del contacts[name]
        print("Contact Deleted.\n")

    else:
        print("Contact not found.\n")

#function prints all the elements of the dictionary
def display_contacts(contacts):
    print("Contacts:")

    for contact, details in contacts.items():
        print(f"Name: {contact}")
        print(f"\tPhone Number: {details['phone']}")
        print(f"\tEmail Address: {details['email']}")

    print()

#define main
def main():
    #empty dict
    contacts = {}

    while True:
        menu()

        try:
            choice = int(input("Enter a choice: "))

            if choice == 1:
                add_contact(contacts)
            elif choice == 2:
                search_contacts(contacts)
            elif choice == 3:
                update_contact(contacts)
            elif choice == 4:
                delete_contact(contacts)
            elif choice == 5:
                display_contacts(contacts)
            elif choice == 6:
                print("Goodbye:")
                break
            else:
                print("Invalid Entry")

        except:
            print("Something went wrong...")


#PROGRAM START
main()