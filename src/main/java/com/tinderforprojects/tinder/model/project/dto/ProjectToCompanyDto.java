package com.tinderforprojects.tinder.model.project.dto;

import com.tinderforprojects.tinder.model.benefit.dto.BenefitDto;
import com.tinderforprojects.tinder.model.skill.dto.SkillDto;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Builder
@Getter
@Setter
@ToString
public class ProjectToCompanyDto {

    private Long id;
    private String name;
    private String description;
    private List<SkillDto> skills;
    private List<BenefitDto> benefits;

}
