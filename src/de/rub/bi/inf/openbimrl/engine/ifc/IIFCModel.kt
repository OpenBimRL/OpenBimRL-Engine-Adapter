package de.rub.bi.inf.openbimrl.engine.ifc

interface IIFCModel {
    fun addObject(rep: IIFCClass): Boolean
    fun removeObject(obj: IIFCClass): Boolean
}