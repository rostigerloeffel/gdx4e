/*
 * generated by Xtext 2.9.1
 */
package com.nukulargames.gdx4e.actors.dsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class DslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("com/nukulargames/gdx4e/actors/dsl/parser/antlr/internal/InternalDsl.tokens");
	}
}