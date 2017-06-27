package com.peihao.nba.player.utility;

import java.util.HashMap;
import java.util.Map;

/**
 * 通过ThreadLocal存储贯穿于整个Request处理流程的全局对象的工具类
 *
 * @author lijing.ye
 * @version 1.0.0
 */
public class ThreadLocalUtility {
    private static final ThreadLocal<Map<String, Object>> infoMap = new ThreadLocal<>();

    public static boolean containsKey(ThreadLocalKey key) {
        return containsKey(key.toString());
    }

    /**
     * 是否存在指定Key的全局变量.
     *
     * @param key 全局变量的Key
     * @return 存在则返回true, 不存在返回false
     */
    public static boolean containsKey(String key) {
        return null != get(key);
    }

    public static void put(ThreadLocalKey key, Object value) {
        put(key.toString(), value);
    }

    /**
     * 设置全局变量.
     *
     * @param key   全局变量的Key
     * @param value 全局变量的值
     */
    public static void put(String key, Object value) {
        if (null != infoMap.get()) infoMap.get().put(key, value);
    }

    public static Object get(ThreadLocalKey key) {
        return get(key.toString());
    }

    /**
     * 获取全局变量的值.
     *
     * @param key 全局变量的Key
     * @return 全局变量的值, 若不存在则返回null
     */
    public static Object get(String key) {
        if (null == infoMap.get()) {
            return null;
        }
        return infoMap.get().get(key);
    }

    public static Integer getInteger(ThreadLocalKey key) {
        return getInteger(key.toString());
    }

    public static Integer getInteger(String key) {
        try {
            Object value = get(key);
            if (value instanceof String)
                return Integer.valueOf((String) value);
            if (value instanceof Number)
                return ((Number) value).intValue();

        } catch (Exception ignored) {

        }
        return null;
    }

    public static void remove(ThreadLocalKey key) {
        remove(key.toString());
    }

    /**
     * 移除全局变量.
     *
     * @param key 全局变量的Key
     */

    public static void remove(String key) {
        if (null != infoMap.get()) infoMap.get().put(key, null);
    }

    /**
     * 初始化ThreadLocal对象.
     */
    public static void init() {
        infoMap.set(new HashMap<>());

    }

    /**
     * 销毁ThreadLocal对象.
     */
    public static void destroy() {
        infoMap.set(null);
    }
}