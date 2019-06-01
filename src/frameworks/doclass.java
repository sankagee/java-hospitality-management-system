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
public class doclass {
    private int did;
    private String dname;
    private String dexp;
    private String djoindate;


    
    public doclass(int did,String dname,String dexp,String djoindate){
        this.did=did;
        this.dname=dname;
        this.dexp=dexp;
        this.djoindate=djoindate;
    }
    public int getdid(){
        return did;
    }
    public void setdid(int did){
        this.did=did;
    }
    public String getdname(){
        return dname;
    }
    public void setdname(String dname){
        this.dname=dname;
    }
    public String getdexp(){
        return dexp;
    }
    public void setdexp(String dexp){
        this.dexp=dexp;
    }
    public String getdjoindate(){
        return djoindate;
    }
    public void setdjoindate(String djoindate){
        this.djoindate=djoindate;
    }
}
