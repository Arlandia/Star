package com.senac.starwars.web;


import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import com.senac.starwars.dominio.Planeta;

public class WebService {
		
// A API de consumir dados eu tive que aprender agora pois ainda não foi dada na faculdade 
	 private static final String URL_WEBSERVICE  =
			    "http://swapi.co/";
	

			  public List<Planeta> getPlaneta() {

				  

					    HttpURLConnection connection = null;
					    
					    try {
					      URL url = new URL(URL_WEBSERVICE);

					      connection = (HttpURLConnection)url.openConnection();
					        
					      InputStream content = connection.getInputStream();
					      return null;
			//      return new LeitorXML().carrega(content);

					    } catch (IOException e) {
					      throw new RuntimeException(e);
					    } finally {
					      connection.disconnect();
					    }
						
				     }				

                  }
