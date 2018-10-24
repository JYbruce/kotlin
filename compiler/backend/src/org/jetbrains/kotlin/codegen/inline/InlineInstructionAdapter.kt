/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.codegen.inline

import org.jetbrains.org.objectweb.asm.MethodVisitor
import org.jetbrains.org.objectweb.asm.commons.InstructionAdapter

open class InlineMethodInstructionAdapter(methodVisitor: MethodVisitor?) :
    InstructionAdapter(API, methodVisitor) {

    override fun visitAnnotableParameterCount(parameterCount: Int, visible: Boolean) {

    }
}