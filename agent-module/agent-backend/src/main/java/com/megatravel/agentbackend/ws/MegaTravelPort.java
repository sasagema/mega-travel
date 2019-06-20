
package com.megatravel.agentbackend.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MegaTravelPort", targetNamespace = "http://megatravel.com/booking/ws")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MegaTravelPort {


    /**
     * 
     * @param getAllAccommodationRequest
     * @return
     *     returns com.megatravel.agentbackend.ws.GetAllAccommodationResponse
     */
    @WebMethod
    @WebResult(name = "getAllAccommodationResponse", targetNamespace = "http://megatravel.com/booking/ws", partName = "getAllAccommodationResponse")
    public GetAllAccommodationResponse getAllAccommodation(
        @WebParam(name = "getAllAccommodationRequest", targetNamespace = "http://megatravel.com/booking/ws", partName = "getAllAccommodationRequest")
        GetAllAccommodationRequest getAllAccommodationRequest);

    /**
     * 
     * @param getAddServicesRequest
     * @return
     *     returns com.megatravel.agentbackend.ws.GetAddServicesResponse
     */
    @WebMethod
    @WebResult(name = "getAddServicesResponse", targetNamespace = "http://megatravel.com/booking/ws", partName = "getAddServicesResponse")
    public GetAddServicesResponse getAddServices(
        @WebParam(name = "getAddServicesRequest", targetNamespace = "http://megatravel.com/booking/ws", partName = "getAddServicesRequest")
        GetAddServicesRequest getAddServicesRequest);

    /**
     * 
     * @param checkAgentRequest
     * @return
     *     returns com.megatravel.agentbackend.ws.CheckAgentResponse
     */
    @WebMethod
    @WebResult(name = "checkAgentResponse", targetNamespace = "http://megatravel.com/booking/ws", partName = "checkAgentResponse")
    public CheckAgentResponse checkAgent(
        @WebParam(name = "checkAgentRequest", targetNamespace = "http://megatravel.com/booking/ws", partName = "checkAgentRequest")
                CheckAgentRequest checkAgentRequest);

    /**
     * 
     * @param confirmReservationRequest
     * @return
     *     returns com.megatravel.agentbackend.ws.ConfirmReservationResponse
     */
    @WebMethod
    @WebResult(name = "confirmReservationResponse", targetNamespace = "http://megatravel.com/booking/ws", partName = "confirmReservationResponse")
    public ConfirmReservationResponse confirmReservation(
        @WebParam(name = "confirmReservationRequest", targetNamespace = "http://megatravel.com/booking/ws", partName = "confirmReservationRequest")
        ConfirmReservationRequest confirmReservationRequest);

    /**
     * 
     * @param addAccommodationsRequest
     * @return
     *     returns com.megatravel.agentbackend.ws.AddAccommodationsResponse
     */
    @WebMethod
    @WebResult(name = "addAccommodationsResponse", targetNamespace = "http://megatravel.com/booking/ws", partName = "addAccommodationsResponse")
    public AddAccommodationsResponse addAccommodations(
        @WebParam(name = "addAccommodationsRequest", targetNamespace = "http://megatravel.com/booking/ws", partName = "addAccommodationsRequest")
        AddAccommodationsRequest addAccommodationsRequest);

    /**
     * 
     * @param deleteAccommodationsRequest
     * @return
     *     returns com.megatravel.agentbackend.ws.DeleteAccommodationsResponse
     */
    @WebMethod
    @WebResult(name = "deleteAccommodationsResponse", targetNamespace = "http://megatravel.com/booking/ws", partName = "deleteAccommodationsResponse")
    public DeleteAccommodationsResponse deleteAccommodations(
        @WebParam(name = "deleteAccommodationsRequest", targetNamespace = "http://megatravel.com/booking/ws", partName = "deleteAccommodationsRequest")
                DeleteAccommodationsRequest deleteAccommodationsRequest);

    /**
     * 
     * @param editOneAccommodationRequest
     * @return
     *     returns com.megatravel.agentbackend.ws.EditOneAccommodationResponse
     */
    @WebMethod
    @WebResult(name = "editOneAccommodationResponse", targetNamespace = "http://megatravel.com/booking/ws", partName = "editOneAccommodationResponse")
    public EditOneAccommodationResponse editOneAccommodation(
        @WebParam(name = "editOneAccommodationRequest", targetNamespace = "http://megatravel.com/booking/ws", partName = "editOneAccommodationRequest")
        EditOneAccommodationRequest editOneAccommodationRequest);

    /**
     * 
     * @param getAccTypeRequest
     * @return
     *     returns com.megatravel.agentbackend.ws.GetAccTypeResponse
     */
    @WebMethod
    @WebResult(name = "getAccTypeResponse", targetNamespace = "http://megatravel.com/booking/ws", partName = "getAccTypeResponse")
    public GetAccTypeResponse getAccType(
        @WebParam(name = "getAccTypeRequest", targetNamespace = "http://megatravel.com/booking/ws", partName = "getAccTypeRequest")
        GetAccTypeRequest getAccTypeRequest);

    /**
     * 
     * @param getMessageRequest
     * @return
     *     returns com.megatravel.agentbackend.ws.GetMessageResponse
     */
    @WebMethod
    @WebResult(name = "getMessageResponse", targetNamespace = "http://megatravel.com/booking/ws", partName = "getMessageResponse")
    public GetMessageResponse getMessage(
        @WebParam(name = "getMessageRequest", targetNamespace = "http://megatravel.com/booking/ws", partName = "getMessageRequest")
        GetMessageRequest getMessageRequest);

    /**
     * 
     * @param getCategoryRequest
     * @return
     *     returns com.megatravel.agentbackend.ws.GetCategoryResponse
     */
    @WebMethod
    @WebResult(name = "getCategoryResponse", targetNamespace = "http://megatravel.com/booking/ws", partName = "getCategoryResponse")
    public GetCategoryResponse getCategory(
        @WebParam(name = "getCategoryRequest", targetNamespace = "http://megatravel.com/booking/ws", partName = "getCategoryRequest")
                GetCategoryRequest getCategoryRequest);

    /**
     * 
     * @param addOneAccommodationRequest
     * @return
     *     returns com.megatravel.agentbackend.ws.AddOneAccommodationResponse
     */
    @WebMethod
    @WebResult(name = "addOneAccommodationResponse", targetNamespace = "http://megatravel.com/booking/ws", partName = "addOneAccommodationResponse")
    public AddOneAccommodationResponse addOneAccommodation(
        @WebParam(name = "addOneAccommodationRequest", targetNamespace = "http://megatravel.com/booking/ws", partName = "addOneAccommodationRequest")
        AddOneAccommodationRequest addOneAccommodationRequest);

    /**
     * 
     * @param sendMessageRequest
     * @return
     *     returns com.megatravel.agentbackend.ws.SendMessageResponse
     */
    @WebMethod
    @WebResult(name = "sendMessageResponse", targetNamespace = "http://megatravel.com/booking/ws", partName = "sendMessageResponse")
    public SendMessageResponse sendMessage(
        @WebParam(name = "sendMessageRequest", targetNamespace = "http://megatravel.com/booking/ws", partName = "sendMessageRequest")
        SendMessageRequest sendMessageRequest);

    /**
     * 
     * @param getOneAccommodationRequest
     * @return
     *     returns com.megatravel.agentbackend.ws.GetOneAccommodationResponse
     */
    @WebMethod
    @WebResult(name = "getOneAccommodationResponse", targetNamespace = "http://megatravel.com/booking/ws", partName = "getOneAccommodationResponse")
    public GetOneAccommodationResponse getOneAccommodation(
        @WebParam(name = "getOneAccommodationRequest", targetNamespace = "http://megatravel.com/booking/ws", partName = "getOneAccommodationRequest")
        GetOneAccommodationRequest getOneAccommodationRequest);

}
