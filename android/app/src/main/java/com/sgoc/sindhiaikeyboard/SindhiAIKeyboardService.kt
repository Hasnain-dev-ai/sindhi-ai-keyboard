package com.sgoc.sindhiaikeyboard

import android.inputmethodservice.InputMethodService
import android.view.View

/**
 * Android Input Method Service for Sindhi AI Keyboard.
 *
 * This initial implementation establishes the keyboard service
 * recognized by Android. The actual keyboard UI, Sindhi layout,
 * language engine, suggestions, and AI features will be added
 * incrementally.
 */
class SindhiAIKeyboardService : InputMethodService() {

    override fun onCreateInputView(): View {
        return View(this)
    }
}