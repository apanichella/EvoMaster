package org.evomaster.experiments.unit

import org.evomaster.core.search.Action
import org.evomaster.core.search.gene.Gene


class ISFAction(val methodName: String, val genes: List<Gene>) : Action{

    override fun getName(): String {
        return methodName
    }

    override fun seeGenes(): List<out Gene> {
        return genes
    }

    override fun copy(): Action {
        return ISFAction(methodName, genes.map { g -> g.copy() })
    }

    override fun shouldCountForFitnessEvaluations(): Boolean {
        return true
    }
}