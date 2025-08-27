# Lane Pollock
# 11 Mar 2025
# Lab 4.2 Vehicle Inheritance
# driver for truck and car classes

from types import Car, Truck

def main():
    car = Car("Nissan", "Sentra", 2018, 4)
    truck = Truck("Ford", "F150", 2022, "30 sqft")

    print("Car demo:")

    car.display_details()
    car.start_engine()
    car.stop_engine()

    print("\nTruck demo:")

    truck.display_details()
    truck.start_engine()
    truck.stop_engine()

if __name__ == "__main__":
    main()