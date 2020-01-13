package com.fh.util;

public class SystemConstant {
    public static final  String TEMPLATE_PATH="/template";
    public static final  String EXCEL_FILE_PATH="D:/outFile/";
    public static final  String EXCEL_TIMPATE_FILE_PATH="bbb.xml";
    public static final  String WORD_TIMPATE_FILE_PATH="word-template.xml";
    public static final  String PDF_TIMPATE_FILE_PATH="pdf-template.html";
    public static final  String UPLOAD_FILE_PATH="upload";
    public static final  int LOGGIN_USERNAME_ERROR=1;
    public static final  int LOGGIN_PASSWORD_ERROR=2;
    public static final  int LOGGIN_SUCCESS=3;
    public static final  String LOGGIN_CURRENT_USER="user:";
    public static final  String TOKENKEY="token:";

    public static final  String COOKIE_KEY="login";
    public static final  String PAY_KEY="pay";
    public static final  int COOKIE_OUT_TIME=7*24*60*60;
    public static final  int COOKIE_OUT_TIME_DEFAULT=30*60;
    public static final  int CODE_OUT_TIME=5*60;//设置验证码过期时间
    public static final  int TOKRN_OUT_TIME=7*24*60*60;//设置token过期时间
    public static final  int LOG_ERROR=0;
    public static final  int LOG_SUCCESS=1;
    public static final  String LOGIN_PAGE="/login.jsp";
    public static final  String SECRET_KEY="$t@m&jaaada";//密钥
    public static final  String AJAX_SESSION_OUT="timeOut";
    public static final  int ADD_PRODUCT_LIST_SIZE =10;
    public static final String  CURRENT_RESOURCELIST="current_menu:";//当前用户所拥有的资源 key
    public static final String  ALL_RESOURCELIST="all_menu:";//所有的资源 key
    public static final  String C_CODE ="code";//状态码
    public static final  String CATEGORYLIST ="categoryList";
    public static final  String TOKENISNULL ="token为空";
    public static final  String TOKENIERROR ="该用户为登录";
    public static final  String TOKENISUBMIT ="token重复提交";
    public static final  String MEMBERNAMEALL_IS_NULL ="用户信息为空";
    public static final String  CART_KEY="cart:";//购物车 key
    public static final String  PRODUCT_IS_DOWN="商品已下架";
    public static final String  PRODUCT_IS_NUL="商品信息为空";
    public static final String  CART_IS_UNDERSTOCK="订单信息为空";
    public static final String  PAY_STUDENT="订单已超市";
    public static final int  ORDER_STATUS=1;//支付中
    public static final int  ORDER_SUCCESS=2;//已支付


}
