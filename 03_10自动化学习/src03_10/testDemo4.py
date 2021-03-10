from selenium import webdriver
import os
import time
# 导入移动鼠标需要的包
from selenium.webdriver.common.action_chains import ActionChains
browser = webdriver.Chrome()
browser.maximize_window()
file_path = "file:///"+os.path.abspath("E:/JavaWebCode/level_locate.html")
browser.get(file_path)
time.sleep(3)

# 定位link1
browser.find_element_by_link_text("Link1").click()
# 定位需要鼠标需要移动的目标元素
button = browser.find_element_by_link_text("Action")

# 将鼠标移动到目标元素
ActionChains(browser).move_to_element(button).perform()
time.sleep(4)
browser.quit()