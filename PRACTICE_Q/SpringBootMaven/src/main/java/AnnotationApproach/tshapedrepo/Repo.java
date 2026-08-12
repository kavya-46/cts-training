package AnnotationApproach.tshapedrepo;
import org.springframework.stereotype.Repository;
@Repository

public class Repo {
    public Repo() {
        System.out.println("repository bean created");
    }
}
