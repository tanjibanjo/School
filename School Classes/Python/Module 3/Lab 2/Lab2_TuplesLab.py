# Lane Pollock
# 25 Feb 2025
# Lab 2 - Tuples Lab
# Develop a system to analyze student scores by adding, averaging, and finding the highest score

#define function that prints the options of the program
def menu():
    print("1: Add Score")
    print("2: Find Average of Scores")
    print("3: Find Highest Score")
    print("4: Quit")

#define function add_score that takes the list and adds a tuple
def add_score(scores):
    #prompt for name (string) and score(int)
    name = input("\nEnter Student Name: ")
    score = int(input("Enter Score: "))

    student_tuple = (name, score)

    #add the tuple to the list
    scores.append(student_tuple)
    print("Score Added Successfully!\n")

#define function calculate_average that iterates and prints average score
def calculate_average(scores):
    #local variable
    total = 0
    #iterate through the list
    for score in scores:
        total += score[1]
    
    #calculate average
    average = total / len(scores)
    #print
    print(f"\nThe average of the scores is: {average}\n")

#define function that iterates through the list, prints the student with the highest score
def find_highest_score(scores):
    #set highest as the score of the first student in scores
    student_tuple = scores[0]
    student_name, highest_score = student_tuple

    #iterate through list
    for score in scores:
        #if score is higher, set highest
        if score[1] > highest_score:
           highest_score = score[1]
           student_name = score[0]

    #print
    print(f"\nThe student with the highest score: {student_name}, {highest_score}\n")
    

#define main 
def main():
    #empty list
    scores = []

    while True:
        menu()

        try:
            choice = int(input("Enter a choice: "))

            if choice == 1:
                add_score(scores)
            elif choice == 2:
                calculate_average(scores)
            elif choice == 3:
                find_highest_score(scores)
            elif choice == 4:
                print("Goodbye:")
                break
            else:
                print("Invalid Entry")

        except:
            print("Something went wrong...")

#PROGRAM START
main()
