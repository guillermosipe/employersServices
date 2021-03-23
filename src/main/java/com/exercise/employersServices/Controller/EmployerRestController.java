package com.exercise.employersServices.Controller;

import com.exercise.employersServices.Pojo.EmployerRequest;
import com.exercise.employersServices.Pojo.EmployerResponse;
import com.exercise.employersServices.Service.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class EmployerRestController {

    @Autowired
    private EmployerService employerService;

    @GetMapping("/addEmployer")
    public EmployerResponse addEmployer(
            @RequestParam(name = "nombre", required = false) String nombre,
            @RequestParam(name = "apellidoPaterno", required = false) String apellidoPaterno,
            @RequestParam(name = "apellidoMaterno", required = false) String apellidoMaterno,
            @RequestParam(name = "tipoDocumento", required = false) String tipoDocumento,
            @RequestParam(name = "numDocumento", required = false) String numDocumento,
            @RequestParam(name = "fechaNacimiento", required = false) String fechaNacimiento,
            @RequestParam(name = "fechaVinculacion", required = false) String fechaVinculacion,
            @RequestParam(name = "cargo", required = false) String cargo,
            @RequestParam(name = "salario",required = false) Double salario
    ){
        EmployerRequest employerRequest = new EmployerRequest(nombre,apellidoPaterno,apellidoMaterno,tipoDocumento,numDocumento,fechaNacimiento,fechaVinculacion,cargo,salario);
        StringBuilder result = employerService.save(employerRequest);
        if(result != null){
            throw new RuntimeException("---- Petición Incorrecta ----"+result);
        }
        EmployerResponse employerResponse = new EmployerResponse(nombre,apellidoPaterno,apellidoMaterno,tipoDocumento,numDocumento,fechaNacimiento,fechaVinculacion,cargo,salario);
        return employerResponse;
    }



}
