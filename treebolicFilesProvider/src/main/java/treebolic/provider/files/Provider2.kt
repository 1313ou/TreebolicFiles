/*
 * Copyright (c) 2023. Bernard Bou
 */
package treebolic.provider.files

import treebolic.glue.iface.Image
import treebolic.model.Model
import treebolic.model.MutableEdge
import treebolic.model.MutableNode
import java.net.URL
import java.util.Properties

class Provider2 : Provider() {

    // P A R S E

    /**
     * Make model
     *
     * @param source     source
     * @param base       base
     * @param parameters parameters
     * @return model if successful
     */
    override fun makeModel(source: String, base: URL, parameters: Properties): Model? {
        val model = super.makeModel(source, base, parameters)
        return if (model == null) null else Model(model.tree, model.settings, images2)
    }

    // D E C O R A T E

    override fun setNodeImage(node: MutableNode, index: Int) {
        if (index != -1) {
            node.imageIndex = index
        }
    }

    override fun setTreeEdgeImage(node: MutableNode, index: Int) {
        if (index != -1) {
            node.edgeImageIndex = index
        }
    }

    override fun setEdgeImage(edge: MutableEdge, index: Int) {
        if (index != -1) {
            edge.imageIndex = index
        }
    }

    companion object {

        val images2: Array<Image?> = makeImages(images)

        /**
         * ImageFactory
         *
         * @param imageUrls image urls
         * @return images
         */
        private fun makeImages(imageUrls: Array<String>): Array<Image?> {
            val images = arrayOfNulls<Image>(imageUrls.size)
            for (i in imageUrls.indices) {
                images[i] = treebolic.glue.Image(Provider2::class.java.getResource("images/" + imageUrls[i]))
            }
            return images
        }
    }
}
