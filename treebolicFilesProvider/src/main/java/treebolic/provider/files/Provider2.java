package treebolic.provider.files;

import java.net.URL;
import java.util.Properties;

import androidx.annotation.NonNull;
import treebolic.glue.iface.Image;
import treebolic.model.Model;
import treebolic.model.MutableEdge;
import treebolic.model.MutableNode;

public class Provider2 extends treebolic.provider.files.Provider
{
	// D E C O R A T I O N   M E M B E R S

	static final Image[] images2 = makeImages(images);

	// P A R S E

	/**
	 * Make model
	 *
	 * @param source     source
	 * @param base       base
	 * @param parameters parameters
	 * @return model if successful
	 */
	@Override
	public Model makeModel(final String source, final URL base, final Properties parameters)
	{
		Model model = super.makeModel(source, base, parameters);
		return new Model(model.tree, model.settings, images2);
	}

	// D E C O R A T E

	@Override
	public void setNodeImage(final MutableNode node, final int index)
	{
		if (index != -1)
		{
			node.setImageIndex(index);
		}
	}

	@Override
	public void setTreeEdgeImage(final MutableNode node, final int index)
	{
		if (index != -1)
		{
			node.setEdgeImageIndex(index);
		}
	}

	@Override
	public void setEdgeImage(final MutableEdge edge, final int index)
	{
		if (index != -1)
		{
			edge.setImageIndex(index);
		}
	}

	/**
	 * ImageFactory
	 *
	 * @param imageUrls image urls
	 * @return images
	 */
	public static Image[] makeImages(@NonNull final String[] imageUrls)
	{
		Image[] images = new Image[imageUrls.length];
		for (int i = 0; i < imageUrls.length; i++)
		{
			images[i] = new treebolic.glue.Image(Provider2.class.getResource("images/" + imageUrls[i]));
		}
		return images;
	}
}
