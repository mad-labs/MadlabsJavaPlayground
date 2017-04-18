package it.madlabs.playground;

import it.madlabs.playground.restserver.JerseyEmbeddedHTTPServerCrunchify;
import java.io.IOException;

/**
 * Created by gabriele on 10/04/17.
 */
public class PlayGroundRestServer {
	public static void main (String[] args) throws IOException {
		new JerseyEmbeddedHTTPServerCrunchify().startUp();
	}

}
