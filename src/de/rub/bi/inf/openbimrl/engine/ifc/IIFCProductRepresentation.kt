package de.rub.bi.inf.openbimrl.engine.ifc

interface IIFCProductRepresentation {
    fun addRepresentations(representation: IIFCRepresentation)
    fun removeAllRepresentations(elements: ArrayList<IIFCRepresentation>) {

    }

}