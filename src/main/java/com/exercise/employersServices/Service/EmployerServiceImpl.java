package com.exercise.employersServices.Service;

import com.exercise.employersServices.Clients.EmployerSoapClient;
import com.exercise.employersServices.Pojo.EmployerRequest;
import com.exercise.employersServices.Utils.DateUtils;
import com.exercise.employersServices.soap.EmployerDetails;
import com.exercise.employersServices.soap.SaveEmployerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployerServiceImpl implements  EmployerService {

    @Autowired
    EmployerSoapClient employerSoapClient;

    @Override
    public StringBuilder save(EmployerRequest employerRequest){
        boolean validationCorrect = true;
        StringBuilder errorMessage = new StringBuilder("");

        StringBuilder emptyFields = employerRequest.attrEmpty();
        if(emptyFields.length()!=0){
            validationCorrect = false;
            errorMessage.append("\nLos campos: ");
            errorMessage.append(emptyFields.subSequence(0,emptyFields.length()-1));
            errorMessage.append(" estan vacios, favor de llenarlos.");
        }

        if(!DateUtils.over18(employerRequest.getFechaNacimiento())){
            validationCorrect = false;
            errorMessage.append("\nLa persona no es mayor de edad");
        }

        if(validationCorrect) {
            SaveEmployerResponse saveEmployerResponse = employerSoapClient.saveEmployer(new EmployerDetails(employerRequest.getNombre(),employerRequest.getApellidoPaterno(),employerRequest.getApellidoMaterno(),employerRequest.getTipoDocumento(),
                    employerRequest.getNumDocumento(),employerRequest.getFechaNacimiento(),employerRequest.getFechaVinculacion(),employerRequest.getCargo(),employerRequest.getSalario()));
            if(saveEmployerResponse != null){
                return null;
            }
            errorMessage.append("Error en el consumo del WS SOAP.");
        }
        return errorMessage;
    }

}
