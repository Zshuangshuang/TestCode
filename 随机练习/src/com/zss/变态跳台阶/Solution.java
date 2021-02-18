package com.zss.变态跳台阶;

/**
 * Author:ZouDouble
 * Description:
 * 天气：晴天
 * 目标：Good Offer
 * Date    2021-02-18 15:48
 */
public class Solution {
    public int JumpFloorII(int target) {
        if (target <= 0){
            return 0;
        }
        if (target == 1){
            return 1;
        }

        int  ret = (1<<(target-1));
        return ret;
    }


}
