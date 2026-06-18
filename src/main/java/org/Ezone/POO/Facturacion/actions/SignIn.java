package org.Ezone.POO.Facturacion.actions;

import com.openxava.naviox.actions.ForwardToOriginalURIBaseAction;
import com.openxava.naviox.impl.SignInHelper;
import org.openxava.util.Is;

public class SignIn extends ForwardToOriginalURIBaseAction {

    public void execute() throws Exception {
        SignInHelper.initRequest(getRequest(), getView());
        if (getErrors().contains()) return;
        String userName = getView().getValueString("user");
        String password = getView().getValueString("password");
        if (Is.emptyString(userName, password)) {
            addError("USUARIO INVALIDO");
            return;
        }
        if (!SignInHelper.isAuthorized(getRequest(), userName, password, getErrors())) {
            return;
        }
        SignInHelper.signIn(getRequest(), userName);
        getView().reset();
        getContext().resetAllModulesExceptCurrent(getRequest());
        forwardToOriginalURI();
    }
}
