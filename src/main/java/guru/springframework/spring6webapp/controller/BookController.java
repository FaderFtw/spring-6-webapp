package guru.springframework.spring6webapp.controller;


import guru.springframework.spring6webapp.domain.Book;
import guru.springframework.spring6webapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/books")
    public String getBooks(Model model){
        model.addAttribute("books", bookService.findAll());
        return "books";
    }

}
