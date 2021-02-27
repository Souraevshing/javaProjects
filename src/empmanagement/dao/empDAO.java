/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empmanagement.dao;


import empmanagement.pojo.emp;
import empmanagement.dbutil.DBConnection;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class empDAO
{
    
    public static boolean addEmployee(emp e)throws SQLException
    {
        
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Insert into emp values(?,?,?,?,?)");
        ps.setInt(1, e.getEmpNo());
        ps.setString(2,e.getEname());
        ps.setInt(3, e.getEmpAge());
        ps.setDouble(4,e.getEmpSal());
        ps.setString(5, e.getEmpAddress());
        int result=ps.executeUpdate();
        if(result==1)
            return true;
        return false;
    }
    public static boolean updateEmployee(emp e)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update emp set name=?, age=?, salary=?, address=? where id=?");
        ps.setInt(5, e.getEmpNo());
        ps.setString(1,e.getEname());
        ps.setInt(2, e.getEmpAge());
        ps.setDouble(3,e.getEmpSal());
        ps.setString(4, e.getEmpAddress());
        int result=ps.executeUpdate();
        if(result==1)
            return true;
        return false;
    }
    public static boolean deleteEmployee(int empNo)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("delete from emp where id=?");
        ps.setInt(1, empNo);
        int result = ps.executeUpdate();
        if(result==1)
            return true;
        return false;
    }
    public static emp findBEmployeeById(int empNo)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Select * from emp where id=?");
        ps.setInt(1, empNo);
        ResultSet rs=ps.executeQuery();
        emp e=null;
        if(rs.next())
        {
            e=new emp();
            e.setEmpNo(rs.getInt(1));
            e.setEname(rs.getString(2));
            e.setEmpAge(rs.getInt(3));
            e.setEmpSal(rs.getDouble(4));
            e.setEmpAddress(rs.getString(5));    
        }
        return e;
        
    }
    public static ArrayList<emp> getAllEmployees() throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ArrayList<emp> empList=new ArrayList<>();
        ResultSet rs=st.executeQuery("Select * from emp order by id");
        while(rs.next())
        {
            emp e=new emp();
            e.setEmpNo(rs.getInt(1));
            e.setEname(rs.getString(2));
            e.setEmpAge(rs.getInt(3));
            e.setEmpSal(rs.getDouble(3));
            e.setEmpAddress(rs.getString(5));
            empList.add(e);
        }
        return empList;
    }
    
}
