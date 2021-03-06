// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.versioncontrol.clientservices._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.versioncontrol.clientservices._03._ChangeType;
import ms.tfs.versioncontrol.clientservices._03._GetOperation;
import ms.tfs.versioncontrol.clientservices._03._ItemType;
import ms.tfs.versioncontrol.clientservices._03._LockLevel;
import ms.tfs.versioncontrol.clientservices._03._PropertyValue;

import java.lang.Object;
import java.lang.String;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _GetOperation
    implements ElementSerializable, ElementDeserializable
{
    // Attributes
    protected _ItemType type = _ItemType.Any;
    protected int itemid = 0;
    protected String slocal;
    protected String tlocal;
    protected String titem;
    protected String sitem;
    protected int sver = 0;
    protected int vrevto = -2;
    protected int lver = 0;
    protected int did = 0;
    protected int chgEx = 0;
    protected _ChangeType chg = new _ChangeType(
                new _ChangeType._ChangeType_Flag[] { _ChangeType._ChangeType_Flag.None });
    protected _LockLevel lock = _LockLevel.None;
    protected boolean il = true;
    protected int pcid = 0;
    protected boolean cnflct = false;
    protected _ChangeType cnflctchg = new _ChangeType(
                new _ChangeType._ChangeType_Flag[] { _ChangeType._ChangeType_Flag.None });
    protected int cnflctchgEx = 0;
    protected int cnflctitemid = 0;
    protected byte nmscnflct;
    protected String durl;
    protected int enc = -2;
    protected Calendar vsd = XMLConvert.toCalendar(
            "0001-01-01T00:00:00",
            true);

    // Elements
    protected byte[] hashValue;
    protected _PropertyValue[] properties;
    protected _PropertyValue[] propertyValues;

    public _GetOperation()
    {
        super();
    }

    public _GetOperation(
        final _ItemType type,
        final int itemid,
        final String slocal,
        final String tlocal,
        final String titem,
        final String sitem,
        final int sver,
        final int vrevto,
        final int lver,
        final int did,
        final int chgEx,
        final _ChangeType chg,
        final _LockLevel lock,
        final boolean il,
        final int pcid,
        final boolean cnflct,
        final _ChangeType cnflctchg,
        final int cnflctchgEx,
        final int cnflctitemid,
        final byte nmscnflct,
        final String durl,
        final int enc,
        final Calendar vsd,
        final byte[] hashValue,
        final _PropertyValue[] properties,
        final _PropertyValue[] propertyValues)
    {
        // TODO : Call super() instead of setting all fields directly?
        setType(type);
        setItemid(itemid);
        setSlocal(slocal);
        setTlocal(tlocal);
        setTitem(titem);
        setSitem(sitem);
        setSver(sver);
        setVrevto(vrevto);
        setLver(lver);
        setDid(did);
        setChgEx(chgEx);
        setChg(chg);
        setLock(lock);
        setIl(il);
        setPcid(pcid);
        setCnflct(cnflct);
        setCnflctchg(cnflctchg);
        setCnflctchgEx(cnflctchgEx);
        setCnflctitemid(cnflctitemid);
        setNmscnflct(nmscnflct);
        setDurl(durl);
        setEnc(enc);
        setVsd(vsd);
        setHashValue(hashValue);
        setProperties(properties);
        setPropertyValues(propertyValues);
    }

    public _ItemType getType()
    {
        return this.type;
    }

    public void setType(final _ItemType value)
    {
        this.type = value;
    }

    public int getItemid()
    {
        return this.itemid;
    }

    public void setItemid(final int value)
    {
        this.itemid = value;
    }

    public String getSlocal()
    {
        return this.slocal;
    }

    public void setSlocal(final String value)
    {
        this.slocal = value;
    }

    public String getTlocal()
    {
        return this.tlocal;
    }

    public void setTlocal(final String value)
    {
        this.tlocal = value;
    }

    public String getTitem()
    {
        return this.titem;
    }

    public void setTitem(final String value)
    {
        this.titem = value;
    }

    public String getSitem()
    {
        return this.sitem;
    }

    public void setSitem(final String value)
    {
        this.sitem = value;
    }

    public int getSver()
    {
        return this.sver;
    }

    public void setSver(final int value)
    {
        this.sver = value;
    }

    public int getVrevto()
    {
        return this.vrevto;
    }

    public void setVrevto(final int value)
    {
        this.vrevto = value;
    }

    public int getLver()
    {
        return this.lver;
    }

    public void setLver(final int value)
    {
        this.lver = value;
    }

    public int getDid()
    {
        return this.did;
    }

    public void setDid(final int value)
    {
        this.did = value;
    }

    public int getChgEx()
    {
        return this.chgEx;
    }

    public void setChgEx(final int value)
    {
        this.chgEx = value;
    }

    public _ChangeType getChg()
    {
        return this.chg;
    }

    public void setChg(final _ChangeType value)
    {
        this.chg = value;
    }

    public _LockLevel getLock()
    {
        return this.lock;
    }

    public void setLock(final _LockLevel value)
    {
        this.lock = value;
    }

    public boolean isIl()
    {
        return this.il;
    }

    public void setIl(final boolean value)
    {
        this.il = value;
    }

    public int getPcid()
    {
        return this.pcid;
    }

    public void setPcid(final int value)
    {
        this.pcid = value;
    }

    public boolean isCnflct()
    {
        return this.cnflct;
    }

    public void setCnflct(final boolean value)
    {
        this.cnflct = value;
    }

    public _ChangeType getCnflctchg()
    {
        return this.cnflctchg;
    }

    public void setCnflctchg(final _ChangeType value)
    {
        this.cnflctchg = value;
    }

    public int getCnflctchgEx()
    {
        return this.cnflctchgEx;
    }

    public void setCnflctchgEx(final int value)
    {
        this.cnflctchgEx = value;
    }

    public int getCnflctitemid()
    {
        return this.cnflctitemid;
    }

    public void setCnflctitemid(final int value)
    {
        this.cnflctitemid = value;
    }

    public byte getNmscnflct()
    {
        return this.nmscnflct;
    }

    public void setNmscnflct(final byte value)
    {
        this.nmscnflct = value;
    }

    public String getDurl()
    {
        return this.durl;
    }

    public void setDurl(final String value)
    {
        this.durl = value;
    }

    public int getEnc()
    {
        return this.enc;
    }

    public void setEnc(final int value)
    {
        this.enc = value;
    }

    public Calendar getVsd()
    {
        return this.vsd;
    }

    public void setVsd(final Calendar value)
    {
        this.vsd = value;
    }

    public byte[] getHashValue()
    {
        return this.hashValue;
    }

    public void setHashValue(byte[] value)
    {
        this.hashValue = value;
    }

    public _PropertyValue[] getProperties()
    {
        return this.properties;
    }

    public void setProperties(_PropertyValue[] value)
    {
        this.properties = value;
    }

    public _PropertyValue[] getPropertyValues()
    {
        return this.propertyValues;
    }

    public void setPropertyValues(_PropertyValue[] value)
    {
        this.propertyValues = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Attributes
        if (this.type != null)
        {
            this.type.writeAsAttribute(
                writer,
                "type");
        }

        XMLStreamWriterHelper.writeAttribute(
            writer,
            "itemid",
            this.itemid);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "slocal",
            this.slocal);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "tlocal",
            this.tlocal);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "titem",
            this.titem);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "sitem",
            this.sitem);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "sver",
            this.sver);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "vrevto",
            this.vrevto);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "lver",
            this.lver);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "did",
            this.did);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "chgEx",
            this.chgEx);

        if (this.chg != null)
        {
            this.chg.writeAsAttribute(
                writer,
                "chg");
        }

        if (this.lock != null)
        {
            this.lock.writeAsAttribute(
                writer,
                "lock");
        }

        XMLStreamWriterHelper.writeAttribute(
            writer,
            "il",
            this.il);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "pcid",
            this.pcid);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "cnflct",
            this.cnflct);

        if (this.cnflctchg != null)
        {
            this.cnflctchg.writeAsAttribute(
                writer,
                "cnflctchg");
        }

        XMLStreamWriterHelper.writeAttribute(
            writer,
            "cnflctchgEx",
            this.cnflctchgEx);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "cnflctitemid",
            this.cnflctitemid);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "nmscnflct",
            this.nmscnflct);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "durl",
            this.durl);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "enc",
            this.enc);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "vsd",
            this.vsd,
            true);

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "HashValue",
            this.hashValue);

        if (this.properties != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("Properties");

            for (int iterator0 = 0; iterator0 < this.properties.length; iterator0++)
            {
                this.properties[iterator0].writeAsElement(
                    writer,
                    "PropertyValue");
            }

            writer.writeEndElement();
        }

        if (this.propertyValues != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("PropertyValues");

            for (int iterator0 = 0; iterator0 < this.propertyValues.length; iterator0++)
            {
                this.propertyValues[iterator0].writeAsElement(
                    writer,
                    "PropertyValue");
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // Attributes
        final int attributeCount = reader.getAttributeCount();
        String attributeValue;

        for (int i = 0; i < attributeCount; i++)
        {
            localName = reader.getAttributeLocalName(i);
            attributeValue = reader.getAttributeValue(i);

            if (localName.equalsIgnoreCase("type"))
            {
                this.type = _ItemType.fromString(attributeValue);
            }
            else if (localName.equalsIgnoreCase("itemid"))
            {
                this.itemid = XMLConvert.toInt(attributeValue);
            }
            else if (localName.equalsIgnoreCase("slocal"))
            {
                this.slocal = attributeValue;
            }
            else if (localName.equalsIgnoreCase("tlocal"))
            {
                this.tlocal = attributeValue;
            }
            else if (localName.equalsIgnoreCase("titem"))
            {
                this.titem = attributeValue;
            }
            else if (localName.equalsIgnoreCase("sitem"))
            {
                this.sitem = attributeValue;
            }
            else if (localName.equalsIgnoreCase("sver"))
            {
                this.sver = XMLConvert.toInt(attributeValue);
            }
            else if (localName.equalsIgnoreCase("vrevto"))
            {
                this.vrevto = XMLConvert.toInt(attributeValue);
            }
            else if (localName.equalsIgnoreCase("lver"))
            {
                this.lver = XMLConvert.toInt(attributeValue);
            }
            else if (localName.equalsIgnoreCase("did"))
            {
                this.did = XMLConvert.toInt(attributeValue);
            }
            else if (localName.equalsIgnoreCase("chgEx"))
            {
                this.chgEx = XMLConvert.toInt(attributeValue);
            }
            else if (localName.equalsIgnoreCase("chg"))
            {
                this.chg = new _ChangeType();
                this.chg.readFromAttribute(attributeValue);
            }
            else if (localName.equalsIgnoreCase("lock"))
            {
                this.lock = _LockLevel.fromString(attributeValue);
            }
            else if (localName.equalsIgnoreCase("il"))
            {
                this.il = XMLConvert.toBoolean(attributeValue);
            }
            else if (localName.equalsIgnoreCase("pcid"))
            {
                this.pcid = XMLConvert.toInt(attributeValue);
            }
            else if (localName.equalsIgnoreCase("cnflct"))
            {
                this.cnflct = XMLConvert.toBoolean(attributeValue);
            }
            else if (localName.equalsIgnoreCase("cnflctchg"))
            {
                this.cnflctchg = new _ChangeType();
                this.cnflctchg.readFromAttribute(attributeValue);
            }
            else if (localName.equalsIgnoreCase("cnflctchgEx"))
            {
                this.cnflctchgEx = XMLConvert.toInt(attributeValue);
            }
            else if (localName.equalsIgnoreCase("cnflctitemid"))
            {
                this.cnflctitemid = XMLConvert.toInt(attributeValue);
            }
            else if (localName.equalsIgnoreCase("nmscnflct"))
            {
                this.nmscnflct = XMLConvert.toByte(attributeValue);
            }
            else if (localName.equalsIgnoreCase("durl"))
            {
                this.durl = attributeValue;
            }
            else if (localName.equalsIgnoreCase("enc"))
            {
                this.enc = XMLConvert.toInt(attributeValue);
            }
            else if (localName.equalsIgnoreCase("vsd"))
            {
                this.vsd = XMLConvert.toCalendar(
                        attributeValue,
                        true);
            }

            // Ignore unknown attributes.
        }

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("HashValue"))
                {
                    this.hashValue = XMLConvert.toByteArray(reader.getElementText());
                }
                else if (localName.equalsIgnoreCase("Properties"))
                {
                    /*
                     * The element type is an array.
                     */
                    int event0;
                    final List list0 = new ArrayList();

                    do
                    {
                        event0 = reader.nextTag();

                        if (event0 == XMLStreamConstants.START_ELEMENT)
                        {
                            _PropertyValue complexObject0 = new _PropertyValue();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.properties = (_PropertyValue[]) list0.toArray(new _PropertyValue[list0.size()]);
                }
                else if (localName.equalsIgnoreCase("PropertyValues"))
                {
                    /*
                     * The element type is an array.
                     */
                    int event0;
                    final List list0 = new ArrayList();

                    do
                    {
                        event0 = reader.nextTag();

                        if (event0 == XMLStreamConstants.START_ELEMENT)
                        {
                            _PropertyValue complexObject0 = new _PropertyValue();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.propertyValues = (_PropertyValue[]) list0.toArray(new _PropertyValue[list0.size()]);
                }
                else
                {
                    // Read the unknown child element until its end
                    XMLStreamReaderHelper.readUntilElementEnd(reader);
                }
            }
        }
        while (event != XMLStreamConstants.END_ELEMENT);
    }
}
