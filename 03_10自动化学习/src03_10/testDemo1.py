from selenium import webdriver
import os
import time
driver = webdriver.Chrome()
file_path = 'file:///'+os.path.abspath("E:/Python/checkBox.html")
driver.get(file_path)
# 选择页面所有的input,过滤出checkbox进行勾选
inputs = driver.find_elements_by_tag_name('input')
for input in inputs:
    if input.get_attribute('type') == "checkbox":
        input.click()
time.sleep(3)
driver.quit()