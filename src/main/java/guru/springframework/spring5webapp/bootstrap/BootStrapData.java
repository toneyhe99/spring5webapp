package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Auther;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.repository.AutherRepository;
import guru.springframework.spring5webapp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    @Autowired
    private AutherRepository autherRepository;
    @Autowired
    private BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        Auther a1 = new Auther("John1", "name1");
        Book b1 = new Book("Book1", "123123");
        a1.getBooks().add(b1);
        b1.getAuthers().add(a1);
        autherRepository.save(a1);
        bookRepository.save(b1);
        System.out.println(autherRepository.count());

        Auther a2 = new Auther("John2", "name2");
        Book b2 = new Book("Book2", "456456");
        autherRepository.save(a2);
        bookRepository.save(b2);
        System.out.println(autherRepository.count());
    }
}
