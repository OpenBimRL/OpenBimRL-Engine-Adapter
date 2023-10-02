package de.rub.bi.inf.openbimrl.engine.ifc

interface IIFCPolyline : IIFCBoundedCurve {
    val points: Array<IIFCCartesianPoint>
}