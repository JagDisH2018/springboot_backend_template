package com.springbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.springbackend.entity.ImageEntity;
import com.springbackend.repository.ImageRepository;

import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/example")
public class ImageController {

    @Autowired
    private ImageRepository exampleRepository;

    @GetMapping("/img")
    public List<ImageEntity> getExamples() {
        return exampleRepository.findAll();
    }

    @PostMapping("/pu")
    public ImageEntity createExample(@RequestParam("name") String name,
                                        @RequestParam("image") MultipartFile image) throws IOException {

        ImageEntity exampleEntity = new ImageEntity();
        exampleEntity.setName(name);
        exampleEntity.setImage(image.getBytes());

        return exampleRepository.save(exampleEntity);
    }

    @GetMapping("/{id}")
    public void downloadImage(@PathVariable Long id, HttpServletResponse response) throws IOException {
        ImageEntity exampleEntity = exampleRepository.findById(id).orElse(null);
        if (exampleEntity == null) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        response.setContentType(MediaType.IMAGE_JPEG_VALUE);
        response.getOutputStream().write(exampleEntity.getImage());
    }

}
