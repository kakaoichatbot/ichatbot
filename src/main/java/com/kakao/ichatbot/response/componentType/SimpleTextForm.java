package com.kakao.ichatbot.response.componentType;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SimpleTextForm implements ISkillComponent {
    private SimpleText simpleText;
}
