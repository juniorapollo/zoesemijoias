/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.zoe.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author daniel
 */
@Service
@RequestMapping(value = "${baseUrl}")
public class PaginasService {
    
    @GetMapping(value="/")
    public String index() {
        return "index/index";
    }
    @GetMapping(value="/home")
    public String home() {
        return "home/home";
    }
    
    @GetMapping(value="/aula")
    public String aula() {
        return "aula/aula";
    }
}
