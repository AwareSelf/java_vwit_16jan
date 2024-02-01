package junit.nama.mockito;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RepoService {
    private Repository repository;

    public RepoService(Repository repository) {
        this.repository = repository;
    }

    public List<String> getStuffWithLengthLessThanFive() {
        try {
            return repository.getStuff().stream()
                    .filter(stuff -> stuff.length() < 5)
                    .collect(Collectors.toList());
        } catch (SQLException e) {
            return Arrays.asList();
        }
    }
}