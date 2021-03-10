from selenium import webdriver
import os
import time
browser = webdriver.Chrome()
file_path = 'file:///'+os.path.abspath("E:/JavaWebCode/upload.html")
browser.get(file_path)
browser.maximize_window()
# 定位上传文件按钮
browser.find_element_by_tag_name("input").send_keys("D:\\Xshell.exe")
time.sleep(4)
browser.quit()