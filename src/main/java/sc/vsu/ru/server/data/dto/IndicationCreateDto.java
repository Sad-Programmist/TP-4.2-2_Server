package sc.vsu.ru.server.data.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@AllArgsConstructor
@Getter
public class IndicationCreateDto {
    private final Integer ipuId;
    private final int value;
}
