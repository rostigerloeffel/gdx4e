/**
 * generated by Xtext 2.9.1
 */
package com.nukulargames.gdx4e.actors.dsl.jvmmodel;

import com.google.inject.Inject;
import com.nukulargames.gdx4e.actors.Actor;
import com.nukulargames.gdx4e.actors.Model;
import com.nukulargames.gdx4e.actors.Stage;
import com.nukulargames.gdx4e.actors.dsl.jvmmodel.ActorInferrer;
import com.nukulargames.gdx4e.actors.dsl.jvmmodel.StageInferrer;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class DslJvmModelInferrer extends AbstractModelInferrer {
  @Inject
  @Extension
  private ActorInferrer actorInferrer;
  
  @Inject
  @Extension
  private StageInferrer stageInferrer;
  
  protected void _infer(final Model element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    EList<Actor> _actors = element.getActors();
    for (final Actor actor : _actors) {
      this.actorInferrer.infer(actor, element, acceptor, isPreIndexingPhase);
    }
    EList<Stage> _stages = element.getStages();
    for (final Stage stage : _stages) {
      this.stageInferrer.infer(stage, element, acceptor, isPreIndexingPhase);
    }
  }
  
  public void infer(final EObject element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    if (element instanceof Model) {
      _infer((Model)element, acceptor, isPreIndexingPhase);
      return;
    } else if (element != null) {
      _infer(element, acceptor, isPreIndexingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(element, acceptor, isPreIndexingPhase).toString());
    }
  }
}
