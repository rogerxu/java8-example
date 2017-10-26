package org.example.java8.nashorn;

import org.testng.annotations.Test;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NashornTest {
	@Test
	public void testEval() throws Exception {
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("nashorn");

		Path scriptPath = Paths.get(getClass().getClassLoader().getResource("/script.js").toURI());
		System.out.println(scriptPath.toAbsolutePath());
		Reader reader = Files.newBufferedReader(scriptPath, StandardCharsets.UTF_8);

		String result;
		try {
			result = (String) engine.eval(reader);
			System.out.println(result);
		} catch (ScriptException e) {
			e.printStackTrace();
		}
	}
}
