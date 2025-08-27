# Lane Pollock
# 12 Mar 2024
# Lab 4.3 - Web Scrape Lab
# Use BeautifulSoup to parse a html from an url and save product info and price to a .csv file

import requests
from bs4 import BeautifulSoup
import csv

def fetch_product_page(url):
    response = requests.get(url)
    return response.text

def parse_products(html):
    soup = BeautifulSoup(html, 'html.parser')
    products = soup.find_all('div', class_='g1qv1ctd atm_u80d3j_1li1fea atm_c8_o7aogt atm_g3_8jkm7i c1v0rf5q atm_9s_11p5wf0 atm_cx_4wguik atm_dz_7esijk atm_e0_1lo05zz dir dir-ltr')  # Adjust class based on actual site structure
    for product in products:
        name = product.find('div', class_='t1jojoys atm_g3_1kw7nm4 atm_ks_15vqwwr atm_sq_1l2sidv atm_9s_cj1kg8 atm_6w_1e54zos atm_fy_1vgr820 atm_7l_jt7fhx atm_cs_10d11i2 atm_w4_1eetg7c atm_ks_zryt35__1rgatj2 dir dir-ltr').text.strip()  # Example element
        price = product.find('span', class_='a8jt5op atm_3f_idpfg4 atm_7h_hxbz6r atm_7i_ysn8ba atm_e2_t94yts atm_ks_zryt35 atm_l8_idpfg4 atm_vv_1q9ccgz atm_vy_t94yts aze35hn atm_mk_stnw88 atm_tk_idpfg4 dir dir-ltr').text.strip()  # Example element
        yield {'name': name, 'price': price}
        print(f"{name}, {price}")

def save_to_csv(products, filename):
    with open(filename, mode='w', newline='') as file:
        writer = csv.writer(file)
        writer.writerow(['Name', 'Price'])
        for product in products:
            writer.writerow([product['name'], product['price']])

def main():
   #TODO - Create the appropriate code for your main
   filename = "lab4Data.csv"
   url = "https://www.airbnb.com/?c=.pi0.pk36239956_25650614176&&c=.pi0.pk36239956_25650614176&ghost=true&gad_source=1&gclid=Cj0KCQjw4cS-BhDGARIsABg4_J3kjZwBrHFFD_L21N7CGPThJ-tBXiGTxvDaqrQqLqMXyEvHpf1FXFgaAhrYEALw_wcB&gclsrc=aw.ds"

   #cross my fingers
   save_to_csv(parse_products(fetch_product_page(url)), filename)

   print("Success")



if __name__ == "__main__":
    main()