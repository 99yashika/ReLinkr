package com.example.relinkr;

import android.database.sqlite.SQLiteDatabase;

public class UserAccount {
    public String Table_Name = "UserAccount";

    private String col1 = "firstname";
    private String col2 = "lastame";
    private String col3 = "address";
    private String col4 = "mobile";
    private String col5 = "dob";
    private String col6 = "email";
    private String col7 = "password";
    private String col8 = "city";
    private String col9 = "pincode";

    public UserAccount(){}

    public UserAccount(SQLiteDatabase db, String email, String pass){

    }

    public UserAccount(SQLiteDatabase db){
        db.execSQL("CREATE TABLE "+Table_Name+ "("+""+""+col1+" VARCHAR(30) " +
                ","+""+col2+" VARCHAR(100),"+""+col3+" VARCHAR(50),"+""+col4+" INTEGER(30),"+""+col5+" VARCHAR(30),"+""+col6+" VARCHAR(50),"+""+col7+" VARCHAR(15),"+""+col8+" VARCHAR(30),"+""+col9+" INTEGER(6));");
    }

    public UserAccount(String col1, String col2, String col3, String col4, String col5,String col6,String col7,String col8,String col9){
        this.col1 = col1;
        this.col2 = col2;
        this.col3 = col3;
        this.col4 = col4;
        this.col5 = col5;
        this.col6 = col6;
        this.col7 = col7;
        this.col8 = col8;
        this.col9 = col9;
    }
    public String getCol1(){
        return col1;
    }
    public void setCol1(String col1){
        this.col1 = col1;
    }
    public String getCol2(){
        return col2;
    }
    public void setCol2(String col1){
        this.col2 = col2;
    }
    public String getCol3(){
        return col3;
    }
    public void setCol3(String col3){
        this.col3 = col3;
    }
    public String getCol4(){
        return col4;
    }
    public void setCol4(String col4){
        this.col4 = col4;
    }
    public String getCol5(){
        return col5;
    }
    public void setCol5(String col5){
        this.col5 = col5;
    }
    public String getCol6(){
        return col6;
    }
    public void setCol6(String col6){
        this.col6 = col6;
    }
    public String getCol7(){
        return col7;
    }
    public void setCol7(String col7){
        this.col7 = col7;
    }
    public String getCol8(){
        return col8;
    }
    public void setCol8(String col8){
        this.col8 = col8;
    }
    public String getCol9(){
        return col9;
    }
    public void setCol9(String col9){
        this.col9 = col9;
    }

    public String getTable_Name() {
        return Table_Name;
    }

    public void setTable_Name(String table_Name) {
        Table_Name = table_Name;
    }

    public UserAccount(String col6, String col7){
        this.col6 = col6;
        this.col7 = col7;
    }

}
