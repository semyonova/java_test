
package ru.fabrikant.api.multi_integration.easuz.prepareprocedure;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.fabrikant.api.multi_integration.easuz.prepareprocedure package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.fabrikant.api.multi_integration.easuz.prepareprocedure
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AuctionLot }
     * 
     */
    public AuctionLot createAuctionLot() {
        return new AuctionLot();
    }

    /**
     * Create an instance of {@link Auction }
     * 
     */
    public Auction createAuction() {
        return new Auction();
    }

    /**
     * Create an instance of {@link PurchaseLot }
     * 
     */
    public PurchaseLot createPurchaseLot() {
        return new PurchaseLot();
    }

    /**
     * Create an instance of {@link ProcedurePurchase }
     * 
     */
    public ProcedurePurchase createProcedurePurchase() {
        return new ProcedurePurchase();
    }

    /**
     * Create an instance of {@link PrepareProcedurePurchase }
     * 
     */
    public PrepareProcedurePurchase createPrepareProcedurePurchase() {
        return new PrepareProcedurePurchase();
    }

    /**
     * Create an instance of {@link PrepareAuction }
     * 
     */
    public PrepareAuction createPrepareAuction() {
        return new PrepareAuction();
    }

    /**
     * Create an instance of {@link PriceInfo }
     * 
     */
    public PriceInfo createPriceInfo() {
        return new PriceInfo();
    }

    /**
     * Create an instance of {@link PlanInfo }
     * 
     */
    public PlanInfo createPlanInfo() {
        return new PlanInfo();
    }

    /**
     * Create an instance of {@link PrepareProcedureResponse }
     * 
     */
    public PrepareProcedureResponse createPrepareProcedureResponse() {
        return new PrepareProcedureResponse();
    }

    /**
     * Create an instance of {@link AuctionLot.OkpdList }
     * 
     */
    public AuctionLot.OkpdList createAuctionLotOkpdList() {
        return new AuctionLot.OkpdList();
    }

    /**
     * Create an instance of {@link Auction.LotList }
     * 
     */
    public Auction.LotList createAuctionLotList() {
        return new Auction.LotList();
    }

    /**
     * Create an instance of {@link PurchaseLot.OkpdList }
     * 
     */
    public PurchaseLot.OkpdList createPurchaseLotOkpdList() {
        return new PurchaseLot.OkpdList();
    }

    /**
     * Create an instance of {@link ProcedurePurchase.LotList }
     * 
     */
    public ProcedurePurchase.LotList createProcedurePurchaseLotList() {
        return new ProcedurePurchase.LotList();
    }

}
