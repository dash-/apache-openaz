/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.05.23 at 02:47:00 PM EDT
//

package oasis.names.tc.xacml._3_0.core.schema.wd_17;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for MatchType complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MatchType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}AttributeValue"/>
 *         &lt;choice>
 *           &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}AttributeDesignator"/>
 *           &lt;element ref="{urn:oasis:names:tc:xacml:3.0:core:schema:wd-17}AttributeSelector"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="MatchId" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchType", propOrder = {
                                          "attributeValue", "attributeDesignator", "attributeSelector"
})
public class MatchType {

    @XmlElement(name = "AttributeValue", required = true)
    protected AttributeValueType attributeValue;
    @XmlElement(name = "AttributeDesignator")
    protected AttributeDesignatorType attributeDesignator;
    @XmlElement(name = "AttributeSelector")
    protected AttributeSelectorType attributeSelector;
    @XmlAttribute(name = "MatchId", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String matchId;

    /**
     * Gets the value of the attributeValue property.
     *
     * @return possible object is {@link AttributeValueType }
     */
    public AttributeValueType getAttributeValue() {
        return attributeValue;
    }

    /**
     * Sets the value of the attributeValue property.
     *
     * @param value allowed object is {@link AttributeValueType }
     */
    public void setAttributeValue(AttributeValueType value) {
        this.attributeValue = value;
    }

    /**
     * Gets the value of the attributeDesignator property.
     *
     * @return possible object is {@link AttributeDesignatorType }
     */
    public AttributeDesignatorType getAttributeDesignator() {
        return attributeDesignator;
    }

    /**
     * Sets the value of the attributeDesignator property.
     *
     * @param value allowed object is {@link AttributeDesignatorType }
     */
    public void setAttributeDesignator(AttributeDesignatorType value) {
        this.attributeDesignator = value;
    }

    /**
     * Gets the value of the attributeSelector property.
     *
     * @return possible object is {@link AttributeSelectorType }
     */
    public AttributeSelectorType getAttributeSelector() {
        return attributeSelector;
    }

    /**
     * Sets the value of the attributeSelector property.
     *
     * @param value allowed object is {@link AttributeSelectorType }
     */
    public void setAttributeSelector(AttributeSelectorType value) {
        this.attributeSelector = value;
    }

    /**
     * Gets the value of the matchId property.
     *
     * @return possible object is {@link String }
     */
    public String getMatchId() {
        return matchId;
    }

    /**
     * Sets the value of the matchId property.
     *
     * @param value allowed object is {@link String }
     */
    public void setMatchId(String value) {
        this.matchId = value;
    }

}
