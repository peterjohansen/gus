package com.actram.solace.interpreter.errors;

import com.actram.solace.interpreter.InterpreterError;

/**
 * An error representing a failed conversion of a {@link String} to a
 * {@code char}.
 * <p>
 * This error is most commonly caused by the {@link String} having a length
 * greater than one.
 *
 * @author Peter André Johansen
 */
public class CharFormatError implements InterpreterError {
}