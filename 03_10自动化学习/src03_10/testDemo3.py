from selenium import webdriver
import os
import time
driver = webdriver.Chrome()
file_path = 'file:///'+os.path.abspath("E:/JavaWebCode/frame.html")
driver.get(file_path)
driver.switch_to.frame("f1")
driver.switch_to.frame("f2")
driver.find_element_by_id("kw").send_keys("邓庄庄")
driver.find_element_by_id("su").click()
time.sleep(3)

driver.switch_to_default_content()
driver.switch_to.frame("f1")
driver.find_element_by_link_text("click").click()
time.sleep(4)
driver.quit()