package com.example.kaanapos.repository.dao;

//@Dao
public abstract class CartItemDao {
//
//    @Insert(onConflict = OnConflictStrategy.IGNORE)
//    public abstract void insertTicketItem(TicketAddItemModel ticketAddItemModel);
//
//    //check later
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    public abstract void insertTicketItemList(List<TicketAddItemModel> ticketAddItemModel);
//
//    @Update(onConflict = OnConflictStrategy.REPLACE)
//    public abstract void updateTicketItem(TicketAddItemModel ticketAddItemModel);
//
//    @Query("UPDATE TicketAddItemModel SET isVoid = :isVoid, modifiedDate =:modifiedTime, voidDate =:modifiedTime, voidUserId =:modifiedUser, modifiedUserId=:modifiedUser WHERE id = :id")
//    public abstract void  deleteItem(final int id , Boolean isVoid, String modifiedTime, Integer modifiedUser);
//
//
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    public abstract void insertTicket(TicketListModel ticketListModel);
//
//    @Query("select * from TicketListModel WHERE ticketName =:ticketName")
//    public abstract TicketListModel getTicket(String ticketName );
//
//    @Query("select ticketName from TicketListModel WHERE ticketName =:ticketName")
//    public abstract String checkTicketAvailable(String ticketName );
//
//    @Insert(onConflict = OnConflictStrategy.IGNORE)
//    public abstract void insertTicketFromOpenTicketApi(List<TicketListModel> TicketListModel);
//
///**changed 5feb 2pm @update-> @insert*/
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    public abstract void updateTicket(TicketListModel ticketListModel);
//
//    @Update(onConflict = OnConflictStrategy.REPLACE)
//    public abstract void voidTicket(TicketListModel ticketListModel);
//
//    @Update(onConflict = OnConflictStrategy.REPLACE)
//    public abstract void updateTicketFromOpenOrderApi(List<TicketListModel> TicketListModel);
//
////    @Query("UPDATE TicketAddItemModel SET kotPrinted = :kotPrinted, kotTime=:timeInMilliSec")
////    public abstract void updateSentToKOT(Boolean kotPrinted, String timeInMilliSec);
//
//    @Update(onConflict = OnConflictStrategy.REPLACE)
//    public abstract void updateSentToKOT(List<TicketAddItemModel> ticketAddItemModels);
//
////    @Update(onConflict = OnConflictStrategy.REPLACE)
////    public abstract void updateTicket(TicketListModel ticketListModel);
////
////    @Query("UPDATE TicketListModel SET isSendSuccessfully = :sendSuccessfully , isVoid =:isVoid ," +
////            " createdTime=:currentDateTimeString, createdUTC=:createdUTC, openedUTC=:openedUTC, " +
////            "openedUserId=:openedUserId, modifiedDate=:modifiedDate, modifiedUserID=:modifiedUserID, " +
////            "voidDate=:voidDate, voidUserId=:voidUser WHERE ticketName =:ticketName ")
////    public abstract void deleteSingleTicket(String ticketName, Boolean sendSuccessfully,
////                                            Boolean isVoid, String currentDateTimeString,
////                                            String createdUTC, String openedUTC,
////                                            Integer openedUserId, String modifiedDate,
////                                            Integer modifiedUserID, String voidDate , Integer voidUser);
//
//    @Query("UPDATE TicketListModel SET isSendSuccessfully = :sendSuccessfully , isVoid =:isVoid , createdTime=:currentDateTimeString WHERE ticketName =:ticketName ")
//    public abstract void deleteSingleTicket(String ticketName, Boolean sendSuccessfully, Boolean isVoid, String currentDateTimeString);
//
//    @Update(onConflict = OnConflictStrategy.REPLACE)
//    public abstract void voidSingleTicket(TicketListModel ticketListModel);
//
//    @Query("select * from TicketAddItemModel")
//    public abstract List<TicketAddItemModel> getTicketItems();
//
//    @Query("select * from TicketListModel WHERE isSendSuccessfully = :sendSuccessfully ")
//    public abstract List<TicketListModel> getTicketNotSend(Boolean sendSuccessfully);
//
//    @Query("select * from TicketListModel WHERE isVoid = :isVoid")
//    public abstract List<TicketListModel> getTickets(Boolean isVoid);
//
//    @Query("select * from TicketListModel WHERE isVoid = :isVoid AND tableName LIKE :searchTxt||'%' ORDER BY createdUTC LIMIT :limit OFFSET :start ")
//    public abstract List<TicketListModel> getTicketsListPaginationonTableName(String searchTxt, Boolean isVoid, int start, int limit);
//
//    @Query("select * from TicketListModel  WHERE isVoid = :isVoid AND ticketName LIKE '%'||:searchTxt||'%' ORDER BY createdUTC LIMIT :limit OFFSET :start")
//    public abstract List<TicketListModel> getTicketsListPaginationonTicketName(String searchTxt, Boolean isVoid, int start, int limit);
//
//    @Query("select * from TicketListModel WHERE isVoid = :isVoid AND " +
//            "stationId =:stationId AND tableName LIKE :searchTxt||'%'  AND ((billPrinted =:isBillPrinted AND ((billPrintedTime   + 600000)<:currentTime)) OR billPrinted =:isBillPrintedFalse )ORDER BY createdUTC LIMIT :limit OFFSET :start")
//    public abstract List<TicketListModel> getTicketsWithStationIdonTableName(String searchTxt,
//                                                                             Boolean isVoid,
//                                                                             int stationId,
//                                                                             int start,
//                                                                             int limit,
//                                                                             Long currentTime,
//                                                                             Boolean isBillPrinted,
//                                                                             Boolean isBillPrintedFalse);
//
//    @Query("select * from TicketListModel WHERE isVoid = :isVoid AND stationId =:stationId AND ticketName LIKE '%'||:searchTxt||'%' AND ((billPrinted =:isBillPrinted AND (billPrintedTime + 600000)<:currentTime ) OR billPrinted =:isBillPrintedFalse ) ORDER BY createdUTC LIMIT :limit OFFSET :start")
//    public abstract List<TicketListModel> getTicketsWithStationIdonTicketName(String searchTxt,
//                                                                              Boolean isVoid,
//                                                                              int stationId,
//                                                                              int start,
//                                                                              int limit,
//                                                                              Long currentTime,
//                                                                              Boolean isBillPrinted,
//                                                                              Boolean isBillPrintedFalse);
//
//    @Query("select * from TicketListModel WHERE isVoid = :isVoid AND " +
//            "stationId =:stationId AND tableName LIKE :searchTxt||'%' ORDER BY createdUTC LIMIT :limit OFFSET :start")
//    public abstract List<TicketListModel> getTicketsWithStationIdWithoutPrintBIllConditionOnTableName(String searchTxt,
//                                                                                                      Boolean isVoid,
//                                                                                                      int stationId,
//                                                                                                      int start,
//                                                                                                      int limit);
//
//    @Query("select * from TicketListModel WHERE isVoid = :isVoid AND stationId =:stationId AND ticketName LIKE '%'||:searchTxt||'%' ORDER BY createdUTC LIMIT :limit OFFSET :start")
//    public abstract List<TicketListModel> getTicketsWithStationIdWithoutPrintBIllConditionOnTicketName(String searchTxt,
//                                                                                                       Boolean isVoid,
//                                                                                                       int stationId,
//                                                                                                       int start,
//                                                                                                       int limit);
//
//
//    @Query("UPDATE TicketListModel SET isSendSuccessfully = :sendSuccessfully WHERE ticketName =:ticketName ")
//    public abstract void updateTicketsSendStatus(String ticketName, Boolean sendSuccessfully);
//
//    @Query("UPDATE TicketListModel SET isVoid = :isVoid WHERE ticketName =:ticketName ")
//    public abstract void updateTicketsVoidStatus(String ticketName , Boolean isVoid);
//
//    @Query("UPDATE TicketAddItemModel SET kotPrinted = :isKotPrinted WHERE kotNumberToDisplay = :kotNumber")
//    public abstract void resetKOT(String kotNumber, Boolean isKotPrinted);
//
//    @Query("DELETE FROM TicketAddItemModel WHERE id=:id")
//    public abstract void deleteItemFromNewTicket(int id);
////    @Query("select * from TicketAddItemModel")
////    public abstract List<TicketAddItemModel> updateTicketItem();
//
////    individual data updation
//    @Query("UPDATE TicketAddItemModel SET quantity = quantity + 1  WHERE id = :id")
//    public  abstract void updateTicketItem(int id);
//
//    @Query("UPDATE TicketListModel SET billCount = :copyNum WHERE ticketName = :id")
//    public  abstract void updateBillCopy(String id, int copyNum);
//
//    @Query("DELETE FROM TicketAddItemModel")
//    public abstract void deleteTicketItem();
//
//    @Query("SELECT COUNT(ticketName) FROM TicketListModel WHERE isSendSuccessfully =:isSendSuccessfully")
//    public abstract Integer getNotSentData(Boolean isSendSuccessfully);
//
//    @Query("SELECT COUNT(orderNo) FROM SaveOrderRequest")
//    public abstract Integer getChargedOrderNotSentData();
//
//    @Query("DELETE FROM TicketListModel WHERE ticketName=:ticketName")
//    public abstract void deleteTicket(String ticketName);
//
//    @Query("DELETE FROM TicketListModel WHERE isSendSuccessfully=:isSendSuccesfully")
//    public abstract void deleteTickets(Boolean isSendSuccesfully);
//
////    @Query("DELETE FROM TicketListModel WHERE ticketName = ticketName ")
////    public abstract void deleteTicket(String ticketName);
//
////    TicketListModel ticketListModels = new TicketListModel();
////    public void updateTicketItem(TicketAddItemModel ticketAddItemModel) {
////        updateTicket(ticketAddItemModel);
////    }
//
//    @Query("DELETE FROM TicketListModel WHERE isVoid=:isVoid and isSendSuccessfully =:isSendSuccesfully")
//    public abstract void deleteUnwantedTicket(Boolean isVoid, Boolean isSendSuccesfully);
//
//    @Query("select * from TicketAddItemModel WHERE itemId = :itemId")
//    public abstract TicketAddItemModel searchItem(int itemId);
//
//    public void  insertItemWithoutModifier(TicketAddItemModel ticketAddItemModel){
//        if(searchItem(ticketAddItemModel.getItemId())!= null){
//            Log.e("searchItem","success");
//            Log.e("searchItem","success " + ticketAddItemModel.getItemId());
//            updateTicketItem(ticketAddItemModel.getItemId());
//        }else{
//            Log.e("searchItem","success false");
//            insertTicketItem(ticketAddItemModel);
//        }
//    }
//
//    @Query("select * from MenuItem WHERE id =:mId")
//    public abstract MenuItem getMenuItem(int mId);
//
////    public void insertTicketFromOpenTicketApi(List<TicketListModel> tk){
////        for (int j = 0; j < tk.size(); j++) {
////            insertTicketFromOpenTicket(tk.get(j));
////        }
////    }
//    public void deleteTicketsFromOpenTicketApi(List<TicketListModel> tk){
//        for (int j = 0; j < tk.size(); j++) {
//            deleteTicket(tk.get(j).getTicketName());
//        }
//    }
//
//    public void deleteMergedTickets(TicketListModel tk){
//        for (int j = 0; j < tk.getMergedTickets().size(); j++) {
//            deleteTicket(tk.getMergedTickets().get(j).getTicketName());
//        }
//    }
//
//    public List<TicketListModel> getTicketList(List<TicketListModel> mticketListModels) {
//        List<TicketListModel> ticketlist = new ArrayList<>();
//        for (int j = 0; j < mticketListModels.size(); j++) {
//            ticketlist.add(getTicket(mticketListModels.get(j).getTicketName()));
//        }
//        return ticketlist;
//    }
//
//    public List<TicketListModel> getMergeTicketList(List<TicketListModel> mTicketListModels) {
//        List<TicketListModel> ticketlist = new ArrayList<>();
//        for (int j = 0; j < mTicketListModels.size(); j++) {
//            if(getTicket(mTicketListModels.get(j).getTicketName())!=null){
//                ticketlist.add(getTicket(mTicketListModels.get(j).getTicketName()));
//            }
//        }
//        return ticketlist;
//    }
}
