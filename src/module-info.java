/**
 * A file compression, encryption and splitting utility in Java.
 */
open module eu.steffo.cleaver {
    requires java.desktop;
    requires java.xml;

    exports eu.steffo.cleaver;
    exports eu.steffo.cleaver.errors;
    exports eu.steffo.cleaver.gui;
    exports eu.steffo.cleaver.gui.panels;
    exports eu.steffo.cleaver.gui.rows;
    exports eu.steffo.cleaver.gui.rows.option;
    exports eu.steffo.cleaver.logic;
    exports eu.steffo.cleaver.logic.compress;
    exports eu.steffo.cleaver.logic.crypt;
    exports eu.steffo.cleaver.logic.progress;
    exports eu.steffo.cleaver.logic.split;
}