package uz.bakhromjon.announcement.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import uz.bakhromjon.announcement.AnnouncementCreateRequest;

import java.util.Objects;

public class ValidateAnnouncementValidator implements ConstraintValidator<ValidateAnnouncement, AnnouncementCreateRequest> {
    @Override
    public boolean isValid(AnnouncementCreateRequest rest, ConstraintValidatorContext constraintValidatorContext) {
        if (Objects.nonNull(rest.getFloor()) && Objects.nonNull(rest.getFloorInHouse())) {
            return rest.getFloor() <= rest.getFloorInHouse();
        }
        return true;
    }
}
