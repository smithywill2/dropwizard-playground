package com.wizard.testapp;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;
import com.wizard.testapp.config.*;

public class TestAppService extends Service<AppConfiguration>
{
    public static void main( String[] args ) throws Exception {
    	
    	new TestAppService().run(new String[] {"server"});
        
    }

	@Override
	public void initialize(Bootstrap<AppConfiguration> bootstrap) {
		bootstrap.setName("testapp");
		
	}

	@Override
	public void run(AppConfiguration arg0, Environment env) throws Exception {
		env.addResource(new IndexResource());
		
	}
}
