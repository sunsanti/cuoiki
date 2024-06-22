/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CuoiKi2;

class User {
    private String name,status;
    public User(String name,String status){
        this.name = name;
        this.status = status;
    }
    public String getName(){
        return this.name;
    }
    public String getStatus(){
        return this.status;
    }
}
