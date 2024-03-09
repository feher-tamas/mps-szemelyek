package DataMapping.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.menus.substitute.SubstituteMenuBase;
import jetbrains.mps.lang.editor.menus.EditorMenuDescriptorBase;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import jetbrains.mps.lang.editor.menus.MenuPart;
import jetbrains.mps.openapi.editor.menus.substitute.SubstituteMenuItem;
import jetbrains.mps.openapi.editor.menus.substitute.SubstituteMenuContext;
import java.util.ArrayList;
import jetbrains.mps.lang.editor.menus.substitute.ConstraintsFilteringSubstituteMenuPartDecorator;
import jetbrains.mps.lang.editor.menus.substitute.ReferenceScopeSubstituteMenuPart;
import jetbrains.mps.lang.editor.menus.ConceptMenusPart;
import java.util.Collection;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.lang.editor.menus.substitute.DefaultSubstituteMenuLookup;
import jetbrains.mps.smodel.language.LanguageRegistry;
import org.jetbrains.mps.openapi.language.SConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SReferenceLink;

public class MappingDefRef_SubstituteMenu extends SubstituteMenuBase {
  public MappingDefRef_SubstituteMenu() {
    super(false, new EditorMenuDescriptorBase("default substitute menu for MappingDefRef. Generated from implicit smart reference attribute.", new SNodePointer("r:2d36f7b5-27c5-4304-ac9a-34504b59f0d2(DataMapping.structure)", "2807072621951130357")));
  }
  @NotNull
  @Override
  protected List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> getParts(final SubstituteMenuContext _context) {
    List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> result = new ArrayList<MenuPart<SubstituteMenuItem, SubstituteMenuContext>>();
    result.add(new ConstraintsFilteringSubstituteMenuPartDecorator(new SMP_ReferenceScope_gdajdq_a(), CONCEPTS.MappingDefRef$Gv));
    result.add(new SMP_Subconcepts_gdajdq_b());
    return result;
  }

  public class SMP_ReferenceScope_gdajdq_a extends ReferenceScopeSubstituteMenuPart {

    public SMP_ReferenceScope_gdajdq_a() {
      super(CONCEPTS.MappingDefRef$Gv, LINKS.mappingDef$r2Vz, new EditorMenuDescriptorBase("reference scope substitute menu part", null));
    }

  }
  public class SMP_Subconcepts_gdajdq_b extends ConceptMenusPart<SubstituteMenuItem, SubstituteMenuContext> {
    public SMP_Subconcepts_gdajdq_b() {
      super(new EditorMenuDescriptorBase("include menus for all the direct subconcepts of " + "MappingDefRef", null));
    }

    @Override
    protected Collection<SAbstractConcept> getConcepts(final SubstituteMenuContext _context) {
      return getDirectDescendants(_context, CONCEPTS.MappingDefRef$Gv);
    }

    @Override
    protected Collection<SubstituteMenuItem> createItemsForConcept(SubstituteMenuContext context, SAbstractConcept concept) {
      return context.createItems(new DefaultSubstituteMenuLookup(LanguageRegistry.getInstance(context.getEditorContext().getRepository()), concept));
    }
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept MappingDefRef$Gv = MetaAdapterFactory.getConcept(0x22a6c585e3ba46bcL, 0x922caa7eb0f6869bL, 0x26f4b9ad5a1f1af5L, "DataMapping.structure.MappingDefRef");
  }

  private static final class LINKS {
    /*package*/ static final SReferenceLink mappingDef$r2Vz = MetaAdapterFactory.getReferenceLink(0x22a6c585e3ba46bcL, 0x922caa7eb0f6869bL, 0x26f4b9ad5a1f1af5L, 0x26f4b9ad5a1f1af6L, "mappingDef");
  }
}