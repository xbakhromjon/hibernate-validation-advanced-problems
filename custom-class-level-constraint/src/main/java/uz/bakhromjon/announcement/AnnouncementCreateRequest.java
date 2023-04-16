package uz.bakhromjon.announcement;

import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.bakhromjon.announcement.validation.ValidateAnnouncement;
import uz.bakhromjon.announcement.validation.group.FirstLevel;
import uz.bakhromjon.common.SelfValidator;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ValidateAnnouncement(groups = FirstLevel.class)
public class AnnouncementCreateRequest extends SelfValidator<AnnouncementCreateRequest> {
    private String target;

    @Min(value = 1, groups = FirstLevel.class)
    private Integer entrance;

    @Min(value = 1, groups = FirstLevel.class)
    private Integer floorInHouse;

    @Min(value = 1, groups = FirstLevel.class)
    private Integer floor;

}
