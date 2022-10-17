package com.example.travisguo.myapplication.tools;

import android.content.*;
import android.content.Context;
import android.content.SharedPreferences;



public class MySharedPerference {

    private String xmlfileString = "appSetting";
    private SharedPreferences sharedPreferences;
    private String et_device_id;
    private String server_address;
    private String et_air_condition_id;
    private String et_humi_device_id;
    private String et_monitor_id;
    private String et_light_device_id;
    private String et_window_controller_id;
    private String et_iotcloud_passwd;
    private String et_iotcloud_user ;
    private String et_camera_address;
    private String et_humi_therthod;
    private String et_light_threthod;
    private String et_temp_therthod;

    public String getEt_air_condition_id() {
        et_air_condition_id = this.sharedPreferences.getString("et_air_condition_id","0");
        return et_air_condition_id;
    }

    public void setEt_air_condition_id(String et_air_condition_id) {
        SharedPreferences.Editor editor = this.sharedPreferences.edit();
        editor.putString("et_air_condition_id",et_air_condition_id);
        this.et_air_condition_id = et_air_condition_id;
    }

    public String getEt_humi_device_id() {
        et_humi_device_id = this.sharedPreferences.getString("et_humi_device_id","0");
        return et_humi_device_id;
    }

    public void setEt_humi_device_id(String et_humi_device_id) {
        SharedPreferences.Editor editor = this.sharedPreferences.edit();
        editor.putString("et_humi_device_id",et_humi_device_id);
        this.et_humi_device_id = et_humi_device_id;
    }

    public String getEt_monitor_id() {
        et_monitor_id = this.sharedPreferences.getString("et_monitor_id","0");
        return et_monitor_id;
    }

    public void setEt_monitor_id(String et_monitor_id) {
        SharedPreferences.Editor editor = this.sharedPreferences.edit();
        editor.putString("et_monitor_id","0");
        this.et_monitor_id = et_monitor_id;
    }

    public String getEt_light_device_id() {
        et_light_device_id = this.sharedPreferences.getString("et_light_device_id","0");
        return et_light_device_id;
    }

    public void setEt_light_device_id(String et_light_device_id) {
        SharedPreferences.Editor editor = this.sharedPreferences.edit();
        editor.putString("et_light_device_id","0");
        this.et_light_device_id = et_light_device_id;
    }

    public String getEt_window_controller_id() {
        et_window_controller_id = this.sharedPreferences.getString("et_window_controller_id","0");
        return et_window_controller_id;
    }

    public void setEt_window_controller_id(String et_window_controller_id) {
        SharedPreferences.Editor editor = this.sharedPreferences.edit();
        editor.putString("et_window_controller_id","0");
        this.et_window_controller_id = et_window_controller_id;
    }

    public String getEt_iotcloud_passwd() {
        et_iotcloud_passwd = this.sharedPreferences.getString("et_iotcloud_passwd","0");
        return et_iotcloud_passwd;
    }

    public void setEt_iotcloud_passwd(String et_iotcloud_passwd) {
        SharedPreferences.Editor editor = this.sharedPreferences.edit();
        editor.putString("et_iotcloud_passwd",server_address);
        this.et_iotcloud_passwd = et_iotcloud_passwd;
    }

    public String getEt_iotcloud_user() {
        et_iotcloud_user = this.sharedPreferences.getString("et_iotcloud_user","0");
        return et_iotcloud_user;
    }

    public void setEt_iotcloud_user(String et_iotcloud_user) {
        SharedPreferences.Editor editor = this.sharedPreferences.edit();
        editor.putString("et_iotcloud_user",server_address);
        this.et_iotcloud_user = et_iotcloud_user;
    }

    public String getEt_camera_address() {
        et_camera_address = this.sharedPreferences.getString("et_camera_address","0");
        return et_camera_address;
    }

    public void setEt_camera_address(String et_camera_address) {
        SharedPreferences.Editor editor = this.sharedPreferences.edit();
        editor.putString("et_camera_address",server_address);
        this.et_camera_address = et_camera_address;
    }

    public String getEt_humi_therthod() {
        et_humi_therthod = this.sharedPreferences.getString("et_humi_therthod","0");
        return et_humi_therthod;
    }

    public void setEt_humi_therthod(String et_humi_therthod) {
        SharedPreferences.Editor editor = this.sharedPreferences.edit();
        editor.putString("et_humi_therthod",server_address);
        this.et_humi_therthod = et_humi_therthod;
    }

    public String getEt_light_threthod() {
        et_light_threthod = this.sharedPreferences.getString("et_light_threthod","0");
        return et_light_threthod;
    }

    public void setEt_light_threthod(String et_light_threthod) {
        SharedPreferences.Editor editor = this.sharedPreferences.edit();
        editor.putString("et_light_threthod",server_address);
        this.et_light_threthod = et_light_threthod;
    }

    public String getEt_temp_therthod() {
        et_temp_therthod = this.sharedPreferences.getString("et_temp_therthod","0");
        return et_temp_therthod;
    }

    public void setEt_temp_therthod(String et_temp_therthod) {
        SharedPreferences.Editor editor = this.sharedPreferences.edit();
        editor.putString("et_temp_therthod",server_address);
        this.et_temp_therthod = et_temp_therthod;
    }

    public String getServer_address() {
        server_address = this.sharedPreferences.getString("server_address","0");
        return server_address;
    }

    public void setServer_address(String server_address) {

        SharedPreferences.Editor editor = this.sharedPreferences.edit();
        editor.putString("server_address",server_address);
        this.server_address = server_address;
    }


    public String getEt_device_id() {
        et_device_id = this.sharedPreferences.getString("et_device_id","0");
        return et_device_id;
    }

    public void setEt_device_id(String et_device_id) {
        SharedPreferences.Editor editor = this.sharedPreferences.edit();
        editor.putString("et_device_id",server_address);
        this.et_device_id = et_device_id;
    }




    public MySharedPerference(Context context){
        sharedPreferences = context.getSharedPreferences(xmlfileString,Context.MODE_PRIVATE);
    }
}

