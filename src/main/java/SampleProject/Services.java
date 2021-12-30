package SampleProject;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface Services {
    //declaration
    public List<String> getInformation(String userName);
}
