package edu.java.scrapper;

import edu.java.LinkUpdaterScheduler;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class LinkUpdaterSchedulerTest {

    @Test
    void updateTest() {
        LinkUpdaterScheduler linkUpdaterScheduler = Mockito.mock(LinkUpdaterScheduler.class);
        Mockito.doThrow(new RuntimeException()).when(linkUpdaterScheduler).update();

        Assertions.assertThrows(RuntimeException.class, linkUpdaterScheduler::update);
    }
}
