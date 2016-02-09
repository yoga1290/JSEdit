package editor.controller;

import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import editor.util.*;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ReadSvc
{
        @Autowired
	private URLUtil URL;


	@RequestMapping(value="/read", method=RequestMethod.POST, produces = "application/txt")
	public @ResponseBody String read(@RequestParam String url)
	{
	    return URL.readText(url);
	}
}
