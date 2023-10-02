package de.rub.bi.inf.openbimrl.engine.ifc

interface IIFCRepresentation : IIFCClass {
    val items: Collection<IIFCRepresentationItem>
}