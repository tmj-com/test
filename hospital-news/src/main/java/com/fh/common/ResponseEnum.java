package com.fh.common;

public enum ResponseEnum {
    SUCCESS(200,"操作成功"),
    ERROR(1000,"操作失败"),
    CODE_ERROR(10001,"短信发送失败"),
    CODE_PHONESUCCESS(10002,"短信发送成功"),
    CODE_PHONENULL(10003,"手机号为空"),
    MEMBERNAME(10004,"会员账号已注册"),
    MEMBERPHONE(10005,"手机号已被使用"),
    VERIFICATION_CODE_ERROR(10006,"验证码错误"),
    VERIFICATION_CODE_EXPIRED(10007,"验证码不存在"),
    MEMBERNAME_IS_NULL(10008,"会员账号为空"),
    MEMBERPASSWORD_IS_NULL(10009,"会员密码为空"),
    MEMBERNAMEALL_IS_NULL(10010,"会员信息为空"),
    MEMBERNAME_NULL(10011,"会员名称不存在"),
    MEMBERPASSWORD_NULL(10012,"会员密码错误"),
    PRODUCT_IS_NULL(10013,"商品信息为空"),
    PRODUCT_IS_DOWN(10014,"商品已下架"),
    CART_IS_NULL(10015,"购物车为空"),
    PAY_IS_NULL(10016,"pay信息为空"),
    PAY_GUOQI(10016,"二维码信息过期")
    ;
    private int code;
    private String msg;

    ResponseEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
