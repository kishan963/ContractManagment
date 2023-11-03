package com.example.Project1.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Service;

import com.example.Project1.Models.Routes;

@Service
public class MyService {


    public List<Routes> getCarrier(List<String> str, List<Routes> list ){
        List<Routes> currenRoutes=new ArrayList<>();

		for(int i=0;i<list.size();i++)
		{
			if( list.get(i).getOrigin().equals(str.get(0)) && list.get(i).getDestination().equals(str.get(1)) )
			{  
               currenRoutes.add(list.get(i));
			}
		}
        
        Collections.sort(currenRoutes, (obj1, obj2) -> Integer.compare(obj1.getRates().getRate(), obj2.getRates().getRate()));
        
		return currenRoutes;
    }
    
}
