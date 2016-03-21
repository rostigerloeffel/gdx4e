/*
 * generated by Xtext 2.9.2
 */
package com.nukulargames.gdx4e.actors.dsl;

import com.google.inject.Binder;
import com.google.inject.Provider;
import com.google.inject.name.Names;
import com.nukulargames.gdx4e.actors.dsl.formatting.DslFormatter;
import com.nukulargames.gdx4e.actors.dsl.jvmmodel.DslJvmModelInferrer;
import com.nukulargames.gdx4e.actors.dsl.parser.antlr.DslAntlrTokenFileProvider;
import com.nukulargames.gdx4e.actors.dsl.parser.antlr.DslParser;
import com.nukulargames.gdx4e.actors.dsl.parser.antlr.internal.InternalDslLexer;
import com.nukulargames.gdx4e.actors.dsl.scoping.DslScopeProvider;
import com.nukulargames.gdx4e.actors.dsl.serializer.DslSemanticSequencer;
import com.nukulargames.gdx4e.actors.dsl.serializer.DslSyntacticSequencer;
import com.nukulargames.gdx4e.actors.dsl.services.DslGrammarAccess;
import com.nukulargames.gdx4e.actors.dsl.validation.DslValidator;
import java.util.Properties;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.common.services.Ecore2XtextTerminalConverters;
import org.eclipse.xtext.common.types.xtext.TypesAwareDefaultGlobalScopeProvider;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.formatting.IFormatter;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.parser.ITokenToStringConverter;
import org.eclipse.xtext.parser.antlr.AntlrTokenDefProvider;
import org.eclipse.xtext.parser.antlr.AntlrTokenToStringConverter;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;
import org.eclipse.xtext.parser.antlr.ITokenDefProvider;
import org.eclipse.xtext.parser.antlr.IUnorderedGroupHelper;
import org.eclipse.xtext.parser.antlr.Lexer;
import org.eclipse.xtext.parser.antlr.LexerBindings;
import org.eclipse.xtext.parser.antlr.LexerProvider;
import org.eclipse.xtext.parser.antlr.UnorderedGroupHelper;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.ILocationInFileProvider;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.containers.IAllContainersState;
import org.eclipse.xtext.resource.containers.ResourceSetBasedAllContainersStateProvider;
import org.eclipse.xtext.resource.containers.StateBasedContainerManager;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.resource.impl.ResourceSetBasedResourceDescriptions;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.IgnoreCaseLinking;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.serializer.impl.Serializer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ISyntacticSequencer;
import org.eclipse.xtext.service.SingletonBinding;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.xbase.annotations.DefaultXbaseWithAnnotationsRuntimeModule;
import org.eclipse.xtext.xbase.annotations.validation.DerivedStateAwareResourceValidator;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.JvmLocationInFileProvider;
import org.eclipse.xtext.xbase.scoping.XImportSectionNamespaceScopeProvider;
import org.eclipse.xtext.xbase.scoping.XbaseQualifiedNameProvider;
import org.eclipse.xtext.xbase.scoping.batch.IBatchScopeProvider;
import org.eclipse.xtext.xbase.typesystem.internal.DefaultBatchTypeResolver;
import org.eclipse.xtext.xbase.typesystem.internal.DefaultReentrantTypeResolver;
import org.eclipse.xtext.xbase.typesystem.internal.LogicalContainerAwareBatchTypeResolver;
import org.eclipse.xtext.xbase.typesystem.internal.LogicalContainerAwareReentrantTypeResolver;
import org.eclipse.xtext.xbase.validation.FeatureNameValidator;
import org.eclipse.xtext.xbase.validation.LogicalContainerAwareFeatureNameValidator;

/**
 * Manual modifications go to {@link DslRuntimeModule}.
 */
@SuppressWarnings("all")
public abstract class AbstractDslRuntimeModule extends DefaultXbaseWithAnnotationsRuntimeModule {

	protected Properties properties = null;

	@Override
	public void configure(Binder binder) {
		properties = tryBindProperties(binder, "com/nukulargames/gdx4e/actors/dsl/Dsl.properties");
		super.configure(binder);
	}
	
	public void configureLanguageName(Binder binder) {
		binder.bind(String.class).annotatedWith(Names.named(Constants.LANGUAGE_NAME)).toInstance("com.nukulargames.gdx4e.actors.dsl.Dsl");
	}
	
	public void configureFileExtensions(Binder binder) {
		if (properties == null || properties.getProperty(Constants.FILE_EXTENSIONS) == null)
			binder.bind(String.class).annotatedWith(Names.named(Constants.FILE_EXTENSIONS)).toInstance("actors");
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.grammarAccess.GrammarAccessFragment2
	public ClassLoader bindClassLoaderToInstance() {
		return getClass().getClassLoader();
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.grammarAccess.GrammarAccessFragment2
	public Class<? extends IGrammarAccess> bindIGrammarAccess() {
		return DslGrammarAccess.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.serializer.SerializerFragment2
	public Class<? extends ISemanticSequencer> bindISemanticSequencer() {
		return DslSemanticSequencer.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.serializer.SerializerFragment2
	public Class<? extends ISyntacticSequencer> bindISyntacticSequencer() {
		return DslSyntacticSequencer.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.serializer.SerializerFragment2
	public Class<? extends ISerializer> bindISerializer() {
		return Serializer.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
	public Class<? extends IParser> bindIParser() {
		return DslParser.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
	public Class<? extends ITokenToStringConverter> bindITokenToStringConverter() {
		return AntlrTokenToStringConverter.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
	public Class<? extends IAntlrTokenFileProvider> bindIAntlrTokenFileProvider() {
		return DslAntlrTokenFileProvider.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
	public Class<? extends Lexer> bindLexer() {
		return InternalDslLexer.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
	public Class<? extends ITokenDefProvider> bindITokenDefProvider() {
		return AntlrTokenDefProvider.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
	public Provider<InternalDslLexer> provideInternalDslLexer() {
		return LexerProvider.create(InternalDslLexer.class);
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
	public void configureRuntimeLexer(Binder binder) {
		binder.bind(Lexer.class)
			.annotatedWith(Names.named(LexerBindings.RUNTIME))
			.to(InternalDslLexer.class);
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
	public Class<? extends IUnorderedGroupHelper> bindIUnorderedGroupHelper() {
		return UnorderedGroupHelper.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.validation.ValidatorFragment2
	@SingletonBinding(eager=true)
	public Class<? extends DslValidator> bindDslValidator() {
		return DslValidator.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.scoping.ImportNamespacesScopingFragment2
	public Class<? extends IBatchScopeProvider> bindIBatchScopeProvider() {
		return DslScopeProvider.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.scoping.ImportNamespacesScopingFragment2
	public void configureIScopeProviderDelegate(Binder binder) {
		binder.bind(IScopeProvider.class).annotatedWith(Names.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE)).to(XImportSectionNamespaceScopeProvider.class);
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.scoping.ImportNamespacesScopingFragment2
	public void configureIgnoreCaseLinking(Binder binder) {
		binder.bindConstant().annotatedWith(IgnoreCaseLinking.class).to(false);
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.builder.BuilderIntegrationFragment2
	public Class<? extends IContainer.Manager> bindIContainer$Manager() {
		return StateBasedContainerManager.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.builder.BuilderIntegrationFragment2
	public Class<? extends IAllContainersState.Provider> bindIAllContainersState$Provider() {
		return ResourceSetBasedAllContainersStateProvider.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.builder.BuilderIntegrationFragment2
	public void configureIResourceDescriptions(Binder binder) {
		binder.bind(IResourceDescriptions.class).to(ResourceSetBasedResourceDescriptions.class);
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.builder.BuilderIntegrationFragment2
	public void configureIResourceDescriptionsPersisted(Binder binder) {
		binder.bind(IResourceDescriptions.class).annotatedWith(Names.named(ResourceDescriptionsProvider.PERSISTED_DESCRIPTIONS)).to(ResourceSetBasedResourceDescriptions.class);
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.xbase.XbaseGeneratorFragment2
	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return XbaseQualifiedNameProvider.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.xbase.XbaseGeneratorFragment2
	public Class<? extends ILocationInFileProvider> bindILocationInFileProvider() {
		return JvmLocationInFileProvider.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.xbase.XbaseGeneratorFragment2
	public Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
		return TypesAwareDefaultGlobalScopeProvider.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.xbase.XbaseGeneratorFragment2
	public Class<? extends FeatureNameValidator> bindFeatureNameValidator() {
		return LogicalContainerAwareFeatureNameValidator.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.xbase.XbaseGeneratorFragment2
	public Class<? extends DefaultBatchTypeResolver> bindDefaultBatchTypeResolver() {
		return LogicalContainerAwareBatchTypeResolver.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.xbase.XbaseGeneratorFragment2
	public Class<? extends DefaultReentrantTypeResolver> bindDefaultReentrantTypeResolver() {
		return LogicalContainerAwareReentrantTypeResolver.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.xbase.XbaseGeneratorFragment2
	public Class<? extends IResourceValidator> bindIResourceValidator() {
		return DerivedStateAwareResourceValidator.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.xbase.XbaseGeneratorFragment2
	public Class<? extends IJvmModelInferrer> bindIJvmModelInferrer() {
		return DslJvmModelInferrer.class;
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.ecore2xtext.Ecore2XtextValueConverterServiceFragment2
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return Ecore2XtextTerminalConverters.class;
	}
	
	// contributed by org.eclipse.xtext.generator.formatting.FormatterFragment
	public Class<? extends IFormatter> bindIFormatter() {
		return DslFormatter.class;
	}
	
}
