#Lane Pollock
#1 Apr 2025
#Lab 5.3
#Monitor and log CPU usage over a brief interval with psutil library

import psutil
import logging

logging.basicConfig(filename='system.log', level=logging.INFO, format='%(asctime)s - %(message)s', datefmt="%Y-%m-%d T%H:%M:%SZ")

def log_cpu_usage():
    #get the CPU usage perventage over an interval of 1 second
    usage = psutil.cpu_percent(interval=1)

    #log the usage with timestamp
    logging.info(str(usage) + '%')

def main():
    print("Starting CPU usage monitoring...")
    count = 0 #limit count to 5 
    while count < 5:
        log_cpu_usage()
        count += 1

if __name__ == "__main__":
    main()

