package com.jnshu.backendsystem.pojo;

import java.util.HashMap;

public class Result {

        private Integer code;
        private String message;
        private HashMap data;

        public Integer getCode() {
            return code;
        }

        public void setCode(Integer code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public HashMap getData() {
            return data;
        }

        public void setData(HashMap data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Info{" +
                    "code=" + code +
                    ", message='" + message + '\'' +
                    ", data=" + data +
                    '}';
        }
    }


