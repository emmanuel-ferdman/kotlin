/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.js.test.fir;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateJsTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("js/js.translator/testData/typescript-export/js")
@TestDataPath("$PROJECT_ROOT")
public class FirJsTypeScriptExportTestGenerated extends AbstractFirJsTypeScriptExportTest {
  @Test
  public void testAllFilesPresentInJs() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/abstract-classes")
  @TestDataPath("$PROJECT_ROOT")
  public class Abstract_classes {
    @Test
    @TestMetadata("abstract-classes.kt")
    public void testAbstract_classes() {
      runTest("js/js.translator/testData/typescript-export/js/abstract-classes/abstract-classes.kt");
    }

    @Test
    public void testAllFilesPresentInAbstract_classes() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/abstract-classes"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/abstract-classes-in-exported-file")
  @TestDataPath("$PROJECT_ROOT")
  public class Abstract_classes_in_exported_file {
    @Test
    @TestMetadata("abstract-classes.kt")
    public void testAbstract_classes() {
      runTest("js/js.translator/testData/typescript-export/js/abstract-classes-in-exported-file/abstract-classes.kt");
    }

    @Test
    public void testAllFilesPresentInAbstract_classes_in_exported_file() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/abstract-classes-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/collections")
  @TestDataPath("$PROJECT_ROOT")
  public class Collections {
    @Test
    public void testAllFilesPresentInCollections() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/collections"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("collections.kt")
    public void testCollections() {
      runTest("js/js.translator/testData/typescript-export/js/collections/collections.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/collections-in-exported-file")
  @TestDataPath("$PROJECT_ROOT")
  public class Collections_in_exported_file {
    @Test
    public void testAllFilesPresentInCollections_in_exported_file() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/collections-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("collections.kt")
    public void testCollections() {
      runTest("js/js.translator/testData/typescript-export/js/collections-in-exported-file/collections.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/constructors")
  @TestDataPath("$PROJECT_ROOT")
  public class Constructors {
    @Test
    public void testAllFilesPresentInConstructors() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/constructors"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("constructors.kt")
    public void testConstructors() {
      runTest("js/js.translator/testData/typescript-export/js/constructors/constructors.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/constructors-in-exported-file")
  @TestDataPath("$PROJECT_ROOT")
  public class Constructors_in_exported_file {
    @Test
    public void testAllFilesPresentInConstructors_in_exported_file() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/constructors-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("constructors.kt")
    public void testConstructors() {
      runTest("js/js.translator/testData/typescript-export/js/constructors-in-exported-file/constructors.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/data-classes")
  @TestDataPath("$PROJECT_ROOT")
  public class Data_classes {
    @Test
    public void testAllFilesPresentInData_classes() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/data-classes"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("data-classes.kt")
    public void testData_classes() {
      runTest("js/js.translator/testData/typescript-export/js/data-classes/data-classes.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/data-classes-in-exported-file")
  @TestDataPath("$PROJECT_ROOT")
  public class Data_classes_in_exported_file {
    @Test
    public void testAllFilesPresentInData_classes_in_exported_file() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/data-classes-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("data-classes.kt")
    public void testData_classes() {
      runTest("js/js.translator/testData/typescript-export/js/data-classes-in-exported-file/data-classes.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/deprecated")
  @TestDataPath("$PROJECT_ROOT")
  public class Deprecated {
    @Test
    public void testAllFilesPresentInDeprecated() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/deprecated"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("deprecated.kt")
    public void testDeprecated() {
      runTest("js/js.translator/testData/typescript-export/js/deprecated/deprecated.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/deprecated-in-exported-file")
  @TestDataPath("$PROJECT_ROOT")
  public class Deprecated_in_exported_file {
    @Test
    public void testAllFilesPresentInDeprecated_in_exported_file() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/deprecated-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("deprecated.kt")
    public void testDeprecated() {
      runTest("js/js.translator/testData/typescript-export/js/deprecated-in-exported-file/deprecated.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/enum-classes")
  @TestDataPath("$PROJECT_ROOT")
  public class Enum_classes {
    @Test
    public void testAllFilesPresentInEnum_classes() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/enum-classes"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("enum-classes.kt")
    public void testEnum_classes() {
      runTest("js/js.translator/testData/typescript-export/js/enum-classes/enum-classes.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/enum-classes-in-exported-file")
  @TestDataPath("$PROJECT_ROOT")
  public class Enum_classes_in_exported_file {
    @Test
    public void testAllFilesPresentInEnum_classes_in_exported_file() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/enum-classes-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("enum-classes.kt")
    public void testEnum_classes() {
      runTest("js/js.translator/testData/typescript-export/js/enum-classes-in-exported-file/enum-classes.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/escaped-declarations")
  @TestDataPath("$PROJECT_ROOT")
  public class Escaped_declarations {
    @Test
    public void testAllFilesPresentInEscaped_declarations() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/escaped-declarations"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("escaped-declarations.kt")
    public void testEscaped_declarations() {
      runTest("js/js.translator/testData/typescript-export/js/escaped-declarations/escaped-declarations.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/escaped-declarations-in-exported-file")
  @TestDataPath("$PROJECT_ROOT")
  public class Escaped_declarations_in_exported_file {
    @Test
    public void testAllFilesPresentInEscaped_declarations_in_exported_file() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/escaped-declarations-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("escaped-declarations.kt")
    public void testEscaped_declarations() {
      runTest("js/js.translator/testData/typescript-export/js/escaped-declarations-in-exported-file/escaped-declarations.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/excluded-exported-declarations")
  @TestDataPath("$PROJECT_ROOT")
  public class Excluded_exported_declarations {
    @Test
    public void testAllFilesPresentInExcluded_exported_declarations() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/excluded-exported-declarations"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("excluded-exported-declarations.kt")
    public void testExcluded_exported_declarations() {
      runTest("js/js.translator/testData/typescript-export/js/excluded-exported-declarations/excluded-exported-declarations.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/excluded-exported-declarations-in-exported-file")
  @TestDataPath("$PROJECT_ROOT")
  public class Excluded_exported_declarations_in_exported_file {
    @Test
    public void testAllFilesPresentInExcluded_exported_declarations_in_exported_file() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/excluded-exported-declarations-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("excluded-exported-declarations.kt")
    public void testExcluded_exported_declarations() {
      runTest("js/js.translator/testData/typescript-export/js/excluded-exported-declarations-in-exported-file/excluded-exported-declarations.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/functions")
  @TestDataPath("$PROJECT_ROOT")
  public class Functions {
    @Test
    public void testAllFilesPresentInFunctions() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/functions"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("functions.kt")
    public void testFunctions() {
      runTest("js/js.translator/testData/typescript-export/js/functions/functions.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/functions-in-exported-file")
  @TestDataPath("$PROJECT_ROOT")
  public class Functions_in_exported_file {
    @Test
    public void testAllFilesPresentInFunctions_in_exported_file() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/functions-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("functions.kt")
    public void testFunctions() {
      runTest("js/js.translator/testData/typescript-export/js/functions-in-exported-file/functions.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/implicit-export")
  @TestDataPath("$PROJECT_ROOT")
  public class Implicit_export {
    @Test
    public void testAllFilesPresentInImplicit_export() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/implicit-export"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("implicit-export.kt")
    public void testImplicit_export() {
      runTest("js/js.translator/testData/typescript-export/js/implicit-export/implicit-export.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/inheritance")
  @TestDataPath("$PROJECT_ROOT")
  public class Inheritance {
    @Test
    public void testAllFilesPresentInInheritance() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/inheritance"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("inheritance.kt")
    public void testInheritance() {
      runTest("js/js.translator/testData/typescript-export/js/inheritance/inheritance.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/inner-classes")
  @TestDataPath("$PROJECT_ROOT")
  public class Inner_classes {
    @Test
    public void testAllFilesPresentInInner_classes() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/inner-classes"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("inner-class.kt")
    public void testInner_class() {
      runTest("js/js.translator/testData/typescript-export/js/inner-classes/inner-class.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/inner-classes-in-exported-file")
  @TestDataPath("$PROJECT_ROOT")
  public class Inner_classes_in_exported_file {
    @Test
    public void testAllFilesPresentInInner_classes_in_exported_file() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/inner-classes-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("inner-class.kt")
    public void testInner_class() {
      runTest("js/js.translator/testData/typescript-export/js/inner-classes-in-exported-file/inner-class.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/interfaces")
  @TestDataPath("$PROJECT_ROOT")
  public class Interfaces {
    @Test
    public void testAllFilesPresentInInterfaces() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/interfaces"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("interfaces.kt")
    public void testInterfaces() {
      runTest("js/js.translator/testData/typescript-export/js/interfaces/interfaces.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/interfaces-in-exported-file")
  @TestDataPath("$PROJECT_ROOT")
  public class Interfaces_in_exported_file {
    @Test
    public void testAllFilesPresentInInterfaces_in_exported_file() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/interfaces-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("interfaces.kt")
    public void testInterfaces() {
      runTest("js/js.translator/testData/typescript-export/js/interfaces-in-exported-file/interfaces.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/js-name")
  @TestDataPath("$PROJECT_ROOT")
  public class Js_name {
    @Test
    public void testAllFilesPresentInJs_name() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/js-name"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("js-name.kt")
    public void testJs_name() {
      runTest("js/js.translator/testData/typescript-export/js/js-name/js-name.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/js-name-in-exported-file")
  @TestDataPath("$PROJECT_ROOT")
  public class Js_name_in_exported_file {
    @Test
    public void testAllFilesPresentInJs_name_in_exported_file() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/js-name-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("js-name.kt")
    public void testJs_name() {
      runTest("js/js.translator/testData/typescript-export/js/js-name-in-exported-file/js-name.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/member-properties")
  @TestDataPath("$PROJECT_ROOT")
  public class Member_properties {
    @Test
    public void testAllFilesPresentInMember_properties() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/member-properties"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("member-properties.kt")
    public void testMember_properties() {
      runTest("js/js.translator/testData/typescript-export/js/member-properties/member-properties.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/member-properties-in-exported-file")
  @TestDataPath("$PROJECT_ROOT")
  public class Member_properties_in_exported_file {
    @Test
    public void testAllFilesPresentInMember_properties_in_exported_file() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/member-properties-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("member-properties.kt")
    public void testMember_properties() {
      runTest("js/js.translator/testData/typescript-export/js/member-properties-in-exported-file/member-properties.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/methods")
  @TestDataPath("$PROJECT_ROOT")
  public class Methods {
    @Test
    public void testAllFilesPresentInMethods() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/methods"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("methods.kt")
    public void testMethods() {
      runTest("js/js.translator/testData/typescript-export/js/methods/methods.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/methods-in-exported-file")
  @TestDataPath("$PROJECT_ROOT")
  public class Methods_in_exported_file {
    @Test
    public void testAllFilesPresentInMethods_in_exported_file() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/methods-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("methods.kt")
    public void testMethods() {
      runTest("js/js.translator/testData/typescript-export/js/methods-in-exported-file/methods.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/module-systems")
  @TestDataPath("$PROJECT_ROOT")
  public class Module_systems {
    @Test
    public void testAllFilesPresentInModule_systems() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/module-systems"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("commonjs.kt")
    public void testCommonjs() {
      runTest("js/js.translator/testData/typescript-export/js/module-systems/commonjs.kt");
    }

    @Test
    @TestMetadata("esm.kt")
    public void testEsm() {
      runTest("js/js.translator/testData/typescript-export/js/module-systems/esm.kt");
    }

    @Test
    @TestMetadata("plain.kt")
    public void testPlain() {
      runTest("js/js.translator/testData/typescript-export/js/module-systems/plain.kt");
    }

    @Test
    @TestMetadata("umd.kt")
    public void testUmd() {
      runTest("js/js.translator/testData/typescript-export/js/module-systems/umd.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/module-systems-in-exported-file")
  @TestDataPath("$PROJECT_ROOT")
  public class Module_systems_in_exported_file {
    @Test
    public void testAllFilesPresentInModule_systems_in_exported_file() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/module-systems-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("commonjs.kt")
    public void testCommonjs() {
      runTest("js/js.translator/testData/typescript-export/js/module-systems-in-exported-file/commonjs.kt");
    }

    @Test
    @TestMetadata("esm.kt")
    public void testEsm() {
      runTest("js/js.translator/testData/typescript-export/js/module-systems-in-exported-file/esm.kt");
    }

    @Test
    @TestMetadata("plain.kt")
    public void testPlain() {
      runTest("js/js.translator/testData/typescript-export/js/module-systems-in-exported-file/plain.kt");
    }

    @Test
    @TestMetadata("umd.kt")
    public void testUmd() {
      runTest("js/js.translator/testData/typescript-export/js/module-systems-in-exported-file/umd.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/namespaces")
  @TestDataPath("$PROJECT_ROOT")
  public class Namespaces {
    @Test
    public void testAllFilesPresentInNamespaces() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/namespaces"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("namespaces.kt")
    public void testNamespaces() {
      runTest("js/js.translator/testData/typescript-export/js/namespaces/namespaces.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/namespaces-in-exported-file")
  @TestDataPath("$PROJECT_ROOT")
  public class Namespaces_in_exported_file {
    @Test
    public void testAllFilesPresentInNamespaces_in_exported_file() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/namespaces-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("namespaces.kt")
    public void testNamespaces() {
      runTest("js/js.translator/testData/typescript-export/js/namespaces-in-exported-file/namespaces.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/not-exported-declarations")
  @TestDataPath("$PROJECT_ROOT")
  public class Not_exported_declarations {
    @Test
    public void testAllFilesPresentInNot_exported_declarations() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/not-exported-declarations"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("not-exported-declarations.kt")
    public void testNot_exported_declarations() {
      runTest("js/js.translator/testData/typescript-export/js/not-exported-declarations/not-exported-declarations.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/not-exported-declarations-in-exported-file")
  @TestDataPath("$PROJECT_ROOT")
  public class Not_exported_declarations_in_exported_file {
    @Test
    public void testAllFilesPresentInNot_exported_declarations_in_exported_file() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/not-exported-declarations-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("not-exported-declarations.kt")
    public void testNot_exported_declarations() {
      runTest("js/js.translator/testData/typescript-export/js/not-exported-declarations-in-exported-file/not-exported-declarations.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/objects")
  @TestDataPath("$PROJECT_ROOT")
  public class Objects {
    @Test
    public void testAllFilesPresentInObjects() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/objects"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("objects.kt")
    public void testObjects() {
      runTest("js/js.translator/testData/typescript-export/js/objects/objects.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/objects-in-exported-file")
  @TestDataPath("$PROJECT_ROOT")
  public class Objects_in_exported_file {
    @Test
    public void testAllFilesPresentInObjects_in_exported_file() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/objects-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("objects.kt")
    public void testObjects() {
      runTest("js/js.translator/testData/typescript-export/js/objects-in-exported-file/objects.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/primitives")
  @TestDataPath("$PROJECT_ROOT")
  public class Primitives {
    @Test
    public void testAllFilesPresentInPrimitives() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/primitives"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("primitives.kt")
    public void testPrimitives() {
      runTest("js/js.translator/testData/typescript-export/js/primitives/primitives.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/primitives-in-exported-file")
  @TestDataPath("$PROJECT_ROOT")
  public class Primitives_in_exported_file {
    @Test
    public void testAllFilesPresentInPrimitives_in_exported_file() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/primitives-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("primitives.kt")
    public void testPrimitives() {
      runTest("js/js.translator/testData/typescript-export/js/primitives-in-exported-file/primitives.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/private-primary-constructor")
  @TestDataPath("$PROJECT_ROOT")
  public class Private_primary_constructor {
    @Test
    public void testAllFilesPresentInPrivate_primary_constructor() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/private-primary-constructor"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("private-primary-constructor.kt")
    public void testPrivate_primary_constructor() {
      runTest("js/js.translator/testData/typescript-export/js/private-primary-constructor/private-primary-constructor.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/properties")
  @TestDataPath("$PROJECT_ROOT")
  public class Properties {
    @Test
    public void testAllFilesPresentInProperties() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/properties"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("properties.kt")
    public void testProperties() {
      runTest("js/js.translator/testData/typescript-export/js/properties/properties.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/properties-in-exported-file")
  @TestDataPath("$PROJECT_ROOT")
  public class Properties_in_exported_file {
    @Test
    public void testAllFilesPresentInProperties_in_exported_file() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/properties-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("properties.kt")
    public void testProperties() {
      runTest("js/js.translator/testData/typescript-export/js/properties-in-exported-file/properties.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/regular-classes")
  @TestDataPath("$PROJECT_ROOT")
  public class Regular_classes {
    @Test
    public void testAllFilesPresentInRegular_classes() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/regular-classes"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("regular-classes.kt")
    public void testRegular_classes() {
      runTest("js/js.translator/testData/typescript-export/js/regular-classes/regular-classes.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/regular-classes-in-exported-file")
  @TestDataPath("$PROJECT_ROOT")
  public class Regular_classes_in_exported_file {
    @Test
    public void testAllFilesPresentInRegular_classes_in_exported_file() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/regular-classes-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("regular-classes.kt")
    public void testRegular_classes() {
      runTest("js/js.translator/testData/typescript-export/js/regular-classes-in-exported-file/regular-classes.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/sealed-classes")
  @TestDataPath("$PROJECT_ROOT")
  public class Sealed_classes {
    @Test
    public void testAllFilesPresentInSealed_classes() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/sealed-classes"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("sealed-classes.kt")
    public void testSealed_classes() {
      runTest("js/js.translator/testData/typescript-export/js/sealed-classes/sealed-classes.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/sealed-classes-in-exported-file")
  @TestDataPath("$PROJECT_ROOT")
  public class Sealed_classes_in_exported_file {
    @Test
    public void testAllFilesPresentInSealed_classes_in_exported_file() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/sealed-classes-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("sealed-classes.kt")
    public void testSealed_classes() {
      runTest("js/js.translator/testData/typescript-export/js/sealed-classes-in-exported-file/sealed-classes.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/selective-export")
  @TestDataPath("$PROJECT_ROOT")
  public class Selective_export {
    @Test
    public void testAllFilesPresentInSelective_export() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/selective-export"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("selective-export.kt")
    public void testSelective_export() {
      runTest("js/js.translator/testData/typescript-export/js/selective-export/selective-export.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/strict-implicit-export")
  @TestDataPath("$PROJECT_ROOT")
  public class Strict_implicit_export {
    @Test
    public void testAllFilesPresentInStrict_implicit_export() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/strict-implicit-export"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("strict-implicit-export.kt")
    public void testStrict_implicit_export() {
      runTest("js/js.translator/testData/typescript-export/js/strict-implicit-export/strict-implicit-export.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/visibility")
  @TestDataPath("$PROJECT_ROOT")
  public class Visibility {
    @Test
    public void testAllFilesPresentInVisibility() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/visibility"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("visibility.kt")
    public void testVisibility() {
      runTest("js/js.translator/testData/typescript-export/js/visibility/visibility.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/js/visibility-in-exported-file")
  @TestDataPath("$PROJECT_ROOT")
  public class Visibility_in_exported_file {
    @Test
    public void testAllFilesPresentInVisibility_in_exported_file() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/js/visibility-in-exported-file"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS_IR, true);
    }

    @Test
    @TestMetadata("visibility.kt")
    public void testVisibility() {
      runTest("js/js.translator/testData/typescript-export/js/visibility-in-exported-file/visibility.kt");
    }
  }
}
