# axit2-adb

Fork ob org.apache.axi2.axi2-adb Library to fix some major issues with out SOAP implementation.

Features:
* xsi:type mapping at client side
* dont use xsi:nil at all, null-objects will be ommitted completely 
(optional - controlled by SystemProperty axis2.adb.no_xsi_nil_values)
