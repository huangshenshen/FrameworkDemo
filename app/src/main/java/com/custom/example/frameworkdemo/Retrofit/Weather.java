package com.custom.example.frameworkdemo.Retrofit;

/**
 * Created by Administrator on 2017/9/22 0022.
 */

public class Weather {

    /**
     * resultcode : 200
     * reason : 查询成功
     * result : {"sk":{"temp":"30","wind_direction":"北风","wind_strength":"1级","humidity":"39%","time":"17:21"},"today":{"temperature":"20℃~31℃","weather":"晴转多云","weather_id":{"fa":"00","fb":"01"},"wind":"西南风微风","week":"星期五","city":"郑州","date_y":"2017年09月22日","dressing_index":"炎热","dressing_advice":"天气炎热，建议着短衫、短裙、短裤、薄型T恤衫等清凉夏季服装。","uv_index":"强","comfort_index":"","wash_index":"较适宜","travel_index":"较适宜","exercise_index":"较适宜","drying_index":""},"future":{"day_20170922":{"temperature":"20℃~31℃","weather":"晴转多云","weather_id":{"fa":"00","fb":"01"},"wind":"西南风微风","week":"星期五","date":"20170922"},"day_20170923":{"temperature":"19℃~30℃","weather":"多云转阴","weather_id":{"fa":"01","fb":"02"},"wind":"东南风3-4 级","week":"星期六","date":"20170923"},"day_20170924":{"temperature":"20℃~24℃","weather":"中雨转小雨","weather_id":{"fa":"08","fb":"07"},"wind":"东风微风","week":"星期日","date":"20170924"},"day_20170925":{"temperature":"20℃~23℃","weather":"小雨转中雨","weather_id":{"fa":"07","fb":"08"},"wind":"东北风微风","week":"星期一","date":"20170925"},"day_20170926":{"temperature":"20℃~23℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"wind":"东北风微风","week":"星期二","date":"20170926"},"day_20170927":{"temperature":"20℃~24℃","weather":"中雨转小雨","weather_id":{"fa":"08","fb":"07"},"wind":"东风微风","week":"星期三","date":"20170927"},"day_20170928":{"temperature":"20℃~23℃","weather":"小雨转中雨","weather_id":{"fa":"07","fb":"08"},"wind":"东北风微风","week":"星期四","date":"20170928"}}}
     * error_code : 0
     */

    private String resultcode;
    private String reason;
    private ResultBean result;
    private int error_code;

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

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
        @Override
        public String toString() {
            return "ResultBean{" +
                    "sk=" + sk +
                    ", today=" + today +
                    ", future=" + future +
                    '}';
        }

        /**
         * sk : {"temp":"30","wind_direction":"北风","wind_strength":"1级","humidity":"39%","time":"17:21"}
         * today : {"temperature":"20℃~31℃","weather":"晴转多云","weather_id":{"fa":"00","fb":"01"},"wind":"西南风微风","week":"星期五","city":"郑州","date_y":"2017年09月22日","dressing_index":"炎热","dressing_advice":"天气炎热，建议着短衫、短裙、短裤、薄型T恤衫等清凉夏季服装。","uv_index":"强","comfort_index":"","wash_index":"较适宜","travel_index":"较适宜","exercise_index":"较适宜","drying_index":""}
         * future : {"day_20170922":{"temperature":"20℃~31℃","weather":"晴转多云","weather_id":{"fa":"00","fb":"01"},"wind":"西南风微风","week":"星期五","date":"20170922"},"day_20170923":{"temperature":"19℃~30℃","weather":"多云转阴","weather_id":{"fa":"01","fb":"02"},"wind":"东南风3-4 级","week":"星期六","date":"20170923"},"day_20170924":{"temperature":"20℃~24℃","weather":"中雨转小雨","weather_id":{"fa":"08","fb":"07"},"wind":"东风微风","week":"星期日","date":"20170924"},"day_20170925":{"temperature":"20℃~23℃","weather":"小雨转中雨","weather_id":{"fa":"07","fb":"08"},"wind":"东北风微风","week":"星期一","date":"20170925"},"day_20170926":{"temperature":"20℃~23℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"wind":"东北风微风","week":"星期二","date":"20170926"},"day_20170927":{"temperature":"20℃~24℃","weather":"中雨转小雨","weather_id":{"fa":"08","fb":"07"},"wind":"东风微风","week":"星期三","date":"20170927"},"day_20170928":{"temperature":"20℃~23℃","weather":"小雨转中雨","weather_id":{"fa":"07","fb":"08"},"wind":"东北风微风","week":"星期四","date":"20170928"}}
         */

        private SkBean sk;
        private TodayBean today;
        private FutureBean future;

        public SkBean getSk() {
            return sk;
        }

        public void setSk(SkBean sk) {
            this.sk = sk;
        }

        public TodayBean getToday() {
            return today;
        }

        public void setToday(TodayBean today) {
            this.today = today;
        }

        public FutureBean getFuture() {
            return future;
        }

        public void setFuture(FutureBean future) {
            this.future = future;
        }

        public static class SkBean {
            @Override
            public String toString() {
                return "SkBean{" +
                        "temp='" + temp + '\'' +
                        ", wind_direction='" + wind_direction + '\'' +
                        ", wind_strength='" + wind_strength + '\'' +
                        ", humidity='" + humidity + '\'' +
                        ", time='" + time + '\'' +
                        '}';
            }

            /**
             * temp : 30
             * wind_direction : 北风
             * wind_strength : 1级
             * humidity : 39%
             * time : 17:21
             */

            private String temp;
            private String wind_direction;
            private String wind_strength;
            private String humidity;
            private String time;

            public String getTemp() {
                return temp;
            }

            public void setTemp(String temp) {
                this.temp = temp;
            }

            public String getWind_direction() {
                return wind_direction;
            }

            public void setWind_direction(String wind_direction) {
                this.wind_direction = wind_direction;
            }

            public String getWind_strength() {
                return wind_strength;
            }

            public void setWind_strength(String wind_strength) {
                this.wind_strength = wind_strength;
            }

            public String getHumidity() {
                return humidity;
            }

            public void setHumidity(String humidity) {
                this.humidity = humidity;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }

        public static class TodayBean {
            @Override
            public String toString() {
                return "TodayBean{" +
                        "temperature='" + temperature + '\'' +
                        ", weather='" + weather + '\'' +
                        ", weather_id=" + weather_id +
                        ", wind='" + wind + '\'' +
                        ", week='" + week + '\'' +
                        ", city='" + city + '\'' +
                        ", date_y='" + date_y + '\'' +
                        ", dressing_index='" + dressing_index + '\'' +
                        ", dressing_advice='" + dressing_advice + '\'' +
                        ", uv_index='" + uv_index + '\'' +
                        ", comfort_index='" + comfort_index + '\'' +
                        ", wash_index='" + wash_index + '\'' +
                        ", travel_index='" + travel_index + '\'' +
                        ", exercise_index='" + exercise_index + '\'' +
                        ", drying_index='" + drying_index + '\'' +
                        '}';
            }

            /**
             * temperature : 20℃~31℃
             * weather : 晴转多云
             * weather_id : {"fa":"00","fb":"01"}
             * wind : 西南风微风
             * week : 星期五
             * city : 郑州
             * date_y : 2017年09月22日
             * dressing_index : 炎热
             * dressing_advice : 天气炎热，建议着短衫、短裙、短裤、薄型T恤衫等清凉夏季服装。
             * uv_index : 强
             * comfort_index :
             * wash_index : 较适宜
             * travel_index : 较适宜
             * exercise_index : 较适宜
             * drying_index :
             */

            private String temperature;
            private String weather;
            private WeatherIdBean weather_id;
            private String wind;
            private String week;
            private String city;
            private String date_y;
            private String dressing_index;
            private String dressing_advice;
            private String uv_index;
            private String comfort_index;
            private String wash_index;
            private String travel_index;
            private String exercise_index;
            private String drying_index;

            public String getTemperature() {
                return temperature;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public WeatherIdBean getWeather_id() {
                return weather_id;
            }

            public void setWeather_id(WeatherIdBean weather_id) {
                this.weather_id = weather_id;
            }

            public String getWind() {
                return wind;
            }

            public void setWind(String wind) {
                this.wind = wind;
            }

            public String getWeek() {
                return week;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getDate_y() {
                return date_y;
            }

            public void setDate_y(String date_y) {
                this.date_y = date_y;
            }

            public String getDressing_index() {
                return dressing_index;
            }

            public void setDressing_index(String dressing_index) {
                this.dressing_index = dressing_index;
            }

            public String getDressing_advice() {
                return dressing_advice;
            }

            public void setDressing_advice(String dressing_advice) {
                this.dressing_advice = dressing_advice;
            }

            public String getUv_index() {
                return uv_index;
            }

            public void setUv_index(String uv_index) {
                this.uv_index = uv_index;
            }

            public String getComfort_index() {
                return comfort_index;
            }

            public void setComfort_index(String comfort_index) {
                this.comfort_index = comfort_index;
            }

            public String getWash_index() {
                return wash_index;
            }

            public void setWash_index(String wash_index) {
                this.wash_index = wash_index;
            }

            public String getTravel_index() {
                return travel_index;
            }

            public void setTravel_index(String travel_index) {
                this.travel_index = travel_index;
            }

            public String getExercise_index() {
                return exercise_index;
            }

            public void setExercise_index(String exercise_index) {
                this.exercise_index = exercise_index;
            }

            public String getDrying_index() {
                return drying_index;
            }

            public void setDrying_index(String drying_index) {
                this.drying_index = drying_index;
            }

            public static class WeatherIdBean {
                /**
                 * fa : 00
                 * fb : 01
                 */

                private String fa;
                private String fb;

                public String getFa() {
                    return fa;
                }

                public void setFa(String fa) {
                    this.fa = fa;
                }

                public String getFb() {
                    return fb;
                }

                public void setFb(String fb) {
                    this.fb = fb;
                }
            }
        }

        public static class FutureBean {
            @Override
            public String toString() {
                return "FutureBean{" +
                        "day_20170922=" + day_20170922 +
                        ", day_20170923=" + day_20170923 +
                        ", day_20170924=" + day_20170924 +
                        ", day_20170925=" + day_20170925 +
                        ", day_20170926=" + day_20170926 +
                        ", day_20170927=" + day_20170927 +
                        ", day_20170928=" + day_20170928 +
                        '}';
            }

            /**
             * day_20170922 : {"temperature":"20℃~31℃","weather":"晴转多云","weather_id":{"fa":"00","fb":"01"},"wind":"西南风微风","week":"星期五","date":"20170922"}
             * day_20170923 : {"temperature":"19℃~30℃","weather":"多云转阴","weather_id":{"fa":"01","fb":"02"},"wind":"东南风3-4 级","week":"星期六","date":"20170923"}
             * day_20170924 : {"temperature":"20℃~24℃","weather":"中雨转小雨","weather_id":{"fa":"08","fb":"07"},"wind":"东风微风","week":"星期日","date":"20170924"}
             * day_20170925 : {"temperature":"20℃~23℃","weather":"小雨转中雨","weather_id":{"fa":"07","fb":"08"},"wind":"东北风微风","week":"星期一","date":"20170925"}
             * day_20170926 : {"temperature":"20℃~23℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"wind":"东北风微风","week":"星期二","date":"20170926"}
             * day_20170927 : {"temperature":"20℃~24℃","weather":"中雨转小雨","weather_id":{"fa":"08","fb":"07"},"wind":"东风微风","week":"星期三","date":"20170927"}
             * day_20170928 : {"temperature":"20℃~23℃","weather":"小雨转中雨","weather_id":{"fa":"07","fb":"08"},"wind":"东北风微风","week":"星期四","date":"20170928"}
             */

            private Day20170922Bean day_20170922;
            private Day20170923Bean day_20170923;
            private Day20170924Bean day_20170924;
            private Day20170925Bean day_20170925;
            private Day20170926Bean day_20170926;
            private Day20170927Bean day_20170927;
            private Day20170928Bean day_20170928;

            public Day20170922Bean getDay_20170922() {
                return day_20170922;
            }

            public void setDay_20170922(Day20170922Bean day_20170922) {
                this.day_20170922 = day_20170922;
            }

            public Day20170923Bean getDay_20170923() {
                return day_20170923;
            }

            public void setDay_20170923(Day20170923Bean day_20170923) {
                this.day_20170923 = day_20170923;
            }

            public Day20170924Bean getDay_20170924() {
                return day_20170924;
            }

            public void setDay_20170924(Day20170924Bean day_20170924) {
                this.day_20170924 = day_20170924;
            }

            public Day20170925Bean getDay_20170925() {
                return day_20170925;
            }

            public void setDay_20170925(Day20170925Bean day_20170925) {
                this.day_20170925 = day_20170925;
            }

            public Day20170926Bean getDay_20170926() {
                return day_20170926;
            }

            public void setDay_20170926(Day20170926Bean day_20170926) {
                this.day_20170926 = day_20170926;
            }

            public Day20170927Bean getDay_20170927() {
                return day_20170927;
            }

            public void setDay_20170927(Day20170927Bean day_20170927) {
                this.day_20170927 = day_20170927;
            }

            public Day20170928Bean getDay_20170928() {
                return day_20170928;
            }

            public void setDay_20170928(Day20170928Bean day_20170928) {
                this.day_20170928 = day_20170928;
            }

            public static class Day20170922Bean {
                /**
                 * temperature : 20℃~31℃
                 * weather : 晴转多云
                 * weather_id : {"fa":"00","fb":"01"}
                 * wind : 西南风微风
                 * week : 星期五
                 * date : 20170922
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanX weather_id;
                private String wind;
                private String week;
                private String date;

                @Override
                public String toString() {
                    return "Day20170922Bean{" +
                            "temperature='" + temperature + '\'' +
                            ", weather='" + weather + '\'' +
                            ", weather_id=" + weather_id +
                            ", wind='" + wind + '\'' +
                            ", week='" + week + '\'' +
                            ", date='" + date + '\'' +
                            '}';
                }

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanX {
                    /**
                     * fa : 00
                     * fb : 01
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20170923Bean {
                /**
                 * temperature : 19℃~30℃
                 * weather : 多云转阴
                 * weather_id : {"fa":"01","fb":"02"}
                 * wind : 东南风3-4 级
                 * week : 星期六
                 * date : 20170923
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanXX weather_id;
                private String wind;
                private String week;
                private String date;

                @Override
                public String toString() {
                    return "Day20170923Bean{" +
                            "temperature='" + temperature + '\'' +
                            ", weather='" + weather + '\'' +
                            ", weather_id=" + weather_id +
                            ", wind='" + wind + '\'' +
                            ", week='" + week + '\'' +
                            ", date='" + date + '\'' +
                            '}';
                }

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXX {
                    /**
                     * fa : 01
                     * fb : 02
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20170924Bean {
                /**
                 * temperature : 20℃~24℃
                 * weather : 中雨转小雨
                 * weather_id : {"fa":"08","fb":"07"}
                 * wind : 东风微风
                 * week : 星期日
                 * date : 20170924
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXX {
                    /**
                     * fa : 08
                     * fb : 07
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20170925Bean {
                /**
                 * temperature : 20℃~23℃
                 * weather : 小雨转中雨
                 * weather_id : {"fa":"07","fb":"08"}
                 * wind : 东北风微风
                 * week : 星期一
                 * date : 20170925
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanXXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXXX {
                    /**
                     * fa : 07
                     * fb : 08
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20170926Bean {
                /**
                 * temperature : 20℃~23℃
                 * weather : 小雨
                 * weather_id : {"fa":"07","fb":"07"}
                 * wind : 东北风微风
                 * week : 星期二
                 * date : 20170926
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanXXXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXXXX {
                    /**
                     * fa : 07
                     * fb : 07
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20170927Bean {
                /**
                 * temperature : 20℃~24℃
                 * weather : 中雨转小雨
                 * weather_id : {"fa":"08","fb":"07"}
                 * wind : 东风微风
                 * week : 星期三
                 * date : 20170927
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanXXXXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXXXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXXXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXXXXX {
                    /**
                     * fa : 08
                     * fb : 07
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20170928Bean {
                /**
                 * temperature : 20℃~23℃
                 * weather : 小雨转中雨
                 * weather_id : {"fa":"07","fb":"08"}
                 * wind : 东北风微风
                 * week : 星期四
                 * date : 20170928
                 */

                private String temperature;
                private String weather;
                private WeatherIdBeanXXXXXXX weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBeanXXXXXXX getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBeanXXXXXXX weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBeanXXXXXXX {
                    /**
                     * fa : 07
                     * fb : 08
                     */

                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Weather{" +
                "resultcode='" + resultcode + '\'' +
                ", reason='" + reason + '\'' +
                ", result=" + result +
                ", error_code=" + error_code +
                '}';
    }
}
