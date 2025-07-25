package controllers;

import play.mvc.*;

import play.data.FormFactory;
import play.data.Form;
import javax.inject.Inject;
import forms.FooForm;
import play.mvc.Http.Request;
import play.i18n.Messages;
import play.i18n.MessagesApi;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    private final FormFactory formFactory;
    private final MessagesApi messagesApi;

    @Inject
    public HomeController(FormFactory formFactory, MessagesApi messagesApi) {
        this.formFactory = formFactory;
        this.messagesApi = messagesApi;
    }
    

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index( Http.Request request ) {
        Messages messages = messagesApi.preferred( request );

        Form<FooForm> form = formFactory.form(FooForm.class);

        return ok(views.html.index.render(form, request, messages));
    }

    public Result submitForm() {
        // Handle form submission


        return ok("Form submitted");
    }

}
