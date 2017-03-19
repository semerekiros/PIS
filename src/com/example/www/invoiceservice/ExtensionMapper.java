
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:04:10 GMT)
 */

        
            package com.example.www.invoiceservice;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://www.example.org/InvoiceTypes".equals(namespaceURI) &&
                  "PriceList".equals(typeName)){
                   
                            return  org.example.www.invoicetypes.PriceList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/InvoiceTypes".equals(namespaceURI) &&
                  "PrescriptionList".equals(typeName)){
                   
                            return  org.example.www.invoicetypes.PrescriptionList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/InvoiceTypes".equals(namespaceURI) &&
                  "DiagnoseListType".equals(typeName)){
                   
                            return  org.example.www.invoicetypes.DiagnoseListType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/InvoiceTypes".equals(namespaceURI) &&
                  "PrescriptionListType".equals(typeName)){
                   
                            return  org.example.www.invoicetypes.PrescriptionListType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/InvoiceTypes".equals(namespaceURI) &&
                  "PriceListType".equals(typeName)){
                   
                            return  org.example.www.invoicetypes.PriceListType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/InvoiceTypes".equals(namespaceURI) &&
                  "DiagnoseList".equals(typeName)){
                   
                            return  org.example.www.invoicetypes.DiagnoseList.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    