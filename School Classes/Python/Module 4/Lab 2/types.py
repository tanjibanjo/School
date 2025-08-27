# Lane Pollock
# 11 Mar 2025
# Lab 4.2 Vehicle Inheritance
# file defines car and truck classes that inherit from vehicle

from vehicle import Vehicle

class Car(Vehicle):
    def __init__(self, make, model, year, passenger_capacity):
        super().__init__(make, model, year)
        self.passenger_capacity = passenger_capacity

    def display_details(self):
        super().display_details()
        print(f"Capacity: {self.passenger_capacity} people")

    def start_engine(self):
        print("Car engine started.")
    
    def stop_engine(self):
        print("Car turned off.")

    
class Truck(Vehicle):
    def __init__(self, make, model, year, cargo_capacity):
        super().__init__(make, model, year)
        self.cargo_capacity = cargo_capacity

    def display_details(self):
        super().display_details()
        print(f"Cargo Space: {self.cargo_capacity}")

    def start_engine(self):
        print("Truck engine roars.")
    
    def stop_engine(self):
        print("Truck turns off.")
