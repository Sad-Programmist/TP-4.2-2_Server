package sc.vsu.ru.server.data.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class IndicationDto {
    private final Integer ipuId;
    private final String type;
    private final int value;
    private final String date;
}
