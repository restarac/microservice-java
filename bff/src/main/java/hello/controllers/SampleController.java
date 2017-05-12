package hello.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hello.filter.versions.VersionsAcceptable;

@RestController
public class SampleController {

	@RequestMapping("/")
	String version3OrGreater() {
		return "Hello World! May this is V3 or greater";
	}

	@RequestMapping(value = "/", headers = VersionsAcceptable.INITIAL_VERSION)
	String versionOneOrNotFound() {
		return "Hello World! this is another route V1";
	}

	@RequestMapping(value = "/", headers = VersionsAcceptable.V2)
	String home2() {
		return "Hello World! this is also another route V2";
	}
}