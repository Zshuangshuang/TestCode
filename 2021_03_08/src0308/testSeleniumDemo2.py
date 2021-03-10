from selenium import webdriver
import time
# 引入火狐驱动包
driver = webdriver.Firefox()
driver.get("https://www.baidu.com/")
# 放大窗口
driver.maximize_window()
time.sleep(3)
# 定位className不成功，因为可能会重名
# 定位link text
driver.find_element_by_link_text(u"视频").click()
time.sleep(2)
driver.quit()