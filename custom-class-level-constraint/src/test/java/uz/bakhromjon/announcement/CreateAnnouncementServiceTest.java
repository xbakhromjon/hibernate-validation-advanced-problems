package uz.bakhromjon.announcement;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import uz.bakhromjon.common.SelfValidator;

import static org.junit.jupiter.api.Assertions.*;

class CreateAnnouncementServiceTest {

    private final CreateAnnouncementService createAnnouncementService = new CreateAnnouncementService(new SelfValidator<>());

    @Test
    void create() {
        createAnnouncementService.create(new AnnouncementCreateRequest("TARGET", 1, 2, 2));
    }
}


