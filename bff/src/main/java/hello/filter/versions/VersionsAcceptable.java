package hello.filter.versions;

public class VersionsAcceptable {

	public static final String HEADER_NAME = "Accept-version";

	public static final String NOT_FOUND_VERSION = HEADER_NAME + "=1";
	public static final String NOT_FOUND_VERSION_NUMBER = "1";

	public static final String INITIAL_VERSION = HEADER_NAME + "=1";
	
	public static final String V2 = HEADER_NAME + "=2";

	public static final String V3 = HEADER_NAME + "=3";
	public static final String V4 = HEADER_NAME + "=4";

	private VersionsAcceptable() {
	}
}
