package de.rub.bi.inf.openbimrl.engine.ifc

interface IIFCShapeRepresentation : IIFCShapeModel {
    fun addItems(item: IIFCRepresentationItem): Int
    var representationType: IIFCLabel
    var representationIdentifier: IIFCLabel
}