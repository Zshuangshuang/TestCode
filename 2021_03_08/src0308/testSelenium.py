from selenium import webdriver
import time

# 从火狐浏览器获取驱动包
driver = webdriver.Firefox()
driver.get("https://www.baidu.com/")
# 放大窗口
driver.maximize_window()
time.sleep(6)
# id的定位
driver.find_element_by_id("kw").send_keys("你好李焕英")
driver.find_element_by_id("su").click()

time.sleep(6)
driver.quit()