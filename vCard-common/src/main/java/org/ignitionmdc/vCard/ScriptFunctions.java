package org.ignitionmdc.vCard;

import ezvcard.Ezvcard;
import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.io.text.VCardWriter;
import ezvcard.parameter.EmailType;
import ezvcard.parameter.TelephoneType;
import ezvcard.property.Address;
import ezvcard.property.Photo;
import ezvcard.property.StructuredName;

import java.io.File;
import java.util.*;

/**
 * Created by kevin.mcclusky on 7/3/2017.
 */
public class ScriptFunctions {
    public static VCard getVCard() {
        return new VCard();
    }

    public static List<VCard> getVCardList() {
        return new ArrayList<VCard>();
    }

    public static Class<VCardVersion> getVCardVersion() throws Exception {
        return VCardVersion.class;
//        return VCardVersion.valueOf(vCardVersion);
//        if (vCardVersion.equals("2.1")) {
//            return VCardVersion.V2_1;
//        }
//        else if (vCardVersion.equals("3.0")) {
//            return VCardVersion.V3_0;
//        }
//        else if (vCardVersion.equals("4.0")) {
//            return VCardVersion.V4_0;
//        }
//        else {
//            throw new Exception("vCard version not found.  Please user version \"2.1\", \"3.0\", or \"4.0\".");
//        }
    }

    public static Class getEzvcard() {
        return Ezvcard.class;
    }

    public static StructuredName getStructuredName() {
        return new StructuredName();
    }

    public static Address getAddress() {
        return new Address();
    }

    public static Class<TelephoneType> getTelephoneType() {
        return TelephoneType.class;
    }

    public static Class<EmailType> getEmailType() {
        return EmailType.class;
    }
}
