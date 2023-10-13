package com.aurorapixel.sso.core.utils;

import cn.hutool.json.JSONUtil;
import org.springframework.http.MediaType;

import javax.servlet.http.HttpServletResponse;

/**
 * 客户端工具类
 *
 * @author AuroraPixel
 * @github https://github.com/AuroraPixel
 */
public class ServletUtil {
    /**
     * 返回 JSON 字符串
     *
     * @param response 响应
     * @param object 对象，会序列化成 JSON 字符串
     */
    @SuppressWarnings("deprecation") // 必须使用 APPLICATION_JSON_UTF8_VALUE，否则会乱码
    public static void writeJSON(HttpServletResponse response, Object object) {
        String content = JSONUtil.toJsonStr(object);
        cn.hutool.extra.servlet.ServletUtil.write(response, content, MediaType.APPLICATION_JSON_UTF8_VALUE);
    }


    public static void write(HttpServletResponse response, String text, String contentType) {
        cn.hutool.extra.servlet.ServletUtil.write(response, text, contentType);
    }
}