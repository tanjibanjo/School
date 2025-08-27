#Lane Pollock
#1 Apr 2025
#Lab 5.2
#Use Python's built in shutil.disk.usage() function to report disk usage stats
import shutil

def get_disk_usage():
    path = "/Users/lanepollock"
    print(f"Total space in Disk: {shutil.disk_usage(path).total / (1024**3)} gB")
    print(f"Free space in Disk: {shutil.disk_usage(path).free / (1024**3)} gB")
    print(f"Used space in Disk: {shutil.disk_usage(path).used / (1024**3)} gB")
    

get_disk_usage()
