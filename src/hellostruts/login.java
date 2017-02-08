package hellostruts;

import com.opensymphony.xwork2.ActionSupport;  
import javax.servlet.http.HttpServletRequest;  
import org.apache.struts2.ServletActionContext;  
  
public class login extends ActionSupport {  
    HttpServletRequest req = ServletActionContext.getRequest();  
    String username = req.getParameter("username");  
    String password = req.getParameter("password");  
      
    public String login() {  
        if(username.equals("Leafage") && password.equals("123456")) {  
            return "success";  
        } else {  
            return "error";  
        }  
    }  
}  
