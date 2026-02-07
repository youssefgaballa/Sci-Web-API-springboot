package org.sci_web.api_springboot.pages.controller;

import org.sci_web.api_springboot.pages.dto.PageResponseDTO;
import org.sci_web.api_springboot.pages.repository.PageRepository;
import org.sci_web.api_springboot.pages.model.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/pages")
public class PageController {
    private final PageRepository pageRepository;

    public PageController(PageRepository pageRepository) {
        this.pageRepository = pageRepository;
    }

    @GetMapping
    public Iterable<Page> getAllPages() {
        return pageRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PageResponseDTO> getPageById(@PathVariable long id) {
        Optional<Page> page = pageRepository.findById(id);
        if (page.isPresent()) {
            return ResponseEntity.ok(new PageResponseDTO(page, Optional.empty()));
        } else {
            return ResponseEntity.ok(new PageResponseDTO(Optional.empty(),
                    Optional.of("Page not found")));
            }
    }

}
