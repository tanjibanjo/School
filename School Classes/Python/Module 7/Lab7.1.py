# Lane Pollock
# 28 Apr 2025
# lab 7.1 Try - Except Lab
# develop functions that use try, except, else, and finally

#function prompts user for input and tries to convert to int
def convert_to_integer():
    try:
        #get input
        user_input = int(input("Enter in a number, that will become an integer: "))
    except ValueError:
        print(f"Error, not a valid number.")
    else:
        print("Integer stored.")

#function takes two inputs and divides, handling errors
def safe_division():
    #get numerator/denominator
    try:
        numerator = float(input("Enter a numerator: "))
        denominator = float(input("Enter a denominator: "))
        result = numerator/denominator

    except ZeroDivisionError:
        print("Cannot divide by zero.")

    except ValueError:
        print("Not a valid number.")

    except Exception as e:
        print(f"An unforseen error occured: {str(e)}")

    else:
        print(f"Result: {result}")

#function asks for a filename, opens and reads it
def read_file():
    myFile = None
    try:
        filename = input("Enter the filename: ")
        myFile = open(filename, 'r')
        data = myFile.read()
    except IOError:
        print("Error occured trying to read the file.")
    else:
        print(data)
    finally:
        if myFile and not myFile.closed:
            myFile.close()
            print("File closed.")
        
def main():
    #test functions
    convert_to_integer()
    safe_division()
    read_file()

if __name__ == "__main__":
    main()

