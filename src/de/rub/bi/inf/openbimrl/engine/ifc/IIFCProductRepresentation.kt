package de.rub.bi.inf.openbimrl.engine.ifc

interface IIFCProductRepresentation {
    val representations: Collection<IIFCRepresentation>

    fun addRepresentations(representation: IIFCRepresentation)
    fun removeAllRepresentations(elements: ArrayList<IIFCRepresentation>) {

    }

}