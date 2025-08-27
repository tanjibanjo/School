# Lane Pollock
# 16 Apr 2025
# Use requests and bs4 to scrape data off of a public website/catalog
# I used the san antonio public library

import requests
from bs4 import BeautifulSoup

# URL to scrape
url = "http://www.mysapl.org/"

# Send a GET request to fetch the webpage content
headers = {"User-Agent": "Mozilla/5.0"}
response = requests.get(url, headers=headers)

# Check if the request was successful
if response.status_code == 200:
    soup = BeautifulSoup(response.text, 'html.parser')

    # Extract and print the title of the webpage
    title = soup.title.text if soup.title else "No title found"
    print(f"Page Title: {title}\n")

    # Extract and print all headings (h1, h2, h3)
    print("Headings on the Page:")
    for heading in soup.find_all(["h1", "h2", "h3"]):
        print(f"- {heading.text.strip()}")

    # Extract and print all paragraphs
    print("\nParagraphs on the Page:")
    for paragraph in soup.find_all("p"):
        print(f"- {paragraph.text.strip()}")

    # Extract and print all hyperlinks
    print("\nExtracted Links:")
    for link in soup.find_all("a", href=True):
        print(link["href"])

else:
    print(f"Failed to retrieve the webpage. Status Code: {response.status_code}")
