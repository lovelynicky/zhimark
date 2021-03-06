package com.spring.mvc.model.gson.ecoPort;

/**
 * Created by liluoqi on 15/5/1.
 */
public class EcoPortJKFGoodsPurchaserGson {
    //购买人ID
    private String id;//必填
    //姓名
    private String name;//必填
    //注册邮箱
    private String email;//非必填
    //联系电话
    private String telNumber;//必填
    //证件类型代码
    private String paperType;//非必填
    //证件号码
    private String paperNumber;//非必填
    //地址
    private String address;//非必填

    public EcoPortJKFGoodsPurchaserGson(){

    }

    public EcoPortJKFGoodsPurchaserGson(String id, String name, String email, String telNumber, String paperType, String paperNumber,
                                        String address){
        this.id=id;
        this.name=name;
        this.email=email;
        this.telNumber=telNumber;
        this.paperNumber=paperNumber;
        this.paperType=paperType;
        this.address=address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getPaperType() {
        return paperType;
    }

    public void setPaperType(String paperType) {
        this.paperType = paperType;
    }

    public String getPaperNumber() {
        return paperNumber;
    }

    public void setPaperNumber(String paperNumber) {
        this.paperNumber = paperNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
