package com.buildinglife.mall.enums;

public enum  ExceptionCode {
    /************************** 业务异常在平板展示给用户 **************************/
    REQUEST_SUCCESS("A-00000", "成功!"),
    SERVICE_EXCEPTION_ERROR("A-00001", "服务异常"),
    USER_LOGIN_TIMEOUT("A-00002", "登录超时"),
    LOGIN_FAILURE("A-000013","登录已失效，请重新登录"),
    TOKEN_ERROR("A-000014","token错误，请重新登录"),

    VAILDATE_MOBILE_ERROR("A-00003", "手机号码错误"),
    USER_VERIFACATION_CODE_DUPLICATION_ERROR("A-00004", "最后一次发送的验证码还有效，请勿频繁获取"),
    SMS_SEND_ERROR("A-00005", "短信验证码发送失败"),
    DELETE_USER_CONTACT_FAIL("A-00006","删除联系人失败"),
    RECHARGEAMOUNT_ERROR("A-00007", "请输入[1,9999]之间的充值金额"),
    CONTACT_OUT_HOSPITAL("A-00008", "联系人已出院，无法充值"),
    CONTACT_NOT_EXIST("A-00009", "联系人不存在"),

    /************************** 系统异常，不给用户展示，但是需要返回给前端 **************************/
    REQUEST_PARAM_ERROR("B-00001", "参数错误"),
    SQL_EXECUTE_FAILURE("B-00002", "SQL执行失败"),
    REQUEST_PARAM_MISSING("B-00003","缺少参数"),
    SYSTEM_EXCEPTION("B-00005","系统异常"),
    WXPAY_ERROR("B-00007", "调用微信接口异常"),
    ALIPAY_CONFIG_MISSING("B-00008", "未查找到该院的支付宝支付配置"),
    WX_CONFIG_MISSING("B-00009", "未查找到该院的微信支付配置"),
    ALIPAY_ERROR("B-00010", "调用支付宝接口异常"),
    CONNECT_JIGUANG_SERVER_FAIL("B-00011", "极光连接推送服务器失败"),
    SEND_JIGUANG_MESSAGE_FAIL("B-00012", "极光推送消息请求失败"),
    USERINFO_SAVE_REDIS_FAIL("B-00015", "登录信息存入缓存失败"),
    UNKNOWN_ERROR("B-00016", "未知错误!"),
    USER_INFO_IS_NOT_EXIST("B-00018","用户信息不存在"),
    LOGIN_INFO_IS_NOT_EXIST("B-00019","用户登录信息不存在"),
    REPEAT_DATA_EXCEPTION("B-00020","存在重复数据"),
    USER_NAME_AREADY_EXIST("B-00021","用户名已存在"),
    WORK_NUMBER_AREADY_EXIST("B-00022","工号已存在"),
    DATA_AREADY_EXIST("B-00023","数据已存在"),
    ROLE_AREADY_EXIST("B-00024","角色名或者角色编码已存在"),
    CONTACT_ID_EXCEPTION("B-00028","联系人ID为空"),
    ORDER_NUM_IS_NOT_EXIST("B-00029","订单号不存在"),
    SMS_EXCEPTION("B-00040","发送短信失败"),
    DATA_NOT_EXIST("B-00041","数据不存在"),
    ;

    private final String code;
    private final String msg;

    private ExceptionCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    ExceptionCode(String code){
        this.code = code;
        this.msg = ExceptionCode.getMsgByCode(code);
    }

    public String getCode() {
        return code;
    }

    public static String getMsgByCode(String code) {
        for (ExceptionCode exceptionCode : ExceptionCode.values()) {
            if (code.equals(exceptionCode.getCode())) {
                return exceptionCode.getMsg();
            }
        }
        return null;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "ExceptionCode{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
