package org.olf.oa

import grails.gorm.MultiTenant

import com.k_int.web.toolkit.refdata.CategoryId
import com.k_int.web.toolkit.refdata.Defaults
import com.k_int.web.toolkit.refdata.RefdataValue

class RequestParty implements MultiTenant<RequestParty> {

  String id

  @CategoryId(defaultInternal=true)
  @Defaults(['Corresponding author', 'Request contact'])
  RefdataValue role

  static belongsTo = [
    publicationRequestOwner: PublicationRequest,
    partyOwner: Party
  ]

  static mapping = {
                       id column: 'rp_id', generator: 'uuid2', length: 36
                     role column: 'rp_role'
  publicationRequestOwner column: 'rp_publication_request_fk'
               partyOwner column: 'rp_party_fk'
  }
  
  static constraints = {
                        role nullable: false
     publicationRequestOwner nullable: false
                  partyOwner nullable: false
  }

}
