from selenium import webdriver
import os
import time

browser = webdriver.Chrome()
file_name = "file:///"+os.path.abspath("E:/JavaWebCode/alert.html")
browser.get(file_name)
browser.maximize_window()
browser.find_element_by_id("tooltip").click()
time.sleep(2)
# 点击alert框
alert = browser.switch_to.alert
# 输出弹出框的内容
text = alert.text
print("text = "+text)
alert.accept()
browser.quit()