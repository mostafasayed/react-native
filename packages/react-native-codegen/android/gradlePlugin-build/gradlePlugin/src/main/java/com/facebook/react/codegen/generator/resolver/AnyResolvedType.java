/*
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.react.codegen.generator.resolver;

import com.facebook.react.codegen.generator.model.AnyType;
import com.facebook.react.codegen.generator.model.TypeData;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import javax.annotation.Nullable;

public final class AnyResolvedType extends ResolvedType<AnyType> {

  private AnyResolvedType(final AnyType type, final boolean nullable) {
    super(type, nullable);
  }

  public static AnyResolvedType create(
      final AnyType type, final TypeData typeData, final boolean nullable) {
    return new AnyResolvedType(type, nullable);
  }

  @Override
  public TypeName getNativeType(final NativeTypeContext typeContext) {
    // TODO
    return TypeName.VOID;
  }

  @Override
  public @Nullable TypeSpec getGeneratedCode(final String packageName) {
    // TODO
    throw new UnsupportedOperationException();
  }
}