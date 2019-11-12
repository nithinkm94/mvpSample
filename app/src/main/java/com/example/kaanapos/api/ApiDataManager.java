package com.example.kaanapos.api.retrofit;

import android.util.Log;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class ApiDataManager {


//    public void SaveOrderTask2(CartFragmentPresenter cartFragmentPresenter, List<SaveOrderRequest> data, String FROM, PaymentCustomDialog paymentCustomDialog, boolean offlineMode) {
//
//        apiService = ApiCleint.getClient().create(ApiInterface.class);
//
//        Observable<SaveOrderResponse> ResponseObservable = apiService.SaveOrder(data);
//        ResponseObservable.subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Observer<SaveOrderResponse>() {
//                    @Override
//                    public void onSubscribe(Disposable d) {
//
//                    }
//
//                    @Override
//                    public void onNext(SaveOrderResponse saveOrderResponse) {
//                        if(saveOrderResponse!=null) {
//                            if(saveOrderResponse.getSuccess()) {
//                                cartFragmentPresenter.saveOrderTaskSuccess();
//                            }else {
//                                cartFragmentPresenter.saveOrderTaskFailure();
//                            }
//
//                        }else{
//                            cartFragmentPresenter.saveOrderTaskFailure();
//                        }
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        Log.e("SAVE_ORDER","apiResponse---"+ e);
//                        cartFragmentPresenter.saveOrderTaskFailure();
//                    }
//
//                    @Override
//                    public void onComplete() {
//
//                    }
//                });
//    }

}
