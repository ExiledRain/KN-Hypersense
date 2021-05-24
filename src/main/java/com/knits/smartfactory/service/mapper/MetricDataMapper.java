package com.knits.smartfactory.service.mapper;

import com.knits.smartfactory.domain.*;
import com.knits.smartfactory.service.dto.MetricDataDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link MetricData} and its DTO {@link MetricDataDTO}.
 */
@Mapper(componentModel = "spring", uses = { MetricMapper.class })
public interface MetricDataMapper extends EntityMapper<MetricDataDTO, MetricData> {
    @Mapping(target = "metric", source = "metric", qualifiedByName = "id")
    MetricDataDTO toDto(MetricData s);
}
