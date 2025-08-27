# Lane Pollock
# 24 Feb 2024
# Lab 3.1 - Lists Lab
# Develop a simple library management system using python lists

#define function add_book that prompts for book info then adds to the list
def add_book(library):
    #prompt for the info
    isbn = input("Enter ISBN: ")
    title = input("Enter Title: ")
    author = input("Enter Author: ")
    library.append({'ISBN': isbn, 'Title' : title, 'Author' : author, 'Available' : True})
    print("Book added successfully!\n")

#define function to check out book
def check_out_book(library):
    #get the isbn from desired book
    isbn = input("Enter the ISBN for the desired book: ")
    #loop through the list to check if exists
    for book in library:
        if book.get('ISBN') == isbn:
            #if exists, set the availability as false
            book['Available'] = False
            print(f"{book.get('Title')} checked out.\n")
            break
        else:
            print("ISBN not found.\n")

#define function that displays all books that are available
def display_inventory(library):
    #loop through the list and display the books that are available
    print("Available Books:")
    for book in library:
        if book.get('Available') == True:
            #if the book availability is true, print the information
            for key, value in book.items():
                print(f"{key} : {value}")
        print()
    #print unavailable?
    print("\nUnavailable Books:")
    for book in library:
        if book.get('Available') == False:
            #if the book availability is true, print the information
            for key, value in book.items():
                print(f"{key} : {value}")
        print()

#define menu for choices
def menu():
    print("1: Display Library Inventory")
    print("2: Add Book to Library")
    print("3: Check Out Book")
    print("4: Exit\n")

def main():
#start with an empty list
    library_books = []

    while True:
        menu()

        try:
            choice = int(input("Enter a choice: "))
            print()

            if choice == 1: #display inventory
                display_inventory(library_books)
            elif choice == 2: #add book
                add_book(library_books)
            elif choice == 3: #check out book
                check_out_book(library_books)
            elif choice == 4: #exit
                print("Goodbye.")
                break
            else:
                print("Invalid choice\n")



        except:
            print("Something went wrong.\n")



#PROGRAM START
main()
