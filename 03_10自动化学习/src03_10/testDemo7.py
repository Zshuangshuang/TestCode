from selenium import webdriver
import os
import time
browser = webdriver.Chrome()
file_path = 'file:///'+os.path.abspath("E:/JavaWebCode/modal.html")
browser.get(file_path)
browser.maximize_window()
browser.find_element_by_id("show_modal").click()
time.sleep(2)
# 定位click me
div1 = browser.find_element_by_class_name("modal-body")
browser.find_element_by_link_text("click me").click()
time.sleep(4)
div2 = browser.find_element_by_class_name("modal-footer")
buttons = div2.find_elements_by_tag_name("button")
buttons[0].click()