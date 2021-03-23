package com.exercise.employersServices.Clients;

import com.exercise.employersServices.soap.EmployerDetails;
import com.exercise.employersServices.soap.SaveEmployerRequest;
import com.exercise.employersServices.soap.SaveEmployerResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class EmployerSoapClient extends WebServiceGatewaySupport {

    public SaveEmployerResponse saveEmployer(EmployerDetails employer){
        SaveEmployerRequest request = new SaveEmployerRequest();
        request.setEmployerDetails(employer);
        SaveEmployerResponse response = (SaveEmployerResponse) getWebServiceTemplate().marshalSendAndReceive(request);
        return response;
    }

}
