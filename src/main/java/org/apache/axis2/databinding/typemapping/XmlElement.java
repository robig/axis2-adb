package org.apache.axis2.databinding.typemapping;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

/**
 * Maps a JavaBean name property to a XML element derived from property name.
 */

@Retention(RUNTIME) @Target({FIELD, METHOD})
public @interface XmlElement {
    /**
     * Name of the XML Schema element.
     * <p> If the value is "##default", then element name is derived from the
     * JavaBean property name.
     */
    String name() default "##default";


    /**
     * XML target namespace of the XML Schema element.
     * <p>
     * If the value is "##default", then the namespace is determined
     * as follows:
     * <ol>
     *  <li>
     *  If the enclosing package has {@link XmlSchema} annotation,
     *  and its {@link XmlSchema#elementFormDefault() elementFormDefault}
     *  is {@link XmlNsForm#QUALIFIED QUALIFIED}, then the namespace of
     *  the enclosing class.
     *
     *  <li>
     *  Otherwise &#39;&#39; (which produces unqualified element in the default
     *  namespace.
     * </ol>
     */
    String namespace() default "##default";


}

