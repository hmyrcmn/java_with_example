/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractdemo;

/**
 *
 * @author humey
 */
public class SqlDateBaseManager extends BaseDataManager {

    public SqlDateBaseManager() {
    }

    @Override
    public void getData() {
        System.out.println("veri getirildi: sql");
    }
    
}
