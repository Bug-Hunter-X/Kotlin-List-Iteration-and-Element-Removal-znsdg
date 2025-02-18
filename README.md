# Kotlin List Iteration and Element Removal
This example showcases a common error when removing elements from a mutable list in Kotlin while iterating over it using a `for` loop.

The `removeAt` function modifies the list's size, leading to potential index out-of-bounds exceptions or unexpected behavior.  The `removeIf` function, however, is designed to handle this safely.  The example demonstrates the correct and incorrect approaches.