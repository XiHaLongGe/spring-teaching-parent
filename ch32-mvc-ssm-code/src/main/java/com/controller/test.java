package com.controller;

import lombok.Data;

/**
 * @Author: LJP
 * @Classname test
 * @Date: 2019-11-26 08:06
 * @Description:
 */
@Data
public class test {
    private String code;
    private String msg;
    private Object data;
    private test(Builder builder){
        setCode(builder.code);
        setMsg(builder.msg);
        setData(builder.data);
    }
    public static Builder newBuilder() {
        return new Builder();
    }
    public static final class Builder{
        private String code;
        private String msg;
        private Object data;
        public Builder code(String val) {
            code = val;
            return this;
        }

        public Builder msg(String val) {
            msg = val;
            return this;
        }

        public Builder data(Object val) {
            data = val;
            return this;
        }

        public test build() {
            return new test(this);
        }
    }

    public static void main(String[] args) {
        test test = new
    }
}