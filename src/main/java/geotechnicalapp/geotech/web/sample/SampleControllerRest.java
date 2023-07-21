package geotechnicalapp.geotech.web.sample;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Sanjeet Baidya
 */
@RestController
@RequestMapping(path = "/sample")
public class SampleControllerRest {

    @GetMapping()
    public ResponseEntity<?> getSample() {
        return new ResponseEntity<>(UUID.randomUUID(), HttpStatus.OK);

    }

    public ResponseEntity<?> postSample(@RequestBody String simpleString) {
        return new ResponseEntity<>(simpleString, HttpStatus.OK);
    }
}