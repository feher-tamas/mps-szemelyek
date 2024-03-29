package DataMapping.behavior;

/*Generated by MPS */

import jetbrains.mps.core.aspects.behaviour.BaseBHDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.core.aspects.behaviour.api.SMethod;
import jetbrains.mps.scope.Scope;
import jetbrains.mps.core.aspects.behaviour.SMethodBuilder;
import jetbrains.mps.core.aspects.behaviour.SJavaCompoundTypeImpl;
import jetbrains.mps.core.aspects.behaviour.AccessPrivileges;
import org.jetbrains.mps.openapi.model.SNode;
import java.util.List;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.scope.ListScope;
import jetbrains.mps.scope.CompositeScope;
import jetbrains.mps.lang.scopes.runtime.ScopeUtils;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.core.behavior.ScopeProvider__BehaviorDescriptor;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;
import org.jetbrains.mps.openapi.language.SConcept;
import org.jetbrains.mps.openapi.language.SInterfaceConcept;

public final class Template__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x22a6c585e3ba46bcL, 0x922caa7eb0f6869bL, 0x72160cfe047820e1L, "DataMapping.structure.Template");

  public static final SMethod<Scope> getScope_id52_Geb4QDV$ = new SMethodBuilder<Scope>(new SJavaCompoundTypeImpl(Scope.class)).name("getScope").modifiers(8, AccessPrivileges.PUBLIC).concept(CONCEPT).baseMethodId(5811245382203252452L).languageId(0x9b92103b95ca8c0cL, 0xceab519525ea4f22L).build2(SMethodBuilder.createJavaParameter((Class<SAbstractConcept>) ((Class) Object.class), ""), SMethodBuilder.createJavaParameter((Class<SNode>) ((Class) Object.class), ""));

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(getScope_id52_Geb4QDV$);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static Scope getScope_id52_Geb4QDV$(@NotNull SNode __thisNode__, SAbstractConcept kind, SNode child) {
    if (SConceptOperations.isExactly(SNodeOperations.asSConcept(kind), CONCEPTS.SourceEntityRef$pM)) {
      ListScope entityRefScope = ListScope.forNamedElements(SNodeOperations.getNodeDescendants(__thisNode__, CONCEPTS.SourceAbstractItem$bh, false, new SAbstractConcept[]{}));
      return new CompositeScope(entityRefScope, ScopeUtils.lazyParentScope(__thisNode__, kind));
    }
    if (SConceptOperations.isExactly(SNodeOperations.asSConcept(kind), CONCEPTS.MappingValueRef$rR) || SConceptOperations.isExactly(SNodeOperations.asSConcept(kind), CONCEPTS.JSONMappingValueRef$IK)) {
      ListScope mappingValueRefScope = ListScope.forNamedElements(ListSequence.fromList(SNodeOperations.getNodeDescendants(__thisNode__, CONCEPTS.ValueDef$Mu, false, new SAbstractConcept[]{})).concat(ListSequence.fromList(SNodeOperations.getNodeDescendants(__thisNode__, CONCEPTS.ParameterValueDef$ZW, false, new SAbstractConcept[]{}))));
      return new CompositeScope(mappingValueRefScope, ScopeUtils.lazyParentScope(__thisNode__, kind));
    }
    if (SConceptOperations.isExactly(SNodeOperations.asSConcept(kind), CONCEPTS.MappingDef$$Y)) {
      ListScope sorceDefScope = ListScope.forNamedElements(SNodeOperations.getNodeDescendants(__thisNode__, CONCEPTS.SourceDef$NF, false, new SAbstractConcept[]{}));
      return new CompositeScope(sorceDefScope, ScopeUtils.lazyParentScope(__thisNode__, kind));
    }
    if (SConceptOperations.isExactly(SNodeOperations.asSConcept(kind), CONCEPTS.XMLDataItem$KN) || SConceptOperations.isExactly(SNodeOperations.asSConcept(kind), CONCEPTS.JSONDataItem$QI) || SConceptOperations.isExactly(SNodeOperations.asSConcept(kind), CONCEPTS.MappingDefRef$Gv) || SConceptOperations.isExactly(SNodeOperations.asSConcept(kind), CONCEPTS.XlsSection$Qq)) {
      Iterable<SNode> mappingDefs = ListSequence.fromList(SNodeOperations.getNodeDescendants(__thisNode__, CONCEPTS.MappingDef$$Y, false, new SAbstractConcept[]{})).concat(ListSequence.fromList(SNodeOperations.getNodeDescendants(__thisNode__, CONCEPTS.ParameterMappingDef$3m, false, new SAbstractConcept[]{})));
      ListScope mappingDefScope = ListScope.forNamedElements(mappingDefs);
      return new CompositeScope(mappingDefScope, ScopeUtils.lazyParentScope(__thisNode__, kind));
    }
    if (SConceptOperations.isExactly(SNodeOperations.asSConcept(kind), CONCEPTS.IParamRef$yT)) {
      ListScope paramItemScope = ListScope.forNamedElements(SNodeOperations.getNodeDescendants(__thisNode__, CONCEPTS.ParamItem$4M, false, new SAbstractConcept[]{}));
      return new CompositeScope(paramItemScope, ScopeUtils.lazyParentScope(__thisNode__, kind));
    }
    return ((Scope) ScopeProvider__BehaviorDescriptor.getScope_id52_Geb4QDV$.invoke0(__thisNode__, CONCEPTS.ScopeProvider$aq, kind, child));
  }

  /*package*/ Template__BehaviorDescriptor() {
  }

  @Override
  protected void initNode(@NotNull SNode node, @NotNull SConstructor constructor, @Nullable Object[] parameters) {
    ___init___(node);
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SNode node, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      case 0:
        return (T) ((Scope) getScope_id52_Geb4QDV$(node, (SAbstractConcept) parameters[0], (SNode) parameters[1]));
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SAbstractConcept concept, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @NotNull
  @Override
  public List<SMethod<?>> getDeclaredMethods() {
    return BH_METHODS;
  }

  @NotNull
  @Override
  public SAbstractConcept getConcept() {
    return CONCEPT;
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept SourceAbstractItem$bh = MetaAdapterFactory.getConcept(0x22a6c585e3ba46bcL, 0x922caa7eb0f6869bL, 0x28099d21881b7891L, "DataMapping.structure.SourceAbstractItem");
    /*package*/ static final SConcept SourceEntityRef$pM = MetaAdapterFactory.getConcept(0x22a6c585e3ba46bcL, 0x922caa7eb0f6869bL, 0x28099d21881b7c6eL, "DataMapping.structure.SourceEntityRef");
    /*package*/ static final SConcept ValueDef$Mu = MetaAdapterFactory.getConcept(0x22a6c585e3ba46bcL, 0x922caa7eb0f6869bL, 0x28099d21881a135cL, "DataMapping.structure.ValueDef");
    /*package*/ static final SConcept ParameterValueDef$ZW = MetaAdapterFactory.getConcept(0x22a6c585e3ba46bcL, 0x922caa7eb0f6869bL, 0x7bbd02202d7f1985L, "DataMapping.structure.ParameterValueDef");
    /*package*/ static final SConcept JSONMappingValueRef$IK = MetaAdapterFactory.getConcept(0x22a6c585e3ba46bcL, 0x922caa7eb0f6869bL, 0x6d9e20901ae69279L, "DataMapping.structure.JSONMappingValueRef");
    /*package*/ static final SConcept MappingValueRef$rR = MetaAdapterFactory.getConcept(0x22a6c585e3ba46bcL, 0x922caa7eb0f6869bL, 0x41fd2b6fb7964650L, "DataMapping.structure.MappingValueRef");
    /*package*/ static final SConcept SourceDef$NF = MetaAdapterFactory.getConcept(0x22a6c585e3ba46bcL, 0x922caa7eb0f6869bL, 0x28099d21881b6885L, "DataMapping.structure.SourceDef");
    /*package*/ static final SConcept MappingDef$$Y = MetaAdapterFactory.getConcept(0x22a6c585e3ba46bcL, 0x922caa7eb0f6869bL, 0x28099d21881a0754L, "DataMapping.structure.MappingDef");
    /*package*/ static final SConcept ParameterMappingDef$3m = MetaAdapterFactory.getConcept(0x22a6c585e3ba46bcL, 0x922caa7eb0f6869bL, 0x7bbd02202d2efecbL, "DataMapping.structure.ParameterMappingDef");
    /*package*/ static final SConcept XlsSection$Qq = MetaAdapterFactory.getConcept(0x22a6c585e3ba46bcL, 0x922caa7eb0f6869bL, 0x34e1d43f312686c0L, "DataMapping.structure.XlsSection");
    /*package*/ static final SConcept XMLDataItem$KN = MetaAdapterFactory.getConcept(0x22a6c585e3ba46bcL, 0x922caa7eb0f6869bL, 0x41fd2b6fb78f5f48L, "DataMapping.structure.XMLDataItem");
    /*package*/ static final SConcept JSONDataItem$QI = MetaAdapterFactory.getConcept(0x22a6c585e3ba46bcL, 0x922caa7eb0f6869bL, 0x6d9e20901ae527d3L, "DataMapping.structure.JSONDataItem");
    /*package*/ static final SConcept MappingDefRef$Gv = MetaAdapterFactory.getConcept(0x22a6c585e3ba46bcL, 0x922caa7eb0f6869bL, 0x26f4b9ad5a1f1af5L, "DataMapping.structure.MappingDefRef");
    /*package*/ static final SConcept ParamItem$4M = MetaAdapterFactory.getConcept(0x22a6c585e3ba46bcL, 0x922caa7eb0f6869bL, 0x774c73f6ce229c65L, "DataMapping.structure.ParamItem");
    /*package*/ static final SInterfaceConcept IParamRef$yT = MetaAdapterFactory.getInterfaceConcept(0x22a6c585e3ba46bcL, 0x922caa7eb0f6869bL, 0x1c06662da7304013L, "DataMapping.structure.IParamRef");
    /*package*/ static final SInterfaceConcept ScopeProvider$aq = MetaAdapterFactory.getInterfaceConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x33d23ee961a0cbf3L, "jetbrains.mps.lang.core.structure.ScopeProvider");
  }
}
