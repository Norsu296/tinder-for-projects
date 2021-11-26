package com.github.clanhouse.tinderforprojects.tinderforprojects.dto.mapper;

import com.github.clanhouse.tinderforprojects.tinderforprojects.dto.model.benefit.BenefitDTO;
import com.github.clanhouse.tinderforprojects.tinderforprojects.entities.Benefit;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BenefitMapper {

    BenefitDTO toBenefitsDTO(Benefit benefit);
    List<BenefitDTO> toBenefitsDTOs(List<Benefit> benefits);
    Benefit toBenefit(BenefitDTO benefitDTO);

}