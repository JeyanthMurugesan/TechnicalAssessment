/*Repository*/

package com.merchantManagement.SpringBootCrud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchantRepository extends CrudRepository<String name, String merchantId> {

}
