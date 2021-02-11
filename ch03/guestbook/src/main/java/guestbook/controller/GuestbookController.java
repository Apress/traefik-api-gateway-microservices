package guestbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class GuestbookController {
    private GuestbookEntryVO savedValue;
    @Value("${appName}")
    private String appName;

    @Value("${error:false}")
    private boolean errorOnly;

  //  @ResponseStatus(HttpStatus.BAD_REQUEST)
    @GetMapping({"/"})
    public String guestBook(Model model) {
        if(errorOnly){
            throw new RuntimeException("Application Error");
        }
        model.addAttribute("guestbookentry", new GuestbookEntryVO());
        model.addAttribute("latest",savedValue);
        model.addAttribute("appName",appName);
        return "guestbook";
    }

    @PostMapping({"/"})
    public String postGuestBook(GuestbookEntryVO entryVO, Model model) {
        if(errorOnly){
            throw new RuntimeException("Application Error");
        }
        System.out.println("Saving  :" + entryVO);
        savedValue = entryVO;
        return "redirect:/";
    }
}