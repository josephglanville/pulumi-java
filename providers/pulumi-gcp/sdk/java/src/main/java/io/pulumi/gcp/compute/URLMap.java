// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.URLMapArgs;
import io.pulumi.gcp.compute.inputs.URLMapState;
import io.pulumi.gcp.compute.outputs.URLMapDefaultRouteAction;
import io.pulumi.gcp.compute.outputs.URLMapDefaultUrlRedirect;
import io.pulumi.gcp.compute.outputs.URLMapHeaderAction;
import io.pulumi.gcp.compute.outputs.URLMapHostRule;
import io.pulumi.gcp.compute.outputs.URLMapPathMatcher;
import io.pulumi.gcp.compute.outputs.URLMapTest;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * UrlMaps are used to route requests to a backend service based on rules
 * that you define for the host and path of an incoming URL.
 * 
 * To get more information about UrlMap, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/urlMaps)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * UrlMap can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/uRLMap:URLMap default projects/{{project}}/global/urlMaps/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/uRLMap:URLMap default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/uRLMap:URLMap default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/uRLMap:URLMap")
public class URLMap extends io.pulumi.resources.CustomResource {
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * defaultRouteAction takes effect when none of the pathRules or routeRules match. The load balancer performs
     * advanced routing actions like URL rewrites, header transformations, etc. prior to forwarding the request
     * to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set.
     * Conversely if defaultService is set, defaultRouteAction cannot contain any weightedBackendServices.
     * Only one of defaultRouteAction or defaultUrlRedirect must be set.
     * Structure is documented below.
     * 
     */
    @Export(name="defaultRouteAction", type=URLMapDefaultRouteAction.class, parameters={})
    private Output</* @Nullable */ URLMapDefaultRouteAction> defaultRouteAction;

    /**
     * @return defaultRouteAction takes effect when none of the pathRules or routeRules match. The load balancer performs
     * advanced routing actions like URL rewrites, header transformations, etc. prior to forwarding the request
     * to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set.
     * Conversely if defaultService is set, defaultRouteAction cannot contain any weightedBackendServices.
     * Only one of defaultRouteAction or defaultUrlRedirect must be set.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ URLMapDefaultRouteAction> getDefaultRouteAction() {
        return this.defaultRouteAction;
    }
    /**
     * The backend service or backend bucket to use when none of the given paths match.
     * 
     */
    @Export(name="defaultService", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultService;

    /**
     * @return The backend service or backend bucket to use when none of the given paths match.
     * 
     */
    public Output</* @Nullable */ String> getDefaultService() {
        return this.defaultService;
    }
    /**
     * When none of the specified hostRules match, the request is redirected to a URL specified
     * by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or
     * defaultRouteAction must not be set.
     * Structure is documented below.
     * 
     */
    @Export(name="defaultUrlRedirect", type=URLMapDefaultUrlRedirect.class, parameters={})
    private Output</* @Nullable */ URLMapDefaultUrlRedirect> defaultUrlRedirect;

    /**
     * @return When none of the specified hostRules match, the request is redirected to a URL specified
     * by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or
     * defaultRouteAction must not be set.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ URLMapDefaultUrlRedirect> getDefaultUrlRedirect() {
        return this.defaultUrlRedirect;
    }
    /**
     * Description of this test case.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of this test case.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking.
     * 
     */
    @Export(name="fingerprint", type=String.class, parameters={})
    private Output<String> fingerprint;

    /**
     * @return Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking.
     * 
     */
    public Output<String> getFingerprint() {
        return this.fingerprint;
    }
    /**
     * Specifies changes to request and response headers that need to take effect for
     * the selected backendService.
     * headerAction specified here take effect before headerAction in the enclosing
     * HttpRouteRule, PathMatcher and UrlMap.
     * Structure is documented below.
     * 
     */
    @Export(name="headerAction", type=URLMapHeaderAction.class, parameters={})
    private Output</* @Nullable */ URLMapHeaderAction> headerAction;

    /**
     * @return Specifies changes to request and response headers that need to take effect for
     * the selected backendService.
     * headerAction specified here take effect before headerAction in the enclosing
     * HttpRouteRule, PathMatcher and UrlMap.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ URLMapHeaderAction> getHeaderAction() {
        return this.headerAction;
    }
    /**
     * The list of HostRules to use against the URL.
     * Structure is documented below.
     * 
     */
    @Export(name="hostRules", type=List.class, parameters={URLMapHostRule.class})
    private Output</* @Nullable */ List<URLMapHostRule>> hostRules;

    /**
     * @return The list of HostRules to use against the URL.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ List<URLMapHostRule>> getHostRules() {
        return this.hostRules;
    }
    /**
     * The unique identifier for the resource.
     * 
     */
    @Export(name="mapId", type=Integer.class, parameters={})
    private Output<Integer> mapId;

    /**
     * @return The unique identifier for the resource.
     * 
     */
    public Output<Integer> getMapId() {
        return this.mapId;
    }
    /**
     * The name of the query parameter to match. The query parameter must exist in the
     * request, in the absence of which the request match fails.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the query parameter to match. The query parameter must exist in the
     * request, in the absence of which the request match fails.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The name of the PathMatcher to use to match the path portion of the URL if the
     * hostRule matches the URL's host portion.
     * 
     */
    @Export(name="pathMatchers", type=List.class, parameters={URLMapPathMatcher.class})
    private Output</* @Nullable */ List<URLMapPathMatcher>> pathMatchers;

    /**
     * @return The name of the PathMatcher to use to match the path portion of the URL if the
     * hostRule matches the URL's host portion.
     * 
     */
    public Output</* @Nullable */ List<URLMapPathMatcher>> getPathMatchers() {
        return this.pathMatchers;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The URI of the created resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * The list of expected URL mapping tests. Request to update this UrlMap will
     * succeed only if all of the test cases pass. You can specify a maximum of 100
     * tests per UrlMap.
     * Structure is documented below.
     * 
     */
    @Export(name="tests", type=List.class, parameters={URLMapTest.class})
    private Output</* @Nullable */ List<URLMapTest>> tests;

    /**
     * @return The list of expected URL mapping tests. Request to update this UrlMap will
     * succeed only if all of the test cases pass. You can specify a maximum of 100
     * tests per UrlMap.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ List<URLMapTest>> getTests() {
        return this.tests;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public URLMap(String name) {
        this(name, URLMapArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public URLMap(String name, @Nullable URLMapArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public URLMap(String name, @Nullable URLMapArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/uRLMap:URLMap", name, args == null ? URLMapArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private URLMap(String name, Output<String> id, @Nullable URLMapState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/uRLMap:URLMap", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static URLMap get(String name, Output<String> id, @Nullable URLMapState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new URLMap(name, id, state, options);
    }
}
