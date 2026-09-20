package com.techstack.corebanking.config;

import org.springframework.context.annotation.Bean;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.media.StringSchema;
import io.swagger.v3.oas.models.parameters.Parameter;
import org.springdoc.core.customizers.GlobalOperationCustomizer;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.method.HandlerMethod;
 
@Configuration
public class Config {

	 @Bean
	  public Jaxb2Marshaller marshaller() {
	    Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
	   // marshaller.setContextPath("com.bayee.bayees.stub");
	    marshaller.setPackagesToScan("com.techstack.corebanking.stub");
	    return marshaller;
	  }
	 
	  @Bean
	  public SOAPConnector soapConnector(Jaxb2Marshaller marshaller) {
	    SOAPConnector client = new SOAPConnector();
	   // client.setDefaultUri("http://10.4.0.28:7003/FCUBSAccService/FCUBSAccService");
		  client.setDefaultUri("http://10.1.12.71:8101/FCUBSAccService/FCUBSAccService");
		  client.setMarshaller(marshaller);
	    client.setUnmarshaller(marshaller);
	    return client;
	  }


	@Bean
	public GlobalOperationCustomizer fcubsHeaders() {

		return (operation, handlerMethod) -> {

			addHeader(operation, "OPERATION", true, null);
			addHeader(operation, "SOURCE", false, "FCUBS");
			addHeader(operation, "UBSCOMP", false, "FCUBS");
			addHeader(operation, "MSGID", false, "3211411");
			addHeader(operation, "CORRELID", false, "null");
			addHeader(operation, "USERID", false, "TAKEON02");
			addHeader(operation, "PASSWORD", false, "Oracle@2");
			addHeader(operation, "MODULEID", false, "");
			addHeader(operation, "BRANCH", true, "100");
			addHeader(operation, "SERVICE", false, "FCUBSAccService");

			return operation;
		};
	}

	private void addHeader(
			Operation operation,
			String name,
			boolean required,
			String defaultValue) {

		Parameter parameter = new Parameter()
				.in("header")
				.name(name)
				.required(required)
				.schema(new StringSchema());

		if (defaultValue != null) {
			parameter.getSchema().setDefault(defaultValue);
		}

		operation.addParametersItem(parameter);
	}
}

