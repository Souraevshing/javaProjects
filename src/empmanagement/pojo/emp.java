/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empmanagement.pojo;

/**
 *
 * @author Lenovo
 */
public class emp
{
  
     public emp()
     {
         
     }
     public emp(int empNo, String ename,int eage, double empSal) {
        this.empNo = empNo;
        this.ename = ename;
        this.empSal = empSal;
        this.eage = eage;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getEmpSal() {
        return empSal;
    }

    public void setEmpSal(double empSal) {
        this.empSal = empSal;
    }
    
     public int getEmpAge() {
        return eage;
    }
     
     public void setEmpAge(int eage) {
        this.eage = eage;
    }
     
     public String getEmpAddress() {
        return eaddress;
    }
     
     public void setEmpAddress(String eaddress) {
        this.eaddress = eaddress;
    }
    private int empNo;
    private String ename;
    private double empSal;
    private int eage;
    private String eaddress;
}

