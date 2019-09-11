/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handlers;

/**
 *
 * @author kenca
 */
public class Configuration {
     private boolean simplify_exit=false;
    private boolean simplify_navigation=false;
    private boolean remove_settings=false;
    private String default_library="ayyy;ayy";
    private boolean password_protection=false;
    private String password="123";

    public Configuration(boolean simplify_exit,boolean simplify_navigation,boolean remove_settings,String default_library,boolean password_protection,String password) {
        this.simplify_exit=simplify_exit;
        this.simplify_navigation=simplify_navigation;
        this.remove_settings=remove_settings;
        this.default_library=default_library;
        this.password_protection=password_protection;
        this.password=password;
    }
    
    public boolean isSimplify_exit() {
        return simplify_exit;
    }

    public boolean isSimplify_navigation() {
        return simplify_navigation;
    }

    public boolean isRemove_settings() {
        return remove_settings;
    }

    public String getDefault_library() {
        return default_library;
    }

    public boolean isPassword_protection() {
        return password_protection;
    }

    public String getPassword() {
        return password;
    }
}
