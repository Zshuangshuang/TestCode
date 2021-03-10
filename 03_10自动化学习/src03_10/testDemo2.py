from selenium import webdriver
import os
import time
driver = webdriver.Chrome()
file_path = 'file:///'+os.path.abspath("E:/JavaWebCode/frame.html")
driver.get(file_path)
driver.maximize_window()
# 从默认页面跳转到id为f2的页面：由于f2是嵌套在f1中,因此需要先跳转到f1,然后在跳转到f2
driver.switch_to.frame("f1")
driver.switch_to.frame("f2")
driver.find_element_by_id("kw").send_keys("邓伦")
driver.find_element_by_id("su").click()
time.sleep(3)
driver.quit()
