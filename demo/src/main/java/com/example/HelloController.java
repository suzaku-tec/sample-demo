package com.example;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jp.sf.amateras.mirage.ClasspathSqlResource;
import jp.sf.amateras.mirage.SqlManager;
import jp.sf.amateras.mirage.SqlResource;
import jp.sf.amateras.mirage.session.Session;
import jp.sf.amateras.mirage.session.SessionFactory;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(method=RequestMethod.GET)
    public Hoge hello(@RequestBody Hoge param) {
    	System.out.println("test");
        System.out.println(param);

        Hoge hoge = new Hoge();
        hoge.id = 20;
        hoge.value = "Response";

        return hoge;
    }
    
    @RequestMapping("/insert")
    public String insert() {
    	
    	Session session = SessionFactory.getSession();
    	SqlManager sqlManager = session.getSqlManager();
    	
    	SqlResource selectUserSql = new ClasspathSqlResource("insert.sql");
    	
    	session.begin();
    	
    	Sample s = new Sample();
    	s.setName("aaaaaaa");
    	
    	sqlManager.executeUpdate(selectUserSql, s);
    	
    	session.commit();

    	return "aaaaaaaaaaaaa";
    }
}
