package com.fegin.feginapi.api;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name ="${remote.service.name}",path ="remote/",url ="${remote.service.ip}")
public interface RemoteApi extends FeignApi {
}
