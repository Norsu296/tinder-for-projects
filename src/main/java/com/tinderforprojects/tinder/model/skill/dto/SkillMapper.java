package com.tinderforprojects.tinder.model.skill.dto;

import com.tinderforprojects.tinder.model.skill.Skill;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SkillMapper {

    Skill toSkill(SkillDto skillDto) {
        return Skill.builder()
                .id(skillDto.getId())
                .name(skillDto.getName())
                .build();
    }

    SkillDto toSkillDto(Skill skill) {
        return SkillDto.builder()
                .id(skill.getId())
                .name(skill.getName())
                .build();
    }

    List<Skill> toSkills(List<SkillDto> skillsDto) {
        List<Skill> skills = new ArrayList<>();
        for(SkillDto skillDto : skillsDto){
            skills.add(toSkill(skillDto));
        }
        return skills;
    }

    List<SkillDto> toSkillsDto(List<Skill> skills) {
        List<SkillDto> skillsDto = new ArrayList<>();
        for(Skill skill : skills) {
            skillsDto.add(toSkillDto(skill));
        }
        return skillsDto;
    }

}
