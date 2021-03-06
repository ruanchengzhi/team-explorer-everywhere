// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.sql.reporting.reportingservices;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.sql.reporting.reportingservices._BooleanOperatorEnum;
import ms.sql.reporting.reportingservices._ConditionEnum;
import ms.sql.reporting.reportingservices._ReportingService2005Soap_FindItems;
import ms.sql.reporting.reportingservices._SearchCondition;

import java.lang.String;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _ReportingService2005Soap_FindItems
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String folder;
    protected _BooleanOperatorEnum booleanOperator;
    protected _SearchCondition[] conditions;

    public _ReportingService2005Soap_FindItems()
    {
        super();
    }

    public _ReportingService2005Soap_FindItems(
        final String folder,
        final _BooleanOperatorEnum booleanOperator,
        final _SearchCondition[] conditions)
    {
        // TODO : Call super() instead of setting all fields directly?
        setFolder(folder);
        setBooleanOperator(booleanOperator);
        setConditions(conditions);
    }

    public String getFolder()
    {
        return this.folder;
    }

    public void setFolder(String value)
    {
        this.folder = value;
    }

    public _BooleanOperatorEnum getBooleanOperator()
    {
        return this.booleanOperator;
    }

    public void setBooleanOperator(_BooleanOperatorEnum value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'BooleanOperator' is a required element, its value cannot be null");
        }

        this.booleanOperator = value;
    }

    public _SearchCondition[] getConditions()
    {
        return this.conditions;
    }

    public void setConditions(_SearchCondition[] value)
    {
        this.conditions = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "Folder",
            this.folder);
        this.booleanOperator.writeAsElement(
            writer,
            "BooleanOperator");

        if (this.conditions != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("Conditions");

            for (int iterator0 = 0; iterator0 < this.conditions.length; iterator0++)
            {
                this.conditions[iterator0].writeAsElement(
                    writer,
                    "SearchCondition");
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }
}
