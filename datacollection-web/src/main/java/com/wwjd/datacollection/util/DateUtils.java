package com.wwjd.datacollection.util;

import com.wwjd.datacollection.constants.DataCollectionConstants;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * date utils
 *
 * @author adao
 * @CopyRight qtshe
 * @Created 2018年12月05日 15:27:00
 */
public final class DateUtils {

    /**
     * get default date
     *
     * @param timestampO
     * @return
     * @author adao
     * @time 2018/12/5 15:31
     * @CopyRight 杭州弧途科技有限公司（qtshe）
     */
    public static String getDefaultFormatTime(Object timestampO) {
        Long timestamp;
        // if timestampO is null or it's length is less than ten
        if (timestampO == null || timestampO.toString().length() < DataCollectionConstants.TEN) {
            // use current time
            timestamp = System.currentTimeMillis();
        } else {
            // deal timestamp
            timestamp = sToMs( Long.valueOf(timestampO.toString()));
        }

        // return result
        return new SimpleDateFormat(DataCollectionConstants.DEFAULT_SDF).format(new Date(timestamp));
    }

    /**
     * get current time
     *
     * @param
     * @return
     * @author adao
     * @time 2018/12/6 14:05
     * @CopyRight 杭州弧途科技有限公司（qtshe）
     */
    public static String getNow() {
        // return result
        return new SimpleDateFormat(DataCollectionConstants.CREATE_TIME_SDF).format(new Date());
    }

    /**
     * get time for rowkey
     *
     * @param
     * @return
     * @author adao
     * @time 2018/12/5 15:56
     * @CopyRight 杭州弧途科技有限公司（qtshe）
     */
    public static String getRowKeyTime() {
        // return result
        return new SimpleDateFormat(DataCollectionConstants.ROW_KEY_SDF).format(new Date());
    }
    public static String getRowKeyDay() {
        // return result
        return new SimpleDateFormat(DataCollectionConstants.ROW_KEY_DAY_SDF).format(new Date());
    }

    /**
     * s to ms
     *
     * @return
     * @author adao
     * @time 2018/5/18 12:58
     * @CopyRight 杭州弧途科技有限公司（qtshe）
     * @Param s
     */
    private static Long sToMs(Long s) {
        // if null
        if (s == null) {
            // return null
            return null;
        }
        // if length eq 13
        if (s.toString().length() == DataCollectionConstants.THIRTEEN) {
            // return result
            return s;
        }
        // return result
        return s * DataCollectionConstants.ONE_THOUSAND;
    }
}
