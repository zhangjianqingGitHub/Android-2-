package com.example.zjq.mobileplayer.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.zjq.mobileplayer.service.MusicPlayerService;


/**
 * 缓存工具类
 */
public class CacheUtils {


    /**
     * 保存数据
     * @param context
     * @param key
     * @param values
     */
    public static void putString(Context context,String key,String values){
        SharedPreferences sharedPreferences=context.getSharedPreferences( "VideoCache",Context.MODE_PRIVATE );
        sharedPreferences.edit().putString( key,values ).commit();
    }

    /**
     * 得到缓存的数据
     * @param context
     * @param key
     * @return
     */
    public static String getString(Context context,String key){
        SharedPreferences sharedPreferences=context.getSharedPreferences( "VideoCache",Context.MODE_PRIVATE );
        return sharedPreferences.getString( key,"" );
    }


    /**
     * 保存播放模式
     * @param context
     * @param key
     * @param values
     */
    public  static void putPlaymode(Context context,String key,int values){
        SharedPreferences sharedPreferences=context.getSharedPreferences( "VideoCache",Context.MODE_PRIVATE );

        sharedPreferences.edit().putInt( key,values ).commit();

    }


    /**
     * 得到播放模式
     * @param context
     * @param key
     */
    public  static int getPlaymode(Context context, String key){
        SharedPreferences sharedPreferences=context.getSharedPreferences( "VideoCache",Context.MODE_PRIVATE );

        return sharedPreferences.getInt( key, MusicPlayerService.REPEAT_NORMAL );
    }

}
