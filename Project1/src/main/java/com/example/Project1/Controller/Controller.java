package com.example.Project1.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.Project1.Models.Routes;
import com.example.Project1.Repository.RoutesRepository;
import com.example.Project1.Service.MyService;

@RestController
public class Controller {

    	@Autowired
	    private RoutesRepository routesRepository;
        @Autowired
		private MyService myService;
        
        @PostMapping("/solve")
        public void solve(@RequestBody List<Routes> routes )
	{
        // Rates rate=new Rates();
        // Routes route=new Routes();
        
		// route.setCarrier_rank(0);
		// route.setDestination("Banglore");
		// route.setDestination("Mumbai");
		// route.setId(1);
		// route.setMode("Road");
		// route.setCarrier_code("ABCD1234");

		// rate.setId(1);
		// rate.setRate(100);
		
        
        System.out.println("Code is Working");

		routesRepository.saveAll(routes);
		
	}


	@PostMapping("/getCarrier")
	public List<Routes> getAll(@RequestBody List<String> str)
	{
       
		List<Routes> list= routesRepository.findAll();
        return myService.getCarrier(str, list);

	}

// 	@GetMapping("/getCarrier")
// 	public Routes getAll()
// 	{
       
// 		List<Rates> list= ratesRepository.findAll();

// 		return list.size();

// 	}
    

 }
 