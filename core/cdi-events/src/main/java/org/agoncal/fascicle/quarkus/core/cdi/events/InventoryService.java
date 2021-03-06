package org.agoncal.fascicle.quarkus.core.cdi.events;

import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */
// tag::adocSnippet[]
@Singleton
public class InventoryService {

  // tag::adocSkip[]
  @Inject
  Logger logger;

  // end::adocSkip[]
  List<Book> inventory = new ArrayList<>();

  public void addBook(@Observes Book book) {
    // tag::adocSkip[]
    logger.info("Adding book " + book.getTitle() + " to inventory");
    // end::adocSkip[]
    inventory.add(book);
  }
}
// end::adocSnippet[]
