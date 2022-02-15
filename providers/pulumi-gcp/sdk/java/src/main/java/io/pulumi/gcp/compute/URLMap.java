// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
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

@ResourceType(type="gcp:compute/uRLMap:URLMap")
public class URLMap extends io.pulumi.resources.CustomResource {
    @OutputExport(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    @OutputExport(name="defaultRouteAction", type=URLMapDefaultRouteAction.class, parameters={})
    private Output</* @Nullable */ URLMapDefaultRouteAction> defaultRouteAction;

    public Output</* @Nullable */ URLMapDefaultRouteAction> getDefaultRouteAction() {
        return this.defaultRouteAction;
    }
    @OutputExport(name="defaultService", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultService;

    public Output</* @Nullable */ String> getDefaultService() {
        return this.defaultService;
    }
    @OutputExport(name="defaultUrlRedirect", type=URLMapDefaultUrlRedirect.class, parameters={})
    private Output</* @Nullable */ URLMapDefaultUrlRedirect> defaultUrlRedirect;

    public Output</* @Nullable */ URLMapDefaultUrlRedirect> getDefaultUrlRedirect() {
        return this.defaultUrlRedirect;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="fingerprint", type=String.class, parameters={})
    private Output<String> fingerprint;

    public Output<String> getFingerprint() {
        return this.fingerprint;
    }
    @OutputExport(name="headerAction", type=URLMapHeaderAction.class, parameters={})
    private Output</* @Nullable */ URLMapHeaderAction> headerAction;

    public Output</* @Nullable */ URLMapHeaderAction> getHeaderAction() {
        return this.headerAction;
    }
    @OutputExport(name="hostRules", type=List.class, parameters={URLMapHostRule.class})
    private Output</* @Nullable */ List<URLMapHostRule>> hostRules;

    public Output</* @Nullable */ List<URLMapHostRule>> getHostRules() {
        return this.hostRules;
    }
    @OutputExport(name="mapId", type=Integer.class, parameters={})
    private Output<Integer> mapId;

    public Output<Integer> getMapId() {
        return this.mapId;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="pathMatchers", type=List.class, parameters={URLMapPathMatcher.class})
    private Output</* @Nullable */ List<URLMapPathMatcher>> pathMatchers;

    public Output</* @Nullable */ List<URLMapPathMatcher>> getPathMatchers() {
        return this.pathMatchers;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    @OutputExport(name="tests", type=List.class, parameters={URLMapTest.class})
    private Output</* @Nullable */ List<URLMapTest>> tests;

    public Output</* @Nullable */ List<URLMapTest>> getTests() {
        return this.tests;
    }

    public URLMap(String name, @Nullable URLMapArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/uRLMap:URLMap", name, args == null ? URLMapArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private URLMap(String name, Input<String> id, @Nullable URLMapState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/uRLMap:URLMap", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static URLMap get(String name, Input<String> id, @Nullable URLMapState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new URLMap(name, id, state, options);
    }
}