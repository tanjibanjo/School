#Lane Pollock
#1 Apr 2025
#lab 5.1
#Build a basic system monitor

import time
import psutil

def get_cpu_usage():
    cpu_usage = psutil.cpu_percent(interval=1)
    print(f"Current CPU usage is {cpu_usage}%")

def get_memory_usage():
    usage = psutil.virtual_memory()
    print(f"Current memory usage is {usage.percent}%")

def get_disk_usage():
    usage = psutil.disk_usage('/')
    print(f"Total disk size: {usage.total / (1024**3)} GB")
    print(f"Used: {usage.used / (1024**3)} GB")
    print(f"Free: {usage.free / (1024**3)} GB")
    print(f"Percent used: {usage.percent}%")

def display_system_info():
    count = 0
    while count < 5:
        get_cpu_usage()
        get_memory_usage()
        get_disk_usage()
        print("-" * 20)
        time.sleep(5) #sleep for 5 seconds then refresh stats
        count += 1

def main():
    print("Starting the system monitor...")
    display_system_info()

if __name__ == "__main__":
    main()