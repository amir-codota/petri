package com.wixpress.petri.petri

import java.{lang=>jl}

/**
 * @author shaiyallin
 * @since 6/12/14
 */
trait PetriTopology {
  def getPetriUrl: String

  def getReportsScheduleTimeInMillis: jl.Long = 30000l

  def isWriteStateToServer = true
}