from selenium import webdriver
import os
import time
from selenium.webdriver.support.ui import WebDriverWait
browser = webdriver.Chrome()

file_name = "file:///"+os.path.abspath("E:/JavaWebCode/drop_down.html")
browser.get(file_name)
browser.maximize_window()
# 用xpath定位
# browser.find_element_by_xpath("//*[@id='ShippingMethod']/option[4]").click()
# 用option定位
# lists = browser.find_elements_by_tag_name("option")
# for list in lists:
#     if list.get_attribute('value') == "9.03":
#         list.click()
# 用数组定位
lists = browser.find_elements_by_tag_name("option")
lists[3].click()
time.sleep(3)
browser.quit()
