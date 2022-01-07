package com.springproject.gestionemployes.converter;


import com.springproject.gestionemployes.controllers.dto.EmployeDTO;
import com.springproject.gestionemployes.models.Employe;
import org.modelmapper.ModelMapper;
        import org.modelmapper.config.Configuration;
        import org.springframework.stereotype.Component;

@Component
public class EmployeConverter extends AbstractConverter<Employe, EmployeDTO> {

    private final ModelMapper modelMapper;

    public EmployeConverter(ModelMapper modelMapper) {
        modelMapper.getConfiguration()
                .setFieldMatchingEnabled(true)
                .setFieldAccessLevel(Configuration.AccessLevel.PRIVATE);
        this.modelMapper = modelMapper;
    }

    @Override
    public Employe convertToDM(EmployeDTO employeDTO) {
        return modelMapper.map(employeDTO, Employe.class);
    }

    @Override
    public EmployeDTO convertToDTO(Employe employe) {
        return modelMapper.map(employe, EmployeDTO.class);
    }
}