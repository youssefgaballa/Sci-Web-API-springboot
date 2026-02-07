package org.sci_web.api_springboot.pages.dto;

import org.sci_web.api_springboot.pages.model.Page;

import java.util.Optional;

public record PageResponseDTO(Optional<Page> page, Optional<String> errorMessage) {
}
