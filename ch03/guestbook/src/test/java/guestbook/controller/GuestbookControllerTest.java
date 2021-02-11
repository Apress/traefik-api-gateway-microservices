//package guestbook.controller;
//
//import guestbook.services.GuestbookService;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.ui.ExtendedModelMap;
//import org.springframework.ui.Model;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//
//@ExtendWith(MockitoExtension.class)
//class GuestbookControllerTest {
//
//    @Mock
//    private GuestbookService service;
//
//    @Test
//    void test() {
//        GuestbookController controller = new GuestbookController();
//        controller.guestbookService = service;
//        final Model model = new ExtendedModelMap();
//        String viewName = controller.guestBook(model);
//        assertEquals(viewName, "guestbook");
//        System.out.println(model);
//    }
//
//
//}