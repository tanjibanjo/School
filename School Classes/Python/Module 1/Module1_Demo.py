# Author: Lane Pollock
# Date: 23 Jan 2024
# Purpose: Demo of the introductory concepts to python

#import modules
import math

#greeting
print("Welcome to the Game Health Calculator!")

#get character details
character_name = input("Enter your character's name: ")
max_health = int(input("Enter your character's maximum health: "))
current_health = int(input("Enter your character's current health: "))
damage = int(input("Enter damage taken: "))
healing = int(input("Enter healing received: "))

#calculating net effect on health
net_effect = healing - damage
new_health = current_health + net_effect

#ensure health does not exceed maximum or drop below 0
new_health = min(max_health, new_health)
new_health = max(0, new_health)

#display results
result = (
    "Character: " + character_name + "\n"
    + "Original heath: " + str(current_health) + "\n"
    + "Damage received: " + str(damage) + "\n"
    + "Healing received: " + str(healing) + "\n"
    + "New health: " + str(new_health)
)


print(result)
