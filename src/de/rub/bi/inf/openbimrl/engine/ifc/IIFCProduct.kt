package de.rub.bi.inf.openbimrl.engine.ifc

interface IIFCProduct : IIFCClass, IIFCObject {
    val name: String?
    val representation: IIFCProductRepresentation?
}