/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frameworks;

/**
 *
 * @author SankA
 */
public class appclass {
    private int id;
    private String name;
    private String address;
    private int phonenumber;
    private String gender;
    private String dob;
    
    public appclass(int id,String name,String address,int phonenumber,String gender,String dob){
        this.id=id;
        this.name=name;
        this.address=address;
        this.phonenumber=phonenumber;
        this.gender=gender;
        this.dob=dob;
    }

    public int getid(){
        return id;
    }
    public void setid(int id){
        this.id=id;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public String getaddress(){
        return address;
    }
    public void setaddress(String address){
        this.address=address;
    }
    public int getphonenumber(){
        return phonenumber;
    }
    public void setphonenumber(int phonenumber){
        this.phonenumber=phonenumber;
    }
    public String getgender(){
        return gender;
    }
    public void setgender(String gender){
        this.gender=gender;
    }
    public String getdob(){
        return dob;
    }
    public void setdob(String dob){
        this.dob=dob;
    }
}
