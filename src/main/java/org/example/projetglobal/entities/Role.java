package org.example.projetglobal.entities;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;

@XmlEnum
public enum Role {
    @XmlEnumValue("ADMIN")
    ADMIN,
    @XmlEnumValue("USER")
    USER,
    @XmlEnumValue("SUPERADMIN")
    SUPERADMIN;
}

