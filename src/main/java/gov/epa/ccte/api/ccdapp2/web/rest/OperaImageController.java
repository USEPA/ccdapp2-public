package gov.epa.ccte.api.ccdapp2.web.rest;

import gov.epa.ccte.api.ccdapp2.domain.opera.OperaImage;
import gov.epa.ccte.api.ccdapp2.repository.OperaImageRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

import static org.springframework.http.MediaType.IMAGE_PNG;

@Slf4j
@RestController
public class OperaImageController {

    private final OperaImageRepository operaImageRepository;

    public OperaImageController(OperaImageRepository operaImageRepository) {
        this.operaImageRepository = operaImageRepository;
    }

    @RequestMapping(value = "/opera-image/histo-graph/by-dtxsid/{id}/{modelId}", method = RequestMethod.GET)
    public @ResponseBody
    ResponseEntity<byte[]> getHistoGraphImageForDtxsid(@PathVariable("id") String id, @PathVariable("modelId") int modelId) throws IOException {
        OperaImage image = operaImageRepository.findBydtxsidAndModelId(id, modelId);
        return ResponseEntity.ok().contentType(IMAGE_PNG).body(image.getHistoGraph());

    }

    @RequestMapping(value = "/opera-image/scatter-graph/by-dtxsid/{id}/{modelId}", method = RequestMethod.GET)
    public @ResponseBody
    ResponseEntity<byte[]> getscatterGraphImageForDtxsid(@PathVariable("id") String id, @PathVariable("modelId") int modelId) throws IOException {
        OperaImage image = operaImageRepository.findBydtxsidAndModelId(id, modelId);
        return ResponseEntity.ok().contentType(IMAGE_PNG).body(image.getScatterGraph());

    }

    @RequestMapping(value = "/opera-image/histo-graph/by-dtxcid/{id}/{modelId}", method = RequestMethod.GET)
    public @ResponseBody
    ResponseEntity<byte[]> getHistoGraphImageForDtxcid(@PathVariable("id") String id, @PathVariable("modelId") int modelId) throws IOException {
        OperaImage image = operaImageRepository.findBydtxcidAndModelId(id, modelId);
        return ResponseEntity.ok().contentType(IMAGE_PNG).body(image.getHistoGraph());

    }

    @RequestMapping(value = "/opera-image/scatter-graph/by-dtxcid/{id}/{modelId}", method = RequestMethod.GET)
    public @ResponseBody
    ResponseEntity<byte[]> getscatterGraphImageForDtxcid(@PathVariable("id") String id, @PathVariable("modelId") int modelId) throws IOException {
        OperaImage image = operaImageRepository.findBydtxcidAndModelId(id, modelId);
        return ResponseEntity.ok().contentType(IMAGE_PNG).body(image.getScatterGraph());

    }
}

