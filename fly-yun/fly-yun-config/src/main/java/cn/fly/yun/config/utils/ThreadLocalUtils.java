package cn.fly.yun.config.utils;


import cn.fly.yun.base.TransLog;

public class ThreadLocalUtils {
    /**
     * 国际化
     */
    private static final ThreadLocal<String> LOCAL_LANAGUAGE = new ThreadLocal<>();

    public static void setLocalLanaguage(String locale) {
        LOCAL_LANAGUAGE.set(locale);
    }

    public static String getLocalLanaguage() {
        return LOCAL_LANAGUAGE.get();
    }

    public static void resetLocalLanaguage() {
        LOCAL_LANAGUAGE.remove();
    }



    /**
     * 流水日志
     */
    private static final ThreadLocal<TransLog> LOCAL_TRANSLOG = new ThreadLocal<>();

    public static void setLocalTranslog(TransLog transLog) {
        LOCAL_TRANSLOG.set(transLog);
    }

    public static TransLog getLocalTranslog() {
        return LOCAL_TRANSLOG.get();
    }

    public static void resetLocalTranslog() {
        LOCAL_TRANSLOG.remove();
    }


}
