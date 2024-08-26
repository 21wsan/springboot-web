package com.wsan.springboot.webapp.springboot_web.models.dto;

public class ParamMixDto {

    public String mensaje;
    public Integer code;

    public String getMensaje(){
        return mensaje;
    }

    public void setMensaje(String mensaje){
        this.mensaje = mensaje;
    }

    public Integer getCode(){
        return code;
    }

    public void setCode(Integer code){
        this.code = code;
    }
}
