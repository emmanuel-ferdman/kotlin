/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.konan.test.blackbox;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.junit.jupiter.api.Tag;
import org.jetbrains.kotlin.konan.test.blackbox.support.group.FirPipeline;
import org.jetbrains.kotlin.konan.test.blackbox.support.group.UseStandardTestCaseGroupProvider;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateNativeTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("native/native.tests/testData/SwiftExport")
@TestDataPath("$PROJECT_ROOT")
@Tag("frontend-fir")
@FirPipeline()
@UseStandardTestCaseGroupProvider()
public class SwiftExportExecutionTestGenerated extends AbstractNativeSwiftExportExecutionTest {
  @Test
  public void testAllFilesPresentInSwiftExport() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("native/native.tests/testData/SwiftExport"), Pattern.compile("^([^_](.+))$"), null, false);
  }

  @Test
  @TestMetadata("autoimport")
  public void testAutoimport() {
    runTest("native/native.tests/testData/SwiftExport/autoimport/");
  }

  @Test
  @TestMetadata("char")
  public void testChar() {
    runTest("native/native.tests/testData/SwiftExport/char/");
  }

  @Test
  @TestMetadata("never_type")
  public void testNever_type() {
    runTest("native/native.tests/testData/SwiftExport/never_type/");
  }

  @Test
  @TestMetadata("properties")
  public void testProperties() {
    runTest("native/native.tests/testData/SwiftExport/properties/");
  }

  @Test
  @TestMetadata("referenceTypes")
  public void testReferenceTypes() {
    runTest("native/native.tests/testData/SwiftExport/referenceTypes/");
  }

  @Test
  @TestMetadata("smokes")
  public void testSmokes() {
    runTest("native/native.tests/testData/SwiftExport/smokes/");
  }

  @Test
  @TestMetadata("specialTypes")
  public void testSpecialTypes() {
    runTest("native/native.tests/testData/SwiftExport/specialTypes/");
  }
}
