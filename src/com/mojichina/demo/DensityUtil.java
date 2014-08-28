package com.mojichina.demo;

import android.content.Context;
import android.util.DisplayMetrics;

public class DensityUtil {


    private  final String TAG = DensityUtil.class.getSimpleName();
    
    // 当前屏幕的densityDpi
    private  float dmDensityDpi = 0.0f;
    private  DisplayMetrics dm;
    private  float scale = 0.0f;
 
    
    public DensityUtil(Context context) {
        // 获取当前屏幕
        dm = new DisplayMetrics();
 
        //返回当前资源对象的DispatchMetrics信息。
        dm = context.getApplicationContext().getResources().getDisplayMetrics();
        // 设置DensityDpi
        dmDensityDpi=dm.densityDpi;
       // setDmDensityDpi(dm.densityDpi);
        // 密度因子
        scale = getDmDensityDpi() / 160;//等于 scale=dm.density;

    }
 
    /**
     * 屏幕宽度
     * @return
     */
    public  int getScreenWidth(){
    	return dm.widthPixels;
    }
    
    /**
     * 屏幕高度
     * @return
     */
    public  int getScreenHeight(){
    	return dm.heightPixels;
    }
    
    
    public  float getDmDensityDpi() {
        return dmDensityDpi;
    }
 
//    
//    public  void setDmDensityDpi(float dmDensityDpi) {
//        DensityUtil.dmDensityDpi = dmDensityDpi;
//    }
// 
    
    public  int dip2px(float dipValue) {
 
        return (int) (dipValue * scale + 0.5f);
 
    }
 
    
    public int px2dip(float pxValue) {
        return (int) (pxValue / scale + 0.5f);
    }
 
    @Override
    public String toString() {
        return " dmDensityDpi:" + dmDensityDpi;
    }
}
