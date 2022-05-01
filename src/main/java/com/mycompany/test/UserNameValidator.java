/**
 * Name:            UserNameValidator
 * Aufgabe:         Validation des Usernames im Backend
 * Version:         1.0
 * Letzte Änderung: 01.05.2022
 * Realisierung     Sascha Nickel
 */


import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator(value="userNameValidator")
public class UserNameValidator implements Validator{

    @Override
    public void validate(FacesContext fc, UIComponent uic, Object obj) 
            throws ValidatorException {
        
        String userName = obj.toString();
        FacesMessage fm;
        
        if(userName.length()>=5 && Character.isLetter(userName.charAt(0)))
        {
           fm = new FacesMessage("Login-Name formal korrekt!");
           FacesContext.getCurrentInstance().addMessage(uic.getClientId(), fm);
        }
        else
        {
            fm = new FacesMessage("Hinweis: min. 5 Zeichen!");
            throw new ValidatorException(fm);
        }
        
    }

}
