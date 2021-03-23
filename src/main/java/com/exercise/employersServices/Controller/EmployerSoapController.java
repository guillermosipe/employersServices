package com.exercise.employersServices.Controller;

import com.exercise.employersServices.Dao.EmployerDao;
import com.exercise.employersServices.Entity.Employer;
import com.exercise.employersServices.soap.SaveEmployerRequest;
import com.exercise.employersServices.soap.SaveEmployerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class EmployerSoapController {
    private static final String NAMESPACE_URI = "http://employersServices.exercise.com/Soap";

    @Autowired
    private EmployerDao employerDao;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "saveEmployerRequest")
    @ResponsePayload
    public SaveEmployerResponse saveEmployer(@RequestPayload SaveEmployerRequest request) {
        SaveEmployerResponse response = new SaveEmployerResponse();
        employerDao.save(new Employer(request.getEmployerDetails().getNombre(),request.getEmployerDetails().getApellidoPaterno(),request.getEmployerDetails().getApellidoMaterno(),
                request.getEmployerDetails().getTipoDocumento(),request.getEmployerDetails().getNumDocumento(),request.getEmployerDetails().getFechaNacimiento(),
                request.getEmployerDetails().getFechaVinculacion(),request.getEmployerDetails().getCargo(),request.getEmployerDetails().getSalario()));
        response.setEmployerDetails(request.getEmployerDetails());
        return response;
    }
}
