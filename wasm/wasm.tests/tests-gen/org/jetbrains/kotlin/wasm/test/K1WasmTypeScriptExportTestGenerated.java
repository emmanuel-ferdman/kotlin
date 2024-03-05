/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.wasm.test;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateWasmTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("js/js.translator/testData/typescript-export/wasm")
@TestDataPath("$PROJECT_ROOT")
public class K1WasmTypeScriptExportTestGenerated extends AbstractK1WasmTypeScriptExportTest {
  @Test
  public void testAllFilesPresentInWasm() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/wasm"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.WASM, true);
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/wasm/externalDeclarations")
  @TestDataPath("$PROJECT_ROOT")
  public class ExternalDeclarations {
    @Test
    public void testAllFilesPresentInExternalDeclarations() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/wasm/externalDeclarations"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.WASM, true);
    }

    @Test
    @TestMetadata("externalDeclarations.kt")
    public void testExternalDeclarations() {
      runTest("js/js.translator/testData/typescript-export/wasm/externalDeclarations/externalDeclarations.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/wasm/generics")
  @TestDataPath("$PROJECT_ROOT")
  public class Generics {
    @Test
    public void testAllFilesPresentInGenerics() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/wasm/generics"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.WASM, true);
    }

    @Test
    @TestMetadata("generics.kt")
    public void testGenerics() {
      runTest("js/js.translator/testData/typescript-export/wasm/generics/generics.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/wasm/jsPrimitives")
  @TestDataPath("$PROJECT_ROOT")
  public class JsPrimitives {
    @Test
    public void testAllFilesPresentInJsPrimitives() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/wasm/jsPrimitives"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.WASM, true);
    }

    @Test
    @TestMetadata("jsPrimitives.kt")
    public void testJsPrimitives() {
      runTest("js/js.translator/testData/typescript-export/wasm/jsPrimitives/jsPrimitives.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/wasm/nullableJsPrimitives")
  @TestDataPath("$PROJECT_ROOT")
  public class NullableJsPrimitives {
    @Test
    public void testAllFilesPresentInNullableJsPrimitives() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/wasm/nullableJsPrimitives"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.WASM, true);
    }

    @Test
    @TestMetadata("nullableJsPrimitives.kt")
    public void testNullableJsPrimitives() {
      runTest("js/js.translator/testData/typescript-export/wasm/nullableJsPrimitives/nullableJsPrimitives.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/wasm/nullablePrimitives")
  @TestDataPath("$PROJECT_ROOT")
  public class NullablePrimitives {
    @Test
    public void testAllFilesPresentInNullablePrimitives() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/wasm/nullablePrimitives"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.WASM, true);
    }

    @Test
    @TestMetadata("nullablePrimitives.kt")
    public void testNullablePrimitives() {
      runTest("js/js.translator/testData/typescript-export/wasm/nullablePrimitives/nullablePrimitives.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/wasm/nullableUnsigned")
  @TestDataPath("$PROJECT_ROOT")
  public class NullableUnsigned {
    @Test
    public void testAllFilesPresentInNullableUnsigned() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/wasm/nullableUnsigned"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.WASM, true);
    }

    @Test
    @TestMetadata("nullableUnsinged.kt")
    public void testNullableUnsinged() {
      runTest("js/js.translator/testData/typescript-export/wasm/nullableUnsigned/nullableUnsinged.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/wasm/primitives")
  @TestDataPath("$PROJECT_ROOT")
  public class Primitives {
    @Test
    public void testAllFilesPresentInPrimitives() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/wasm/primitives"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.WASM, true);
    }

    @Test
    @TestMetadata("primitives.kt")
    public void testPrimitives() {
      runTest("js/js.translator/testData/typescript-export/wasm/primitives/primitives.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/typescript-export/wasm/unsigned")
  @TestDataPath("$PROJECT_ROOT")
  public class Unsigned {
    @Test
    public void testAllFilesPresentInUnsigned() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/typescript-export/wasm/unsigned"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.WASM, true);
    }

    @Test
    @TestMetadata("unsinged.kt")
    public void testUnsinged() {
      runTest("js/js.translator/testData/typescript-export/wasm/unsigned/unsinged.kt");
    }
  }
}
