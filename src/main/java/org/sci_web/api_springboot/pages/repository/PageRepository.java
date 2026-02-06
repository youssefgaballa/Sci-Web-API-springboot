package org.sci_web.api_springboot.pages.repository;

import org.sci_web.api_springboot.pages.model.Page;
import org.springframework.data.repository.CrudRepository;

public interface PageRepository extends CrudRepository<Page, Long> {


}
