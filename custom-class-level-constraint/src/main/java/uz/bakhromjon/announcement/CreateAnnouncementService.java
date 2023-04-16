package uz.bakhromjon.announcement;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.bakhromjon.announcement.validation.group.FirstLevel;
import uz.bakhromjon.common.SelfValidator;

@Service
@RequiredArgsConstructor
public class CreateAnnouncementService {
    private final SelfValidator<AnnouncementCreateRequest> validator;

    public void create(AnnouncementCreateRequest request) {
        validator.validate(request, FirstLevel.class);
    }
}
