package com.custom.example.frameworkdemo.Retrofit;

/**
 * Created by Administrator on 2017/9/22 0022.
 */

public class MsgQQ {

    /**
     * error_code : 0
     * reason : success
     * result : {"data":{"conclusion":"[大吉]草木逢春，枯叶沾露，稳健着实，必得人望","analysis":"挽回家运矣春光，顺调发展财辉煌，温和笃实阴阳合，稳健顺调得人望。顺风满帆而容易有所成就，易取富贵人生。外缘殊胜，容易得人之助力及予人好印象。"}}
     */

    private int error_code;
    private String reason;
    private ResultBean result;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
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

    public static class ResultBean {
        /**
         * data : {"conclusion":"[大吉]草木逢春，枯叶沾露，稳健着实，必得人望","analysis":"挽回家运矣春光，顺调发展财辉煌，温和笃实阴阳合，稳健顺调得人望。顺风满帆而容易有所成就，易取富贵人生。外缘殊胜，容易得人之助力及予人好印象。"}
         */

        private DataBean data;

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * conclusion : [大吉]草木逢春，枯叶沾露，稳健着实，必得人望
             * analysis : 挽回家运矣春光，顺调发展财辉煌，温和笃实阴阳合，稳健顺调得人望。顺风满帆而容易有所成就，易取富贵人生。外缘殊胜，容易得人之助力及予人好印象。
             */

            private String conclusion;
            private String analysis;

            public String getConclusion() {
                return conclusion;
            }

            public void setConclusion(String conclusion) {
                this.conclusion = conclusion;
            }

            public String getAnalysis() {
                return analysis;
            }

            public void setAnalysis(String analysis) {
                this.analysis = analysis;
            }
        }
    }
}
