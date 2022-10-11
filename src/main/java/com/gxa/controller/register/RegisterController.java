package com.gxa.controller.register;

import com.gxa.entity.registration.Register;
import com.gxa.service.register.RegisterService;
import com.gxa.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
    @Autowired
    private RegisterService registerService;

    @PostMapping("/register")
    public R add(Register register){
        R r = new R();
        this.registerService.add(register);
        R.ok("success");
        return r;
    }
}
