# Lane Pollock
# 11 Mar 2024
# Lab 4.2 - Vehicle Inheritance Lab
# vehicle class to hold make model and year as well as general methods

class Vehicle:
    def __init__(self, make, model, year):
        self.make = make
        self.model = model
        self.year = year
    
    #method to start engine
    def start_engine(self):
        print("Engine started.")

    #stop engine
    def stop_engine(self):
        print("Engine stopped.")

    #print details
    def display_details(self):
        print(f"{self.year} {self.make} {self.model}")
