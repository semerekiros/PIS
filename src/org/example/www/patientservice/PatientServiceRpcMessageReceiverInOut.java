
/**
 * PatientServiceRpcMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
        package org.example.www.patientservice;

        /**
        *  PatientServiceRpcMessageReceiverInOut message receiver
        */

        public class PatientServiceRpcMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        PatientServiceRpcSkeleton skel = (PatientServiceRpcSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getPrescriptionAndDiagnosisDetail".equals(methodName)){
                
                com.example.www.invoiceservice.GetPrescriptionAndDiagnosisDetailResponse getPrescriptionAndDiagnosisDetailResponse5 = null;
	                        com.example.www.invoiceservice.GetPrescriptionAndDiagnosisDetail wrappedParam =
                                                             (com.example.www.invoiceservice.GetPrescriptionAndDiagnosisDetail)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.example.www.invoiceservice.GetPrescriptionAndDiagnosisDetail.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getPrescriptionAndDiagnosisDetailResponse5 =
                                                   
                                                   
                                                         skel.getPrescriptionAndDiagnosisDetail(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getPrescriptionAndDiagnosisDetailResponse5, false, new javax.xml.namespace.QName("http://www.example.org/PatientService/",
                                                    "getPrescriptionAndDiagnosisDetail"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(com.example.www.invoiceservice.GetPrescriptionAndDiagnosisDetail param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.example.www.invoiceservice.GetPrescriptionAndDiagnosisDetail.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.example.www.invoiceservice.GetPrescriptionAndDiagnosisDetailResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.example.www.invoiceservice.GetPrescriptionAndDiagnosisDetailResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.example.www.invoiceservice.GetPrescriptionAndDiagnosisDetailResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.example.www.invoiceservice.GetPrescriptionAndDiagnosisDetailResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.example.www.invoiceservice.GetPrescriptionAndDiagnosisDetailResponse wrapGetPrescriptionAndDiagnosisDetail(){
                                com.example.www.invoiceservice.GetPrescriptionAndDiagnosisDetailResponse wrappedElement = new com.example.www.invoiceservice.GetPrescriptionAndDiagnosisDetailResponse();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (com.example.www.invoiceservice.GetPrescriptionAndDiagnosisDetail.class.equals(type)){
                
                        return com.example.www.invoiceservice.GetPrescriptionAndDiagnosisDetail.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (com.example.www.invoiceservice.GetPrescriptionAndDiagnosisDetailResponse.class.equals(type)){
                
                        return com.example.www.invoiceservice.GetPrescriptionAndDiagnosisDetailResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    