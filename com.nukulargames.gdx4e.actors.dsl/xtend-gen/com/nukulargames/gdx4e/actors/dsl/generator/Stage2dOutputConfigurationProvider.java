package com.nukulargames.gdx4e.actors.dsl.generator;

import java.util.Set;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class Stage2dOutputConfigurationProvider implements IOutputConfigurationProvider {
  public final static String DEFAULT_OUTPUT_ONCE = "DEFAULT_OUTPUT_ONCE";
  
  /**
   * @return a set of {@link OutputConfiguration} available for the generator
   */
  @Override
  public Set<OutputConfiguration> getOutputConfigurations() {
    OutputConfiguration defaultOutput = new OutputConfiguration(IFileSystemAccess.DEFAULT_OUTPUT);
    defaultOutput.setDescription("Output Folder (gen)");
    defaultOutput.setOutputDirectory("./src-gen");
    defaultOutput.setOverrideExistingResources(true);
    defaultOutput.setCreateOutputDirectory(true);
    defaultOutput.setCleanUpDerivedResources(true);
    defaultOutput.setSetDerivedProperty(true);
    OutputConfiguration onceOutput = new OutputConfiguration(Stage2dOutputConfigurationProvider.DEFAULT_OUTPUT_ONCE);
    onceOutput.setDescription("Output Folder");
    onceOutput.setOutputDirectory("./src");
    onceOutput.setOverrideExistingResources(false);
    onceOutput.setCreateOutputDirectory(true);
    onceOutput.setCleanUpDerivedResources(false);
    onceOutput.setSetDerivedProperty(false);
    return CollectionLiterals.<OutputConfiguration>newHashSet(defaultOutput, onceOutput);
  }
}
