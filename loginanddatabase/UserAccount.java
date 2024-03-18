package com.minseok.loginanddatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;



public class UserAccount  {
    public UserAccount() {

    }


    private String mommo;
    private String emailId;
    public int a=12;
    private String idToken;




    public String getIdToken(){ return idToken;}

    public void setIdToken(String idToken){

        this.idToken= idToken;

    }




    public String getEmailId(){
        return emailId;}


    //내부 에 설정=set
    public void setEmailId(String emailId){

        this.emailId=emailId;}




    //반환하는건 get메서드
    //즉 get,set메서드 ㅇㅇ
    public String getPassword() {   return password;}

    public void setPassword(String password){this.password=password;}
    private String password;


    public String getMommo() {
        return mommo;
    }

    public void setMommo(String mommo) {
        this.mommo = mommo;
    }
}