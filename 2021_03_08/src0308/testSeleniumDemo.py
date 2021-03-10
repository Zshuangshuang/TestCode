from selenium import webdriver
import time
# 从火狐浏览器获取驱动包
driver = webdriver.Firefox()
driver.get("https://www.baidu.com/")
# 放大窗口
driver.maximize_window()
time.sleep(3)
# name的定位
driver.find_element_by_name("wd").send_keys("JVM虚拟机")
driver.find_element_by_id("su").click()

time.sleep(4)
driver.quit()