package com.teragrep.functions.mvn_01;

/**
 * @class Dog
 * @brief Woofs loudly
 *
 * @responsibilities
 * - Very fluffy
 *
 * @collaborators
 * - Cat
 *
 * @startuml
 * class Dog {
 *   + woof()
 * }
 *
 * Dog --> Cat : fluffiness
 *
 * note right of Dog
 * Responsibilities:
 * - Very fluffy
 *
 * Collaborators:
 * - Cat
 * end note
 *
 * @enduml
 */

public final class Dog {
    public void woof() {
        return;
    }
}
