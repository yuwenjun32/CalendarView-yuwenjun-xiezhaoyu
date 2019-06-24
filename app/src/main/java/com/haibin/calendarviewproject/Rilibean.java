package com.haibin.calendarviewproject;

import com.google.gson.annotations.SerializedName;

public class Rilibean {
    /**
     * reason : Success
     * result : {"data":{"avoid":"嫁娶.安葬.入宅.出行.动土.词讼.","animalsYear":"鸡","weekday":"星期六","suit":"塞穴.断蚁.结网.畋猎.余事勿取.","lunarYear":"丁酉年","lunar":"四月十一","year-month":"2017-5","date":"2017-5-6"}}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * data : {"avoid":"嫁娶.安葬.入宅.出行.动土.词讼.","animalsYear":"鸡","weekday":"星期六","suit":"塞穴.断蚁.结网.畋猎.余事勿取.","lunarYear":"丁酉年","lunar":"四月十一","year-month":"2017-5","date":"2017-5-6"}
         */


        private DataBean data;

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public static class DataBean {
            @Override
            public String toString() {
                return "DataBean{" +'\n'+
                        "avoid='" + avoid + '\n' +
                        "animalsYear='" + animalsYear + '\n' +
                        "weekday='" + weekday + '\n' +
                        "suit='" + suit + '\n' +
                        "lunarYear='" + lunarYear + '\n' +
                        "lunar='" + lunar + '\n' +
                        "yearmonth='" + yearmonth + '\n' +
                        "date='" + date + '\n' +
                        '}';
            }

            /**
             *
             * avoid : 嫁娶.安葬.入宅.出行.动土.词讼.
             * animalsYear : 鸡
             * weekday : 星期六
             * suit : 塞穴.断蚁.结网.畋猎.余事勿取.
             * lunarYear : 丁酉年
             * lunar : 四月十一
             * year-month : 2017-5
             * date : 2017-5-6
             */

            private String avoid;
            private String animalsYear;
            private String weekday;
            private String suit;
            private String lunarYear;
            private String lunar;
            @SerializedName("year-month")
            private String yearmonth;
            private String date;

            public String getAvoid() {
                return avoid;
            }

            public void setAvoid(String avoid) {
                this.avoid = avoid;
            }

            public String getAnimalsYear() {
                return animalsYear;
            }

            public void setAnimalsYear(String animalsYear) {
                this.animalsYear = animalsYear;
            }

            public String getWeekday() {
                return weekday;
            }

            public void setWeekday(String weekday) {
                this.weekday = weekday;
            }

            public String getSuit() {
                return suit;
            }

            public void setSuit(String suit) {
                this.suit = suit;
            }

            public String getLunarYear() {
                return lunarYear;
            }

            public void setLunarYear(String lunarYear) {
                this.lunarYear = lunarYear;
            }

            public String getLunar() {
                return lunar;
            }

            public void setLunar(String lunar) {
                this.lunar = lunar;
            }

            public String getYearmonth() {
                return yearmonth;
            }

            public void setYearmonth(String yearmonth) {
                this.yearmonth = yearmonth;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }
        }
    }
}
