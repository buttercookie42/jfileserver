/*
 * Copyright (C) 2006-2010 Alfresco Software Limited.
 *
 * This file is part of Alfresco
 *
 * Alfresco is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Alfresco is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Alfresco. If not, see <http://www.gnu.org/licenses/>.
 */

package org.filesys.server.auth.spnego;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/**
 * OID Class
 *
 * <p>Contains Oids used by SPNEGO
 *
 * @author gkspencer
 */
public class OID {

    // IDs
    public static final String ID_SPNEGO = "1.3.6.1.5.5.2";

    // Kerberos providers
    public static final String ID_KERBEROS5 = "1.2.840.113554.1.2.2";
    public static final String ID_MSKERBEROS5 = "1.2.840.48018.1.2.2";

    public static final String ID_KRB5USERTOUSER = "1.2.840.113554.1.2.2.3";

    // Microsoft NTLM security support provider
    public static final String ID_NTLMSSP = "1.3.6.1.4.1.311.2.2.10";

    // Extended SPNEGO security mechanism
    public static final String ID_SPNEGO_EX = "1.3.6.1.4.1.311.2.2.30";

    // OIDs
    public static ASN1ObjectIdentifier SPNEGO;
    public static ASN1ObjectIdentifier KERBEROS5;
    public static ASN1ObjectIdentifier MSKERBEROS5;
    public static ASN1ObjectIdentifier KRB5USERTOUSER;
    public static ASN1ObjectIdentifier NTLMSSP;
    public static ASN1ObjectIdentifier SPNEGO_EX;

    /**
     * Static initializer
     */
    static {

        // Create the OIDs
        try {
            SPNEGO = new ASN1ObjectIdentifier(ID_SPNEGO);

            KERBEROS5 = new ASN1ObjectIdentifier(ID_KERBEROS5);
            MSKERBEROS5 = new ASN1ObjectIdentifier(ID_MSKERBEROS5);
            KRB5USERTOUSER = new ASN1ObjectIdentifier(ID_KRB5USERTOUSER);

            NTLMSSP = new ASN1ObjectIdentifier(ID_NTLMSSP);

            SPNEGO_EX = new ASN1ObjectIdentifier(ID_SPNEGO_EX);
        }
        catch (Exception ex) {
        }
    }
}
