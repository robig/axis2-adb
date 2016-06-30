# axit2-adb

Fork of org.apache.axi2.axi2-adb Library to fix some major issues with our SOAP implementation.
Used source: axis2-adb-1.7.3-sources.jar

Features:
* xsi:type mapping at client side
* dont use xsi:nil at all, null-objects will be ommitted completely 
(optional - controlled by SystemProperty axis2.adb.no_xsi_nil_values)
* (uncomplete:) use org.apache2.axis2.databinding.typemapping.XmlElement annotation to set name of XML-Elements (in Requests only!)
