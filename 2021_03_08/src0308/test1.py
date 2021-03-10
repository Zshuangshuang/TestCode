#coding=utf-8
from selenium import webdriver
import time
browser = webdriver.Chrome()
browser.get("http://www.baidu.com")
browser.find_element_by_xpath("//*[@id='kw']").send_keys("selenium")
############################################
browser.find_element_by_id("su").click()
time.sleep(10)
browser.quit()